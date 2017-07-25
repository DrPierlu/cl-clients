package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Invoice
 */
public class Invoice extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String amount;
	private Integer amountCents;
	private Integer billingAddressId;
	private Integer billingRecipientId;
	private Integer channelId;
	private Integer countryId;
	private Integer currencyId;
	private String formattedAmount;
	private String formattedTaxAmount;
	private String formattedTaxableAmount;
	private Integer marketId;
	private String name;
	private String number;
	private String orderAmountPercentage;
	private String orderAmountPercentageRounded;
	private Integer orderId;
	private Integer paymentMethodId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	private String taxAmount;
	private String taxRate;
	private String taxRateRounded;
	private String taxableAmount;
	private Integer transactionId;
	private List<String> versions;
	@JsonExclude
	private Object billingAddress;
	@JsonExclude
	private Object billingRecipient;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentMethod;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object referenceTransaction;


	public Invoice() {
		super();
	}
	

	public Invoice(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Invoice name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public Invoice marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	

	public Integer getChannelId() {
		return this.channelId;
	}
	

	public Invoice channelId(Integer channelId) {
		setChannelId(channelId);
		return this;
	}
	

	public Integer channelId() {
		return getChannelId();
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public Invoice countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public Invoice orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public Invoice currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	

	public Integer getPaymentMethodId() {
		return this.paymentMethodId;
	}
	

	public Invoice paymentMethodId(Integer paymentMethodId) {
		setPaymentMethodId(paymentMethodId);
		return this;
	}
	

	public Integer paymentMethodId() {
		return getPaymentMethodId();
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public Invoice paymentSourceResource(String paymentSourceResource) {
		setPaymentSourceResource(paymentSourceResource);
		return this;
	}
	

	public String paymentSourceResource() {
		return getPaymentSourceResource();
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public Invoice paymentSourceId(Integer paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public Integer paymentSourceId() {
		return getPaymentSourceId();
	}
	

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	

	public Integer getTransactionId() {
		return this.transactionId;
	}
	

	public Invoice transactionId(Integer transactionId) {
		setTransactionId(transactionId);
		return this;
	}
	

	public Integer transactionId() {
		return getTransactionId();
	}
	

	public void setBillingRecipientId(Integer billingRecipientId) {
		this.billingRecipientId = billingRecipientId;
	}
	

	public Integer getBillingRecipientId() {
		return this.billingRecipientId;
	}
	

	public Invoice billingRecipientId(Integer billingRecipientId) {
		setBillingRecipientId(billingRecipientId);
		return this;
	}
	

	public Integer billingRecipientId() {
		return getBillingRecipientId();
	}
	

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public Integer getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public Invoice billingAddressId(Integer billingAddressId) {
		setBillingAddressId(billingAddressId);
		return this;
	}
	

	public Integer billingAddressId() {
		return getBillingAddressId();
	}
	

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getNumber() {
		return this.number;
	}
	

	public Invoice number(String number) {
		setNumber(number);
		return this;
	}
	

	public String number() {
		return getNumber();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public Invoice amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	

	public String getTaxRate() {
		return this.taxRate;
	}
	

	public Invoice taxRate(String taxRate) {
		setTaxRate(taxRate);
		return this;
	}
	

	public String taxRate() {
		return getTaxRate();
	}
	

	public void setReferenceTransaction(Object referenceTransaction) {
		this.referenceTransaction = referenceTransaction;
	}
	

	public Object getReferenceTransaction() {
		return this.referenceTransaction;
	}
	

	public Invoice referenceTransaction(Object referenceTransaction) {
		setReferenceTransaction(referenceTransaction);
		return this;
	}
	

	public Object referenceTransaction() {
		return getReferenceTransaction();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public Invoice market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setChannel(Object channel) {
		this.channel = channel;
	}
	

	public Object getChannel() {
		return this.channel;
	}
	

	public Invoice channel(Object channel) {
		setChannel(channel);
		return this;
	}
	

	public Object channel() {
		return getChannel();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public Invoice country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public Invoice order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public Invoice currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setPaymentMethod(Object paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	

	public Object getPaymentMethod() {
		return this.paymentMethod;
	}
	

	public Invoice paymentMethod(Object paymentMethod) {
		setPaymentMethod(paymentMethod);
		return this;
	}
	

	public Object paymentMethod() {
		return getPaymentMethod();
	}
	

	public void setBillingRecipient(Object billingRecipient) {
		this.billingRecipient = billingRecipient;
	}
	

	public Object getBillingRecipient() {
		return this.billingRecipient;
	}
	

	public Invoice billingRecipient(Object billingRecipient) {
		setBillingRecipient(billingRecipient);
		return this;
	}
	

	public Object billingRecipient() {
		return getBillingRecipient();
	}
	

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}
	

	public Object getBillingAddress() {
		return this.billingAddress;
	}
	

	public Invoice billingAddress(Object billingAddress) {
		setBillingAddress(billingAddress);
		return this;
	}
	

	public Object billingAddress() {
		return getBillingAddress();
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public Invoice paymentSource(Object paymentSource) {
		setPaymentSource(paymentSource);
		return this;
	}
	

	public Object paymentSource() {
		return getPaymentSource();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Invoice versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public Invoice taxAmount(String taxAmount) {
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
	

	public Invoice formattedTaxAmount(String formattedTaxAmount) {
		setFormattedTaxAmount(formattedTaxAmount);
		return this;
	}
	

	public String formattedTaxAmount() {
		return getFormattedTaxAmount();
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public Invoice taxableAmount(String taxableAmount) {
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
	

	public Invoice formattedTaxableAmount(String formattedTaxableAmount) {
		setFormattedTaxableAmount(formattedTaxableAmount);
		return this;
	}
	

	public String formattedTaxableAmount() {
		return getFormattedTaxableAmount();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public Invoice amount(String amount) {
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
	

	public Invoice formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setTaxRateRounded(String taxRateRounded) {
		this.taxRateRounded = taxRateRounded;
	}
	

	public String getTaxRateRounded() {
		return this.taxRateRounded;
	}
	

	public Invoice taxRateRounded(String taxRateRounded) {
		setTaxRateRounded(taxRateRounded);
		return this;
	}
	

	public String taxRateRounded() {
		return getTaxRateRounded();
	}
	

	public void setOrderAmountPercentage(String orderAmountPercentage) {
		this.orderAmountPercentage = orderAmountPercentage;
	}
	

	public String getOrderAmountPercentage() {
		return this.orderAmountPercentage;
	}
	

	public Invoice orderAmountPercentage(String orderAmountPercentage) {
		setOrderAmountPercentage(orderAmountPercentage);
		return this;
	}
	

	public String orderAmountPercentage() {
		return getOrderAmountPercentage();
	}
	

	public void setOrderAmountPercentageRounded(String orderAmountPercentageRounded) {
		this.orderAmountPercentageRounded = orderAmountPercentageRounded;
	}
	

	public String getOrderAmountPercentageRounded() {
		return this.orderAmountPercentageRounded;
	}
	

	public Invoice orderAmountPercentageRounded(String orderAmountPercentageRounded) {
		setOrderAmountPercentageRounded(orderAmountPercentageRounded);
		return this;
	}
	

	public String orderAmountPercentageRounded() {
		return getOrderAmountPercentageRounded();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Invoice x = (Invoice)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.channelId, x.channelId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.paymentMethodId, x.paymentMethodId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.transactionId, x.transactionId)
			&& Objects.equals(this.billingRecipientId, x.billingRecipientId)
			&& Objects.equals(this.billingAddressId, x.billingAddressId)
			&& Objects.equals(this.number, x.number)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.taxRate, x.taxRate)
			&& Objects.equals(this.referenceTransaction, x.referenceTransaction)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.channel, x.channel)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.paymentMethod, x.paymentMethod)
			&& Objects.equals(this.billingRecipient, x.billingRecipient)
			&& Objects.equals(this.billingAddress, x.billingAddress)
			&& Objects.equals(this.paymentSource, x.paymentSource)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.taxRateRounded, x.taxRateRounded)
			&& Objects.equals(this.orderAmountPercentage, x.orderAmountPercentage)
			&& Objects.equals(this.orderAmountPercentageRounded, x.orderAmountPercentageRounded)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, channelId, countryId, orderId,
			currencyId, paymentMethodId, paymentSourceResource, paymentSourceId, transactionId,
			billingRecipientId, billingAddressId, number, amountCents, taxRate,
			referenceTransaction, market, channel, country, order,
			currency, paymentMethod, billingRecipient, billingAddress, paymentSource,
			versions, taxAmount, formattedTaxAmount, taxableAmount, formattedTaxableAmount,
			amount, formattedAmount, taxRateRounded, orderAmountPercentage, orderAmountPercentageRounded
			
		);
	
	}
	

	@Override
	public Invoice clone() {
	
		Invoice no = new Invoice();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.channelId = this.channelId;
		no.countryId = this.countryId;
		no.orderId = this.orderId;
		no.currencyId = this.currencyId;
		no.paymentMethodId = this.paymentMethodId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.paymentSourceId = this.paymentSourceId;
		no.transactionId = this.transactionId;
		no.billingRecipientId = this.billingRecipientId;
		no.billingAddressId = this.billingAddressId;
		no.number = this.number;
		no.amountCents = this.amountCents;
		no.taxRate = this.taxRate;
		no.referenceTransaction = this.referenceTransaction;
		no.market = this.market;
		no.channel = this.channel;
		no.country = this.country;
		no.order = this.order;
		no.currency = this.currency;
		no.paymentMethod = this.paymentMethod;
		no.billingRecipient = this.billingRecipient;
		no.billingAddress = this.billingAddress;
		no.paymentSource = this.paymentSource;
		no.versions = this.versions;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.taxRateRounded = this.taxRateRounded;
		no.orderAmountPercentage = this.orderAmountPercentage;
		no.orderAmountPercentageRounded = this.orderAmountPercentageRounded;
	
		return no;
	
	}
	
}
