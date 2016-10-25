
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ShippingMethod
 */
public class ShippingMethod extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("shipping_zone_id")
	private String shippingZoneId = null;

	@SerializedName("shipping_category_id")
	private String shippingCategoryId = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public ShippingMethod environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public ShippingMethod creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public ShippingMethod creatorResource(String creatorResource) {
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
		ShippingMethod shippingMethod = (ShippingMethod) o;
		return Objects.equals(this.resourceName, shippingMethod.resourceName)
				&& Objects.equals(this.id, shippingMethod.id)
				&& Objects.equals(this.environmentId, shippingMethod.environmentId)
				&& Objects.equals(this.name, shippingMethod.name)
				&& Objects.equals(this.description, shippingMethod.description)
				&& Objects.equals(this.shippingZoneId, shippingMethod.shippingZoneId)
				&& Objects.equals(this.shippingCategoryId, shippingMethod.shippingCategoryId)
				&& Objects.equals(this.creatorId, shippingMethod.creatorId)
				&& Objects.equals(this.creatorResource, shippingMethod.creatorResource)
				&& Objects.equals(this.createdAt, shippingMethod.createdAt)
				&& Objects.equals(this.updatedAt, shippingMethod.updatedAt)
				&& Objects.equals(this.expanded, shippingMethod.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, description, shippingZoneId, shippingCategoryId,
				creatorId, creatorResource, createdAt, updatedAt, expanded);
	}

}