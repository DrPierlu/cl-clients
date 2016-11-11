
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Market
 */
public class Market extends ApiResource {

	private String environmentId = null;
	private String channelId = null;
	private String countryGroupId = null;
	private String merchantId = null;
	private String catalogId = null;
	private String priceListId = null;
	private String stockLocationId = null;
	private String orderValidationPolicyId = null;

	public Market environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Market channelId(String channelId) {
		this.channelId = channelId;
		return this;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Market countryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
		return this;
	}

	public String getCountryGroupId() {
		return countryGroupId;
	}

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}

	public Market merchantId(String merchantId) {
		this.merchantId = merchantId;
		return this;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Market catalogId(String catalogId) {
		this.catalogId = catalogId;
		return this;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public Market priceListId(String priceListId) {
		this.priceListId = priceListId;
		return this;
	}

	public String getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}

	public Market stockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
		return this;
	}

	public String getStockLocationId() {
		return stockLocationId;
	}

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}

	public Market orderValidationPolicyId(String orderValidationPolicyId) {
		this.orderValidationPolicyId = orderValidationPolicyId;
		return this;
	}

	public String getOrderValidationPolicyId() {
		return orderValidationPolicyId;
	}

	public void setOrderValidationPolicyId(String orderValidationPolicyId) {
		this.orderValidationPolicyId = orderValidationPolicyId;
	}

	public Market creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Market creatorResource(String creatorResource) {
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
		Market market = (Market) o;
		return Objects.equals(this.resourceName, market.resourceName) && Objects.equals(this.id, market.id)
				&& Objects.equals(this.environmentId, market.environmentId)
				&& Objects.equals(this.channelId, market.channelId)
				&& Objects.equals(this.countryGroupId, market.countryGroupId)
				&& Objects.equals(this.merchantId, market.merchantId)
				&& Objects.equals(this.catalogId, market.catalogId)
				&& Objects.equals(this.priceListId, market.priceListId)
				&& Objects.equals(this.stockLocationId, market.stockLocationId)
				&& Objects.equals(this.orderValidationPolicyId, market.orderValidationPolicyId)
				&& Objects.equals(this.creatorId, market.creatorId)
				&& Objects.equals(this.creatorResource, market.creatorResource)
				&& Objects.equals(this.createdAt, market.createdAt) && Objects.equals(this.updatedAt, market.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, channelId, countryGroupId, merchantId, catalogId,
				priceListId, stockLocationId, orderValidationPolicyId, creatorId, creatorResource, createdAt, updatedAt);
	}

}
