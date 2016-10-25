package io.commercelayer.api.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.commercelayer.api.model.ApiResource;

public final class GsonCodec implements JsonCodec {

	@Override
	public <T extends ApiResource> T fromJSON(String json, Class<T> type) {

		GsonBuilder builder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
		// if (formatted) builder.setPrettyPrinting();
		Gson gson = builder.create();

		return gson.fromJson(json, type);

	}

	@Override
	public String toJSON(ApiResource object) {

		GsonBuilder builder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
		Gson gson = builder.create();

		return gson.toJson(object);

//		if (!withParent)
//			return gson.toJson(o);
//		else {
//			JsonElement je = gson.toJsonTree(o);
//			JsonObject jo = new JsonObject();
//			jo.add(o.getClass().getSimpleName().toLowerCase(), je);
//			return gson.toJson(jo);
//		}

	}

}
