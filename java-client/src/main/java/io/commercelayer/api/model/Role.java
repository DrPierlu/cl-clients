
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Role
 */
public class Role extends ApiResource {
	
	@SerializedName("name")
	private String name = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

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

	public Role creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Role creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
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
		return Objects.equals(this.resourceName, role.resourceName) && Objects.equals(this.id, role.id)
				&& Objects.equals(this.name, role.name) && Objects.equals(this.description, role.description)
				&& Objects.equals(this.creatorId, role.creatorId)
				&& Objects.equals(this.creatorResource, role.creatorResource)
				&& Objects.equals(this.createdAt, role.createdAt) && Objects.equals(this.updatedAt, role.updatedAt)
				&& Objects.equals(this.expanded, role.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, description, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
