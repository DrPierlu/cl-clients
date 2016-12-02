
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Catalog
 */
public class Catalog extends ApiResource {

	private String name = null;
	private String description = null;

	
	public Catalog name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Catalog description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Catalog catalog = (Catalog) o;
		return super.equals(o) && 
			Objects.equals(this.name, catalog.name)
				&& Objects.equals(this.description, catalog.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, description, creatorResource, createdAt,
				updatedAt);
	}

}
