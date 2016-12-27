package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * PaymentMethod
 */
public class PaymentMethod extends ApiResource {

	private static final long serialVersionUID = -1482880735315L;


	@JsonExclude
	private String name;
	private Integer orderId;
	@JsonExclude
	private Integer paymentTypeId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	@JsonExclude
	private Integer gatewayId;
	private Integer billingAddressId;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private String redirectUrl;
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
	@JsonExclude
	private String taxableAmount;
	@JsonExclude
	private String formattedTaxableAmount;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private String formattedTaxAmount;
	@JsonExclude
	private String price;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String amount;
	@JsonExclude
	private String formattedAmount;


	public PaymentMethod() {
		super();
	}
	

	public PaymentMethod(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public Integer getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	

	public String getRedirectUrl() {
		return this.redirectUrl;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaymentMethod x = (PaymentMethod)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.paymentTypeId, x.paymentTypeId)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.billingAddressId, x.billingAddressId)
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.redirectUrl, x.redirectUrl)
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
			name, orderId, paymentTypeId, paymentSourceId, paymentSourceResource,
			gatewayId, billingAddressId, priceCents, amountCents, redirectUrl,
			previousChanges, order, paymentType, paymentSource, gateway,
			billingAddress, taxableAmount, formattedTaxableAmount, taxAmount, formattedTaxAmount,
			price, formattedPrice, amount, formattedAmount 
		);
	
	}
	

	@Override
	public PaymentMethod clone() {
	
		PaymentMethod no = new PaymentMethod();
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.paymentTypeId = this.paymentTypeId;
		no.paymentSourceId = this.paymentSourceId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.gatewayId = this.gatewayId;
		no.billingAddressId = this.billingAddressId;
		no.priceCents = this.priceCents;
		no.amountCents = this.amountCents;
		no.redirectUrl = this.redirectUrl;
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
