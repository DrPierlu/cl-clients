package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingService
 */
public class ShippingService extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String kind;
	private String name;
	private Integer shippingCarrierAccountId;
	@JsonExclude
	private String description;
	@JsonExclude
	private String formattedFreeOverAmount;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private Object shippingCarrierAccount;
	@JsonExclude
	private List<String> shippingCategories;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingPrices;
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
	@JsonExclude
	private List<String> versions;


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
	

	public void setShippingCarrierAccountId(Integer shippingCarrierAccountId) {
		this.shippingCarrierAccountId = shippingCarrierAccountId;
	}
	

	public Integer getShippingCarrierAccountId() {
		return this.shippingCarrierAccountId;
	}
	

	public ShippingService shippingCarrierAccountId(Integer shippingCarrierAccountId) {
		setShippingCarrierAccountId(shippingCarrierAccountId);
		return this;
	}
	

	public Integer shippingCarrierAccountId() {
		return getShippingCarrierAccountId();
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public ShippingService kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setShippingCarrierAccount(Object shippingCarrierAccount) {
		this.shippingCarrierAccount = shippingCarrierAccount;
	}
	

	public Object getShippingCarrierAccount() {
		return this.shippingCarrierAccount;
	}
	

	public ShippingService shippingCarrierAccount(Object shippingCarrierAccount) {
		setShippingCarrierAccount(shippingCarrierAccount);
		return this;
	}
	

	public Object shippingCarrierAccount() {
		return getShippingCarrierAccount();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingService versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
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
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public ShippingService shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	public void setShippingPrices(List<String> shippingPrices) {
		this.shippingPrices = shippingPrices;
	}
	

	public List<String> getShippingPrices() {
		return this.shippingPrices;
	}
	

	public ShippingService shippingPrices(List<String> shippingPrices) {
		setShippingPrices(shippingPrices);
		return this;
	}
	

	public List<String> shippingPrices() {
		return getShippingPrices();
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
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public ShippingService formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
	}
	

	public void setFormattedFreeOverAmount(String formattedFreeOverAmount) {
		this.formattedFreeOverAmount = formattedFreeOverAmount;
	}
	

	public String getFormattedFreeOverAmount() {
		return this.formattedFreeOverAmount;
	}
	

	public ShippingService formattedFreeOverAmount(String formattedFreeOverAmount) {
		setFormattedFreeOverAmount(formattedFreeOverAmount);
		return this;
	}
	

	public String formattedFreeOverAmount() {
		return getFormattedFreeOverAmount();
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
			&& Objects.equals(this.shippingCarrierAccountId, x.shippingCarrierAccountId)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.shippingCarrierAccount, x.shippingCarrierAccount)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.shippingServiceCategories, x.shippingServiceCategories)
			&& Objects.equals(this.shippingServiceZones, x.shippingServiceZones)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shippingPrices, x.shippingPrices)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.shippingCategories, x.shippingCategories)
			&& Objects.equals(this.stockLocations, x.stockLocations)
			&& Objects.equals(this.shippingZones, x.shippingZones)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
			&& Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, shippingCarrierAccountId, kind,
			shippingCarrierAccount, versions, translations, marketShippingServices, shippingServiceCategories,
			shippingServiceZones, shippingServiceStockLocations, shippingMethods, shippingPrices, markets,
			shippingCategories, stockLocations, shippingZones, formattedPrice, formattedFreeOverAmount
			
		);
	
	}
	

	@Override
	public ShippingService clone() {
	
		ShippingService no = new ShippingService();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.shippingCarrierAccountId = this.shippingCarrierAccountId;
		no.kind = this.kind;
		no.shippingCarrierAccount = this.shippingCarrierAccount;
		no.versions = this.versions;
		no.translations = this.translations;
		no.marketShippingServices = this.marketShippingServices;
		no.shippingServiceCategories = this.shippingServiceCategories;
		no.shippingServiceZones = this.shippingServiceZones;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.shippingMethods = this.shippingMethods;
		no.shippingPrices = this.shippingPrices;
		no.markets = this.markets;
		no.shippingCategories = this.shippingCategories;
		no.stockLocations = this.stockLocations;
		no.shippingZones = this.shippingZones;
		no.formattedPrice = this.formattedPrice;
		no.formattedFreeOverAmount = this.formattedFreeOverAmount;
	
		return no;
	
	}
	
}
