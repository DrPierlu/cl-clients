package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingMethod
 */
public class ShippingMethod extends ApiResource {

	private static final long serialVersionUID = -1481805605960L;


	private String orderId;
	private String shippingAddressId;
	private String shippingServiceId;
	private String shippingPackageId;
	private String priceCents;
	private String freeOverAmountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object shippingPackage;
	@JsonExclude
	private Object shippingAddress;
	@JsonExclude
	private Object shippingService;
	private List<String> lineItemStocks;
	private List<String> shipments;
	private List<String> lineItems;
	private String amount;
	private String formattedAmount;
	private String totalLineItemAmount;
	private String formattedTotalLineItemAmount;
	private String taxableAmount;
	private String formattedTaxableAmount;
	private String taxAmount;
	private String formattedTaxAmount;
	private String price;
	private String formattedPrice;
	private String freeOverAmount;
	private String formattedFreeOverAmount;


	public ShippingMethod() {
		super();
	}
	

	public ShippingMethod(Long id) {
		super(id);
	}
	

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	

	public String getOrderId() {
		return this.orderId;
	}
	

	public void setShippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	

	public String getShippingAddressId() {
		return this.shippingAddressId;
	}
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public void setShippingPackageId(String shippingPackageId) {
		this.shippingPackageId = shippingPackageId;
	}
	

	public String getShippingPackageId() {
		return this.shippingPackageId;
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public void setFreeOverAmountCents(String freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public String getFreeOverAmountCents() {
		return this.freeOverAmountCents;
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
	

	public void setShippingPackage(Object shippingPackage) {
		this.shippingPackage = shippingPackage;
	}
	

	public Object getShippingPackage() {
		return this.shippingPackage;
	}
	

	public void setShippingAddress(Object shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	

	public Object getShippingAddress() {
		return this.shippingAddress;
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public void setTotalLineItemAmount(String totalLineItemAmount) {
		this.totalLineItemAmount = totalLineItemAmount;
	}
	

	public String getTotalLineItemAmount() {
		return this.totalLineItemAmount;
	}
	

	public void setFormattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		this.formattedTotalLineItemAmount = formattedTotalLineItemAmount;
	}
	

	public String getFormattedTotalLineItemAmount() {
		return this.formattedTotalLineItemAmount;
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public void setFormattedTaxableAmount(String formattedTaxableAmount) {
		this.formattedTaxableAmount = formattedTaxableAmount;
	}
	

	public String getFormattedTaxableAmount() {
		return this.formattedTaxableAmount;
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public void setFormattedTaxAmount(String formattedTaxAmount) {
		this.formattedTaxAmount = formattedTaxAmount;
	}
	

	public String getFormattedTaxAmount() {
		return this.formattedTaxAmount;
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public void setFreeOverAmount(String freeOverAmount) {
		this.freeOverAmount = freeOverAmount;
	}
	

	public String getFreeOverAmount() {
		return this.freeOverAmount;
	}
	

	public void setFormattedFreeOverAmount(String formattedFreeOverAmount) {
		this.formattedFreeOverAmount = formattedFreeOverAmount;
	}
	

	public String getFormattedFreeOverAmount() {
		return this.formattedFreeOverAmount;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ShippingMethod x = (ShippingMethod) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.shippingAddressId, x.shippingAddressId)  &&
			Objects.equals(this.shippingServiceId, x.shippingServiceId)  &&
			Objects.equals(this.shippingPackageId, x.shippingPackageId)  &&
			Objects.equals(this.priceCents, x.priceCents)  &&
			Objects.equals(this.freeOverAmountCents, x.freeOverAmountCents)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.shippingPackage, x.shippingPackage)  &&
			Objects.equals(this.shippingAddress, x.shippingAddress)  &&
			Objects.equals(this.shippingService, x.shippingService)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.shipments, x.shipments)  &&
			Objects.equals(this.lineItems, x.lineItems)  &&
			Objects.equals(this.amount, x.amount)  &&
			Objects.equals(this.formattedAmount, x.formattedAmount)  &&
			Objects.equals(this.totalLineItemAmount, x.totalLineItemAmount)  &&
			Objects.equals(this.formattedTotalLineItemAmount, x.formattedTotalLineItemAmount)  &&
			Objects.equals(this.taxableAmount, x.taxableAmount)  &&
			Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)  &&
			Objects.equals(this.taxAmount, x.taxAmount)  &&
			Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)  &&
			Objects.equals(this.price, x.price)  &&
			Objects.equals(this.formattedPrice, x.formattedPrice)  &&
			Objects.equals(this.freeOverAmount, x.freeOverAmount)  &&
			Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, shippingAddressId, shippingServiceId, shippingPackageId,
			priceCents, freeOverAmountCents, previousChanges, order, shippingPackage,
			shippingAddress, shippingService, lineItemStocks, shipments, lineItems,
			amount, formattedAmount, totalLineItemAmount, formattedTotalLineItemAmount, taxableAmount,
			formattedTaxableAmount, taxAmount, formattedTaxAmount, price, formattedPrice,
			freeOverAmount, formattedFreeOverAmount 
		);
	
	}
	
}
