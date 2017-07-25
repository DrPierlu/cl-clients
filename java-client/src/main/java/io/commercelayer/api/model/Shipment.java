package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


/**
 * Shipment
 */
public class Shipment extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer orderId;
	private Integer shippingMethodId;
	private Integer stockLocationId;
	@JsonExclude
	private Object customsForm;
	@JsonExclude
	private List<String> events;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private LocalDateTime purchasedAt;
	@JsonExclude
	private LocalDateTime shippedAt;
	@JsonExclude
	private String shippingLabelFormat;
	@JsonExclude
	private String shippingLabelUrl;
	@JsonExclude
	private List<String> shippingLabels;
	@JsonExclude
	private Object shippingMethod;
	@JsonExclude
	private String state;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private String trackingNumber;
	@JsonExclude
	private List<String> versions;


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
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Shipment state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	

	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	

	public Shipment trackingNumber(String trackingNumber) {
		setTrackingNumber(trackingNumber);
		return this;
	}
	

	public String trackingNumber() {
		return getTrackingNumber();
	}
	

	public void setShippingLabelUrl(String shippingLabelUrl) {
		this.shippingLabelUrl = shippingLabelUrl;
	}
	

	public String getShippingLabelUrl() {
		return this.shippingLabelUrl;
	}
	

	public Shipment shippingLabelUrl(String shippingLabelUrl) {
		setShippingLabelUrl(shippingLabelUrl);
		return this;
	}
	

	public String shippingLabelUrl() {
		return getShippingLabelUrl();
	}
	

	public void setShippingLabelFormat(String shippingLabelFormat) {
		this.shippingLabelFormat = shippingLabelFormat;
	}
	

	public String getShippingLabelFormat() {
		return this.shippingLabelFormat;
	}
	

	public Shipment shippingLabelFormat(String shippingLabelFormat) {
		setShippingLabelFormat(shippingLabelFormat);
		return this;
	}
	

	public String shippingLabelFormat() {
		return getShippingLabelFormat();
	}
	

	public void setPurchasedAt(LocalDateTime purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	

	public LocalDateTime getPurchasedAt() {
		return this.purchasedAt;
	}
	

	public Shipment purchasedAt(LocalDateTime purchasedAt) {
		setPurchasedAt(purchasedAt);
		return this;
	}
	

	public LocalDateTime purchasedAt() {
		return getPurchasedAt();
	}
	

	public void setShippedAt(LocalDateTime shippedAt) {
		this.shippedAt = shippedAt;
	}
	

	public LocalDateTime getShippedAt() {
		return this.shippedAt;
	}
	

	public Shipment shippedAt(LocalDateTime shippedAt) {
		setShippedAt(shippedAt);
		return this;
	}
	

	public LocalDateTime shippedAt() {
		return getShippedAt();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Shipment versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setEvents(List<String> events) {
		this.events = events;
	}
	

	public List<String> getEvents() {
		return this.events;
	}
	

	public Shipment events(List<String> events) {
		setEvents(events);
		return this;
	}
	

	public List<String> events() {
		return getEvents();
	}
	

	public void setShippingLabels(List<String> shippingLabels) {
		this.shippingLabels = shippingLabels;
	}
	

	public List<String> getShippingLabels() {
		return this.shippingLabels;
	}
	

	public Shipment shippingLabels(List<String> shippingLabels) {
		setShippingLabels(shippingLabels);
		return this;
	}
	

	public List<String> shippingLabels() {
		return getShippingLabels();
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
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Shipment lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setCustomsForm(Object customsForm) {
		this.customsForm = customsForm;
	}
	

	public Object getCustomsForm() {
		return this.customsForm;
	}
	

	public Shipment customsForm(Object customsForm) {
		setCustomsForm(customsForm);
		return this;
	}
	

	public Object customsForm() {
		return getCustomsForm();
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
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.trackingNumber, x.trackingNumber)
			&& Objects.equals(this.shippingLabelUrl, x.shippingLabelUrl)
			&& Objects.equals(this.shippingLabelFormat, x.shippingLabelFormat)
			&& Objects.equals(this.purchasedAt, x.purchasedAt)
			&& Objects.equals(this.shippedAt, x.shippedAt)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.shippingMethod, x.shippingMethod)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.events, x.events)
			&& Objects.equals(this.shippingLabels, x.shippingLabels)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.customsForm, x.customsForm)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, stockLocationId, shippingMethodId, state,
			trackingNumber, shippingLabelUrl, shippingLabelFormat, purchasedAt, shippedAt,
			order, stockLocation, shippingMethod, versions, events,
			shippingLabels, lineItemStocks, lineItems, customsForm 
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
		no.state = this.state;
		no.trackingNumber = this.trackingNumber;
		no.shippingLabelUrl = this.shippingLabelUrl;
		no.shippingLabelFormat = this.shippingLabelFormat;
		no.purchasedAt = this.purchasedAt;
		no.shippedAt = this.shippedAt;
		no.order = this.order;
		no.stockLocation = this.stockLocation;
		no.shippingMethod = this.shippingMethod;
		no.versions = this.versions;
		no.events = this.events;
		no.shippingLabels = this.shippingLabels;
		no.lineItemStocks = this.lineItemStocks;
		no.lineItems = this.lineItems;
		no.customsForm = this.customsForm;
	
		return no;
	
	}
	
}
