package io.commercelayer.api.codegen;

import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.swagger.models.Model;
import io.swagger.models.Swagger;
import io.swagger.models.properties.Property;
import io.swagger.parser.SwaggerParser;

public class ApiCodeGen {

	public void codegen() {

		SwaggerParser parser = new SwaggerParser();

		Swagger swagger = parser.read(ApiConfig.getProperty(Group.api, "service.url").concat("/swagger"));

		Map<String, Model> definitions = swagger.getDefinitions();
		
		for (Map.Entry<String, Model> def : definitions.entrySet()) {
			Map<String, Property> properties = def.getValue().getProperties();
			for (Map.Entry<String, Property> prop : properties.entrySet()) {
				System.out.println(prop.getKey() + ": " + ToStringBuilder.reflectionToString(prop.getValue(), ToStringStyle.MULTI_LINE_STYLE));
			}
		}

	}

	public static void main(String[] args) {
		new ApiCodeGen().codegen();
	}

}
