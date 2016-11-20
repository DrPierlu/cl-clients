package io.commercelayer.api.model.common;

public class ApiError extends ApiObject {

	private String error;
	private String errorDescription;

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
		return "[error=" + error + ", description=" + errorDescription + "]";
	}

}
