package io.commercelayer.api.operation;

import java.util.HashMap;
import java.util.Map;

import io.commercelayer.api.http.HttpRequest.Method;

public abstract class ApiOperation {

	protected Map<String, Object> pathParams = new HashMap<>();
	protected String path;

	public abstract Method getMethod();

	public ApiOperation(String path) {
		super();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public Map<String, Object> getPathParams() {
		return pathParams;
	}

	public void addPathParam(String key, Object value) {
		this.pathParams.put(key, value);
	}

	public Object getPathParam(String key) {
		return this.pathParams.get(key);
	}

	public String getOrderToken() {
		return (String)this.pathParams.get("order_token");
	}

	public void setOrderToken(String orderToken) {
		this.pathParams.put("order_token", orderToken);
	}

}
