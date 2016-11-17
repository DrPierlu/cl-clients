package io.commercelayer.api.http;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;

public final class HttpClientFactory {

	public static HttpClient getHttpClientInstance() {
		
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
	
	
	private HttpClientFactory() {
		
	}
	
}
