package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PutOperation extends ApiOperation implements IdOperation {

	private ApiResource payload;

	protected PutOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.PUT;
	}


	public ApiResource getPayload() {
		return payload;
	}

	public void setPayload(ApiResource payload) {
		this.payload = payload;
		if ((getId() == null) && (payload.getId() != null)) setId(payload.getId());
	}
	
	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}

}
