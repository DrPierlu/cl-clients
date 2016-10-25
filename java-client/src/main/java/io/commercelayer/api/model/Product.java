
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Product
 */
public class Product extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("shipping_category_id")
	private String shippingCategoryId = null;

	@SerializedName("tax_code")
	private String taxCode = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Product environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Product creatorResource(String creatorResource) {
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
		Product product = (Product) o;
		return Objects.equals(this.resourceName, product.resourceName) && Objects.equals(this.id, product.id)
				&& Objects.equals(this.environmentId, product.environmentId) && Objects.equals(this.name, product.name)
				&& Objects.equals(this.description, product.description)
				&& Objects.equals(this.shippingCategoryId, product.shippingCategoryId)
				&& Objects.equals(this.taxCode, product.taxCode) && Objects.equals(this.creatorId, product.creatorId)
				&& Objects.equals(this.creatorResource, product.creatorResource)
				&& Objects.equals(this.createdAt, product.createdAt)
				&& Objects.equals(this.updatedAt, product.updatedAt) && Objects.equals(this.expanded, product.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, description, shippingCategoryId, taxCode, creatorId,
				creatorResource, createdAt, updatedAt, expanded);
	}

}
