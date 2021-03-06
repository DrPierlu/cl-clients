package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingServiceStockLocation
 */
public class ShippingServiceStockLocation extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer maxLeadTimeHours;
	private Integer minLeadTimeHours;
	private Integer shippingServiceId;
	private Integer stockLocationId;
	@JsonExclude
	private String maxLeadTimeDays;
	@JsonExclude
	private String minLeadTimeDays;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private List<String> versions;


	public ShippingServiceStockLocation() {
		super();
	}
	

	public ShippingServiceStockLocation(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingServiceStockLocation name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceStockLocation shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public ShippingServiceStockLocation stockLocationId(Integer stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public Integer stockLocationId() {
		return getStockLocationId();
	}
	

	public void setMinLeadTimeHours(Integer minLeadTimeHours) {
		this.minLeadTimeHours = minLeadTimeHours;
	}
	

	public Integer getMinLeadTimeHours() {
		return this.minLeadTimeHours;
	}
	

	public ShippingServiceStockLocation minLeadTimeHours(Integer minLeadTimeHours) {
		setMinLeadTimeHours(minLeadTimeHours);
		return this;
	}
	

	public Integer minLeadTimeHours() {
		return getMinLeadTimeHours();
	}
	

	public void setMaxLeadTimeHours(Integer maxLeadTimeHours) {
		this.maxLeadTimeHours = maxLeadTimeHours;
	}
	

	public Integer getMaxLeadTimeHours() {
		return this.maxLeadTimeHours;
	}
	

	public ShippingServiceStockLocation maxLeadTimeHours(Integer maxLeadTimeHours) {
		setMaxLeadTimeHours(maxLeadTimeHours);
		return this;
	}
	

	public Integer maxLeadTimeHours() {
		return getMaxLeadTimeHours();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingServiceStockLocation versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
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
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.minLeadTimeHours, x.minLeadTimeHours)
			&& Objects.equals(this.maxLeadTimeHours, x.maxLeadTimeHours)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.minLeadTimeDays, x.minLeadTimeDays)
			&& Objects.equals(this.maxLeadTimeDays, x.maxLeadTimeDays)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shippingServiceId, stockLocationId, minLeadTimeHours, maxLeadTimeHours,
			shippingService, stockLocation, versions, minLeadTimeDays, maxLeadTimeDays
			
		);
	
	}
	

	@Override
	public ShippingServiceStockLocation clone() {
	
		ShippingServiceStockLocation no = new ShippingServiceStockLocation();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shippingServiceId = this.shippingServiceId;
		no.stockLocationId = this.stockLocationId;
		no.minLeadTimeHours = this.minLeadTimeHours;
		no.maxLeadTimeHours = this.maxLeadTimeHours;
		no.shippingService = this.shippingService;
		no.stockLocation = this.stockLocation;
		no.versions = this.versions;
		no.minLeadTimeDays = this.minLeadTimeDays;
		no.maxLeadTimeDays = this.maxLeadTimeDays;
	
		return no;
	
	}
	
}
