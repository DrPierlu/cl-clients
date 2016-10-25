
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Order
 */
public class Order extends ApiObject {
 
  @SerializedName("environment_id")
  private String environmentId = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("shipping_address_id")
  private String shippingAddressId = null;

  @SerializedName("billing_address_id")
  private String billingAddressId = null;

  @SerializedName("creator_id")
  private String creatorId = null;

  @SerializedName("creator_resource")
  private String creatorResource = null;

  public Order environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public Order merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public Order channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public Order countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public Order currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }


  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Order shippingAddressId(String shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
    return this;
  }

  public String getShippingAddressId() {
    return shippingAddressId;
  }

  public void setShippingAddressId(String shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public Order billingAddressId(String billingAddressId) {
    this.billingAddressId = billingAddressId;
    return this;
  }

  public String getBillingAddressId() {
    return billingAddressId;
  }

  public void setBillingAddressId(String billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  public Order creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public Order creatorResource(String creatorResource) {
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
    Order order = (Order) o;
    return Objects.equals(this.resourceName, order.resourceName) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.environmentId, order.environmentId) &&
        Objects.equals(this.merchantId, order.merchantId) &&
        Objects.equals(this.channelId, order.channelId) &&
        Objects.equals(this.countryId, order.countryId) &&
        Objects.equals(this.currencyId, order.currencyId) &&
        Objects.equals(this.shippingAddressId, order.shippingAddressId) &&
        Objects.equals(this.billingAddressId, order.billingAddressId) &&
        Objects.equals(this.creatorId, order.creatorId) &&
        Objects.equals(this.creatorResource, order.creatorResource) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.updatedAt, order.updatedAt) &&
        Objects.equals(this.expanded, order.expanded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, id, environmentId, merchantId, channelId, countryId, currencyId, shippingAddressId, billingAddressId, creatorId, creatorResource, createdAt, updatedAt, expanded);
  }

}
