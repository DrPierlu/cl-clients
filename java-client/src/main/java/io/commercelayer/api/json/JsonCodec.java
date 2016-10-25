package io.commercelayer.api.json;

import io.commercelayer.api.model.ApiObject;

public interface JsonCodec {

	public <T extends ApiObject> T fromJSON(String json, Class<T> type);
	
	public String toJSON(ApiObject object);
	
}
