package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Environment
 */
public class Environment extends ApiResource {

	private static final long serialVersionUID = -1481805605731L;


	private String organizationId;
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object organization;
	private List<String> addresses;
	private List<String> catalogs;
	private List<String> channels;
	private List<String> countries;
	private List<String> countryGroups;
	private List<String> countryLanguages;
	private List<String> currencies;
	private List<String> customers;
	private List<String> creditCards;
	private List<String> images;
	private List<String> languages;
	private List<String> lineItems;
	private List<String> lineItemStocks;
	private List<String> markets;
	private List<String> shippingCarriers;
	private List<String> marketPaymentTypes;
	private List<String> marketShippingServices;
	private List<String> marketStockLocations;
	private List<String> merchants;
	private List<String> merchandisingRules;
	private List<String> optionTypes;
	private List<String> optionValues;
	private List<String> orders;
	private List<String> orderValidators;
	private List<String> gateways;
	private List<String> paymentTypes;
	private List<String> paymentMethods;
	private List<String> priceLists;
	private List<String> prices;
	private List<String> products;
	private List<String> productTypes;
	private List<String> productProperties;
	private List<String> propertyTypes;
	private List<String> propertyValues;
	private List<String> resourceImages;
	private List<String> shippingCarrierTypes;
	private List<String> shippingCategories;
	private List<String> shippingLabels;
	private List<String> shippingMethods;
	private List<String> shippingPackages;
	private List<String> shippingServices;
	private List<String> shippingServiceCategories;
	private List<String> shippingServiceStockLocations;
	private List<String> shippingServiceZones;
	private List<String> states;
	private List<String> stockLocations;
	private List<String> stockItems;
	private List<String> taxonomies;
	private List<String> taxons;
	private List<String> consumerRoles;
	private List<String> variantOptions;
	private List<String> variants;
	private List<String> webhooks;
	private List<String> wireTransfers;


	public Environment() {
		super();
	}
	

	public Environment(Long id) {
		super(id);
	}
	

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	

	public String getOrganizationId() {
		return this.organizationId;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setOrganization(Object organization) {
		this.organization = organization;
	}
	

	public Object getOrganization() {
		return this.organization;
	}
	

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	

	public List<String> getAddresses() {
		return this.addresses;
	}
	

	public void setCatalogs(List<String> catalogs) {
		this.catalogs = catalogs;
	}
	

	public List<String> getCatalogs() {
		return this.catalogs;
	}
	

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}
	

	public List<String> getChannels() {
		return this.channels;
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public void setCountryGroups(List<String> countryGroups) {
		this.countryGroups = countryGroups;
	}
	

	public List<String> getCountryGroups() {
		return this.countryGroups;
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}
	

	public List<String> getCurrencies() {
		return this.currencies;
	}
	

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	

	public List<String> getCustomers() {
		return this.customers;
	}
	

	public void setCreditCards(List<String> creditCards) {
		this.creditCards = creditCards;
	}
	

	public List<String> getCreditCards() {
		return this.creditCards;
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

	public List<String> getLanguages() {
		return this.languages;
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public void setShippingCarriers(List<String> shippingCarriers) {
		this.shippingCarriers = shippingCarriers;
	}
	

	public List<String> getShippingCarriers() {
		return this.shippingCarriers;
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public void setMarketStockLocations(List<String> marketStockLocations) {
		this.marketStockLocations = marketStockLocations;
	}
	

	public List<String> getMarketStockLocations() {
		return this.marketStockLocations;
	}
	

	public void setMerchants(List<String> merchants) {
		this.merchants = merchants;
	}
	

	public List<String> getMerchants() {
		return this.merchants;
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}
	

	public List<String> getOptionTypes() {
		return this.optionTypes;
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public void setOrderValidators(List<String> orderValidators) {
		this.orderValidators = orderValidators;
	}
	

	public List<String> getOrderValidators() {
		return this.orderValidators;
	}
	

	public void setGateways(List<String> gateways) {
		this.gateways = gateways;
	}
	

	public List<String> getGateways() {
		return this.gateways;
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public void setPriceLists(List<String> priceLists) {
		this.priceLists = priceLists;
	}
	

	public List<String> getPriceLists() {
		return this.priceLists;
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public void setProductTypes(List<String> productTypes) {
		this.productTypes = productTypes;
	}
	

	public List<String> getProductTypes() {
		return this.productTypes;
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public void setPropertyTypes(List<String> propertyTypes) {
		this.propertyTypes = propertyTypes;
	}
	

	public List<String> getPropertyTypes() {
		return this.propertyTypes;
	}
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public void setShippingCarrierTypes(List<String> shippingCarrierTypes) {
		this.shippingCarrierTypes = shippingCarrierTypes;
	}
	

	public List<String> getShippingCarrierTypes() {
		return this.shippingCarrierTypes;
	}
	

	public void setShippingCategories(List<String> shippingCategories) {
		this.shippingCategories = shippingCategories;
	}
	

	public List<String> getShippingCategories() {
		return this.shippingCategories;
	}
	

	public void setShippingLabels(List<String> shippingLabels) {
		this.shippingLabels = shippingLabels;
	}
	

	public List<String> getShippingLabels() {
		return this.shippingLabels;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public void setShippingPackages(List<String> shippingPackages) {
		this.shippingPackages = shippingPackages;
	}
	

	public List<String> getShippingPackages() {
		return this.shippingPackages;
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public void setStates(List<String> states) {
		this.states = states;
	}
	

	public List<String> getStates() {
		return this.states;
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public void setTaxonomies(List<String> taxonomies) {
		this.taxonomies = taxonomies;
	}
	

	public List<String> getTaxonomies() {
		return this.taxonomies;
	}
	

	public void setTaxons(List<String> taxons) {
		this.taxons = taxons;
	}
	

	public List<String> getTaxons() {
		return this.taxons;
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public void setWebhooks(List<String> webhooks) {
		this.webhooks = webhooks;
	}
	

	public List<String> getWebhooks() {
		return this.webhooks;
	}
	

	public void setWireTransfers(List<String> wireTransfers) {
		this.wireTransfers = wireTransfers;
	}
	

	public List<String> getWireTransfers() {
		return this.wireTransfers;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Environment x = (Environment) o;
	
		return super.equals(o) &&
			Objects.equals(this.organizationId, x.organizationId)  &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.organization, x.organization)  &&
			Objects.equals(this.addresses, x.addresses)  &&
			Objects.equals(this.catalogs, x.catalogs)  &&
			Objects.equals(this.channels, x.channels)  &&
			Objects.equals(this.countries, x.countries)  &&
			Objects.equals(this.countryGroups, x.countryGroups)  &&
			Objects.equals(this.countryLanguages, x.countryLanguages)  &&
			Objects.equals(this.currencies, x.currencies)  &&
			Objects.equals(this.customers, x.customers)  &&
			Objects.equals(this.creditCards, x.creditCards)  &&
			Objects.equals(this.images, x.images)  &&
			Objects.equals(this.languages, x.languages)  &&
			Objects.equals(this.lineItems, x.lineItems)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.markets, x.markets)  &&
			Objects.equals(this.shippingCarriers, x.shippingCarriers)  &&
			Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)  &&
			Objects.equals(this.marketShippingServices, x.marketShippingServices)  &&
			Objects.equals(this.marketStockLocations, x.marketStockLocations)  &&
			Objects.equals(this.merchants, x.merchants)  &&
			Objects.equals(this.merchandisingRules, x.merchandisingRules)  &&
			Objects.equals(this.optionTypes, x.optionTypes)  &&
			Objects.equals(this.optionValues, x.optionValues)  &&
			Objects.equals(this.orders, x.orders)  &&
			Objects.equals(this.orderValidators, x.orderValidators)  &&
			Objects.equals(this.gateways, x.gateways)  &&
			Objects.equals(this.paymentTypes, x.paymentTypes)  &&
			Objects.equals(this.paymentMethods, x.paymentMethods)  &&
			Objects.equals(this.priceLists, x.priceLists)  &&
			Objects.equals(this.prices, x.prices)  &&
			Objects.equals(this.products, x.products)  &&
			Objects.equals(this.productTypes, x.productTypes)  &&
			Objects.equals(this.productProperties, x.productProperties)  &&
			Objects.equals(this.propertyTypes, x.propertyTypes)  &&
			Objects.equals(this.propertyValues, x.propertyValues)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.shippingCarrierTypes, x.shippingCarrierTypes)  &&
			Objects.equals(this.shippingCategories, x.shippingCategories)  &&
			Objects.equals(this.shippingLabels, x.shippingLabels)  &&
			Objects.equals(this.shippingMethods, x.shippingMethods)  &&
			Objects.equals(this.shippingPackages, x.shippingPackages)  &&
			Objects.equals(this.shippingServices, x.shippingServices)  &&
			Objects.equals(this.shippingServiceCategories, x.shippingServiceCategories)  &&
			Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)  &&
			Objects.equals(this.shippingServiceZones, x.shippingServiceZones)  &&
			Objects.equals(this.states, x.states)  &&
			Objects.equals(this.stockLocations, x.stockLocations)  &&
			Objects.equals(this.stockItems, x.stockItems)  &&
			Objects.equals(this.taxonomies, x.taxonomies)  &&
			Objects.equals(this.taxons, x.taxons)  &&
			Objects.equals(this.consumerRoles, x.consumerRoles)  &&
			Objects.equals(this.variantOptions, x.variantOptions)  &&
			Objects.equals(this.variants, x.variants)  &&
			Objects.equals(this.webhooks, x.webhooks)  &&
			Objects.equals(this.wireTransfers, x.wireTransfers) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, organizationId, name, previousChanges, organization,
			addresses, catalogs, channels, countries, countryGroups,
			countryLanguages, currencies, customers, creditCards, images,
			languages, lineItems, lineItemStocks, markets, shippingCarriers,
			marketPaymentTypes, marketShippingServices, marketStockLocations, merchants, merchandisingRules,
			optionTypes, optionValues, orders, orderValidators, gateways,
			paymentTypes, paymentMethods, priceLists, prices, products,
			productTypes, productProperties, propertyTypes, propertyValues, resourceImages,
			shippingCarrierTypes, shippingCategories, shippingLabels, shippingMethods, shippingPackages,
			shippingServices, shippingServiceCategories, shippingServiceStockLocations, shippingServiceZones, states,
			stockLocations, stockItems, taxonomies, taxons, consumerRoles,
			variantOptions, variants, webhooks, wireTransfers 
		);
	
	}
	
}
