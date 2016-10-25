
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Environment
 */
public class Environment extends ApiResource {
	
	@SerializedName("organization_id")
	private String organizationId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Environment organizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public Environment name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Environment creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Environment creatorResource(String creatorResource) {
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
		Environment environment = (Environment) o;
		return Objects.equals(this.resourceName, environment.resourceName) && Objects.equals(this.id, environment.id)
				&& Objects.equals(this.organizationId, environment.organizationId)
				&& Objects.equals(this.name, environment.name) && Objects.equals(this.creatorId, environment.creatorId)
				&& Objects.equals(this.creatorResource, environment.creatorResource)
				&& Objects.equals(this.createdAt, environment.createdAt)
				&& Objects.equals(this.updatedAt, environment.updatedAt)
				&& Objects.equals(this.expanded, environment.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, organizationId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
