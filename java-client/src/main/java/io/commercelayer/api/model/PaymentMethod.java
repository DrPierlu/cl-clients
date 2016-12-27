package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * PaymentMethod
 */
public class PaymentMethod extends ApiResource {

	private static final long serialVersionUID = -1482845758109L;


	private String orderId;
	private String paymentTypeId;
	private String paymentSourceId;
	private String paymentSourceResource;
	private String gatewayId;
	private String billingAddressId;
	private String priceCents;
	private String amountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private Object billingAddress;
	private String taxableAmount;
	private String formattedTaxableAmount;
	private String taxAmount;
	private String formattedTaxAmount;
	private String price;
	private String formattedPrice;
	private String amount;
	private String formattedAmount;


	public PaymentMethod() {
		super();
	}
	

	public PaymentMethod(Long id) {
		super(id);
	}
	

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return this.orderId;
	}
	

	public void setPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public String getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public void setPaymentSourceId(String paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public String getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public String getGatewayId() {
		return this.gatewayId;
	}
	

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public String getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public void setAmountCents(String amountCents) {
		this.amountCents = amountCents;
	}
	

	public String getAmountCents() {
		return this.amountCents;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}
	

	public Object getBillingAddress() {
		return this.billingAddress;
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public void setFormattedTaxableAmount(String formattedTaxableAmount) {
		this.formattedTaxableAmount = formattedTaxableAmount;
	}
	

	public String getFormattedTaxableAmount() {
		return this.formattedTaxableAmount;
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public void setFormattedTaxAmount(String formattedTaxAmount) {
		this.formattedTaxAmount = formattedTaxAmount;
	}
	

	public String getFormattedTaxAmount() {
		return this.formattedTaxAmount;
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		PaymentMethod x = (PaymentMethod) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.paymentTypeId, x.paymentTypeId)  &&
			Objects.equals(this.paymentSourceId, x.paymentSourceId)  &&
			Objects.equals(this.paymentSourceResource, x.paymentSourceResource)  &&
			Objects.equals(this.gatewayId, x.gatewayId)  &&
			Objects.equals(this.billingAddressId, x.billingAddressId)  &&
			Objects.equals(this.priceCents, x.priceCents)  &&
			Objects.equals(this.amountCents, x.amountCents)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.paymentType, x.paymentType)  &&
			Objects.equals(this.paymentSource, x.paymentSource)  &&
			Objects.equals(this.gateway, x.gateway)  &&
			Objects.equals(this.billingAddress, x.billingAddress)  &&
			Objects.equals(this.taxableAmount, x.taxableAmount)  &&
			Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)  &&
			Objects.equals(this.taxAmount, x.taxAmount)  &&
			Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)  &&
			Objects.equals(this.price, x.price)  &&
			Objects.equals(this.formattedPrice, x.formattedPrice)  &&
			Objects.equals(this.amount, x.amount)  &&
			Objects.equals(this.formattedAmount, x.formattedAmount) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, paymentTypeId, paymentSourceId, paymentSourceResource,
			gatewayId, billingAddressId, priceCents, amountCents, previousChanges,
			order, paymentType, paymentSource, gateway, billingAddress,
			taxableAmount, formattedTaxableAmount, taxAmount, formattedTaxAmount, price,
			formattedPrice, amount, formattedAmount 
		);
	
	}
	
}