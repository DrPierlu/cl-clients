
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * CountryGroup
 */
public class CountryGroup extends ApiObject {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public CountryGroup environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public CountryGroup name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CountryGroup creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public CountryGroup creatorResource(String creatorResource) {
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
		CountryGroup countryGroup = (CountryGroup) o;
		return Objects.equals(this.resourceName, countryGroup.resourceName) && Objects.equals(this.id, countryGroup.id)
				&& Objects.equals(this.environmentId, countryGroup.environmentId)
				&& Objects.equals(this.name, countryGroup.name)
				&& Objects.equals(this.creatorId, countryGroup.creatorId)
				&& Objects.equals(this.creatorResource, countryGroup.creatorResource)
				&& Objects.equals(this.createdAt, countryGroup.createdAt)
				&& Objects.equals(this.updatedAt, countryGroup.updatedAt)
				&& Objects.equals(this.expanded, countryGroup.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
