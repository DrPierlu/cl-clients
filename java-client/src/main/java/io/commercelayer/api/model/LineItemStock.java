package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * LineItemStock
 */
public class LineItemStock extends ApiResource {

	private static final long serialVersionUID = -1484058602868L;


	private Integer lineItemId;
	private Integer stockItemId;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Integer countryId;
	@JsonExclude
	private Object lineItem;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Integer marketId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Integer orderId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Integer quantity;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private Integer sellableId;
	@JsonExclude
	private String sellableResource;
	@JsonExclude
	private Object shipment;
	@JsonExclude
	private Integer shipmentId;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Integer shippingCategoryId;
	@JsonExclude
	private Object shippingMethod;
	@JsonExclude
	private Integer shippingMethodId;
	@JsonExclude
	private Object stockItem;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Integer stockLocationId;


	public LineItemStock() {
		super();
	}
	

	public LineItemStock(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public LineItemStock name(String name) {
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
	

	public LineItemStock orderId(Integer orderId) {
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
	

	public LineItemStock marketId(Integer marketId) {
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
	

	public LineItemStock countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public LineItemStock shippingCategoryId(Integer shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public Integer shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}
	

	public Integer getLineItemId() {
		return this.lineItemId;
	}
	

	public LineItemStock lineItemId(Integer lineItemId) {
		setLineItemId(lineItemId);
		return this;
	}
	

	public Integer lineItemId() {
		return getLineItemId();
	}
	

	public void setStockItemId(Integer stockItemId) {
		this.stockItemId = stockItemId;
	}
	

	public Integer getStockItemId() {
		return this.stockItemId;
	}
	

	public LineItemStock stockItemId(Integer stockItemId) {
		setStockItemId(stockItemId);
		return this;
	}
	

	public Integer stockItemId() {
		return getStockItemId();
	}
	

	public void setSellableId(Integer sellableId) {
		this.sellableId = sellableId;
	}
	

	public Integer getSellableId() {
		return this.sellableId;
	}
	

	public LineItemStock sellableId(Integer sellableId) {
		setSellableId(sellableId);
		return this;
	}
	

	public Integer sellableId() {
		return getSellableId();
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public LineItemStock sellableResource(String sellableResource) {
		setSellableResource(sellableResource);
		return this;
	}
	

	public String sellableResource() {
		return getSellableResource();
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public LineItemStock stockLocationId(Integer stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public Integer stockLocationId() {
		return getStockLocationId();
	}
	

	public void setShippingMethodId(Integer shippingMethodId) {
		this.shippingMethodId = shippingMethodId;
	}
	

	public Integer getShippingMethodId() {
		return this.shippingMethodId;
	}
	

	public LineItemStock shippingMethodId(Integer shippingMethodId) {
		setShippingMethodId(shippingMethodId);
		return this;
	}
	

	public Integer shippingMethodId() {
		return getShippingMethodId();
	}
	

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public Integer getShipmentId() {
		return this.shipmentId;
	}
	

	public LineItemStock shipmentId(Integer shipmentId) {
		setShipmentId(shipmentId);
		return this;
	}
	

	public Integer shipmentId() {
		return getShipmentId();
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
	}
	

	public LineItemStock quantity(Integer quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public Integer quantity() {
		return getQuantity();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public LineItemStock previousChanges(Object previousChanges) {
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
	

	public LineItemStock shippingCategory(Object shippingCategory) {
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
	

	public LineItemStock order(Object order) {
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
	

	public LineItemStock market(Object market) {
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
	

	public LineItemStock country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setLineItem(Object lineItem) {
		this.lineItem = lineItem;
	}
	

	public Object getLineItem() {
		return this.lineItem;
	}
	

	public LineItemStock lineItem(Object lineItem) {
		setLineItem(lineItem);
		return this;
	}
	

	public Object lineItem() {
		return getLineItem();
	}
	

	public void setStockItem(Object stockItem) {
		this.stockItem = stockItem;
	}
	

	public Object getStockItem() {
		return this.stockItem;
	}
	

	public LineItemStock stockItem(Object stockItem) {
		setStockItem(stockItem);
		return this;
	}
	

	public Object stockItem() {
		return getStockItem();
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public LineItemStock sellable(Object sellable) {
		setSellable(sellable);
		return this;
	}
	

	public Object sellable() {
		return getSellable();
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public LineItemStock stockLocation(Object stockLocation) {
		setStockLocation(stockLocation);
		return this;
	}
	

	public Object stockLocation() {
		return getStockLocation();
	}
	

	public void setShippingMethod(Object shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	

	public Object getShippingMethod() {
		return this.shippingMethod;
	}
	

	public LineItemStock shippingMethod(Object shippingMethod) {
		setShippingMethod(shippingMethod);
		return this;
	}
	

	public Object shippingMethod() {
		return getShippingMethod();
	}
	

	public void setShipment(Object shipment) {
		this.shipment = shipment;
	}
	

	public Object getShipment() {
		return this.shipment;
	}
	

	public LineItemStock shipment(Object shipment) {
		setShipment(shipment);
		return this;
	}
	

	public Object shipment() {
		return getShipment();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		LineItemStock x = (LineItemStock)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.lineItemId, x.lineItemId)
			&& Objects.equals(this.stockItemId, x.stockItemId)
			&& Objects.equals(this.sellableId, x.sellableId)
			&& Objects.equals(this.sellableResource, x.sellableResource)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.shippingMethodId, x.shippingMethodId)
			&& Objects.equals(this.shipmentId, x.shipmentId)
			&& Objects.equals(this.quantity, x.quantity)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.lineItem, x.lineItem)
			&& Objects.equals(this.stockItem, x.stockItem)
			&& Objects.equals(this.sellable, x.sellable)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.shippingMethod, x.shippingMethod)
			&& Objects.equals(this.shipment, x.shipment)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, marketId, countryId, shippingCategoryId,
			lineItemId, stockItemId, sellableId, sellableResource, stockLocationId,
			shippingMethodId, shipmentId, quantity, previousChanges, shippingCategory,
			order, market, country, lineItem, stockItem,
			sellable, stockLocation, shippingMethod, shipment 
		);
	
	}
	

	@Override
	public LineItemStock clone() {
	
		LineItemStock no = new LineItemStock();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.marketId = this.marketId;
		no.countryId = this.countryId;
		no.shippingCategoryId = this.shippingCategoryId;
		no.lineItemId = this.lineItemId;
		no.stockItemId = this.stockItemId;
		no.sellableId = this.sellableId;
		no.sellableResource = this.sellableResource;
		no.stockLocationId = this.stockLocationId;
		no.shippingMethodId = this.shippingMethodId;
		no.shipmentId = this.shipmentId;
		no.quantity = this.quantity;
		no.previousChanges = this.previousChanges;
		no.shippingCategory = this.shippingCategory;
		no.order = this.order;
		no.market = this.market;
		no.country = this.country;
		no.lineItem = this.lineItem;
		no.stockItem = this.stockItem;
		no.sellable = this.sellable;
		no.stockLocation = this.stockLocation;
		no.shippingMethod = this.shippingMethod;
		no.shipment = this.shipment;
	
		return no;
	
	}
	
}
