package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * StockItem
 */
public class StockItem extends ApiResource {

	private static final long serialVersionUID = -1482845758281L;


	private String stockLocationId;
	private String stockableId;
	private String stockableResource;
	private String backorderable;
	private String quantity;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Object stockable;
	private List<String> shippingServiceStockLocations;
	private List<String> lineItemStocks;


	public StockItem() {
		super();
	}
	

	public StockItem(Long id) {
		super(id);
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setStockableId(String stockableId) {
		this.stockableId = stockableId;
	}
	

	public String getStockableId() {
		return this.stockableId;
	}
	

	public void setStockableResource(String stockableResource) {
		this.stockableResource = stockableResource;
	}
	

	public String getStockableResource() {
		return this.stockableResource;
	}
	

	public void setBackorderable(String backorderable) {
		this.backorderable = backorderable;
	}
	

	public String getBackorderable() {
		return this.backorderable;
	}
	

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

	public String getQuantity() {
		return this.quantity;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public void setStockable(Object stockable) {
		this.stockable = stockable;
	}
	

	public Object getStockable() {
		return this.stockable;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
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
	
		StockItem x = (StockItem) o;
	
		return super.equals(o) &&
			Objects.equals(this.stockLocationId, x.stockLocationId)  &&
			Objects.equals(this.stockableId, x.stockableId)  &&
			Objects.equals(this.stockableResource, x.stockableResource)  &&
			Objects.equals(this.backorderable, x.backorderable)  &&
			Objects.equals(this.quantity, x.quantity)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.stockLocation, x.stockLocation)  &&
			Objects.equals(this.stockable, x.stockable)  &&
			Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, stockLocationId, stockableId, stockableResource, backorderable,
			quantity, previousChanges, stockLocation, stockable, shippingServiceStockLocations,
			lineItemStocks 
		);
	
	}
	
}
