package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


/**
 * Order
 */
public class Order extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer channelId;
	private Integer countryId;
	private Integer customerId;
	private Integer languageId;
	@JsonExclude
	private LocalDateTime approvedAt;
	@JsonExclude
	private List<String> billingAddresses;
	@JsonExclude
	private List<String> billingRecipients;
	@JsonExclude
	private LocalDateTime canceledAt;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private Object country;
	@JsonExclude
	private List<String> creditCards;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private Object customer;
	@JsonExclude
	private List<String> events;
	@JsonExclude
	private String formattedTotalAmount;
	@JsonExclude
	private String formattedTotalAmountWithMissingPaymentMethod;
	@JsonExclude
	private String formattedTotalAmountWithPaymentMethodRequired;
	@JsonExclude
	private String formattedTotalAmountWithTax;
	@JsonExclude
	private String formattedTotalLineItemAmount;
	@JsonExclude
	private String formattedTotalLineItemTaxAmount;
	@JsonExclude
	private String formattedTotalLineItemTaxableAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodPrice;
	@JsonExclude
	private String formattedTotalPaymentMethodTaxAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodTaxableAmount;
	@JsonExclude
	private String formattedTotalShippingMethodAmount;
	@JsonExclude
	private String formattedTotalShippingMethodTaxAmount;
	@JsonExclude
	private String formattedTotalShippingMethodTaxableAmount;
	@JsonExclude
	private String formattedTotalTaxAmount;
	@JsonExclude
	private String formattedTotalTaxableAmount;
	@JsonExclude
	private LocalDateTime fulfilledAt;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private Object language;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Integer marketId;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Integer merchantId;
	@JsonExclude
	private List<String> metaFields;
	@JsonExclude
	private String name;
	@JsonExclude
	private String number;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private String paymentState;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private List<String> paypalAccounts;
	@JsonExclude
	private String pendingTransactions;
	@JsonExclude
	private LocalDateTime placedAt;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> resourceMetaFields;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private List<String> shippingAddresses;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingRecipients;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private String shippingState;
	@JsonExclude
	private String state;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private String taxCalculated;
	@JsonExclude
	private Boolean taxIncluded;
	@JsonExclude
	private String token;
	@JsonExclude
	private String totalAmount;
	@JsonExclude
	private String totalAmountWithMissingPaymentMethod;
	@JsonExclude
	private String totalAmountWithPaymentMethodRequired;
	@JsonExclude
	private String totalAmountWithTax;
	@JsonExclude
	private String totalLineItemAmount;
	@JsonExclude
	private String totalLineItemTaxAmount;
	@JsonExclude
	private String totalLineItemTaxableAmount;
	@JsonExclude
	private String totalLineItemsCount;
	@JsonExclude
	private String totalPaymentMethodAmount;
	@JsonExclude
	private String totalPaymentMethodPrice;
	@JsonExclude
	private String totalPaymentMethodTaxAmount;
	@JsonExclude
	private String totalPaymentMethodTaxableAmount;
	@JsonExclude
	private String totalShippingMethodAmount;
	@JsonExclude
	private String totalShippingMethodTaxAmount;
	@JsonExclude
	private String totalShippingMethodTaxableAmount;
	@JsonExclude
	private String totalTaxAmount;
	@JsonExclude
	private String totalTaxableAmount;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> variants;
	@JsonExclude
	private List<String> versions;
	@JsonExclude
	private List<String> wireTransfers;


	public Order() {
		super();
	}
	

	public Order(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Order name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	

	public Integer getCustomerId() {
		return this.customerId;
	}
	

	public Order customerId(Integer customerId) {
		setCustomerId(customerId);
		return this;
	}
	

	public Integer customerId() {
		return getCustomerId();
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public Order merchantId(Integer merchantId) {
		setMerchantId(merchantId);
		return this;
	}
	

	public Integer merchantId() {
		return getMerchantId();
	}
	

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	

	public Integer getChannelId() {
		return this.channelId;
	}
	

	public Order channelId(Integer channelId) {
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
	

	public Order countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	

	public Integer getLanguageId() {
		return this.languageId;
	}
	

	public Order languageId(Integer languageId) {
		setLanguageId(languageId);
		return this;
	}
	

	public Integer languageId() {
		return getLanguageId();
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public Order marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public Order currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public Order token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getNumber() {
		return this.number;
	}
	

	public Order number(String number) {
		setNumber(number);
		return this;
	}
	

	public String number() {
		return getNumber();
	}
	

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Boolean getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public Order taxIncluded(Boolean taxIncluded) {
		setTaxIncluded(taxIncluded);
		return this;
	}
	

	public Boolean taxIncluded() {
		return getTaxIncluded();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Order state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	

	public String getShippingState() {
		return this.shippingState;
	}
	

	public Order shippingState(String shippingState) {
		setShippingState(shippingState);
		return this;
	}
	

	public String shippingState() {
		return getShippingState();
	}
	

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	

	public String getPaymentState() {
		return this.paymentState;
	}
	

	public Order paymentState(String paymentState) {
		setPaymentState(paymentState);
		return this;
	}
	

	public String paymentState() {
		return getPaymentState();
	}
	

	public void setPlacedAt(LocalDateTime placedAt) {
		this.placedAt = placedAt;
	}
	

	public LocalDateTime getPlacedAt() {
		return this.placedAt;
	}
	

	public Order placedAt(LocalDateTime placedAt) {
		setPlacedAt(placedAt);
		return this;
	}
	

	public LocalDateTime placedAt() {
		return getPlacedAt();
	}
	

	public void setApprovedAt(LocalDateTime approvedAt) {
		this.approvedAt = approvedAt;
	}
	

	public LocalDateTime getApprovedAt() {
		return this.approvedAt;
	}
	

	public Order approvedAt(LocalDateTime approvedAt) {
		setApprovedAt(approvedAt);
		return this;
	}
	

	public LocalDateTime approvedAt() {
		return getApprovedAt();
	}
	

	public void setCanceledAt(LocalDateTime canceledAt) {
		this.canceledAt = canceledAt;
	}
	

	public LocalDateTime getCanceledAt() {
		return this.canceledAt;
	}
	

	public Order canceledAt(LocalDateTime canceledAt) {
		setCanceledAt(canceledAt);
		return this;
	}
	

	public LocalDateTime canceledAt() {
		return getCanceledAt();
	}
	

	public void setFulfilledAt(LocalDateTime fulfilledAt) {
		this.fulfilledAt = fulfilledAt;
	}
	

	public LocalDateTime getFulfilledAt() {
		return this.fulfilledAt;
	}
	

	public Order fulfilledAt(LocalDateTime fulfilledAt) {
		setFulfilledAt(fulfilledAt);
		return this;
	}
	

	public LocalDateTime fulfilledAt() {
		return getFulfilledAt();
	}
	

	public void setChannel(Object channel) {
		this.channel = channel;
	}
	

	public Object getChannel() {
		return this.channel;
	}
	

	public Order channel(Object channel) {
		setChannel(channel);
		return this;
	}
	

	public Object channel() {
		return getChannel();
	}
	

	public void setCustomer(Object customer) {
		this.customer = customer;
	}
	

	public Object getCustomer() {
		return this.customer;
	}
	

	public Order customer(Object customer) {
		setCustomer(customer);
		return this;
	}
	

	public Object customer() {
		return getCustomer();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public Order country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setLanguage(Object language) {
		this.language = language;
	}
	

	public Object getLanguage() {
		return this.language;
	}
	

	public Order language(Object language) {
		setLanguage(language);
		return this;
	}
	

	public Object language() {
		return getLanguage();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public Order market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public Order merchant(Object merchant) {
		setMerchant(merchant);
		return this;
	}
	

	public Object merchant() {
		return getMerchant();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public Order currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Order versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setEvents(List<String> events) {
		this.events = events;
	}
	

	public List<String> getEvents() {
		return this.events;
	}
	

	public Order events(List<String> events) {
		setEvents(events);
		return this;
	}
	

	public List<String> events() {
		return getEvents();
	}
	

	public void setResourceMetaFields(List<String> resourceMetaFields) {
		this.resourceMetaFields = resourceMetaFields;
	}
	

	public List<String> getResourceMetaFields() {
		return this.resourceMetaFields;
	}
	

	public Order resourceMetaFields(List<String> resourceMetaFields) {
		setResourceMetaFields(resourceMetaFields);
		return this;
	}
	

	public List<String> resourceMetaFields() {
		return getResourceMetaFields();
	}
	

	public void setMetaFields(List<String> metaFields) {
		this.metaFields = metaFields;
	}
	

	public List<String> getMetaFields() {
		return this.metaFields;
	}
	

	public Order metaFields(List<String> metaFields) {
		setMetaFields(metaFields);
		return this;
	}
	

	public List<String> metaFields() {
		return getMetaFields();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Order lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Order lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public Order paymentMethods(List<String> paymentMethods) {
		setPaymentMethods(paymentMethods);
		return this;
	}
	

	public List<String> paymentMethods() {
		return getPaymentMethods();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public Order shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
	}
	

	public Order shipments(List<String> shipments) {
		setShipments(shipments);
		return this;
	}
	

	public List<String> shipments() {
		return getShipments();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public Order transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public Order invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public Order products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public Order variants(List<String> variants) {
		setVariants(variants);
		return this;
	}
	

	public List<String> variants() {
		return getVariants();
	}
	

	public void setShippingAddresses(List<String> shippingAddresses) {
		this.shippingAddresses = shippingAddresses;
	}
	

	public List<String> getShippingAddresses() {
		return this.shippingAddresses;
	}
	

	public Order shippingAddresses(List<String> shippingAddresses) {
		setShippingAddresses(shippingAddresses);
		return this;
	}
	

	public List<String> shippingAddresses() {
		return getShippingAddresses();
	}
	

	public void setShippingRecipients(List<String> shippingRecipients) {
		this.shippingRecipients = shippingRecipients;
	}
	

	public List<String> getShippingRecipients() {
		return this.shippingRecipients;
	}
	

	public Order shippingRecipients(List<String> shippingRecipients) {
		setShippingRecipients(shippingRecipients);
		return this;
	}
	

	public List<String> shippingRecipients() {
		return getShippingRecipients();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public Order shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
	}
	

	public void setBillingAddresses(List<String> billingAddresses) {
		this.billingAddresses = billingAddresses;
	}
	

	public List<String> getBillingAddresses() {
		return this.billingAddresses;
	}
	

	public Order billingAddresses(List<String> billingAddresses) {
		setBillingAddresses(billingAddresses);
		return this;
	}
	

	public List<String> billingAddresses() {
		return getBillingAddresses();
	}
	

	public void setBillingRecipients(List<String> billingRecipients) {
		this.billingRecipients = billingRecipients;
	}
	

	public List<String> getBillingRecipients() {
		return this.billingRecipients;
	}
	

	public Order billingRecipients(List<String> billingRecipients) {
		setBillingRecipients(billingRecipients);
		return this;
	}
	

	public List<String> billingRecipients() {
		return getBillingRecipients();
	}
	

	public void setCreditCards(List<String> creditCards) {
		this.creditCards = creditCards;
	}
	

	public List<String> getCreditCards() {
		return this.creditCards;
	}
	

	public Order creditCards(List<String> creditCards) {
		setCreditCards(creditCards);
		return this;
	}
	

	public List<String> creditCards() {
		return getCreditCards();
	}
	

	public void setWireTransfers(List<String> wireTransfers) {
		this.wireTransfers = wireTransfers;
	}
	

	public List<String> getWireTransfers() {
		return this.wireTransfers;
	}
	

	public Order wireTransfers(List<String> wireTransfers) {
		setWireTransfers(wireTransfers);
		return this;
	}
	

	public List<String> wireTransfers() {
		return getWireTransfers();
	}
	

	public void setPaypalAccounts(List<String> paypalAccounts) {
		this.paypalAccounts = paypalAccounts;
	}
	

	public List<String> getPaypalAccounts() {
		return this.paypalAccounts;
	}
	

	public Order paypalAccounts(List<String> paypalAccounts) {
		setPaypalAccounts(paypalAccounts);
		return this;
	}
	

	public List<String> paypalAccounts() {
		return getPaypalAccounts();
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public Order marketPaymentTypes(List<String> marketPaymentTypes) {
		setMarketPaymentTypes(marketPaymentTypes);
		return this;
	}
	

	public List<String> marketPaymentTypes() {
		return getMarketPaymentTypes();
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public Order paymentTypes(List<String> paymentTypes) {
		setPaymentTypes(paymentTypes);
		return this;
	}
	

	public List<String> paymentTypes() {
		return getPaymentTypes();
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public Order marketShippingServices(List<String> marketShippingServices) {
		setMarketShippingServices(marketShippingServices);
		return this;
	}
	

	public List<String> marketShippingServices() {
		return getMarketShippingServices();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public Order stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setTotalAmountWithTax(String totalAmountWithTax) {
		this.totalAmountWithTax = totalAmountWithTax;
	}
	

	public String getTotalAmountWithTax() {
		return this.totalAmountWithTax;
	}
	

	public Order totalAmountWithTax(String totalAmountWithTax) {
		setTotalAmountWithTax(totalAmountWithTax);
		return this;
	}
	

	public String totalAmountWithTax() {
		return getTotalAmountWithTax();
	}
	

	public void setFormattedTotalAmountWithTax(String formattedTotalAmountWithTax) {
		this.formattedTotalAmountWithTax = formattedTotalAmountWithTax;
	}
	

	public String getFormattedTotalAmountWithTax() {
		return this.formattedTotalAmountWithTax;
	}
	

	public Order formattedTotalAmountWithTax(String formattedTotalAmountWithTax) {
		setFormattedTotalAmountWithTax(formattedTotalAmountWithTax);
		return this;
	}
	

	public String formattedTotalAmountWithTax() {
		return getFormattedTotalAmountWithTax();
	}
	

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	

	public String getTotalAmount() {
		return this.totalAmount;
	}
	

	public Order totalAmount(String totalAmount) {
		setTotalAmount(totalAmount);
		return this;
	}
	

	public String totalAmount() {
		return getTotalAmount();
	}
	

	public void setFormattedTotalAmount(String formattedTotalAmount) {
		this.formattedTotalAmount = formattedTotalAmount;
	}
	

	public String getFormattedTotalAmount() {
		return this.formattedTotalAmount;
	}
	

	public Order formattedTotalAmount(String formattedTotalAmount) {
		setFormattedTotalAmount(formattedTotalAmount);
		return this;
	}
	

	public String formattedTotalAmount() {
		return getFormattedTotalAmount();
	}
	

	public void setTotalLineItemAmount(String totalLineItemAmount) {
		this.totalLineItemAmount = totalLineItemAmount;
	}
	

	public String getTotalLineItemAmount() {
		return this.totalLineItemAmount;
	}
	

	public Order totalLineItemAmount(String totalLineItemAmount) {
		setTotalLineItemAmount(totalLineItemAmount);
		return this;
	}
	

	public String totalLineItemAmount() {
		return getTotalLineItemAmount();
	}
	

	public void setFormattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		this.formattedTotalLineItemAmount = formattedTotalLineItemAmount;
	}
	

	public String getFormattedTotalLineItemAmount() {
		return this.formattedTotalLineItemAmount;
	}
	

	public Order formattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		setFormattedTotalLineItemAmount(formattedTotalLineItemAmount);
		return this;
	}
	

	public String formattedTotalLineItemAmount() {
		return getFormattedTotalLineItemAmount();
	}
	

	public void setTotalShippingMethodAmount(String totalShippingMethodAmount) {
		this.totalShippingMethodAmount = totalShippingMethodAmount;
	}
	

	public String getTotalShippingMethodAmount() {
		return this.totalShippingMethodAmount;
	}
	

	public Order totalShippingMethodAmount(String totalShippingMethodAmount) {
		setTotalShippingMethodAmount(totalShippingMethodAmount);
		return this;
	}
	

	public String totalShippingMethodAmount() {
		return getTotalShippingMethodAmount();
	}
	

	public void setFormattedTotalShippingMethodAmount(String formattedTotalShippingMethodAmount) {
		this.formattedTotalShippingMethodAmount = formattedTotalShippingMethodAmount;
	}
	

	public String getFormattedTotalShippingMethodAmount() {
		return this.formattedTotalShippingMethodAmount;
	}
	

	public Order formattedTotalShippingMethodAmount(String formattedTotalShippingMethodAmount) {
		setFormattedTotalShippingMethodAmount(formattedTotalShippingMethodAmount);
		return this;
	}
	

	public String formattedTotalShippingMethodAmount() {
		return getFormattedTotalShippingMethodAmount();
	}
	

	public void setTotalPaymentMethodPrice(String totalPaymentMethodPrice) {
		this.totalPaymentMethodPrice = totalPaymentMethodPrice;
	}
	

	public String getTotalPaymentMethodPrice() {
		return this.totalPaymentMethodPrice;
	}
	

	public Order totalPaymentMethodPrice(String totalPaymentMethodPrice) {
		setTotalPaymentMethodPrice(totalPaymentMethodPrice);
		return this;
	}
	

	public String totalPaymentMethodPrice() {
		return getTotalPaymentMethodPrice();
	}
	

	public void setFormattedTotalPaymentMethodPrice(String formattedTotalPaymentMethodPrice) {
		this.formattedTotalPaymentMethodPrice = formattedTotalPaymentMethodPrice;
	}
	

	public String getFormattedTotalPaymentMethodPrice() {
		return this.formattedTotalPaymentMethodPrice;
	}
	

	public Order formattedTotalPaymentMethodPrice(String formattedTotalPaymentMethodPrice) {
		setFormattedTotalPaymentMethodPrice(formattedTotalPaymentMethodPrice);
		return this;
	}
	

	public String formattedTotalPaymentMethodPrice() {
		return getFormattedTotalPaymentMethodPrice();
	}
	

	public void setTotalAmountWithPaymentMethodRequired(String totalAmountWithPaymentMethodRequired) {
		this.totalAmountWithPaymentMethodRequired = totalAmountWithPaymentMethodRequired;
	}
	

	public String getTotalAmountWithPaymentMethodRequired() {
		return this.totalAmountWithPaymentMethodRequired;
	}
	

	public Order totalAmountWithPaymentMethodRequired(String totalAmountWithPaymentMethodRequired) {
		setTotalAmountWithPaymentMethodRequired(totalAmountWithPaymentMethodRequired);
		return this;
	}
	

	public String totalAmountWithPaymentMethodRequired() {
		return getTotalAmountWithPaymentMethodRequired();
	}
	

	public void setFormattedTotalAmountWithPaymentMethodRequired(String formattedTotalAmountWithPaymentMethodRequired) {
		this.formattedTotalAmountWithPaymentMethodRequired = formattedTotalAmountWithPaymentMethodRequired;
	}
	

	public String getFormattedTotalAmountWithPaymentMethodRequired() {
		return this.formattedTotalAmountWithPaymentMethodRequired;
	}
	

	public Order formattedTotalAmountWithPaymentMethodRequired(String formattedTotalAmountWithPaymentMethodRequired) {
		setFormattedTotalAmountWithPaymentMethodRequired(formattedTotalAmountWithPaymentMethodRequired);
		return this;
	}
	

	public String formattedTotalAmountWithPaymentMethodRequired() {
		return getFormattedTotalAmountWithPaymentMethodRequired();
	}
	

	public void setTotalPaymentMethodAmount(String totalPaymentMethodAmount) {
		this.totalPaymentMethodAmount = totalPaymentMethodAmount;
	}
	

	public String getTotalPaymentMethodAmount() {
		return this.totalPaymentMethodAmount;
	}
	

	public Order totalPaymentMethodAmount(String totalPaymentMethodAmount) {
		setTotalPaymentMethodAmount(totalPaymentMethodAmount);
		return this;
	}
	

	public String totalPaymentMethodAmount() {
		return getTotalPaymentMethodAmount();
	}
	

	public void setFormattedTotalPaymentMethodAmount(String formattedTotalPaymentMethodAmount) {
		this.formattedTotalPaymentMethodAmount = formattedTotalPaymentMethodAmount;
	}
	

	public String getFormattedTotalPaymentMethodAmount() {
		return this.formattedTotalPaymentMethodAmount;
	}
	

	public Order formattedTotalPaymentMethodAmount(String formattedTotalPaymentMethodAmount) {
		setFormattedTotalPaymentMethodAmount(formattedTotalPaymentMethodAmount);
		return this;
	}
	

	public String formattedTotalPaymentMethodAmount() {
		return getFormattedTotalPaymentMethodAmount();
	}
	

	public void setTotalAmountWithMissingPaymentMethod(String totalAmountWithMissingPaymentMethod) {
		this.totalAmountWithMissingPaymentMethod = totalAmountWithMissingPaymentMethod;
	}
	

	public String getTotalAmountWithMissingPaymentMethod() {
		return this.totalAmountWithMissingPaymentMethod;
	}
	

	public Order totalAmountWithMissingPaymentMethod(String totalAmountWithMissingPaymentMethod) {
		setTotalAmountWithMissingPaymentMethod(totalAmountWithMissingPaymentMethod);
		return this;
	}
	

	public String totalAmountWithMissingPaymentMethod() {
		return getTotalAmountWithMissingPaymentMethod();
	}
	

	public void setFormattedTotalAmountWithMissingPaymentMethod(String formattedTotalAmountWithMissingPaymentMethod) {
		this.formattedTotalAmountWithMissingPaymentMethod = formattedTotalAmountWithMissingPaymentMethod;
	}
	

	public String getFormattedTotalAmountWithMissingPaymentMethod() {
		return this.formattedTotalAmountWithMissingPaymentMethod;
	}
	

	public Order formattedTotalAmountWithMissingPaymentMethod(String formattedTotalAmountWithMissingPaymentMethod) {
		setFormattedTotalAmountWithMissingPaymentMethod(formattedTotalAmountWithMissingPaymentMethod);
		return this;
	}
	

	public String formattedTotalAmountWithMissingPaymentMethod() {
		return getFormattedTotalAmountWithMissingPaymentMethod();
	}
	

	public void setTotalTaxAmount(String totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	

	public String getTotalTaxAmount() {
		return this.totalTaxAmount;
	}
	

	public Order totalTaxAmount(String totalTaxAmount) {
		setTotalTaxAmount(totalTaxAmount);
		return this;
	}
	

	public String totalTaxAmount() {
		return getTotalTaxAmount();
	}
	

	public void setFormattedTotalTaxAmount(String formattedTotalTaxAmount) {
		this.formattedTotalTaxAmount = formattedTotalTaxAmount;
	}
	

	public String getFormattedTotalTaxAmount() {
		return this.formattedTotalTaxAmount;
	}
	

	public Order formattedTotalTaxAmount(String formattedTotalTaxAmount) {
		setFormattedTotalTaxAmount(formattedTotalTaxAmount);
		return this;
	}
	

	public String formattedTotalTaxAmount() {
		return getFormattedTotalTaxAmount();
	}
	

	public void setTotalLineItemTaxAmount(String totalLineItemTaxAmount) {
		this.totalLineItemTaxAmount = totalLineItemTaxAmount;
	}
	

	public String getTotalLineItemTaxAmount() {
		return this.totalLineItemTaxAmount;
	}
	

	public Order totalLineItemTaxAmount(String totalLineItemTaxAmount) {
		setTotalLineItemTaxAmount(totalLineItemTaxAmount);
		return this;
	}
	

	public String totalLineItemTaxAmount() {
		return getTotalLineItemTaxAmount();
	}
	

	public void setFormattedTotalLineItemTaxAmount(String formattedTotalLineItemTaxAmount) {
		this.formattedTotalLineItemTaxAmount = formattedTotalLineItemTaxAmount;
	}
	

	public String getFormattedTotalLineItemTaxAmount() {
		return this.formattedTotalLineItemTaxAmount;
	}
	

	public Order formattedTotalLineItemTaxAmount(String formattedTotalLineItemTaxAmount) {
		setFormattedTotalLineItemTaxAmount(formattedTotalLineItemTaxAmount);
		return this;
	}
	

	public String formattedTotalLineItemTaxAmount() {
		return getFormattedTotalLineItemTaxAmount();
	}
	

	public void setTotalShippingMethodTaxAmount(String totalShippingMethodTaxAmount) {
		this.totalShippingMethodTaxAmount = totalShippingMethodTaxAmount;
	}
	

	public String getTotalShippingMethodTaxAmount() {
		return this.totalShippingMethodTaxAmount;
	}
	

	public Order totalShippingMethodTaxAmount(String totalShippingMethodTaxAmount) {
		setTotalShippingMethodTaxAmount(totalShippingMethodTaxAmount);
		return this;
	}
	

	public String totalShippingMethodTaxAmount() {
		return getTotalShippingMethodTaxAmount();
	}
	

	public void setFormattedTotalShippingMethodTaxAmount(String formattedTotalShippingMethodTaxAmount) {
		this.formattedTotalShippingMethodTaxAmount = formattedTotalShippingMethodTaxAmount;
	}
	

	public String getFormattedTotalShippingMethodTaxAmount() {
		return this.formattedTotalShippingMethodTaxAmount;
	}
	

	public Order formattedTotalShippingMethodTaxAmount(String formattedTotalShippingMethodTaxAmount) {
		setFormattedTotalShippingMethodTaxAmount(formattedTotalShippingMethodTaxAmount);
		return this;
	}
	

	public String formattedTotalShippingMethodTaxAmount() {
		return getFormattedTotalShippingMethodTaxAmount();
	}
	

	public void setTotalPaymentMethodTaxAmount(String totalPaymentMethodTaxAmount) {
		this.totalPaymentMethodTaxAmount = totalPaymentMethodTaxAmount;
	}
	

	public String getTotalPaymentMethodTaxAmount() {
		return this.totalPaymentMethodTaxAmount;
	}
	

	public Order totalPaymentMethodTaxAmount(String totalPaymentMethodTaxAmount) {
		setTotalPaymentMethodTaxAmount(totalPaymentMethodTaxAmount);
		return this;
	}
	

	public String totalPaymentMethodTaxAmount() {
		return getTotalPaymentMethodTaxAmount();
	}
	

	public void setFormattedTotalPaymentMethodTaxAmount(String formattedTotalPaymentMethodTaxAmount) {
		this.formattedTotalPaymentMethodTaxAmount = formattedTotalPaymentMethodTaxAmount;
	}
	

	public String getFormattedTotalPaymentMethodTaxAmount() {
		return this.formattedTotalPaymentMethodTaxAmount;
	}
	

	public Order formattedTotalPaymentMethodTaxAmount(String formattedTotalPaymentMethodTaxAmount) {
		setFormattedTotalPaymentMethodTaxAmount(formattedTotalPaymentMethodTaxAmount);
		return this;
	}
	

	public String formattedTotalPaymentMethodTaxAmount() {
		return getFormattedTotalPaymentMethodTaxAmount();
	}
	

	public void setTotalTaxableAmount(String totalTaxableAmount) {
		this.totalTaxableAmount = totalTaxableAmount;
	}
	

	public String getTotalTaxableAmount() {
		return this.totalTaxableAmount;
	}
	

	public Order totalTaxableAmount(String totalTaxableAmount) {
		setTotalTaxableAmount(totalTaxableAmount);
		return this;
	}
	

	public String totalTaxableAmount() {
		return getTotalTaxableAmount();
	}
	

	public void setFormattedTotalTaxableAmount(String formattedTotalTaxableAmount) {
		this.formattedTotalTaxableAmount = formattedTotalTaxableAmount;
	}
	

	public String getFormattedTotalTaxableAmount() {
		return this.formattedTotalTaxableAmount;
	}
	

	public Order formattedTotalTaxableAmount(String formattedTotalTaxableAmount) {
		setFormattedTotalTaxableAmount(formattedTotalTaxableAmount);
		return this;
	}
	

	public String formattedTotalTaxableAmount() {
		return getFormattedTotalTaxableAmount();
	}
	

	public void setTotalLineItemTaxableAmount(String totalLineItemTaxableAmount) {
		this.totalLineItemTaxableAmount = totalLineItemTaxableAmount;
	}
	

	public String getTotalLineItemTaxableAmount() {
		return this.totalLineItemTaxableAmount;
	}
	

	public Order totalLineItemTaxableAmount(String totalLineItemTaxableAmount) {
		setTotalLineItemTaxableAmount(totalLineItemTaxableAmount);
		return this;
	}
	

	public String totalLineItemTaxableAmount() {
		return getTotalLineItemTaxableAmount();
	}
	

	public void setFormattedTotalLineItemTaxableAmount(String formattedTotalLineItemTaxableAmount) {
		this.formattedTotalLineItemTaxableAmount = formattedTotalLineItemTaxableAmount;
	}
	

	public String getFormattedTotalLineItemTaxableAmount() {
		return this.formattedTotalLineItemTaxableAmount;
	}
	

	public Order formattedTotalLineItemTaxableAmount(String formattedTotalLineItemTaxableAmount) {
		setFormattedTotalLineItemTaxableAmount(formattedTotalLineItemTaxableAmount);
		return this;
	}
	

	public String formattedTotalLineItemTaxableAmount() {
		return getFormattedTotalLineItemTaxableAmount();
	}
	

	public void setTotalShippingMethodTaxableAmount(String totalShippingMethodTaxableAmount) {
		this.totalShippingMethodTaxableAmount = totalShippingMethodTaxableAmount;
	}
	

	public String getTotalShippingMethodTaxableAmount() {
		return this.totalShippingMethodTaxableAmount;
	}
	

	public Order totalShippingMethodTaxableAmount(String totalShippingMethodTaxableAmount) {
		setTotalShippingMethodTaxableAmount(totalShippingMethodTaxableAmount);
		return this;
	}
	

	public String totalShippingMethodTaxableAmount() {
		return getTotalShippingMethodTaxableAmount();
	}
	

	public void setFormattedTotalShippingMethodTaxableAmount(String formattedTotalShippingMethodTaxableAmount) {
		this.formattedTotalShippingMethodTaxableAmount = formattedTotalShippingMethodTaxableAmount;
	}
	

	public String getFormattedTotalShippingMethodTaxableAmount() {
		return this.formattedTotalShippingMethodTaxableAmount;
	}
	

	public Order formattedTotalShippingMethodTaxableAmount(String formattedTotalShippingMethodTaxableAmount) {
		setFormattedTotalShippingMethodTaxableAmount(formattedTotalShippingMethodTaxableAmount);
		return this;
	}
	

	public String formattedTotalShippingMethodTaxableAmount() {
		return getFormattedTotalShippingMethodTaxableAmount();
	}
	

	public void setTotalPaymentMethodTaxableAmount(String totalPaymentMethodTaxableAmount) {
		this.totalPaymentMethodTaxableAmount = totalPaymentMethodTaxableAmount;
	}
	

	public String getTotalPaymentMethodTaxableAmount() {
		return this.totalPaymentMethodTaxableAmount;
	}
	

	public Order totalPaymentMethodTaxableAmount(String totalPaymentMethodTaxableAmount) {
		setTotalPaymentMethodTaxableAmount(totalPaymentMethodTaxableAmount);
		return this;
	}
	

	public String totalPaymentMethodTaxableAmount() {
		return getTotalPaymentMethodTaxableAmount();
	}
	

	public void setFormattedTotalPaymentMethodTaxableAmount(String formattedTotalPaymentMethodTaxableAmount) {
		this.formattedTotalPaymentMethodTaxableAmount = formattedTotalPaymentMethodTaxableAmount;
	}
	

	public String getFormattedTotalPaymentMethodTaxableAmount() {
		return this.formattedTotalPaymentMethodTaxableAmount;
	}
	

	public Order formattedTotalPaymentMethodTaxableAmount(String formattedTotalPaymentMethodTaxableAmount) {
		setFormattedTotalPaymentMethodTaxableAmount(formattedTotalPaymentMethodTaxableAmount);
		return this;
	}
	

	public String formattedTotalPaymentMethodTaxableAmount() {
		return getFormattedTotalPaymentMethodTaxableAmount();
	}
	

	public void setTotalLineItemsCount(String totalLineItemsCount) {
		this.totalLineItemsCount = totalLineItemsCount;
	}
	

	public String getTotalLineItemsCount() {
		return this.totalLineItemsCount;
	}
	

	public Order totalLineItemsCount(String totalLineItemsCount) {
		setTotalLineItemsCount(totalLineItemsCount);
		return this;
	}
	

	public String totalLineItemsCount() {
		return getTotalLineItemsCount();
	}
	

	public void setTaxCalculated(String taxCalculated) {
		this.taxCalculated = taxCalculated;
	}
	

	public String getTaxCalculated() {
		return this.taxCalculated;
	}
	

	public Order taxCalculated(String taxCalculated) {
		setTaxCalculated(taxCalculated);
		return this;
	}
	

	public String taxCalculated() {
		return getTaxCalculated();
	}
	

	public void setPendingTransactions(String pendingTransactions) {
		this.pendingTransactions = pendingTransactions;
	}
	

	public String getPendingTransactions() {
		return this.pendingTransactions;
	}
	

	public Order pendingTransactions(String pendingTransactions) {
		setPendingTransactions(pendingTransactions);
		return this;
	}
	

	public String pendingTransactions() {
		return getPendingTransactions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Order x = (Order)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.customerId, x.customerId)
			&& Objects.equals(this.merchantId, x.merchantId)
			&& Objects.equals(this.channelId, x.channelId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.languageId, x.languageId)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.number, x.number)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.shippingState, x.shippingState)
			&& Objects.equals(this.paymentState, x.paymentState)
			&& Objects.equals(this.placedAt, x.placedAt)
			&& Objects.equals(this.approvedAt, x.approvedAt)
			&& Objects.equals(this.canceledAt, x.canceledAt)
			&& Objects.equals(this.fulfilledAt, x.fulfilledAt)
			&& Objects.equals(this.channel, x.channel)
			&& Objects.equals(this.customer, x.customer)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.language, x.language)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.events, x.events)
			&& Objects.equals(this.resourceMetaFields, x.resourceMetaFields)
			&& Objects.equals(this.metaFields, x.metaFields)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.shippingAddresses, x.shippingAddresses)
			&& Objects.equals(this.shippingRecipients, x.shippingRecipients)
			&& Objects.equals(this.shippingServices, x.shippingServices)
			&& Objects.equals(this.billingAddresses, x.billingAddresses)
			&& Objects.equals(this.billingRecipients, x.billingRecipients)
			&& Objects.equals(this.creditCards, x.creditCards)
			&& Objects.equals(this.wireTransfers, x.wireTransfers)
			&& Objects.equals(this.paypalAccounts, x.paypalAccounts)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.totalAmountWithTax, x.totalAmountWithTax)
			&& Objects.equals(this.formattedTotalAmountWithTax, x.formattedTotalAmountWithTax)
			&& Objects.equals(this.totalAmount, x.totalAmount)
			&& Objects.equals(this.formattedTotalAmount, x.formattedTotalAmount)
			&& Objects.equals(this.totalLineItemAmount, x.totalLineItemAmount)
			&& Objects.equals(this.formattedTotalLineItemAmount, x.formattedTotalLineItemAmount)
			&& Objects.equals(this.totalShippingMethodAmount, x.totalShippingMethodAmount)
			&& Objects.equals(this.formattedTotalShippingMethodAmount, x.formattedTotalShippingMethodAmount)
			&& Objects.equals(this.totalPaymentMethodPrice, x.totalPaymentMethodPrice)
			&& Objects.equals(this.formattedTotalPaymentMethodPrice, x.formattedTotalPaymentMethodPrice)
			&& Objects.equals(this.totalAmountWithPaymentMethodRequired, x.totalAmountWithPaymentMethodRequired)
			&& Objects.equals(this.formattedTotalAmountWithPaymentMethodRequired, x.formattedTotalAmountWithPaymentMethodRequired)
			&& Objects.equals(this.totalPaymentMethodAmount, x.totalPaymentMethodAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodAmount, x.formattedTotalPaymentMethodAmount)
			&& Objects.equals(this.totalAmountWithMissingPaymentMethod, x.totalAmountWithMissingPaymentMethod)
			&& Objects.equals(this.formattedTotalAmountWithMissingPaymentMethod, x.formattedTotalAmountWithMissingPaymentMethod)
			&& Objects.equals(this.totalTaxAmount, x.totalTaxAmount)
			&& Objects.equals(this.formattedTotalTaxAmount, x.formattedTotalTaxAmount)
			&& Objects.equals(this.totalLineItemTaxAmount, x.totalLineItemTaxAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxAmount, x.formattedTotalLineItemTaxAmount)
			&& Objects.equals(this.totalShippingMethodTaxAmount, x.totalShippingMethodTaxAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxAmount, x.formattedTotalShippingMethodTaxAmount)
			&& Objects.equals(this.totalPaymentMethodTaxAmount, x.totalPaymentMethodTaxAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxAmount, x.formattedTotalPaymentMethodTaxAmount)
			&& Objects.equals(this.totalTaxableAmount, x.totalTaxableAmount)
			&& Objects.equals(this.formattedTotalTaxableAmount, x.formattedTotalTaxableAmount)
			&& Objects.equals(this.totalLineItemTaxableAmount, x.totalLineItemTaxableAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxableAmount, x.formattedTotalLineItemTaxableAmount)
			&& Objects.equals(this.totalShippingMethodTaxableAmount, x.totalShippingMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxableAmount, x.formattedTotalShippingMethodTaxableAmount)
			&& Objects.equals(this.totalPaymentMethodTaxableAmount, x.totalPaymentMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxableAmount, x.formattedTotalPaymentMethodTaxableAmount)
			&& Objects.equals(this.totalLineItemsCount, x.totalLineItemsCount)
			&& Objects.equals(this.taxCalculated, x.taxCalculated)
			&& Objects.equals(this.pendingTransactions, x.pendingTransactions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, customerId, merchantId, channelId, countryId,
			languageId, marketId, currencyId, token, number,
			taxIncluded, state, shippingState, paymentState, placedAt,
			approvedAt, canceledAt, fulfilledAt, channel, customer,
			country, language, market, merchant, currency,
			versions, events, resourceMetaFields, metaFields, lineItems,
			lineItemStocks, paymentMethods, shippingMethods, shipments, transactions,
			invoices, products, variants, shippingAddresses, shippingRecipients,
			shippingServices, billingAddresses, billingRecipients, creditCards, wireTransfers,
			paypalAccounts, marketPaymentTypes, paymentTypes, marketShippingServices, stockItems,
			totalAmountWithTax, formattedTotalAmountWithTax, totalAmount, formattedTotalAmount, totalLineItemAmount,
			formattedTotalLineItemAmount, totalShippingMethodAmount, formattedTotalShippingMethodAmount, totalPaymentMethodPrice, formattedTotalPaymentMethodPrice,
			totalAmountWithPaymentMethodRequired, formattedTotalAmountWithPaymentMethodRequired, totalPaymentMethodAmount, formattedTotalPaymentMethodAmount, totalAmountWithMissingPaymentMethod,
			formattedTotalAmountWithMissingPaymentMethod, totalTaxAmount, formattedTotalTaxAmount, totalLineItemTaxAmount, formattedTotalLineItemTaxAmount,
			totalShippingMethodTaxAmount, formattedTotalShippingMethodTaxAmount, totalPaymentMethodTaxAmount, formattedTotalPaymentMethodTaxAmount, totalTaxableAmount,
			formattedTotalTaxableAmount, totalLineItemTaxableAmount, formattedTotalLineItemTaxableAmount, totalShippingMethodTaxableAmount, formattedTotalShippingMethodTaxableAmount,
			totalPaymentMethodTaxableAmount, formattedTotalPaymentMethodTaxableAmount, totalLineItemsCount, taxCalculated, pendingTransactions
			
		);
	
	}
	

	@Override
	public Order clone() {
	
		Order no = new Order();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.customerId = this.customerId;
		no.merchantId = this.merchantId;
		no.channelId = this.channelId;
		no.countryId = this.countryId;
		no.languageId = this.languageId;
		no.marketId = this.marketId;
		no.currencyId = this.currencyId;
		no.token = this.token;
		no.number = this.number;
		no.taxIncluded = this.taxIncluded;
		no.state = this.state;
		no.shippingState = this.shippingState;
		no.paymentState = this.paymentState;
		no.placedAt = this.placedAt;
		no.approvedAt = this.approvedAt;
		no.canceledAt = this.canceledAt;
		no.fulfilledAt = this.fulfilledAt;
		no.channel = this.channel;
		no.customer = this.customer;
		no.country = this.country;
		no.language = this.language;
		no.market = this.market;
		no.merchant = this.merchant;
		no.currency = this.currency;
		no.versions = this.versions;
		no.events = this.events;
		no.resourceMetaFields = this.resourceMetaFields;
		no.metaFields = this.metaFields;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.paymentMethods = this.paymentMethods;
		no.shippingMethods = this.shippingMethods;
		no.shipments = this.shipments;
		no.transactions = this.transactions;
		no.invoices = this.invoices;
		no.products = this.products;
		no.variants = this.variants;
		no.shippingAddresses = this.shippingAddresses;
		no.shippingRecipients = this.shippingRecipients;
		no.shippingServices = this.shippingServices;
		no.billingAddresses = this.billingAddresses;
		no.billingRecipients = this.billingRecipients;
		no.creditCards = this.creditCards;
		no.wireTransfers = this.wireTransfers;
		no.paypalAccounts = this.paypalAccounts;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.paymentTypes = this.paymentTypes;
		no.marketShippingServices = this.marketShippingServices;
		no.stockItems = this.stockItems;
		no.totalAmountWithTax = this.totalAmountWithTax;
		no.formattedTotalAmountWithTax = this.formattedTotalAmountWithTax;
		no.totalAmount = this.totalAmount;
		no.formattedTotalAmount = this.formattedTotalAmount;
		no.totalLineItemAmount = this.totalLineItemAmount;
		no.formattedTotalLineItemAmount = this.formattedTotalLineItemAmount;
		no.totalShippingMethodAmount = this.totalShippingMethodAmount;
		no.formattedTotalShippingMethodAmount = this.formattedTotalShippingMethodAmount;
		no.totalPaymentMethodPrice = this.totalPaymentMethodPrice;
		no.formattedTotalPaymentMethodPrice = this.formattedTotalPaymentMethodPrice;
		no.totalAmountWithPaymentMethodRequired = this.totalAmountWithPaymentMethodRequired;
		no.formattedTotalAmountWithPaymentMethodRequired = this.formattedTotalAmountWithPaymentMethodRequired;
		no.totalPaymentMethodAmount = this.totalPaymentMethodAmount;
		no.formattedTotalPaymentMethodAmount = this.formattedTotalPaymentMethodAmount;
		no.totalAmountWithMissingPaymentMethod = this.totalAmountWithMissingPaymentMethod;
		no.formattedTotalAmountWithMissingPaymentMethod = this.formattedTotalAmountWithMissingPaymentMethod;
		no.totalTaxAmount = this.totalTaxAmount;
		no.formattedTotalTaxAmount = this.formattedTotalTaxAmount;
		no.totalLineItemTaxAmount = this.totalLineItemTaxAmount;
		no.formattedTotalLineItemTaxAmount = this.formattedTotalLineItemTaxAmount;
		no.totalShippingMethodTaxAmount = this.totalShippingMethodTaxAmount;
		no.formattedTotalShippingMethodTaxAmount = this.formattedTotalShippingMethodTaxAmount;
		no.totalPaymentMethodTaxAmount = this.totalPaymentMethodTaxAmount;
		no.formattedTotalPaymentMethodTaxAmount = this.formattedTotalPaymentMethodTaxAmount;
		no.totalTaxableAmount = this.totalTaxableAmount;
		no.formattedTotalTaxableAmount = this.formattedTotalTaxableAmount;
		no.totalLineItemTaxableAmount = this.totalLineItemTaxableAmount;
		no.formattedTotalLineItemTaxableAmount = this.formattedTotalLineItemTaxableAmount;
		no.totalShippingMethodTaxableAmount = this.totalShippingMethodTaxableAmount;
		no.formattedTotalShippingMethodTaxableAmount = this.formattedTotalShippingMethodTaxableAmount;
		no.totalPaymentMethodTaxableAmount = this.totalPaymentMethodTaxableAmount;
		no.formattedTotalPaymentMethodTaxableAmount = this.formattedTotalPaymentMethodTaxableAmount;
		no.totalLineItemsCount = this.totalLineItemsCount;
		no.taxCalculated = this.taxCalculated;
		no.pendingTransactions = this.pendingTransactions;
	
		return no;
	
	}
	
}
