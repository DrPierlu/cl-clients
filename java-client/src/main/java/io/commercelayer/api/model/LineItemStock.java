package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * LineItemStock
 */
public class LineItemStock extends ApiResource {

	private static final long serialVersionUID = -1482845758016L;


	private String orderId;
	private String marketId;
	private String countryId;
	private String shippingCategoryId;
	private String lineItemId;
	private String stockItemId;
	private String sellableId;
	private String sellableResource;
	private String stockLocationId;
	private String shippingMethodId;
	private String shipmentId;
	private String quantity;
	private String matchingShippingZoneIds;
	private String availableShippingServiceIds;
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
	

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return this.orderId;
	}
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	

	public String getCountryId() {
		return this.countryId;
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setLineItemId(String lineItemId) {
		this.lineItemId = lineItemId;
	}
	

	public String getLineItemId() {
		return this.lineItemId;
	}
	

	public void setStockItemId(String stockItemId) {
		this.stockItemId = stockItemId;
	}
	

	public String getStockItemId() {
		return this.stockItemId;
	}
	

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}
	

	public String getSellableId() {
		return this.sellableId;
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setShippingMethodId(String shippingMethodId) {
		this.shippingMethodId = shippingMethodId;
	}
	

	public String getShippingMethodId() {
		return this.shippingMethodId;
	}
	

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public String getShipmentId() {
		return this.shipmentId;
	}
	

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

	public String getQuantity() {
		return this.quantity;
	}
	

	public void setMatchingShippingZoneIds(String matchingShippingZoneIds) {
		this.matchingShippingZoneIds = matchingShippingZoneIds;
	}
	

	public String getMatchingShippingZoneIds() {
		return this.matchingShippingZoneIds;
	}
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
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
			Objects.equals(this.matchingShippingZoneIds, x.matchingShippingZoneIds)  &&
			Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds)  &&
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
			shippingMethodId, shipmentId, quantity, matchingShippingZoneIds, availableShippingServiceIds,
			previousChanges, shippingCategory, order, market, country,
			lineItem, stockItem, sellable, stockLocation, shippingMethod,
			shipment 
		);
	
	}
	
}
