package io.commercelayer.api.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.exception.ConnectionException;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;

public class HttpClientOkHttpImpl extends HttpClient {

	private final OkHttpClient httpClient;

	HttpClientOkHttpImpl() {
		this(null);
	}

	HttpClientOkHttpImpl(HttpProxy httpProxy) {
		this.httpClient = setupClient(httpProxy);
	}

	private OkHttpClient setupClient(HttpProxy httpProxy) {

		OkHttpClient.Builder builder = new OkHttpClient.Builder();

		if (httpProxy != null) {

			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(httpProxy.getHost(), httpProxy.getPort()));
			builder.proxy(proxy);

			Authenticator proxyAuthenticator = new Authenticator() {
				public Request authenticate(Route route, Response response) throws IOException {
					String credential = Credentials.basic(httpProxy.getUsername(), httpProxy.getPassword());
					return response.request().newBuilder().header("Proxy-Authorization", credential).build();
				}
			};
			builder.proxyAuthenticator(proxyAuthenticator);

		}

		if (ApiConfig.getPropertyBoolean(Group.http, "ssl.trustAll")) sslTrustAll(builder);

		builder.connectTimeout(10, TimeUnit.SECONDS);
		builder.readTimeout(10, TimeUnit.SECONDS);
		builder.writeTimeout(10, TimeUnit.SECONDS);

		return builder.build();

	}

	private void sslTrustAll(OkHttpClient.Builder builder) {

		SSLContext sslContext = null;
		try {
			sslContext = SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException nsae) {
			logger.error("TLS not available", nsae);
			return;
		}

		X509TrustManager trustManager = new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
			public void checkClientTrusted(X509Certificate[] certs, String authType) { }
			public void checkServerTrusted(X509Certificate[] certs, String authType) { }
		};

		try {
			sslContext.init(null, new TrustManager[] { trustManager }, new SecureRandom());
		} catch (KeyManagementException kme) {
			logger.error("SSLContext Init error", kme);
			return;
		}

		builder.sslSocketFactory(sslContext.getSocketFactory(), trustManager);
		
		builder.hostnameVerifier(new HostnameVerifier() {
			public boolean verify(String arg0, SSLSession arg1) { return true; }
		});

	}

	private RequestBody getRequestBody(HttpRequest httpRequest) {
		return RequestBody.create(MediaType.parse(httpRequest.getContentType()), httpRequest.getBody());
	}

	public HttpResponse send(HttpRequest httpRequest) throws ConnectionException {

		// REQUEST
		Request.Builder requestBuilder = new Request.Builder().url(httpRequest.getUrl());

		// HTTP Method & Body
		switch (httpRequest.getMethod()) {
		default:
		case GET: {
			requestBuilder.get();
			break;
		}
		case POST: {
			requestBuilder.post(getRequestBody(httpRequest));
			break;
		}
		case PUT: {
			requestBuilder.put(getRequestBody(httpRequest));
			break;
		}
		case DELETE: {
			requestBuilder.delete();
			break;
		}
		}

		// HTTP Headers
		if (httpRequest.hasHeaders()) {
			for (Map.Entry<String, String> header : httpRequest.getHeaders().entrySet()) {
				requestBuilder.addHeader(header.getKey(), header.getValue());
			}
		}

		if (httpRequest.getHttpAuth() != null) {
			requestBuilder.header("Authorization", httpRequest.getHttpAuth().getHttpRequestAuthHeader());
		}

		Request request = requestBuilder.build();

		// RESPONSE
		Response response = null;

		try {
			response = httpClient.newCall(request).execute();
		} catch (IOException ioe) {
			throw new ConnectionException(String.format("HTTP Error calling [%s:%s]", httpRequest.getMethod(), httpRequest.getUrl()));
		}

		HttpResponse httpResponse = new HttpResponse();

		// HTTP Code
		httpResponse.setCode(response.code());

		// HTTP Headers
		Headers responseHeaders = response.headers();
		for (String hName : responseHeaders.names()) {
			httpResponse.addHeader(hName, responseHeaders.get(hName));
		}

		// HTTP Body
		try {
			httpResponse.setBody(response.body().string());
		} catch (IOException ioe) {
			throw new ConnectionException(String.format("HTTP Error reading body response [%s:%s]", httpRequest.getMethod(), httpRequest.getUrl()));
		}

		// HTTP Content Type
		httpResponse.setContentType(getContentType(response.body().contentType()));

		return httpResponse;

	}

	// private void setAuthentication(HttpBasicAuth basicAuth) {
	//
	// OkHttpClient.Builder builder = httpClient.newBuilder();
	//
	// builder.authenticator(new Authenticator() {
	//
	// private int authAttempts = 0;
	//
	// @Override
	// public Request authenticate(Route route, Response response) throws
	// IOException {
	// authAttempts++;
	// if (authAttempts > 3) {
	// return null;
	// }
	// String credential = Credentials.basic(basicAuth.getUsername(),
	// basicAuth.getPassword());
	// return response.request().newBuilder().header("Authorization",
	// credential).build();
	// }
	// });
	// builder.connectTimeout(10, TimeUnit.SECONDS);
	// builder.writeTimeout(10, TimeUnit.SECONDS);
	// builder.readTimeout(30, TimeUnit.SECONDS);
	//
	// }

	private String getContentType(MediaType mediaType) {
		StringBuilder sb = new StringBuilder(mediaType.type());
		if (mediaType.subtype() != null)
			sb.append('/').append(mediaType.subtype());
		return sb.toString();
	}

}
