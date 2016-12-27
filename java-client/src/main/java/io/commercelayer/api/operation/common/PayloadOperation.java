package io.commercelayer.api.operation.common;

import io.commercelayer.api.model.common.ApiResource;

public interface PayloadOperation {
	
	ApiResource getPayload();

	void setPayload(ApiResource payload);

}
