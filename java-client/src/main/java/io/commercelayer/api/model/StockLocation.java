package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * StockLocation
 */
public class StockLocation extends ApiResource {

	private static final long serialVersionUID = -1484903989132L;


	private Integer addressId;
	private String name;
	@JsonExclude
	private Object address;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> marketStockLocations;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private List<String> stockItems;


	public StockLocation() {
		super();
	}
	

	public StockLocation(Long id) {
		super(id);
	}
	

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	

	public Integer getAddressId() {
		return this.addressId;
	}
	

	public StockLocation addressId(Integer addressId) {
		setAddressId(addressId);
		return this;
	}
	

	public Integer addressId() {
		return getAddressId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public StockLocation name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public StockLocation position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public StockLocation previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setAddress(Object address) {
		this.address = address;
	}
	

	public Object getAddress() {
		return this.address;
	}
	

	public StockLocation address(Object address) {
		setAddress(address);
		return this;
	}
	

	public Object address() {
		return getAddress();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public StockLocation stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public StockLocation lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public StockLocation shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setMarketStockLocations(List<String> marketStockLocations) {
		this.marketStockLocations = marketStockLocations;
	}
	

	public List<String> getMarketStockLocations() {
		return this.marketStockLocations;
	}
	

	public StockLocation marketStockLocations(List<String> marketStockLocations) {
		setMarketStockLocations(marketStockLocations);
		return this;
	}
	

	public List<String> marketStockLocations() {
		return getMarketStockLocations();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public StockLocation shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public StockLocation markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		StockLocation x = (StockLocation)o;
	
		return super.equals(o)
			&& Objects.equals(this.addressId, x.addressId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.address, x.address)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.marketStockLocations, x.marketStockLocations)
			&& Objects.equals(this.shippingServices, x.shippingServices)
			&& Objects.equals(this.markets, x.markets)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			addressId, name, position, previousChanges, address,
			stockItems, lineItemStocks, shippingServiceStockLocations, marketStockLocations, shippingServices,
			markets 
		);
	
	}
	

	@Override
	public StockLocation clone() {
	
		StockLocation no = new StockLocation();
	
		no = super.clone(no);
	
		no.addressId = this.addressId;
		no.name = this.name;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.address = this.address;
		no.stockItems = this.stockItems;
		no.lineItemStocks = this.lineItemStocks;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.marketStockLocations = this.marketStockLocations;
		no.shippingServices = this.shippingServices;
		no.markets = this.markets;
	
		return no;
	
	}
	
}
