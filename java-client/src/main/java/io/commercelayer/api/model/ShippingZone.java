
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * ShippingZone
 */
public class ShippingZone extends ApiResource {

	private String countryGroupId = null;
	private String name = null;


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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShippingZone shippingZone = (ShippingZone) o;
		return super.equals(o) &&
			Objects.equals(this.countryGroupId, shippingZone.countryGroupId)
				&& Objects.equals(this.name, shippingZone.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, countryGroupId, name, creatorResource,
				createdAt, updatedAt);
	}

}
