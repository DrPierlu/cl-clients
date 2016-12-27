package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * OrderValidator
 */
public class OrderValidator extends ApiResource {

	private static final long serialVersionUID = -1482845758094L;


	private String currencyId;
	private String orderTotalMinCents;
	private String orderTotalMaxCents;
	private String orderItemsMin;
	private String orderItemsMax;
	private String paymentMethodAction;
	private String paymentMethodRequiredPercentage;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object currency;
	private String orderTotalMin;
	private String formattedOrderTotalMin;
	private String orderTotalMax;
	private String formattedOrderTotalMax;


	public OrderValidator() {
		super();
	}
	

	public OrderValidator(Long id) {
		super(id);
	}
	

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	

	public String getCurrencyId() {
		return this.currencyId;
	}
	

	public void setOrderTotalMinCents(String orderTotalMinCents) {
		this.orderTotalMinCents = orderTotalMinCents;
	}
	

	public String getOrderTotalMinCents() {
		return this.orderTotalMinCents;
	}
	

	public void setOrderTotalMaxCents(String orderTotalMaxCents) {
		this.orderTotalMaxCents = orderTotalMaxCents;
	}
	

	public String getOrderTotalMaxCents() {
		return this.orderTotalMaxCents;
	}
	

	public void setOrderItemsMin(String orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
	}
	

	public String getOrderItemsMin() {
		return this.orderItemsMin;
	}
	

	public void setOrderItemsMax(String orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
	}
	

	public String getOrderItemsMax() {
		return this.orderItemsMax;
	}
	

	public void setPaymentMethodAction(String paymentMethodAction) {
		this.paymentMethodAction = paymentMethodAction;
	}
	

	public String getPaymentMethodAction() {
		return this.paymentMethodAction;
	}
	

	public void setPaymentMethodRequiredPercentage(String paymentMethodRequiredPercentage) {
		this.paymentMethodRequiredPercentage = paymentMethodRequiredPercentage;
	}
	

	public String getPaymentMethodRequiredPercentage() {
		return this.paymentMethodRequiredPercentage;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setOrderTotalMin(String orderTotalMin) {
		this.orderTotalMin = orderTotalMin;
	}
	

	public String getOrderTotalMin() {
		return this.orderTotalMin;
	}
	

	public void setFormattedOrderTotalMin(String formattedOrderTotalMin) {
		this.formattedOrderTotalMin = formattedOrderTotalMin;
	}
	

	public String getFormattedOrderTotalMin() {
		return this.formattedOrderTotalMin;
	}
	

	public void setOrderTotalMax(String orderTotalMax) {
		this.orderTotalMax = orderTotalMax;
	}
	

	public String getOrderTotalMax() {
		return this.orderTotalMax;
	}
	

	public void setFormattedOrderTotalMax(String formattedOrderTotalMax) {
		this.formattedOrderTotalMax = formattedOrderTotalMax;
	}
	

	public String getFormattedOrderTotalMax() {
		return this.formattedOrderTotalMax;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		OrderValidator x = (OrderValidator) o;
	
		return super.equals(o) &&
			Objects.equals(this.currencyId, x.currencyId)  &&
			Objects.equals(this.orderTotalMinCents, x.orderTotalMinCents)  &&
			Objects.equals(this.orderTotalMaxCents, x.orderTotalMaxCents)  &&
			Objects.equals(this.orderItemsMin, x.orderItemsMin)  &&
			Objects.equals(this.orderItemsMax, x.orderItemsMax)  &&
			Objects.equals(this.paymentMethodAction, x.paymentMethodAction)  &&
			Objects.equals(this.paymentMethodRequiredPercentage, x.paymentMethodRequiredPercentage)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.currency, x.currency)  &&
			Objects.equals(this.orderTotalMin, x.orderTotalMin)  &&
			Objects.equals(this.formattedOrderTotalMin, x.formattedOrderTotalMin)  &&
			Objects.equals(this.orderTotalMax, x.orderTotalMax)  &&
			Objects.equals(this.formattedOrderTotalMax, x.formattedOrderTotalMax) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, currencyId, orderTotalMinCents, orderTotalMaxCents, orderItemsMin,
			orderItemsMax, paymentMethodAction, paymentMethodRequiredPercentage, previousChanges, currency,
			orderTotalMin, formattedOrderTotalMin, orderTotalMax, formattedOrderTotalMax 
		);
	
	}
	
}