package io.commercelayer.api.json;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import io.commercelayer.api.model.common.ApiObject;

public final class JsonCodecGsonImpl implements JsonCodec {
	
	private Gson gson;
	{
		GsonBuilder builder = new GsonBuilder();
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
		// if (formatted) builder.setPrettyPrinting();
		gson = builder.create();
	}

	@Override
	public <T extends ApiObject> T fromJSON(String json, Class<T> type) {
		return gson.fromJson(json, type);
	}

	@Override
	public String toJSON(ApiObject object, boolean includeRoot) {
		
		if (!includeRoot) {
			return gson.toJson(object);
		}
		else {
			
			JsonElement je = gson.toJsonTree(object);
			JsonObject jo = new JsonObject();
			jo.add(object.getClass().getSimpleName().toLowerCase(), je);
			
			return gson.toJson(jo);
			
		}

	}

}
