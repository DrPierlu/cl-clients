package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;

public class Schema {

	private List<Definition> definitions = new ArrayList<>();
	private List<Resource> resources = new ArrayList<>();

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public void addDefinition(Definition definition) {
		this.definitions.add(definition);
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public void addResource(Resource resource) {
		this.resources.add(resource);
	}

}
