package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PutOperation extends PayloadOperation implements IdOperation {

	protected PutOperation(String path) {
		super(path);
	}
	
	protected PutOperation(String path, Long id) {
		this(path);
		setId(id);
	}

	@Override
	public Method getMethod() {
		return Method.PUT;
	}

	public void setPayload(ApiResource payload) {
		super.setPayload(payload);
		if ((getId() == null) && (payload.getId() != null)) setId(payload.getId());
	}
	
	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}

}
