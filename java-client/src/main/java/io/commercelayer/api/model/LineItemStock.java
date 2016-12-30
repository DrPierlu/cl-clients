package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * LineItemStock
 */
public class LineItemStock extends ApiResource {

	private static final long serialVersionUID = -1483100361520L;


	private String lineItemId;
	private String stockItemId;
	@JsonExclude
	private String availableShippingServiceIds;
	@JsonExclude
	private Object country;
	@JsonExclude
	private String countryId;
	@JsonExclude
	private Object lineItem;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String marketId;
	@JsonExclude
	private String matchingShippingZoneIds;
	@JsonExclude
	private Object order;
	@JsonExclude
	private String orderId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String quantity;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private String sellableId;
	@JsonExclude
	private String sellableResource;
	@JsonExclude
	private Object shipment;
	@JsonExclude
	private String shipmentId;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private String shippingCategoryId;
	@JsonExclude
	private Object shippingMethod;
	@JsonExclude
	private String shippingMethodId;
	@JsonExclude
	private Object stockItem;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private String stockLocationId;


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
	

	public LineItemStock orderId(String orderId) {
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
	

	public LineItemStock marketId(String marketId) {
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
	

	public LineItemStock countryId(String countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public String countryId() {
		return getCountryId();
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public LineItemStock shippingCategoryId(String shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public String shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setLineItemId(String lineItemId) {
		this.lineItemId = lineItemId;
	}
	

	public String getLineItemId() {
		return this.lineItemId;
	}
	

	public LineItemStock lineItemId(String lineItemId) {
		setLineItemId(lineItemId);
		return this;
	}
	

	public String lineItemId() {
		return getLineItemId();
	}
	

	public void setStockItemId(String stockItemId) {
		this.stockItemId = stockItemId;
	}
	

	public String getStockItemId() {
		return this.stockItemId;
	}
	

	public LineItemStock stockItemId(String stockItemId) {
		setStockItemId(stockItemId);
		return this;
	}
	

	public String stockItemId() {
		return getStockItemId();
	}
	

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}
	

	public String getSellableId() {
		return this.sellableId;
	}
	

	public LineItemStock sellableId(String sellableId) {
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
	

	public LineItemStock sellableResource(String sellableResource) {
		setSellableResource(sellableResource);
		return this;
	}
	

	public String sellableResource() {
		return getSellableResource();
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public LineItemStock stockLocationId(String stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public String stockLocationId() {
		return getStockLocationId();
	}
	

	public void setShippingMethodId(String shippingMethodId) {
		this.shippingMethodId = shippingMethodId;
	}
	

	public String getShippingMethodId() {
		return this.shippingMethodId;
	}
	

	public LineItemStock shippingMethodId(String shippingMethodId) {
		setShippingMethodId(shippingMethodId);
		return this;
	}
	

	public String shippingMethodId() {
		return getShippingMethodId();
	}
	

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public String getShipmentId() {
		return this.shipmentId;
	}
	

	public LineItemStock shipmentId(String shipmentId) {
		setShipmentId(shipmentId);
		return this;
	}
	

	public String shipmentId() {
		return getShipmentId();
	}
	

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

	public String getQuantity() {
		return this.quantity;
	}
	

	public LineItemStock quantity(String quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public String quantity() {
		return getQuantity();
	}
	

	public void setMatchingShippingZoneIds(String matchingShippingZoneIds) {
		this.matchingShippingZoneIds = matchingShippingZoneIds;
	}
	

	public String getMatchingShippingZoneIds() {
		return this.matchingShippingZoneIds;
	}
	

	public LineItemStock matchingShippingZoneIds(String matchingShippingZoneIds) {
		setMatchingShippingZoneIds(matchingShippingZoneIds);
		return this;
	}
	

	public String matchingShippingZoneIds() {
		return getMatchingShippingZoneIds();
	}
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
	}
	

	public LineItemStock availableShippingServiceIds(String availableShippingServiceIds) {
		setAvailableShippingServiceIds(availableShippingServiceIds);
		return this;
	}
	

	public String availableShippingServiceIds() {
		return getAvailableShippingServiceIds();
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
			&& Objects.equals(this.matchingShippingZoneIds, x.matchingShippingZoneIds)
			&& Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds)
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
			orderId, marketId, countryId, shippingCategoryId, lineItemId,
			stockItemId, sellableId, sellableResource, stockLocationId, shippingMethodId,
			shipmentId, quantity, matchingShippingZoneIds, availableShippingServiceIds, previousChanges,
			shippingCategory, order, market, country, lineItem,
			stockItem, sellable, stockLocation, shippingMethod, shipment
			
		);
	
	}
	

	@Override
	public LineItemStock clone() {
	
		LineItemStock no = new LineItemStock();
	
		no = super.clone(no);
	
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
		no.matchingShippingZoneIds = this.matchingShippingZoneIds;
		no.availableShippingServiceIds = this.availableShippingServiceIds;
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
