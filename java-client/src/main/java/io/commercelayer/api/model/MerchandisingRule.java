
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * MerchandisingRule
 */
public class MerchandisingRule extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("catalog_id")
	private String catalogId = null;

	@SerializedName("taxon_id")
	private String taxonId = null;

	@SerializedName("product_id")
	private String productId = null;

	@SerializedName("position")
	private String position = null;

	@SerializedName("hero")
	private String hero = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public MerchandisingRule environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public MerchandisingRule creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public MerchandisingRule creatorResource(String creatorResource) {
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
		MerchandisingRule merchandisingRule = (MerchandisingRule) o;
		return Objects.equals(this.resourceName, merchandisingRule.resourceName)
				&& Objects.equals(this.id, merchandisingRule.id)
				&& Objects.equals(this.environmentId, merchandisingRule.environmentId)
				&& Objects.equals(this.catalogId, merchandisingRule.catalogId)
				&& Objects.equals(this.taxonId, merchandisingRule.taxonId)
				&& Objects.equals(this.productId, merchandisingRule.productId)
				&& Objects.equals(this.position, merchandisingRule.position)
				&& Objects.equals(this.hero, merchandisingRule.hero)
				&& Objects.equals(this.creatorId, merchandisingRule.creatorId)
				&& Objects.equals(this.creatorResource, merchandisingRule.creatorResource)
				&& Objects.equals(this.createdAt, merchandisingRule.createdAt)
				&& Objects.equals(this.updatedAt, merchandisingRule.updatedAt)
				&& Objects.equals(this.expanded, merchandisingRule.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, catalogId, taxonId, productId, position, hero, creatorId,
				creatorResource, createdAt, updatedAt, expanded);
	}

}