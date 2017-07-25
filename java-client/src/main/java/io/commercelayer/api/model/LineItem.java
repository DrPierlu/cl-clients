package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * LineItem
 */
public class LineItem extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer orderId;
	private Integer sellableId;
	private String sellableResource;
	@JsonExclude
	private String amount;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Integer countryId;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private String defaultShippingMethodId;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
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
	private Integer marketId;
	@JsonExclude
	private List<String> metaFields;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Integer quantity;
	@JsonExclude
	private List<String> resourceMetaFields;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Integer shippingCategoryId;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private Boolean taxIncluded;
	@JsonExclude
	private Float taxRate;
	@JsonExclude
	private String taxableAmount;
	@JsonExclude
	private Boolean trackInventory;
	@JsonExclude
	private String unitAmount;
	@JsonExclude
	private Integer unitAmountCents;
	@JsonExclude
	private List<String> versions;


	public LineItem() {
		super();
	}
	

	public LineItem(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public LineItem name(String name) {
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
	

	public LineItem orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public LineItem marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public LineItem countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public LineItem currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
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
	

	public void setSellableId(Integer sellableId) {
		this.sellableId = sellableId;
	}
	

	public Integer getSellableId() {
		return this.sellableId;
	}
	

	public LineItem sellableId(Integer sellableId) {
		setSellableId(sellableId);
		return this;
	}
	

	public Integer sellableId() {
		return getSellableId();
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public LineItem shippingCategoryId(Integer shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public Integer shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setTrackInventory(Boolean trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public Boolean getTrackInventory() {
		return this.trackInventory;
	}
	

	public LineItem trackInventory(Boolean trackInventory) {
		setTrackInventory(trackInventory);
		return this;
	}
	

	public Boolean trackInventory() {
		return getTrackInventory();
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
	}
	

	public LineItem quantity(Integer quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public Integer quantity() {
		return getQuantity();
	}
	

	public void setUnitAmountCents(Integer unitAmountCents) {
		this.unitAmountCents = unitAmountCents;
	}
	

	public Integer getUnitAmountCents() {
		return this.unitAmountCents;
	}
	

	public LineItem unitAmountCents(Integer unitAmountCents) {
		setUnitAmountCents(unitAmountCents);
		return this;
	}
	

	public Integer unitAmountCents() {
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
	

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Boolean getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public LineItem taxIncluded(Boolean taxIncluded) {
		setTaxIncluded(taxIncluded);
		return this;
	}
	

	public Boolean taxIncluded() {
		return getTaxIncluded();
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
	

	public void setResourceMetaFields(List<String> resourceMetaFields) {
		this.resourceMetaFields = resourceMetaFields;
	}
	

	public List<String> getResourceMetaFields() {
		return this.resourceMetaFields;
	}
	

	public LineItem resourceMetaFields(List<String> resourceMetaFields) {
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
	

	public LineItem metaFields(List<String> metaFields) {
		setMetaFields(metaFields);
		return this;
	}
	

	public List<String> metaFields() {
		return getMetaFields();
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
	

	public void setFeaturedImageId(String featuredImageId) {
		this.featuredImageId = featuredImageId;
	}
	

	public String getFeaturedImageId() {
		return this.featuredImageId;
	}
	

	public LineItem featuredImageId(String featuredImageId) {
		setFeaturedImageId(featuredImageId);
		return this;
	}
	

	public String featuredImageId() {
		return getFeaturedImageId();
	}
	

	public void setFeaturedImage(Object featuredImage) {
		this.featuredImage = featuredImage;
	}
	

	public Object getFeaturedImage() {
		return this.featuredImage;
	}
	

	public LineItem featuredImage(Object featuredImage) {
		setFeaturedImage(featuredImage);
		return this;
	}
	

	public Object featuredImage() {
		return getFeaturedImage();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		LineItem x = (LineItem)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.sellableResource, x.sellableResource)
			&& Objects.equals(this.sellableId, x.sellableId)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.trackInventory, x.trackInventory)
			&& Objects.equals(this.quantity, x.quantity)
			&& Objects.equals(this.unitAmountCents, x.unitAmountCents)
			&& Objects.equals(this.taxRate, x.taxRate)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.sellable, x.sellable)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.resourceMetaFields, x.resourceMetaFields)
			&& Objects.equals(this.metaFields, x.metaFields)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.unitAmount, x.unitAmount)
			&& Objects.equals(this.formattedUnitAmount, x.formattedUnitAmount)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
			&& Objects.equals(this.defaultShippingMethodId, x.defaultShippingMethodId)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, marketId, countryId, currencyId,
			sellableResource, sellableId, shippingCategoryId, trackInventory, quantity,
			unitAmountCents, taxRate, taxIncluded, shippingCategory, order,
			market, country, currency, sellable, versions,
			stockItems, shippingServiceStockLocations, resourceMetaFields, metaFields, lineItemStocks,
			shippingMethods, shipments, taxAmount, formattedTaxAmount, taxableAmount,
			formattedTaxableAmount, amount, formattedAmount, unitAmount, formattedUnitAmount,
			featuredImageId, featuredImage, defaultShippingMethodId 
		);
	
	}
	

	@Override
	public LineItem clone() {
	
		LineItem no = new LineItem();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.marketId = this.marketId;
		no.countryId = this.countryId;
		no.currencyId = this.currencyId;
		no.sellableResource = this.sellableResource;
		no.sellableId = this.sellableId;
		no.shippingCategoryId = this.shippingCategoryId;
		no.trackInventory = this.trackInventory;
		no.quantity = this.quantity;
		no.unitAmountCents = this.unitAmountCents;
		no.taxRate = this.taxRate;
		no.taxIncluded = this.taxIncluded;
		no.shippingCategory = this.shippingCategory;
		no.order = this.order;
		no.market = this.market;
		no.country = this.country;
		no.currency = this.currency;
		no.sellable = this.sellable;
		no.versions = this.versions;
		no.stockItems = this.stockItems;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.resourceMetaFields = this.resourceMetaFields;
		no.metaFields = this.metaFields;
		no.lineItemStocks = this.lineItemStocks;
		no.shippingMethods = this.shippingMethods;
		no.shipments = this.shipments;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.unitAmount = this.unitAmount;
		no.formattedUnitAmount = this.formattedUnitAmount;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
		no.defaultShippingMethodId = this.defaultShippingMethodId;
	
		return no;
	
	}
	
}
