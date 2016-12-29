package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * ShippingService
 */
public class ShippingService extends ApiResource {

	private static final long serialVersionUID = -1483037217929L;


	private String name;
	private Integer shippingCarrierId;
	@JsonExclude
	private String description;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCarrier;
	@JsonExclude
	private List<String> shippingCategories;
	@JsonExclude
	private List<String> shippingServiceCategories;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> shippingServiceZones;
	@JsonExclude
	private List<String> shippingZones;
	@JsonExclude
	private String slug;
	@JsonExclude
	private List<String> stockLocations;
	@JsonExclude
	private List<String> translations;


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
	

	public ShippingService name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public ShippingService slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public ShippingService description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setShippingCarrierId(Integer shippingCarrierId) {
		this.shippingCarrierId = shippingCarrierId;
	}
	

	public Integer getShippingCarrierId() {
		return this.shippingCarrierId;
	}
	

	public ShippingService shippingCarrierId(Integer shippingCarrierId) {
		setShippingCarrierId(shippingCarrierId);
		return this;
	}
	

	public Integer shippingCarrierId() {
		return getShippingCarrierId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingService previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingCarrier(Object shippingCarrier) {
		this.shippingCarrier = shippingCarrier;
	}
	

	public Object getShippingCarrier() {
		return this.shippingCarrier;
	}
	

	public ShippingService shippingCarrier(Object shippingCarrier) {
		setShippingCarrier(shippingCarrier);
		return this;
	}
	

	public Object shippingCarrier() {
		return getShippingCarrier();
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public ShippingService translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public ShippingService marketShippingServices(List<String> marketShippingServices) {
		setMarketShippingServices(marketShippingServices);
		return this;
	}
	

	public List<String> marketShippingServices() {
		return getMarketShippingServices();
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public ShippingService shippingServiceCategories(List<String> shippingServiceCategories) {
		setShippingServiceCategories(shippingServiceCategories);
		return this;
	}
	

	public List<String> shippingServiceCategories() {
		return getShippingServiceCategories();
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public ShippingService shippingServiceZones(List<String> shippingServiceZones) {
		setShippingServiceZones(shippingServiceZones);
		return this;
	}
	

	public List<String> shippingServiceZones() {
		return getShippingServiceZones();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public ShippingService shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
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
	

	public ShippingService markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setShippingCategories(List<String> shippingCategories) {
		this.shippingCategories = shippingCategories;
	}
	

	public List<String> getShippingCategories() {
		return this.shippingCategories;
	}
	

	public ShippingService shippingCategories(List<String> shippingCategories) {
		setShippingCategories(shippingCategories);
		return this;
	}
	

	public List<String> shippingCategories() {
		return getShippingCategories();
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public ShippingService stockLocations(List<String> stockLocations) {
		setStockLocations(stockLocations);
		return this;
	}
	

	public List<String> stockLocations() {
		return getStockLocations();
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	public ShippingService shippingZones(List<String> shippingZones) {
		setShippingZones(shippingZones);
		return this;
	}
	

	public List<String> shippingZones() {
		return getShippingZones();
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
