package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Shipment
 */
public class Shipment extends ApiResource {

	private static final long serialVersionUID = -1485265142627L;


	private List<String> lineItemStocks;
	private String name;
	private Integer orderId;
	private Integer shippingMethodId;
	private Integer stockLocationId;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingMethod;
	@JsonExclude
	private Object stockLocation;


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
	

	public Shipment name(String name) {
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
	

	public Shipment orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public Shipment stockLocationId(Integer stockLocationId) {
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
	

	public Shipment shippingMethodId(Integer shippingMethodId) {
		setShippingMethodId(shippingMethodId);
		return this;
	}
	

	public Integer shippingMethodId() {
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
	
		no = super.clone(no);
	
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
