package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingService
 */
public class ShippingService extends ApiResource {

	private static final long serialVersionUID = -1482880735350L;


	private String name;
	@JsonExclude
	private String slug;
	@JsonExclude
	private String description;
	private Integer shippingCarrierId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCarrier;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> shippingServiceCategories;
	@JsonExclude
	private List<String> shippingServiceZones;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> shippingCategories;
	@JsonExclude
	private List<String> stockLocations;
	@JsonExclude
	private List<String> shippingZones;


	public ShippingService() {
		super();
	}
	

	public ShippingService(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public void setShippingCarrierId(Integer shippingCarrierId) {
		this.shippingCarrierId = shippingCarrierId;
	}
	

	public Integer getShippingCarrierId() {
		return this.shippingCarrierId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingCarrier(Object shippingCarrier) {
		this.shippingCarrier = shippingCarrier;
	}
	

	public Object getShippingCarrier() {
		return this.shippingCarrier;
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public void setShippingCategories(List<String> shippingCategories) {
		this.shippingCategories = shippingCategories;
	}
	

	public List<String> getShippingCategories() {
		return this.shippingCategories;
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingService x = (ShippingService)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.shippingCarrierId, x.shippingCarrierId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCarrier, x.shippingCarrier)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.shippingServiceCategories, x.shippingServiceCategories)
			&& Objects.equals(this.shippingServiceZones, x.shippingServiceZones)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.shippingCategories, x.shippingCategories)
			&& Objects.equals(this.stockLocations, x.stockLocations)
			&& Objects.equals(this.shippingZones, x.shippingZones)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, shippingCarrierId, previousChanges,
			shippingCarrier, translations, marketShippingServices, shippingServiceCategories, shippingServiceZones,
			shippingServiceStockLocations, markets, shippingCategories, stockLocations, shippingZones
			
		);
	
	}
	

	@Override
	public ShippingService clone() {
	
		ShippingService no = new ShippingService();
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.shippingCarrierId = this.shippingCarrierId;
		no.previousChanges = this.previousChanges;
		no.shippingCarrier = this.shippingCarrier;
		no.translations = this.translations;
		no.marketShippingServices = this.marketShippingServices;
		no.shippingServiceCategories = this.shippingServiceCategories;
		no.shippingServiceZones = this.shippingServiceZones;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.markets = this.markets;
		no.shippingCategories = this.shippingCategories;
		no.stockLocations = this.stockLocations;
		no.shippingZones = this.shippingZones;
	
		return no;
	
	}
	
}
