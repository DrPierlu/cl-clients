
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Product
 */
public class Product extends ApiResource {

	private String name = null;
	private String description = null;
	private String shippingCategoryId = null;
	private String taxCode = null;

	
	public Product name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product shippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
		return this;
	}

	public String getShippingCategoryId() {
		return shippingCategoryId;
	}

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}

	public Product taxCode(String taxCode) {
		this.taxCode = taxCode;
		return this;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Product creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Product creatorResource(String creatorResource) {
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
		Product product = (Product) o;
		return super.equals(o) && 
			Objects.equals(this.name, product.name)
				&& Objects.equals(this.description, product.description)
				&& Objects.equals(this.shippingCategoryId, product.shippingCategoryId)
				&& Objects.equals(this.taxCode, product.taxCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, description, shippingCategoryId, taxCode, creatorId,
				creatorResource, createdAt, updatedAt);
	}

}
