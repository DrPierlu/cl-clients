package io.commercelayer.api.json;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.commercelayer.api.model.ApiResource;

public final class JsonCodecGsonImpl implements JsonCodec {
	
	private Gson gson;
	{
		GsonBuilder builder = new GsonBuilder();
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
		// if (formatted) builder.setPrettyPrinting();
		gson = builder.create();
	}

	@Override
	public <T extends ApiResource> T fromJSON(String json, Class<T> type) {
		return gson.fromJson(json, type);
	}

	@Override
	public String toJSON(ApiResource object) {
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
