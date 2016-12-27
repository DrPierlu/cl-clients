package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * StockItem
 */
public class StockItem extends ApiResource {

	private static final long serialVersionUID = -1482880735358L;


	@JsonExclude
	private String name;
	private Integer stockLocationId;
	private Integer stockableId;
	private String stockableResource;
	@JsonExclude
	private Object backorderable;
	@JsonExclude
	private Integer quantity;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Object stockable;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> lineItemStocks;


	public StockItem() {
		super();
	}
	

	public StockItem(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setStockableId(Integer stockableId) {
		this.stockableId = stockableId;
	}
	

	public Integer getStockableId() {
		return this.stockableId;
	}
	

	public void setStockableResource(String stockableResource) {
		this.stockableResource = stockableResource;
	}
	

	public String getStockableResource() {
		return this.stockableResource;
	}
	

	public void setBackorderable(Object backorderable) {
		this.backorderable = backorderable;
	}
	

	public Object getBackorderable() {
		return this.backorderable;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		StockItem x = (StockItem)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.stockableId, x.stockableId)
			&& Objects.equals(this.stockableResource, x.stockableResource)
			&& Objects.equals(this.backorderable, x.backorderable)
			&& Objects.equals(this.quantity, x.quantity)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.stockable, x.stockable)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, stockLocationId, stockableId, stockableResource, backorderable,
			quantity, previousChanges, stockLocation, stockable, shippingServiceStockLocations,
			lineItemStocks 
		);
	
	}
	

	@Override
	public StockItem clone() {
	
		StockItem no = new StockItem();
	
		no.name = this.name;
		no.stockLocationId = this.stockLocationId;
		no.stockableId = this.stockableId;
		no.stockableResource = this.stockableResource;
		no.backorderable = this.backorderable;
		no.quantity = this.quantity;
		no.previousChanges = this.previousChanges;
		no.stockLocation = this.stockLocation;
		no.stockable = this.stockable;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.lineItemStocks = this.lineItemStocks;
	
		return no;
	
	}
	
}
