package io.commercelayer.api.json;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class GsonExclusionStrategy implements ExclusionStrategy {

	public boolean shouldSkipField(FieldAttributes f) {
		return (f.getAnnotation(JsonExclude.class) != null);
	}

	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}

}
