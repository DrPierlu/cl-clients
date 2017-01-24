package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * StockItem
 */
public class StockItem extends ApiResource {

	private static final long serialVersionUID = -1485265142744L;


	private Integer stockLocationId;
	private Integer stockableId;
	private String stockableResource;
	@JsonExclude
	private Boolean backorderable;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Integer quantity;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private Object stockable;


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
	

	public StockItem name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public StockItem stockLocationId(Integer stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public Integer stockLocationId() {
		return getStockLocationId();
	}
	

	public void setStockableId(Integer stockableId) {
		this.stockableId = stockableId;
	}
	

	public Integer getStockableId() {
		return this.stockableId;
	}
	

	public StockItem stockableId(Integer stockableId) {
		setStockableId(stockableId);
		return this;
	}
	

	public Integer stockableId() {
		return getStockableId();
	}
	

	public void setStockableResource(String stockableResource) {
		this.stockableResource = stockableResource;
	}
	

	public String getStockableResource() {
		return this.stockableResource;
	}
	

	public StockItem stockableResource(String stockableResource) {
		setStockableResource(stockableResource);
		return this;
	}
	

	public String stockableResource() {
		return getStockableResource();
	}
	

	public void setBackorderable(Boolean backorderable) {
		this.backorderable = backorderable;
	}
	

	public Boolean getBackorderable() {
		return this.backorderable;
	}
	

	public StockItem backorderable(Boolean backorderable) {
		setBackorderable(backorderable);
		return this;
	}
	

	public Boolean backorderable() {
		return getBackorderable();
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
	}
	

	public StockItem quantity(Integer quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public Integer quantity() {
		return getQuantity();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public StockItem previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public StockItem stockLocation(Object stockLocation) {
		setStockLocation(stockLocation);
		return this;
	}
	

	public Object stockLocation() {
		return getStockLocation();
	}
	

	public void setStockable(Object stockable) {
		this.stockable = stockable;
	}
	

	public Object getStockable() {
		return this.stockable;
	}
	

	public StockItem stockable(Object stockable) {
		setStockable(stockable);
		return this;
	}
	

	public Object stockable() {
		return getStockable();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public StockItem shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public StockItem markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public StockItem lineItemStocks(List<String> lineItemStocks) {
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
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, stockLocationId, stockableId, stockableResource, backorderable,
			quantity, previousChanges, stockLocation, stockable, shippingServiceStockLocations,
			markets, lineItemStocks 
		);
	
	}
	

	@Override
	public StockItem clone() {
	
		StockItem no = new StockItem();
	
		no = super.clone(no);
	
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
		no.markets = this.markets;
		no.lineItemStocks = this.lineItemStocks;
	
		return no;
	
	}
	
}
