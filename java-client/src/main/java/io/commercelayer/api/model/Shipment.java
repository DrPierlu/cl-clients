package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Shipment
 */
public class Shipment extends ApiResource {

	private static final long serialVersionUID = -1482845758265L;


	private String orderId;
	private String stockLocationId;
	private String shippingMethodId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Object shippingMethod;
	private List<String> lineItemStocks;


	public Shipment() {
		super();
	}
	

	public Shipment(Long id) {
		super(id);
	}
	

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return this.orderId;
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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
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
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Shipment x = (Shipment) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.stockLocationId, x.stockLocationId)  &&
			Objects.equals(this.shippingMethodId, x.shippingMethodId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.stockLocation, x.stockLocation)  &&
			Objects.equals(this.shippingMethod, x.shippingMethod)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, stockLocationId, shippingMethodId, previousChanges,
			order, stockLocation, shippingMethod, lineItemStocks 
		);
	
	}
	
}
