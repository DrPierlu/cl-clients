package io.commercelayer.api.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class JsonUtil {

	public static String toJSON(Object object) {

		GsonBuilder builder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
		Gson gson = builder.create();

		return gson.toJson(object);

	}

}
