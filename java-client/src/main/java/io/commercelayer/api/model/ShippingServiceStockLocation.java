package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * ShippingServiceStockLocation
 */
public class ShippingServiceStockLocation extends ApiResource {

	private static final long serialVersionUID = -1483006114430L;


	private String maxLeadTimeHours;
	private String minLeadTimeHours;
	private String shippingServiceId;
	private String stockLocationId;
	@JsonExclude
	private String maxLeadTimeDays;
	@JsonExclude
	private String minLeadTimeDays;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private Object stockLocation;


	public ShippingServiceStockLocation() {
		super();
	}
	

	public ShippingServiceStockLocation(Long id) {
		super(id);
	}
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceStockLocation shippingServiceId(String shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public String shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public ShippingServiceStockLocation stockLocationId(String stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public String stockLocationId() {
		return getStockLocationId();
	}
	

	public void setMinLeadTimeHours(String minLeadTimeHours) {
		this.minLeadTimeHours = minLeadTimeHours;
	}
	

	public String getMinLeadTimeHours() {
		return this.minLeadTimeHours;
	}
	

	public ShippingServiceStockLocation minLeadTimeHours(String minLeadTimeHours) {
		setMinLeadTimeHours(minLeadTimeHours);
		return this;
	}
	

	public String minLeadTimeHours() {
		return getMinLeadTimeHours();
	}
	

	public void setMaxLeadTimeHours(String maxLeadTimeHours) {
		this.maxLeadTimeHours = maxLeadTimeHours;
	}
	

	public String getMaxLeadTimeHours() {
		return this.maxLeadTimeHours;
	}
	

	public ShippingServiceStockLocation maxLeadTimeHours(String maxLeadTimeHours) {
		setMaxLeadTimeHours(maxLeadTimeHours);
		return this;
	}
	

	public String maxLeadTimeHours() {
		return getMaxLeadTimeHours();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingServiceStockLocation previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public ShippingServiceStockLocation shippingService(Object shippingService) {
		setShippingService(shippingService);
		return this;
	}
	

	public Object shippingService() {
		return getShippingService();
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public ShippingServiceStockLocation stockLocation(Object stockLocation) {
		setStockLocation(stockLocation);
		return this;
	}
	

	public Object stockLocation() {
		return getStockLocation();
	}
	

	public void setMinLeadTimeDays(String minLeadTimeDays) {
		this.minLeadTimeDays = minLeadTimeDays;
	}
	

	public String getMinLeadTimeDays() {
		return this.minLeadTimeDays;
	}
	

	public ShippingServiceStockLocation minLeadTimeDays(String minLeadTimeDays) {
		setMinLeadTimeDays(minLeadTimeDays);
		return this;
	}
	

	public String minLeadTimeDays() {
		return getMinLeadTimeDays();
	}
	

	public void setMaxLeadTimeDays(String maxLeadTimeDays) {
		this.maxLeadTimeDays = maxLeadTimeDays;
	}
	

	public String getMaxLeadTimeDays() {
		return this.maxLeadTimeDays;
	}
	

	public ShippingServiceStockLocation maxLeadTimeDays(String maxLeadTimeDays) {
		setMaxLeadTimeDays(maxLeadTimeDays);
		return this;
	}
	

	public String maxLeadTimeDays() {
		return getMaxLeadTimeDays();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingServiceStockLocation x = (ShippingServiceStockLocation)o;
	
		return super.equals(o)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.minLeadTimeHours, x.minLeadTimeHours)
			&& Objects.equals(this.maxLeadTimeHours, x.maxLeadTimeHours)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.minLeadTimeDays, x.minLeadTimeDays)
			&& Objects.equals(this.maxLeadTimeDays, x.maxLeadTimeDays)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			shippingServiceId, stockLocationId, minLeadTimeHours, maxLeadTimeHours, previousChanges,
			shippingService, stockLocation, minLeadTimeDays, maxLeadTimeDays 
		);
	
	}
	

	@Override
	public ShippingServiceStockLocation clone() {
	
		ShippingServiceStockLocation no = new ShippingServiceStockLocation();
	
		no.shippingServiceId = this.shippingServiceId;
		no.stockLocationId = this.stockLocationId;
		no.minLeadTimeHours = this.minLeadTimeHours;
		no.maxLeadTimeHours = this.maxLeadTimeHours;
		no.previousChanges = this.previousChanges;
		no.shippingService = this.shippingService;
		no.stockLocation = this.stockLocation;
		no.minLeadTimeDays = this.minLeadTimeDays;
		no.maxLeadTimeDays = this.maxLeadTimeDays;
	
		return no;
	
	}
	
}
