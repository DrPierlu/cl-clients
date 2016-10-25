
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Price
 */
public class Price extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("price_list_id")
	private String priceListId = null;

	@SerializedName("sellable_id")
	private String sellableId = null;

	@SerializedName("sellable_resource")
	private String sellableResource = null;

	@SerializedName("amount")
	private Float amount = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	@SerializedName("formatted")
	private String formatted = null;

	@SerializedName("exchanges")
	private String exchanges = null;

	public Price environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Price creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
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
		return Objects.equals(this.resourceName, price.resourceName) && Objects.equals(this.id, price.id)
				&& Objects.equals(this.environmentId, price.environmentId)
				&& Objects.equals(this.priceListId, price.priceListId)
				&& Objects.equals(this.sellableId, price.sellableId)
				&& Objects.equals(this.sellableResource, price.sellableResource)
				&& Objects.equals(this.amount, price.amount) && Objects.equals(this.creatorId, price.creatorId)
				&& Objects.equals(this.creatorResource, price.creatorResource)
				&& Objects.equals(this.createdAt, price.createdAt) && Objects.equals(this.updatedAt, price.updatedAt)
				&& Objects.equals(this.expanded, price.expanded) && Objects.equals(this.formatted, price.formatted)
				&& Objects.equals(this.exchanges, price.exchanges);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, priceListId, sellableId, sellableResource, amount,
				creatorId, creatorResource, createdAt, updatedAt, expanded, formatted, exchanges);
	}

}
