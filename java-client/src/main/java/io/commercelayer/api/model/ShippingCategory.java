
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ShippingCategory
 */
public class ShippingCategory extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	public ShippingCategory environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public ShippingCategory name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShippingCategory creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public ShippingCategory creatorResource(String creatorResource) {
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
		ShippingCategory shippingCategory = (ShippingCategory) o;
		return Objects.equals(this.resourceName, shippingCategory.resourceName)
				&& Objects.equals(this.id, shippingCategory.id)
				&& Objects.equals(this.environmentId, shippingCategory.environmentId)
				&& Objects.equals(this.name, shippingCategory.name)
				&& Objects.equals(this.creatorId, shippingCategory.creatorId)
				&& Objects.equals(this.creatorResource, shippingCategory.creatorResource)
				&& Objects.equals(this.createdAt, shippingCategory.createdAt)
				&& Objects.equals(this.updatedAt, shippingCategory.updatedAt)
				&& Objects.equals(this.expanded, shippingCategory.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
