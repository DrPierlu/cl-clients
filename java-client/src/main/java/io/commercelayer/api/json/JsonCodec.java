package io.commercelayer.api.json;

import io.commercelayer.api.model.ApiResource;

public interface JsonCodec {

	<T extends ApiResource> T fromJSON(String json, Class<T> type);
	
	String toJSON(ApiResource object);
	
}
