
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * ShippingCategory
 */
public class ShippingCategory extends ApiResource {

	private String name = null;


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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ShippingCategory shippingCategory = (ShippingCategory) o;
		return super.equals(o) && 
			Objects.equals(this.name, shippingCategory.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorResource, createdAt, updatedAt);
	}

}
