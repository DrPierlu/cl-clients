package io.commercelayer.api.http;

import org.apache.commons.lang3.StringUtils;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.util.LogUtils;

public final class HttpClientFactory {
	
	static {
		
		String cusomClientImpl = ApiConfig.getProperty(Group.http, "client.custom.impl");
		if (StringUtils.isNotBlank(cusomClientImpl)) {
			try {
				customClientClass = Class.forName(cusomClientImpl);
			}
			catch (ClassNotFoundException cnfe) {
				LogUtils.singleErrorMessage(HttpClientFactory.class, String.format("HTTP Custom Client class not found [%s]", cusomClientImpl));
			}
		}
		
	}
	
	private static Class<?> customClientClass;

	public static HttpClient getHttpClientInstance() {
		
		if (customClientClass != null) return getCustomClientInstance();
		
		HttpProxy httpProxy = null;
		
		if (ApiConfig.isPropertyEnabled(Group.http, "proxy.enabled")) {
			
			httpProxy = new HttpProxy();
			
			httpProxy.setHost(ApiConfig.getProperty(Group.http, "proxy.host"));
			httpProxy.setPort(Integer.parseInt(ApiConfig.getProperty(Group.http, "proxy.port")));
			httpProxy.setUsername(ApiConfig.getProperty(Group.http, "proxy.username"));
			httpProxy.setPassword(ApiConfig.getProperty(Group.http, "proxy.password"));
			
		}
		
		return (httpProxy == null)? new HttpClientOkHttpImpl() : new HttpClientOkHttpImpl(httpProxy);
		
	}
	
	
	public static HttpClient getHttpClientInstance(HttpProxy httpProxy) {
		return new HttpClientOkHttpImpl(httpProxy);
	}
	
	
	private static HttpClient getCustomClientInstance() {
		HttpClient client = null;
		try {
			client = (HttpClient)customClientClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			LogUtils.singleErrorStackTrace(HttpClientFactory.class, e);
		}
		return client;
	}
	
	
	private HttpClientFactory() {
		
	}
	
	
	public static void main(String[] args) {
		HttpClient client = HttpClientFactory.getHttpClientInstance();
		LogUtils.singleInfoMessage(HttpClientFactory.class, String.format("HTTP Client implementation: %s", client.getClass().getName()));
	}
	
}
