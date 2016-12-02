
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * ShippingMethod
 */
public class ShippingMethod extends ApiResource {

	private String name = null;
	private String description = null;
	private String shippingZoneId = null;
	private String shippingCategoryId = null;


	public ShippingMethod name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShippingMethod description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ShippingMethod shippingZoneId(String shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
		return this;
	}

	public String getShippingZoneId() {
		return shippingZoneId;
	}

	public void setShippingZoneId(String shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
	}

	public ShippingMethod shippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
		return this;
	}

	public String getShippingCategoryId() {
		return shippingCategoryId;
	}

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}



	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShippingMethod shippingMethod = (ShippingMethod) o;
		return super.equals(o) &&
			Objects.equals(this.name, shippingMethod.name)
				&& Objects.equals(this.description, shippingMethod.description)
				&& Objects.equals(this.shippingZoneId, shippingMethod.shippingZoneId)
				&& Objects.equals(this.shippingCategoryId, shippingMethod.shippingCategoryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, description, shippingZoneId, shippingCategoryId,
				creatorResource, createdAt, updatedAt);
	}

}
