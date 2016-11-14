package io.commercelayer.api.json;

import java.util.List;

import io.commercelayer.api.model.common.ApiObject;

public interface JsonCodec {

	<T extends ApiObject> T fromJSON(String json, Class<T> resourceType);
	
	<T extends ApiObject> List<T> fromJSONList(String json, Class<T> resourceType);
	
	String toJSON(ApiObject apiResource, boolean includeRoot);
	
}
