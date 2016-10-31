
package io.commercelayer.api.model;

import java.util.Objects;

/**
 * LineItem
 */
public class LineItem extends ApiResource {

	private String environmentId = null;
	private String orderId = null;
	private String sellableId = null;
	private String sellableResource = null;
	private String shippingAddressId = null;
	private String quantity = null;
	private Float unitAmount = null;
	private Float taxRate = null;
	private String taxIncluded = null;
	private String taxBreakdown = null;
	private String amount = null;
	private String formattedUnitAmount = null;
	private String formattedAmount = null;

	public LineItem environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public LineItem orderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LineItem sellableId(String sellableId) {
		this.sellableId = sellableId;
		return this;
	}

	public String getSellableId() {
		return sellableId;
	}

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}

	public LineItem sellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
		return this;
	}

	public String getSellableResource() {
		return sellableResource;
	}

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}

	public LineItem shippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
		return this;
	}

	public String getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public LineItem quantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public LineItem unitAmount(Float unitAmount) {
		this.unitAmount = unitAmount;
		return this;
	}

	public Float getUnitAmount() {
		return unitAmount;
	}

	public void setUnitAmount(Float unitAmount) {
		this.unitAmount = unitAmount;
	}

	public LineItem taxRate(Float taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	public Float getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}

	public LineItem taxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
		return this;
	}

	public String getTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public LineItem taxBreakdown(String taxBreakdown) {
		this.taxBreakdown = taxBreakdown;
		return this;
	}

	public String getTaxBreakdown() {
		return taxBreakdown;
	}

	public void setTaxBreakdown(String taxBreakdown) {
		this.taxBreakdown = taxBreakdown;
	}

	public LineItem creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public LineItem creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public LineItem amount(String amount) {
		this.amount = amount;
		return this;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public LineItem formattedUnitAmount(String formattedUnitAmount) {
		this.formattedUnitAmount = formattedUnitAmount;
		return this;
	}

	public String getFormattedUnitAmount() {
		return formattedUnitAmount;
	}

	public void setFormattedUnitAmount(String formattedUnitAmount) {
		this.formattedUnitAmount = formattedUnitAmount;
	}

	public LineItem formattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
		return this;
	}

	public String getFormattedAmount() {
		return formattedAmount;
	}

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItem lineItem = (LineItem) o;
		return Objects.equals(this.resourceName, lineItem.resourceName) && Objects.equals(this.id, lineItem.id)
				&& Objects.equals(this.environmentId, lineItem.environmentId)
				&& Objects.equals(this.orderId, lineItem.orderId)
				&& Objects.equals(this.sellableId, lineItem.sellableId)
				&& Objects.equals(this.sellableResource, lineItem.sellableResource)
				&& Objects.equals(this.shippingAddressId, lineItem.shippingAddressId)
				&& Objects.equals(this.quantity, lineItem.quantity)
				&& Objects.equals(this.unitAmount, lineItem.unitAmount)
				&& Objects.equals(this.taxRate, lineItem.taxRate)
				&& Objects.equals(this.taxIncluded, lineItem.taxIncluded)
				&& Objects.equals(this.taxBreakdown, lineItem.taxBreakdown)
				&& Objects.equals(this.creatorId, lineItem.creatorId)
				&& Objects.equals(this.creatorResource, lineItem.creatorResource)
				&& Objects.equals(this.createdAt, lineItem.createdAt)
				&& Objects.equals(this.updatedAt, lineItem.updatedAt)
				&& Objects.equals(this.expanded, lineItem.expanded) && Objects.equals(this.amount, lineItem.amount)
				&& Objects.equals(this.formattedUnitAmount, lineItem.formattedUnitAmount)
				&& Objects.equals(this.formattedAmount, lineItem.formattedAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, orderId, sellableId, sellableResource, shippingAddressId,
				quantity, unitAmount, taxRate, taxIncluded, taxBreakdown, creatorId, creatorResource, createdAt,
				updatedAt, expanded, amount, formattedUnitAmount, formattedAmount);
	}

}
