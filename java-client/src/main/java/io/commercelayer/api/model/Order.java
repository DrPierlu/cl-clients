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

	private static final long serialVersionUID = -1485265142480L;


	private Integer channelId;
	private Integer countryId;
	private Integer customerId;
	@JsonExclude
	private LocalDateTime approvedAt;
	@JsonExclude
	private String availablePaymentTypeIds;
	@JsonExclude
	private String availableShippingServiceIds;
	@JsonExclude
	private LocalDateTime canceledAt;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private Object customer;
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
	private String name;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private String pendingTransactions;
	@JsonExclude
	private LocalDateTime placedAt;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private String state;
	@JsonExclude
	private List<String> stockItems;
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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Order previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
	}
	

	public Order availableShippingServiceIds(String availableShippingServiceIds) {
		setAvailableShippingServiceIds(availableShippingServiceIds);
		return this;
	}
	

	public String availableShippingServiceIds() {
		return getAvailableShippingServiceIds();
	}
	

	public void setAvailablePaymentTypeIds(String availablePaymentTypeIds) {
		this.availablePaymentTypeIds = availablePaymentTypeIds;
	}
	

	public String getAvailablePaymentTypeIds() {
		return this.availablePaymentTypeIds;
	}
	

	public Order availablePaymentTypeIds(String availablePaymentTypeIds) {
		setAvailablePaymentTypeIds(availablePaymentTypeIds);
		return this;
	}
	

	public String availablePaymentTypeIds() {
		return getAvailablePaymentTypeIds();
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
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.placedAt, x.placedAt)
			&& Objects.equals(this.approvedAt, x.approvedAt)
			&& Objects.equals(this.canceledAt, x.canceledAt)
			&& Objects.equals(this.fulfilledAt, x.fulfilledAt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.customer, x.customer)
			&& Objects.equals(this.channel, x.channel)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.shippingServices, x.shippingServices)
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
			&& Objects.equals(this.totalTaxableAmount, x.totalTaxableAmount)
			&& Objects.equals(this.formattedTotalTaxableAmount, x.formattedTotalTaxableAmount)
			&& Objects.equals(this.totalLineItemTaxableAmount, x.totalLineItemTaxableAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxableAmount, x.formattedTotalLineItemTaxableAmount)
			&& Objects.equals(this.totalShippingMethodTaxableAmount, x.totalShippingMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxableAmount, x.formattedTotalShippingMethodTaxableAmount)
			&& Objects.equals(this.totalPaymentMethodTaxableAmount, x.totalPaymentMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxableAmount, x.formattedTotalPaymentMethodTaxableAmount)
			&& Objects.equals(this.totalTaxAmount, x.totalTaxAmount)
			&& Objects.equals(this.formattedTotalTaxAmount, x.formattedTotalTaxAmount)
			&& Objects.equals(this.totalLineItemTaxAmount, x.totalLineItemTaxAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxAmount, x.formattedTotalLineItemTaxAmount)
			&& Objects.equals(this.totalShippingMethodTaxAmount, x.totalShippingMethodTaxAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxAmount, x.formattedTotalShippingMethodTaxAmount)
			&& Objects.equals(this.totalPaymentMethodTaxAmount, x.totalPaymentMethodTaxAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxAmount, x.formattedTotalPaymentMethodTaxAmount)
			&& Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds)
			&& Objects.equals(this.availablePaymentTypeIds, x.availablePaymentTypeIds)
			&& Objects.equals(this.pendingTransactions, x.pendingTransactions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, customerId, merchantId, channelId, countryId,
			marketId, currencyId, token, taxIncluded, state,
			placedAt, approvedAt, canceledAt, fulfilledAt, previousChanges,
			customer, channel, country, market, merchant,
			currency, lineItems, lineItemStocks, paymentMethods, shippingMethods,
			shipments, transactions, marketPaymentTypes, paymentTypes, marketShippingServices,
			shippingServices, stockItems, totalAmountWithTax, formattedTotalAmountWithTax, totalAmount,
			formattedTotalAmount, totalLineItemAmount, formattedTotalLineItemAmount, totalShippingMethodAmount, formattedTotalShippingMethodAmount,
			totalPaymentMethodPrice, formattedTotalPaymentMethodPrice, totalAmountWithPaymentMethodRequired, formattedTotalAmountWithPaymentMethodRequired, totalPaymentMethodAmount,
			formattedTotalPaymentMethodAmount, totalAmountWithMissingPaymentMethod, formattedTotalAmountWithMissingPaymentMethod, totalTaxableAmount, formattedTotalTaxableAmount,
			totalLineItemTaxableAmount, formattedTotalLineItemTaxableAmount, totalShippingMethodTaxableAmount, formattedTotalShippingMethodTaxableAmount, totalPaymentMethodTaxableAmount,
			formattedTotalPaymentMethodTaxableAmount, totalTaxAmount, formattedTotalTaxAmount, totalLineItemTaxAmount, formattedTotalLineItemTaxAmount,
			totalShippingMethodTaxAmount, formattedTotalShippingMethodTaxAmount, totalPaymentMethodTaxAmount, formattedTotalPaymentMethodTaxAmount, availableShippingServiceIds,
			availablePaymentTypeIds, pendingTransactions 
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
		no.marketId = this.marketId;
		no.currencyId = this.currencyId;
		no.token = this.token;
		no.taxIncluded = this.taxIncluded;
		no.state = this.state;
		no.placedAt = this.placedAt;
		no.approvedAt = this.approvedAt;
		no.canceledAt = this.canceledAt;
		no.fulfilledAt = this.fulfilledAt;
		no.previousChanges = this.previousChanges;
		no.customer = this.customer;
		no.channel = this.channel;
		no.country = this.country;
		no.market = this.market;
		no.merchant = this.merchant;
		no.currency = this.currency;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.paymentMethods = this.paymentMethods;
		no.shippingMethods = this.shippingMethods;
		no.shipments = this.shipments;
		no.transactions = this.transactions;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.paymentTypes = this.paymentTypes;
		no.marketShippingServices = this.marketShippingServices;
		no.shippingServices = this.shippingServices;
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
		no.totalTaxableAmount = this.totalTaxableAmount;
		no.formattedTotalTaxableAmount = this.formattedTotalTaxableAmount;
		no.totalLineItemTaxableAmount = this.totalLineItemTaxableAmount;
		no.formattedTotalLineItemTaxableAmount = this.formattedTotalLineItemTaxableAmount;
		no.totalShippingMethodTaxableAmount = this.totalShippingMethodTaxableAmount;
		no.formattedTotalShippingMethodTaxableAmount = this.formattedTotalShippingMethodTaxableAmount;
		no.totalPaymentMethodTaxableAmount = this.totalPaymentMethodTaxableAmount;
		no.formattedTotalPaymentMethodTaxableAmount = this.formattedTotalPaymentMethodTaxableAmount;
		no.totalTaxAmount = this.totalTaxAmount;
		no.formattedTotalTaxAmount = this.formattedTotalTaxAmount;
		no.totalLineItemTaxAmount = this.totalLineItemTaxAmount;
		no.formattedTotalLineItemTaxAmount = this.formattedTotalLineItemTaxAmount;
		no.totalShippingMethodTaxAmount = this.totalShippingMethodTaxAmount;
		no.formattedTotalShippingMethodTaxAmount = this.formattedTotalShippingMethodTaxAmount;
		no.totalPaymentMethodTaxAmount = this.totalPaymentMethodTaxAmount;
		no.formattedTotalPaymentMethodTaxAmount = this.formattedTotalPaymentMethodTaxAmount;
		no.availableShippingServiceIds = this.availableShippingServiceIds;
		no.availablePaymentTypeIds = this.availablePaymentTypeIds;
		no.pendingTransactions = this.pendingTransactions;
	
		return no;
	
	}
	
}
