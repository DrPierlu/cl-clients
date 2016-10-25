
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Variant
 */
public class Variant extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("product_id")
	private String productId = null;

	@SerializedName("shipping_category_id")
	private String shippingCategoryId = null;

	@SerializedName("sku")
	private String sku = null;

	@SerializedName("tax_code")
	private String taxCode = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Variant environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Variant productId(String productId) {
		this.productId = productId;
		return this;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Variant shippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
		return this;
	}

	public String getShippingCategoryId() {
		return shippingCategoryId;
	}

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}

	public Variant sku(String sku) {
		this.sku = sku;
		return this;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Variant taxCode(String taxCode) {
		this.taxCode = taxCode;
		return this;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Variant creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Variant creatorResource(String creatorResource) {
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
		Variant variant = (Variant) o;
		return Objects.equals(this.resourceName, variant.resourceName) && Objects.equals(this.id, variant.id)
				&& Objects.equals(this.environmentId, variant.environmentId)
				&& Objects.equals(this.productId, variant.productId)
				&& Objects.equals(this.shippingCategoryId, variant.shippingCategoryId)
				&& Objects.equals(this.sku, variant.sku) && Objects.equals(this.taxCode, variant.taxCode)
				&& Objects.equals(this.creatorId, variant.creatorId)
				&& Objects.equals(this.creatorResource, variant.creatorResource)
				&& Objects.equals(this.createdAt, variant.createdAt)
				&& Objects.equals(this.updatedAt, variant.updatedAt) && Objects.equals(this.expanded, variant.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, productId, shippingCategoryId, sku, taxCode, creatorId,
				creatorResource, createdAt, updatedAt, expanded);
	}

}