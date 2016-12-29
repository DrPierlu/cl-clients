package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * PaymentMethod
 */
public class PaymentMethod extends ApiResource {

	private static final long serialVersionUID = -1483024665810L;


	private String billingAddressId;
	private String orderId;
	private String paymentSourceId;
	private String paymentSourceResource;
	@JsonExclude
	private String amount;
	@JsonExclude
	private String amountCents;
	@JsonExclude
	private Object billingAddress;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String formattedTaxAmount;
	@JsonExclude
	private String formattedTaxableAmount;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private String gatewayId;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private String paymentTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String price;
	@JsonExclude
	private String priceCents;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private String taxableAmount;


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
	

	public PaymentMethod orderId(String orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public String orderId() {
		return getOrderId();
	}
	

	public void setPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public String getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public PaymentMethod paymentTypeId(String paymentTypeId) {
		setPaymentTypeId(paymentTypeId);
		return this;
	}
	

	public String paymentTypeId() {
		return getPaymentTypeId();
	}
	

	public void setPaymentSourceId(String paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public String getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public PaymentMethod paymentSourceId(String paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public String paymentSourceId() {
		return getPaymentSourceId();
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public PaymentMethod paymentSourceResource(String paymentSourceResource) {
		setPaymentSourceResource(paymentSourceResource);
		return this;
	}
	

	public String paymentSourceResource() {
		return getPaymentSourceResource();
	}
	

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public String getGatewayId() {
		return this.gatewayId;
	}
	

	public PaymentMethod gatewayId(String gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public String gatewayId() {
		return getGatewayId();
	}
	

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public String getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public PaymentMethod billingAddressId(String billingAddressId) {
		setBillingAddressId(billingAddressId);
		return this;
	}
	

	public String billingAddressId() {
		return getBillingAddressId();
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public PaymentMethod priceCents(String priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public String priceCents() {
		return getPriceCents();
	}
	

	public void setAmountCents(String amountCents) {
		this.amountCents = amountCents;
	}
	

	public String getAmountCents() {
		return this.amountCents;
	}
	

	public PaymentMethod amountCents(String amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public String amountCents() {
		return getAmountCents();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public PaymentMethod previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public PaymentMethod order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public PaymentMethod paymentType(Object paymentType) {
		setPaymentType(paymentType);
		return this;
	}
	

	public Object paymentType() {
		return getPaymentType();
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public PaymentMethod paymentSource(Object paymentSource) {
		setPaymentSource(paymentSource);
		return this;
	}
	

	public Object paymentSource() {
		return getPaymentSource();
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public PaymentMethod gateway(Object gateway) {
		setGateway(gateway);
		return this;
	}
	

	public Object gateway() {
		return getGateway();
	}
	

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}
	

	public Object getBillingAddress() {
		return this.billingAddress;
	}
	

	public PaymentMethod billingAddress(Object billingAddress) {
		setBillingAddress(billingAddress);
		return this;
	}
	

	public Object billingAddress() {
		return getBillingAddress();
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public PaymentMethod taxableAmount(String taxableAmount) {
		setTaxableAmount(taxableAmount);
		return this;
	}
	

	public String taxableAmount() {
		return getTaxableAmount();
	}
	

	public void setFormattedTaxableAmount(String formattedTaxableAmount) {
		this.formattedTaxableAmount = formattedTaxableAmount;
	}
	

	public String getFormattedTaxableAmount() {
		return this.formattedTaxableAmount;
	}
	

	public PaymentMethod formattedTaxableAmount(String formattedTaxableAmount) {
		setFormattedTaxableAmount(formattedTaxableAmount);
		return this;
	}
	

	public String formattedTaxableAmount() {
		return getFormattedTaxableAmount();
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public PaymentMethod taxAmount(String taxAmount) {
		setTaxAmount(taxAmount);
		return this;
	}
	

	public String taxAmount() {
		return getTaxAmount();
	}
	

	public void setFormattedTaxAmount(String formattedTaxAmount) {
		this.formattedTaxAmount = formattedTaxAmount;
	}
	

	public String getFormattedTaxAmount() {
		return this.formattedTaxAmount;
	}
	

	public PaymentMethod formattedTaxAmount(String formattedTaxAmount) {
		setFormattedTaxAmount(formattedTaxAmount);
		return this;
	}
	

	public String formattedTaxAmount() {
		return getFormattedTaxAmount();
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public PaymentMethod price(String price) {
		setPrice(price);
		return this;
	}
	

	public String price() {
		return getPrice();
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public PaymentMethod formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public PaymentMethod amount(String amount) {
		setAmount(amount);
		return this;
	}
	

	public String amount() {
		return getAmount();
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public PaymentMethod formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaymentMethod x = (PaymentMethod)o;
	
		return super.equals(o)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.paymentTypeId, x.paymentTypeId)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.billingAddressId, x.billingAddressId)
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.paymentType, x.paymentType)
			&& Objects.equals(this.paymentSource, x.paymentSource)
			&& Objects.equals(this.gateway, x.gateway)
			&& Objects.equals(this.billingAddress, x.billingAddress)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.price, x.price)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			orderId, paymentTypeId, paymentSourceId, paymentSourceResource, gatewayId,
			billingAddressId, priceCents, amountCents, previousChanges, order,
			paymentType, paymentSource, gateway, billingAddress, taxableAmount,
			formattedTaxableAmount, taxAmount, formattedTaxAmount, price, formattedPrice,
			amount, formattedAmount 
		);
	
	}
	

	@Override
	public PaymentMethod clone() {
	
		PaymentMethod no = new PaymentMethod();
	
		no.orderId = this.orderId;
		no.paymentTypeId = this.paymentTypeId;
		no.paymentSourceId = this.paymentSourceId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.gatewayId = this.gatewayId;
		no.billingAddressId = this.billingAddressId;
		no.priceCents = this.priceCents;
		no.amountCents = this.amountCents;
		no.previousChanges = this.previousChanges;
		no.order = this.order;
		no.paymentType = this.paymentType;
		no.paymentSource = this.paymentSource;
		no.gateway = this.gateway;
		no.billingAddress = this.billingAddress;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.price = this.price;
		no.formattedPrice = this.formattedPrice;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
	
		return no;
	
	}
	
}
