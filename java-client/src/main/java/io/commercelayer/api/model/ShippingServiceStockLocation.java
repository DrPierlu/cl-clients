package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingServiceStockLocation
 */
public class ShippingServiceStockLocation extends ApiResource {

	private static final long serialVersionUID = -1482845758250L;


	private String shippingServiceId;
	private String stockLocationId;
	private String minLeadTimeHours;
	private String maxLeadTimeHours;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private Object stockLocation;
	private String minLeadTimeDays;
	private String maxLeadTimeDays;


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
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setMinLeadTimeHours(String minLeadTimeHours) {
		this.minLeadTimeHours = minLeadTimeHours;
	}
	

	public String getMinLeadTimeHours() {
		return this.minLeadTimeHours;
	}
	

	public void setMaxLeadTimeHours(String maxLeadTimeHours) {
		this.maxLeadTimeHours = maxLeadTimeHours;
	}
	

	public String getMaxLeadTimeHours() {
		return this.maxLeadTimeHours;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public void setMinLeadTimeDays(String minLeadTimeDays) {
		this.minLeadTimeDays = minLeadTimeDays;
	}
	

	public String getMinLeadTimeDays() {
		return this.minLeadTimeDays;
	}
	

	public void setMaxLeadTimeDays(String maxLeadTimeDays) {
		this.maxLeadTimeDays = maxLeadTimeDays;
	}
	

	public String getMaxLeadTimeDays() {
		return this.maxLeadTimeDays;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ShippingServiceStockLocation x = (ShippingServiceStockLocation) o;
	
		return super.equals(o) &&
			Objects.equals(this.shippingServiceId, x.shippingServiceId)  &&
			Objects.equals(this.stockLocationId, x.stockLocationId)  &&
			Objects.equals(this.minLeadTimeHours, x.minLeadTimeHours)  &&
			Objects.equals(this.maxLeadTimeHours, x.maxLeadTimeHours)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingService, x.shippingService)  &&
			Objects.equals(this.stockLocation, x.stockLocation)  &&
			Objects.equals(this.minLeadTimeDays, x.minLeadTimeDays)  &&
			Objects.equals(this.maxLeadTimeDays, x.maxLeadTimeDays) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, shippingServiceId, stockLocationId, minLeadTimeHours, maxLeadTimeHours,
			previousChanges, shippingService, stockLocation, minLeadTimeDays, maxLeadTimeDays
			
		);
	
	}
	
}