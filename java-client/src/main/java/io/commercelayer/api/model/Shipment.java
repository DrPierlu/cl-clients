package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Shipment
 */
public class Shipment extends ApiResource {

	private static final long serialVersionUID = -1482880735356L;


	private String name;
	private Integer orderId;
	private Integer stockLocationId;
	private Integer shippingMethodId;
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
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Shipment x = (Shipment)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.shippingMethodId, x.shippingMethodId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.shippingMethod, x.shippingMethod)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, stockLocationId, shippingMethodId, previousChanges,
			order, stockLocation, shippingMethod, lineItemStocks 
		);
	
	}
	

	@Override
	public Shipment clone() {
	
		Shipment no = new Shipment();
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.stockLocationId = this.stockLocationId;
		no.shippingMethodId = this.shippingMethodId;
		no.previousChanges = this.previousChanges;
		no.order = this.order;
		no.stockLocation = this.stockLocation;
		no.shippingMethod = this.shippingMethod;
		no.lineItemStocks = this.lineItemStocks;
	
		return no;
	
	}
	
}
