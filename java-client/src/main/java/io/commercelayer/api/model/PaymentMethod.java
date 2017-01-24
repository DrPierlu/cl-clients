package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * PaymentMethod
 */
public class PaymentMethod extends ApiResource {

	private static final long serialVersionUID = -1485265142520L;


	private Integer billingAddressId;
	private Integer orderId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	@JsonExclude
	private String amount;
	@JsonExclude
	private Integer amountCents;
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
	private Integer gatewayId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private Integer paymentTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String price;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private String redirectUrl;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private Float taxRate;
	@JsonExclude
	private Boolean taxable;
	@JsonExclude
	private String taxableAmount;


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
	

	public PaymentMethod name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public PaymentMethod orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public PaymentMethod paymentTypeId(Integer paymentTypeId) {
		setPaymentTypeId(paymentTypeId);
		return this;
	}
	

	public Integer paymentTypeId() {
		return getPaymentTypeId();
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public PaymentMethod paymentSourceId(Integer paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public Integer paymentSourceId() {
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
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public PaymentMethod gatewayId(Integer gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public Integer gatewayId() {
		return getGatewayId();
	}
	

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public Integer getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public PaymentMethod billingAddressId(Integer billingAddressId) {
		setBillingAddressId(billingAddressId);
		return this;
	}
	

	public Integer billingAddressId() {
		return getBillingAddressId();
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public PaymentMethod priceCents(Integer priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public Integer priceCents() {
		return getPriceCents();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public PaymentMethod amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	

	public PaymentMethod redirectUrl(String redirectUrl) {
		setRedirectUrl(redirectUrl);
		return this;
	}
	

	public String redirectUrl() {
		return getRedirectUrl();
	}
	

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}
	

	public Boolean getTaxable() {
		return this.taxable;
	}
	

	public PaymentMethod taxable(Boolean taxable) {
		setTaxable(taxable);
		return this;
	}
	

	public Boolean taxable() {
		return getTaxable();
	}
	

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}
	

	public Float getTaxRate() {
		return this.taxRate;
	}
	

	public PaymentMethod taxRate(Float taxRate) {
		setTaxRate(taxRate);
		return this;
	}
	

	public Float taxRate() {
		return getTaxRate();
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
			&& Objects.equals(this.taxable, x.taxable)
			&& Objects.equals(this.taxRate, x.taxRate)
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
			taxable, taxRate, previousChanges, order, paymentType,
			paymentSource, gateway, billingAddress, taxableAmount, formattedTaxableAmount,
			taxAmount, formattedTaxAmount, price, formattedPrice, amount,
			formattedAmount 
		);
	
	}
	

	@Override
	public PaymentMethod clone() {
	
		PaymentMethod no = new PaymentMethod();
	
		no = super.clone(no);
	
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
		no.taxable = this.taxable;
		no.taxRate = this.taxRate;
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
