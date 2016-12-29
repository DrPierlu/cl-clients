package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * LineItem
 */
public class LineItem extends ApiResource {

	private static final long serialVersionUID = -1483024665589L;


	private String orderId;
	private String sellableId;
	private String sellableResource;
	@JsonExclude
	private String amount;
	@JsonExclude
	private String availableShippingServiceIds;
	@JsonExclude
	private Object country;
	@JsonExclude
	private String countryId;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private String currencyId;
	@JsonExclude
	private String defaultShippingMethodId;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedTaxAmount;
	@JsonExclude
	private String formattedTaxableAmount;
	@JsonExclude
	private String formattedUnitAmount;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String marketId;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String quantity;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private String shippingCategoryId;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private String taxIncluded;
	@JsonExclude
	private Float taxRate;
	@JsonExclude
	private String taxableAmount;
	@JsonExclude
	private String trackInventory;
	@JsonExclude
	private String unitAmount;
	@JsonExclude
	private String unitAmountCents;
	@JsonExclude
	private List<String> versions;


	public LineItem() {
		super();
	}
	

	public LineItem(Long id) {
		super(id);
	}
	

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return this.orderId;
	}
	

	public LineItem orderId(String orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public String orderId() {
		return getOrderId();
	}
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public LineItem marketId(String marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public String marketId() {
		return getMarketId();
	}
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	

	public String getCountryId() {
		return this.countryId;
	}
	

	public LineItem countryId(String countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public String countryId() {
		return getCountryId();
	}
	

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	

	public String getCurrencyId() {
		return this.currencyId;
	}
	

	public LineItem currencyId(String currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public String currencyId() {
		return getCurrencyId();
	}
	

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}
	

	public String getSellableId() {
		return this.sellableId;
	}
	

	public LineItem sellableId(String sellableId) {
		setSellableId(sellableId);
		return this;
	}
	

	public String sellableId() {
		return getSellableId();
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public LineItem sellableResource(String sellableResource) {
		setSellableResource(sellableResource);
		return this;
	}
	

	public String sellableResource() {
		return getSellableResource();
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public LineItem shippingCategoryId(String shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public String shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setTrackInventory(String trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public String getTrackInventory() {
		return this.trackInventory;
	}
	

	public LineItem trackInventory(String trackInventory) {
		setTrackInventory(trackInventory);
		return this;
	}
	

	public String trackInventory() {
		return getTrackInventory();
	}
	

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

	public String getQuantity() {
		return this.quantity;
	}
	

	public LineItem quantity(String quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public String quantity() {
		return getQuantity();
	}
	

	public void setUnitAmountCents(String unitAmountCents) {
		this.unitAmountCents = unitAmountCents;
	}
	

	public String getUnitAmountCents() {
		return this.unitAmountCents;
	}
	

	public LineItem unitAmountCents(String unitAmountCents) {
		setUnitAmountCents(unitAmountCents);
		return this;
	}
	

	public String unitAmountCents() {
		return getUnitAmountCents();
	}
	

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}
	

	public Float getTaxRate() {
		return this.taxRate;
	}
	

	public LineItem taxRate(Float taxRate) {
		setTaxRate(taxRate);
		return this;
	}
	

	public Float taxRate() {
		return getTaxRate();
	}
	

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public String getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public LineItem taxIncluded(String taxIncluded) {
		setTaxIncluded(taxIncluded);
		return this;
	}
	

	public String taxIncluded() {
		return getTaxIncluded();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public LineItem previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public LineItem shippingCategory(Object shippingCategory) {
		setShippingCategory(shippingCategory);
		return this;
	}
	

	public Object shippingCategory() {
		return getShippingCategory();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public LineItem order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public LineItem sellable(Object sellable) {
		setSellable(sellable);
		return this;
	}
	

	public Object sellable() {
		return getSellable();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public LineItem market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public LineItem country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public LineItem currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public LineItem stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public LineItem shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public LineItem versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public LineItem lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public LineItem shippingMethods(List<String> shippingMethods) {
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
	

	public LineItem shipments(List<String> shipments) {
		setShipments(shipments);
		return this;
	}
	

	public List<String> shipments() {
		return getShipments();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public LineItem amount(String amount) {
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
	

	public LineItem formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public LineItem taxableAmount(String taxableAmount) {
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
	

	public LineItem formattedTaxableAmount(String formattedTaxableAmount) {
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
	

	public LineItem taxAmount(String taxAmount) {
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
	

	public LineItem formattedTaxAmount(String formattedTaxAmount) {
		setFormattedTaxAmount(formattedTaxAmount);
		return this;
	}
	

	public String formattedTaxAmount() {
		return getFormattedTaxAmount();
	}
	

	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}
	

	public String getUnitAmount() {
		return this.unitAmount;
	}
	

	public LineItem unitAmount(String unitAmount) {
		setUnitAmount(unitAmount);
		return this;
	}
	

	public String unitAmount() {
		return getUnitAmount();
	}
	

	public void setFormattedUnitAmount(String formattedUnitAmount) {
		this.formattedUnitAmount = formattedUnitAmount;
	}
	

	public String getFormattedUnitAmount() {
		return this.formattedUnitAmount;
	}
	

	public LineItem formattedUnitAmount(String formattedUnitAmount) {
		setFormattedUnitAmount(formattedUnitAmount);
		return this;
	}
	

	public String formattedUnitAmount() {
		return getFormattedUnitAmount();
	}
	

	public void setDefaultShippingMethodId(String defaultShippingMethodId) {
		this.defaultShippingMethodId = defaultShippingMethodId;
	}
	

	public String getDefaultShippingMethodId() {
		return this.defaultShippingMethodId;
	}
	

	public LineItem defaultShippingMethodId(String defaultShippingMethodId) {
		setDefaultShippingMethodId(defaultShippingMethodId);
		return this;
	}
	

	public String defaultShippingMethodId() {
		return getDefaultShippingMethodId();
	}
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
	}
	

	public LineItem availableShippingServiceIds(String availableShippingServiceIds) {
		setAvailableShippingServiceIds(availableShippingServiceIds);
		return this;
	}
	

	public String availableShippingServiceIds() {
		return getAvailableShippingServiceIds();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		LineItem x = (LineItem)o;
	
		return super.equals(o)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.sellableId, x.sellableId)
			&& Objects.equals(this.sellableResource, x.sellableResource)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.trackInventory, x.trackInventory)
			&& Objects.equals(this.quantity, x.quantity)
			&& Objects.equals(this.unitAmountCents, x.unitAmountCents)
			&& Objects.equals(this.taxRate, x.taxRate)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.sellable, x.sellable)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.unitAmount, x.unitAmount)
			&& Objects.equals(this.formattedUnitAmount, x.formattedUnitAmount)
			&& Objects.equals(this.defaultShippingMethodId, x.defaultShippingMethodId)
			&& Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			orderId, marketId, countryId, currencyId, sellableId,
			sellableResource, shippingCategoryId, trackInventory, quantity, unitAmountCents,
			taxRate, taxIncluded, previousChanges, shippingCategory, order,
			sellable, market, country, currency, stockItems,
			shippingServiceStockLocations, versions, lineItemStocks, shippingMethods, shipments,
			amount, formattedAmount, taxableAmount, formattedTaxableAmount, taxAmount,
			formattedTaxAmount, unitAmount, formattedUnitAmount, defaultShippingMethodId, availableShippingServiceIds
			
		);
	
	}
	

	@Override
	public LineItem clone() {
	
		LineItem no = new LineItem();
	
		no.orderId = this.orderId;
		no.marketId = this.marketId;
		no.countryId = this.countryId;
		no.currencyId = this.currencyId;
		no.sellableId = this.sellableId;
		no.sellableResource = this.sellableResource;
		no.shippingCategoryId = this.shippingCategoryId;
		no.trackInventory = this.trackInventory;
		no.quantity = this.quantity;
		no.unitAmountCents = this.unitAmountCents;
		no.taxRate = this.taxRate;
		no.taxIncluded = this.taxIncluded;
		no.previousChanges = this.previousChanges;
		no.shippingCategory = this.shippingCategory;
		no.order = this.order;
		no.sellable = this.sellable;
		no.market = this.market;
		no.country = this.country;
		no.currency = this.currency;
		no.stockItems = this.stockItems;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.versions = this.versions;
		no.lineItemStocks = this.lineItemStocks;
		no.shippingMethods = this.shippingMethods;
		no.shipments = this.shipments;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.unitAmount = this.unitAmount;
		no.formattedUnitAmount = this.formattedUnitAmount;
		no.defaultShippingMethodId = this.defaultShippingMethodId;
		no.availableShippingServiceIds = this.availableShippingServiceIds;
	
		return no;
	
	}
	
}
