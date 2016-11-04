
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.BasicResource;

/**
 * Variant
 */
public class Variant extends BasicResource {

	private String environmentId = null;
	private String productId = null;
	private String shippingCategoryId = null;
	private String sku = null;
	private String taxCode = null;

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

	public Variant creatorResource(String creatorResource) {
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
		Variant variant = (Variant) o;
		return Objects.equals(this.resourceName, variant.resourceName) && Objects.equals(this.id, variant.id)
				&& Objects.equals(this.environmentId, variant.environmentId)
				&& Objects.equals(this.productId, variant.productId)
				&& Objects.equals(this.shippingCategoryId, variant.shippingCategoryId)
				&& Objects.equals(this.sku, variant.sku) && Objects.equals(this.taxCode, variant.taxCode)
				&& Objects.equals(this.creatorId, variant.creatorId)
				&& Objects.equals(this.creatorResource, variant.creatorResource)
				&& Objects.equals(this.createdAt, variant.createdAt)
				&& Objects.equals(this.updatedAt, variant.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, productId, shippingCategoryId, sku, taxCode, creatorId,
				creatorResource, createdAt, updatedAt);
	}

}
