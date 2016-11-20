
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Price
 */
public class Price extends ApiResource {

	private String priceListId = null;
	private String sellableId = null;
	private String sellableResource = null;
	private Float amount = null;
	private String formatted = null;
	private String exchanges = null;

	
	public Price priceListId(String priceListId) {
		this.priceListId = priceListId;
		return this;
	}

	public String getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}

	public Price sellableId(String sellableId) {
		this.sellableId = sellableId;
		return this;
	}

	public String getSellableId() {
		return sellableId;
	}

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}

	public Price sellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
		return this;
	}

	public String getSellableResource() {
		return sellableResource;
	}

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}

	public Price amount(Float amount) {
		this.amount = amount;
		return this;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Price creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Price creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public Price formatted(String formatted) {
		this.formatted = formatted;
		return this;
	}

	public String getFormatted() {
		return formatted;
	}

	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}

	public Price exchanges(String exchanges) {
		this.exchanges = exchanges;
		return this;
	}

	public String getExchanges() {
		return exchanges;
	}

	public void setExchanges(String exchanges) {
		this.exchanges = exchanges;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Price price = (Price) o;
		return super.equals(o) && 
			Objects.equals(this.priceListId, price.priceListId)
				&& Objects.equals(this.sellableId, price.sellableId)
				&& Objects.equals(this.sellableResource, price.sellableResource)
				&& Objects.equals(this.amount, price.amount) 
				&& Objects.equals(this.formatted, price.formatted)
				&& Objects.equals(this.exchanges, price.exchanges);
	}

	@Override
	public int hashCode() {
		return Objects.hash(priceListId, sellableId, sellableResource, amount, formatted, exchanges);
	}

}
