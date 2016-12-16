package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * LineItem
 */
public class LineItem extends ApiResource {

	private static final long serialVersionUID = -1481927389105L;


	private Integer orderId;
	private Integer marketId;
	private Integer countryId;
	private Integer currencyId;
	private Integer sellableId;
	private String sellableResource;
	private Integer shippingCategoryId;
	@JsonExclude
	private Object trackInventory;
	private Integer quantity;
	private Integer unitAmountCents;
	private Float taxRate;
	@JsonExclude
	private Object taxIncluded;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object currency;
	private List<String> stockItems;
	private List<String> shippingServiceStockLocations;
	private List<String> versions;
	private List<String> lineItemStocks;
	private List<String> shippingMethods;
	private List<String> shipments;
	private String amount;
	private String formattedAmount;
	private String taxableAmount;
	private String formattedTaxableAmount;
	private String taxAmount;
	private String formattedTaxAmount;
	private String unitAmount;
	private String formattedUnitAmount;
	private String defaultShippingMethodId;
	private String availableShippingServiceIds;


	public LineItem() {
		super();
	}
	

	public LineItem(Long id) {
		super(id);
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public void setSellableId(Integer sellableId) {
		this.sellableId = sellableId;
	}
	

	public Integer getSellableId() {
		return this.sellableId;
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setTrackInventory(Object trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public Object getTrackInventory() {
		return this.trackInventory;
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
	}
	

	public void setUnitAmountCents(Integer unitAmountCents) {
		this.unitAmountCents = unitAmountCents;
	}
	

	public Integer getUnitAmountCents() {
		return this.unitAmountCents;
	}
	

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}
	

	public Float getTaxRate() {
		return this.taxRate;
	}
	

	public void setTaxIncluded(Object taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Object getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
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
	

	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}
	

	public String getUnitAmount() {
		return this.unitAmount;
	}
	

	public void setFormattedUnitAmount(String formattedUnitAmount) {
		this.formattedUnitAmount = formattedUnitAmount;
	}
	

	public String getFormattedUnitAmount() {
		return this.formattedUnitAmount;
	}
	

	public void setDefaultShippingMethodId(String defaultShippingMethodId) {
		this.defaultShippingMethodId = defaultShippingMethodId;
	}
	

	public String getDefaultShippingMethodId() {
		return this.defaultShippingMethodId;
	}
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		LineItem x = (LineItem) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.marketId, x.marketId)  &&
			Objects.equals(this.countryId, x.countryId)  &&
			Objects.equals(this.currencyId, x.currencyId)  &&
			Objects.equals(this.sellableId, x.sellableId)  &&
			Objects.equals(this.sellableResource, x.sellableResource)  &&
			Objects.equals(this.shippingCategoryId, x.shippingCategoryId)  &&
			Objects.equals(this.trackInventory, x.trackInventory)  &&
			Objects.equals(this.quantity, x.quantity)  &&
			Objects.equals(this.unitAmountCents, x.unitAmountCents)  &&
			Objects.equals(this.taxRate, x.taxRate)  &&
			Objects.equals(this.taxIncluded, x.taxIncluded)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingCategory, x.shippingCategory)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.sellable, x.sellable)  &&
			Objects.equals(this.market, x.market)  &&
			Objects.equals(this.country, x.country)  &&
			Objects.equals(this.currency, x.currency)  &&
			Objects.equals(this.stockItems, x.stockItems)  &&
			Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)  &&
			Objects.equals(this.versions, x.versions)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.shippingMethods, x.shippingMethods)  &&
			Objects.equals(this.shipments, x.shipments)  &&
			Objects.equals(this.amount, x.amount)  &&
			Objects.equals(this.formattedAmount, x.formattedAmount)  &&
			Objects.equals(this.taxableAmount, x.taxableAmount)  &&
			Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)  &&
			Objects.equals(this.taxAmount, x.taxAmount)  &&
			Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)  &&
			Objects.equals(this.unitAmount, x.unitAmount)  &&
			Objects.equals(this.formattedUnitAmount, x.formattedUnitAmount)  &&
			Objects.equals(this.defaultShippingMethodId, x.defaultShippingMethodId)  &&
			Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, marketId, countryId, currencyId,
			sellableId, sellableResource, shippingCategoryId, trackInventory, quantity,
			unitAmountCents, taxRate, taxIncluded, previousChanges, shippingCategory,
			order, sellable, market, country, currency,
			stockItems, shippingServiceStockLocations, versions, lineItemStocks, shippingMethods,
			shipments, amount, formattedAmount, taxableAmount, formattedTaxableAmount,
			taxAmount, formattedTaxAmount, unitAmount, formattedUnitAmount, defaultShippingMethodId,
			availableShippingServiceIds 
		);
	
	}
	
}
