package io.commercelayer.api.model.common;

import io.commercelayer.api.json.JsonExclude;

public class ApiError extends ApiObject {

	private String error;
	private String errorDescription;
	@JsonExclude
	private int httpErrorCode;


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getErrorDescription() {
		return errorDescription;
	}


	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}


	public String toString() {
		return String.format("[error=%s, description=%s]", error, errorDescription);
	}


	public int getHttpErrorCode() {
		return httpErrorCode;
	}


	public void setHttpErrorCode(int httpErrorCode) {
		this.httpErrorCode = httpErrorCode;
	}

}
