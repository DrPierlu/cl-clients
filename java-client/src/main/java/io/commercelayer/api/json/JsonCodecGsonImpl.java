package io.commercelayer.api.json;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;

import io.commercelayer.api.model.common.ApiObject;

public final class JsonCodecGsonImpl implements JsonCodec {

	private Gson gson;
	{
		
		GsonBuilder builder = new GsonBuilder();
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
		// if (formatted) builder.setPrettyPrinting();
		
		builder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());
		
		gson = builder.create();
		
	}
	
	public <T extends ApiObject> List<T> fromJSONList(String json, Class<T> type) {
		Class<?>[] intfs = type.getInterfaces();
		if ((intfs == null) || (intfs.length == 0)) return null;
		
		Type collectionType = new TypeToken<List<T>>(){}.getType();
		List<T> list = gson.fromJson(json, collectionType);
		
		
		return list;

	}

	@Override
	public <T extends ApiObject> T fromJSON(String json, Class<T> type) {
		return gson.fromJson(json, type);
	}

	@Override
	public String toJSON(ApiObject object, boolean includeRoot) {

		if (!includeRoot) {
			return gson.toJson(object);
		} else {

			JsonElement je = gson.toJsonTree(object);
			JsonObject jo = new JsonObject();
			jo.add(object.getClass().getSimpleName().toLowerCase(), je);

			return gson.toJson(jo);

		}

	}

	private class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
		
		@Override
		public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
	        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
	        Date date = Date.from(instant);
	        return new JsonPrimitive(date.getTime());
	    }

		@Override
		public LocalDateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		    return ZonedDateTime.parse(json.getAsJsonPrimitive().getAsString()).toLocalDateTime();
		}
	
	}

}
