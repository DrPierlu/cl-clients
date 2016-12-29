package io.commercelayer.api.json.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import io.commercelayer.api.json.JsonExclude;

public class GsonExclusionStrategy implements ExclusionStrategy {
	
	GsonExclusionStrategy() {
		super();
	}

	public boolean shouldSkipField(FieldAttributes f) {
		return (f.getAnnotation(JsonExclude.class) != null);
	}

	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}

}
