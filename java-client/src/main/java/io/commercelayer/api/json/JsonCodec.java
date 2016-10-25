package io.commercelayer.api.json;

import io.commercelayer.api.model.ApiResource;

public interface JsonCodec {

	public <T extends ApiResource> T fromJSON(String json, Class<T> type);
	
	public String toJSON(ApiResource object);
	
}
