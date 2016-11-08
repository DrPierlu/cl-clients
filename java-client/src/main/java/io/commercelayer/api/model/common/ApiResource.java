package io.commercelayer.api.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class ApiResource {

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
