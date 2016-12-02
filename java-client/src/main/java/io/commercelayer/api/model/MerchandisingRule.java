
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * MerchandisingRule
 */
public class MerchandisingRule extends ApiResource {

	private String catalogId = null;
	private String taxonId = null;
	private String productId = null;
	private String position = null;
	private String hero = null;


	public MerchandisingRule catalogId(String catalogId) {
		this.catalogId = catalogId;
		return this;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public MerchandisingRule taxonId(String taxonId) {
		this.taxonId = taxonId;
		return this;
	}

	public String getTaxonId() {
		return taxonId;
	}

	public void setTaxonId(String taxonId) {
		this.taxonId = taxonId;
	}

	public MerchandisingRule productId(String productId) {
		this.productId = productId;
		return this;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public MerchandisingRule position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public MerchandisingRule hero(String hero) {
		this.hero = hero;
		return this;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MerchandisingRule merchandisingRule = (MerchandisingRule) o;
		return super.equals(o) && 
			Objects.equals(this.catalogId, merchandisingRule.catalogId)
				&& Objects.equals(this.taxonId, merchandisingRule.taxonId)
				&& Objects.equals(this.productId, merchandisingRule.productId)
				&& Objects.equals(this.position, merchandisingRule.position)
				&& Objects.equals(this.hero, merchandisingRule.hero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, catalogId, taxonId, productId, position, hero, 
				creatorResource, createdAt, updatedAt);
	}

}
