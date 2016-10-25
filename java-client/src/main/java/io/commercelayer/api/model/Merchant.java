
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Merchant
 */
public class Merchant extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("country_id")
	private String countryId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Merchant environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Merchant countryId(String countryId) {
		this.countryId = countryId;
		return this;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Merchant name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Merchant description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Merchant creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Merchant creatorResource(String creatorResource) {
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
		Merchant merchant = (Merchant) o;
		return Objects.equals(this.resourceName, merchant.resourceName) && Objects.equals(this.id, merchant.id)
				&& Objects.equals(this.environmentId, merchant.environmentId)
				&& Objects.equals(this.countryId, merchant.countryId) && Objects.equals(this.name, merchant.name)
				&& Objects.equals(this.description, merchant.description)
				&& Objects.equals(this.creatorId, merchant.creatorId)
				&& Objects.equals(this.creatorResource, merchant.creatorResource)
				&& Objects.equals(this.createdAt, merchant.createdAt)
				&& Objects.equals(this.updatedAt, merchant.updatedAt)
				&& Objects.equals(this.expanded, merchant.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, countryId, name, description, creatorId, creatorResource,
				createdAt, updatedAt, expanded);
	}

}