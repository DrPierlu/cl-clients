package io.commercelayer.api.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;

public abstract class ApiObject {

	private static final ToStringStyle style = ApiConfig.getPropertyBoolean(Group.test, "mode")? ToStringStyle.MULTI_LINE_STYLE : ToStringStyle.SHORT_PREFIX_STYLE;
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, style);
	}
	
}
