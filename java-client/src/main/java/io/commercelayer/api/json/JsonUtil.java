package io.commercelayer.api.json;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class JsonUtil {

	public static String toJSON(Object object) {

		GsonBuilder builder = new GsonBuilder();

		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

		Gson gson = builder.create();

		return gson.toJson(object);

	}

}
