package io.commercelayer.api.operation.common;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.model.common.ApiResource;

public abstract class PayloadOperation extends ApiOperation {

	private List<String> requiredFields = new ArrayList<>();

	public PayloadOperation(String path) {
		super(path);
	}

	private ApiResource payload;

	public ApiResource getPayload() {
		return payload;
	}

	public void setPayload(ApiResource payload) {
		this.payload = payload;
	}

	public List<String> getRequiredFields() {
		return requiredFields;
	}

	protected void addRequiredField(String fieldName) {
		this.requiredFields.add(fieldName);
	}
	
	public boolean isFieldRequired(String fieldName) {
		return this.requiredFields.contains(fieldName);
	}

}
