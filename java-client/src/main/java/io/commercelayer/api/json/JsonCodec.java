package io.commercelayer.api.json;

import io.commercelayer.api.model.common.ApiObject;

public interface JsonCodec {

	<T extends ApiObject> T fromJSON(String json, Class<T> type);
	
	String toJSON(ApiObject apiResource, boolean includeRoot);
	
}
