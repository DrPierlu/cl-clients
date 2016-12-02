
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * PriceList
 */
public class PriceList extends ApiResource {

	private String currencyId = null;
	private String name = null;
	private String taxIncluded = null;


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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PriceList priceList = (PriceList) o;
		return super.equals(o) && 
			Objects.equals(this.currencyId, priceList.currencyId) 
				&& Objects.equals(this.name, priceList.name)
				&& Objects.equals(this.taxIncluded, priceList.taxIncluded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, currencyId, name, taxIncluded, creatorResource,
				createdAt, updatedAt);
	}

}
