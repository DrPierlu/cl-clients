package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * LineItemStock
 */
public class LineItemStock extends ApiResource {

	private static final long serialVersionUID = -1481927389108L;


	private Integer orderId;
	private Integer marketId;
	private Integer countryId;
	private Integer shippingCategoryId;
	private Integer lineItemId;
	private Integer stockItemId;
	private Integer sellableId;
	private String sellableResource;
	private Integer stockLocationId;
	private Integer shippingMethodId;
	private Integer shipmentId;
	private Integer quantity;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object lineItem;
	@JsonExclude
	private Object stockItem;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Object shippingMethod;
	@JsonExclude
	private Object shipment;


	public LineItemStock() {
		super();
	}
	

	public LineItemStock(Long id) {
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
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}
	

	public Integer getLineItemId() {
		return this.lineItemId;
	}
	

	public void setStockItemId(Integer stockItemId) {
		this.stockItemId = stockItemId;
	}
	

	public Integer getStockItemId() {
		return this.stockItemId;
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
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setShippingMethodId(Integer shippingMethodId) {
		this.shippingMethodId = shippingMethodId;
	}
	

	public Integer getShippingMethodId() {
		return this.shippingMethodId;
	}
	

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public Integer getShipmentId() {
		return this.shipmentId;
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
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
	

	public void setLineItem(Object lineItem) {
		this.lineItem = lineItem;
	}
	

	public Object getLineItem() {
		return this.lineItem;
	}
	

	public void setStockItem(Object stockItem) {
		this.stockItem = stockItem;
	}
	

	public Object getStockItem() {
		return this.stockItem;
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public void setShippingMethod(Object shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	

	public Object getShippingMethod() {
		return this.shippingMethod;
	}
	

	public void setShipment(Object shipment) {
		this.shipment = shipment;
	}
	

	public Object getShipment() {
		return this.shipment;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		LineItemStock x = (LineItemStock) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.marketId, x.marketId)  &&
			Objects.equals(this.countryId, x.countryId)  &&
			Objects.equals(this.shippingCategoryId, x.shippingCategoryId)  &&
			Objects.equals(this.lineItemId, x.lineItemId)  &&
			Objects.equals(this.stockItemId, x.stockItemId)  &&
			Objects.equals(this.sellableId, x.sellableId)  &&
			Objects.equals(this.sellableResource, x.sellableResource)  &&
			Objects.equals(this.stockLocationId, x.stockLocationId)  &&
			Objects.equals(this.shippingMethodId, x.shippingMethodId)  &&
			Objects.equals(this.shipmentId, x.shipmentId)  &&
			Objects.equals(this.quantity, x.quantity)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingCategory, x.shippingCategory)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.market, x.market)  &&
			Objects.equals(this.country, x.country)  &&
			Objects.equals(this.lineItem, x.lineItem)  &&
			Objects.equals(this.stockItem, x.stockItem)  &&
			Objects.equals(this.sellable, x.sellable)  &&
			Objects.equals(this.stockLocation, x.stockLocation)  &&
			Objects.equals(this.shippingMethod, x.shippingMethod)  &&
			Objects.equals(this.shipment, x.shipment) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, marketId, countryId, shippingCategoryId,
			lineItemId, stockItemId, sellableId, sellableResource, stockLocationId,
			shippingMethodId, shipmentId, quantity, previousChanges, shippingCategory,
			order, market, country, lineItem, stockItem,
			sellable, stockLocation, shippingMethod, shipment 
		);
	
	}
	
}
