
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.BasicResource;

/**
 * OrderValidationPolicy
 */
public class OrderValidationPolicy extends BasicResource {

	private String environmentId = null;
	private String currencyId = null;
	private String billingAddressRequired = null;
	private Float orderTotalMin = null;
	private Float orderTotalMax = null;
	private String orderItemsMin = null;
	private String orderItemsMax = null;
	private String paymentMethodStatus = null;
	private String paymentMethodStatusPercentage = null;

	public OrderValidationPolicy environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public OrderValidationPolicy currencyId(String currencyId) {
		this.currencyId = currencyId;
		return this;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public OrderValidationPolicy billingAddressRequired(String billingAddressRequired) {
		this.billingAddressRequired = billingAddressRequired;
		return this;
	}

	public String getBillingAddressRequired() {
		return billingAddressRequired;
	}

	public void setBillingAddressRequired(String billingAddressRequired) {
		this.billingAddressRequired = billingAddressRequired;
	}

	public OrderValidationPolicy orderTotalMin(Float orderTotalMin) {
		this.orderTotalMin = orderTotalMin;
		return this;
	}

	public Float getOrderTotalMin() {
		return orderTotalMin;
	}

	public void setOrderTotalMin(Float orderTotalMin) {
		this.orderTotalMin = orderTotalMin;
	}

	public OrderValidationPolicy orderTotalMax(Float orderTotalMax) {
		this.orderTotalMax = orderTotalMax;
		return this;
	}

	public Float getOrderTotalMax() {
		return orderTotalMax;
	}

	public void setOrderTotalMax(Float orderTotalMax) {
		this.orderTotalMax = orderTotalMax;
	}

	public OrderValidationPolicy orderItemsMin(String orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
		return this;
	}

	public String getOrderItemsMin() {
		return orderItemsMin;
	}

	public void setOrderItemsMin(String orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
	}

	public OrderValidationPolicy orderItemsMax(String orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
		return this;
	}

	public String getOrderItemsMax() {
		return orderItemsMax;
	}

	public void setOrderItemsMax(String orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
	}

	public OrderValidationPolicy paymentMethodStatus(String paymentMethodStatus) {
		this.paymentMethodStatus = paymentMethodStatus;
		return this;
	}

	public String getPaymentMethodStatus() {
		return paymentMethodStatus;
	}

	public void setPaymentMethodStatus(String paymentMethodStatus) {
		this.paymentMethodStatus = paymentMethodStatus;
	}

	public OrderValidationPolicy paymentMethodStatusPercentage(String paymentMethodStatusPercentage) {
		this.paymentMethodStatusPercentage = paymentMethodStatusPercentage;
		return this;
	}

	public String getPaymentMethodStatusPercentage() {
		return paymentMethodStatusPercentage;
	}

	public void setPaymentMethodStatusPercentage(String paymentMethodStatusPercentage) {
		this.paymentMethodStatusPercentage = paymentMethodStatusPercentage;
	}

	public OrderValidationPolicy creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public OrderValidationPolicy creatorResource(String creatorResource) {
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
		OrderValidationPolicy orderValidationPolicy = (OrderValidationPolicy) o;
		return Objects.equals(this.resourceName, orderValidationPolicy.resourceName)
				&& Objects.equals(this.id, orderValidationPolicy.id)
				&& Objects.equals(this.environmentId, orderValidationPolicy.environmentId)
				&& Objects.equals(this.currencyId, orderValidationPolicy.currencyId)
				&& Objects.equals(this.billingAddressRequired, orderValidationPolicy.billingAddressRequired)
				&& Objects.equals(this.orderTotalMin, orderValidationPolicy.orderTotalMin)
				&& Objects.equals(this.orderTotalMax, orderValidationPolicy.orderTotalMax)
				&& Objects.equals(this.orderItemsMin, orderValidationPolicy.orderItemsMin)
				&& Objects.equals(this.orderItemsMax, orderValidationPolicy.orderItemsMax)
				&& Objects.equals(this.paymentMethodStatus, orderValidationPolicy.paymentMethodStatus)
				&& Objects.equals(this.paymentMethodStatusPercentage,
						orderValidationPolicy.paymentMethodStatusPercentage)
				&& Objects.equals(this.creatorId, orderValidationPolicy.creatorId)
				&& Objects.equals(this.creatorResource, orderValidationPolicy.creatorResource)
				&& Objects.equals(this.createdAt, orderValidationPolicy.createdAt)
				&& Objects.equals(this.updatedAt, orderValidationPolicy.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, currencyId, billingAddressRequired, orderTotalMin,
				orderTotalMax, orderItemsMin, orderItemsMax, paymentMethodStatus, paymentMethodStatusPercentage,
				creatorId, creatorResource, createdAt, updatedAt);
	}

}
