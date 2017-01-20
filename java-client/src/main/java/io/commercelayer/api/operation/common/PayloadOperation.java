package io.commercelayer.api.operation.common;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.model.common.ApiResource;

public abstract class PayloadOperation<T extends ApiResource> extends ApiOperation<T> {

	private List<String> requiredFields = new ArrayList<>();

	public PayloadOperation(String path) {
		super(path);
	}

	private T payload;

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
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
