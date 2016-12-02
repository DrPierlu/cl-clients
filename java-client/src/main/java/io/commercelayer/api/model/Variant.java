
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Variant
 */
public class Variant extends ApiResource {

	private String productId = null;
	private String shippingCategoryId = null;
	private String sku = null;
	private String taxCode = null;


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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Variant variant = (Variant) o;
		return super.equals(o) &&
			Objects.equals(this.productId, variant.productId)
				&& Objects.equals(this.shippingCategoryId, variant.shippingCategoryId)
				&& Objects.equals(this.sku, variant.sku)
				&& Objects.equals(this.taxCode, variant.taxCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, productId, shippingCategoryId, sku, taxCode, 
				creatorResource, createdAt, updatedAt);
	}

}
