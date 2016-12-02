
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Role
 */
public class Role extends ApiResource {

	private String name = null;
	private String description = null;

	public Role name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role description(String description) {
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
		Role role = (Role) o;
		return super.equals(o) && 
			Objects.equals(this.name, role.name) 
				&& Objects.equals(this.description, role.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, description, creatorResource, createdAt, updatedAt);
	}

}
