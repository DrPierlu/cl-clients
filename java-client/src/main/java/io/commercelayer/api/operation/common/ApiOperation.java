package io.commercelayer.api.operation.common;

import java.util.HashMap;
import java.util.Map;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public abstract class ApiOperation {

	protected Map<String, Object> pathParams = new HashMap<>();
	protected String path;

	public abstract Method getMethod();
	
	public Class<? extends ApiResource> getResourceType() {
		return null;
	}

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
	
	public String toString() {
		return getClass().getSimpleName();
	}
	
	public boolean isPathParam(String paramName) {
		if (path == null) return false;
		else return (getPath().indexOf(String.format("{%s}", paramName)) != -1);
	}

}
