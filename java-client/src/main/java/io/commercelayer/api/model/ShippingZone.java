
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ShippingZone
 */
public class ShippingZone extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("country_group_id")
	private String countryGroupId = null;

	@SerializedName("name")
	private String name = null;

	public ShippingZone environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public ShippingZone countryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
		return this;
	}

	public String getCountryGroupId() {
		return countryGroupId;
	}

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}

	public ShippingZone name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShippingZone creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public ShippingZone creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShippingZone shippingZone = (ShippingZone) o;
		return Objects.equals(this.resourceName, shippingZone.resourceName) && Objects.equals(this.id, shippingZone.id)
				&& Objects.equals(this.environmentId, shippingZone.environmentId)
				&& Objects.equals(this.countryGroupId, shippingZone.countryGroupId)
				&& Objects.equals(this.name, shippingZone.name)
				&& Objects.equals(this.creatorId, shippingZone.creatorId)
				&& Objects.equals(this.creatorResource, shippingZone.creatorResource)
				&& Objects.equals(this.createdAt, shippingZone.createdAt)
				&& Objects.equals(this.updatedAt, shippingZone.updatedAt)
				&& Objects.equals(this.expanded, shippingZone.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, countryGroupId, name, creatorId, creatorResource,
				createdAt, updatedAt, expanded);
	}

}
