
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Organization
 */
public class Organization extends ApiObject {
	
	@SerializedName("name")
	private String name = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Organization name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Organization creatorResource(String creatorResource) {
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
		Organization organization = (Organization) o;
		return Objects.equals(this.resourceName, organization.resourceName) && Objects.equals(this.id, organization.id)
				&& Objects.equals(this.name, organization.name)
				&& Objects.equals(this.creatorId, organization.creatorId)
				&& Objects.equals(this.creatorResource, organization.creatorResource)
				&& Objects.equals(this.createdAt, organization.createdAt)
				&& Objects.equals(this.updatedAt, organization.updatedAt)
				&& Objects.equals(this.expanded, organization.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorId, creatorResource, createdAt, updatedAt, expanded);
	}

}
