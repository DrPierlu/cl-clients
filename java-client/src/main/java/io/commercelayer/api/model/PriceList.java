
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * PriceList
 */
public class PriceList extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("currency_id")
	private String currencyId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("tax_included")
	private String taxIncluded = null;

	public PriceList environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public PriceList currencyId(String currencyId) {
		this.currencyId = currencyId;
		return this;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public PriceList name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PriceList taxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
		return this;
	}

	public String getTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public PriceList creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public PriceList creatorResource(String creatorResource) {
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
		PriceList priceList = (PriceList) o;
		return Objects.equals(this.resourceName, priceList.resourceName) && Objects.equals(this.id, priceList.id)
				&& Objects.equals(this.environmentId, priceList.environmentId)
				&& Objects.equals(this.currencyId, priceList.currencyId) && Objects.equals(this.name, priceList.name)
				&& Objects.equals(this.taxIncluded, priceList.taxIncluded)
				&& Objects.equals(this.creatorId, priceList.creatorId)
				&& Objects.equals(this.creatorResource, priceList.creatorResource)
				&& Objects.equals(this.createdAt, priceList.createdAt)
				&& Objects.equals(this.updatedAt, priceList.updatedAt)
				&& Objects.equals(this.expanded, priceList.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, currencyId, name, taxIncluded, creatorId, creatorResource,
				createdAt, updatedAt, expanded);
	}

}
