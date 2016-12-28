package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Shipment
 */
public class Shipment extends ApiResource {

	private static final long serialVersionUID = -1482914098035L;


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
	

	public Shipment orderId(String orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public String orderId() {
		return getOrderId();
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public Shipment stockLocationId(String stockLocationId) {
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
	

	public Shipment shippingMethodId(String shippingMethodId) {
		setShippingMethodId(shippingMethodId);
		return this;
	}
	

	public String shippingMethodId() {
		return getShippingMethodId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Shipment previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public Shipment order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public Shipment stockLocation(Object stockLocation) {
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
	

	public Shipment shippingMethod(Object shippingMethod) {
		setShippingMethod(shippingMethod);
		return this;
	}
	

	public Object shippingMethod() {
		return getShippingMethod();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Shipment lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Shipment x = (Shipment)o;
	
		return super.equals(o)
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
			orderId, stockLocationId, shippingMethodId, previousChanges, order,
			stockLocation, shippingMethod, lineItemStocks 
		);
	
	}
	

	@Override
	public Shipment clone() {
	
		Shipment no = new Shipment();
	
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
