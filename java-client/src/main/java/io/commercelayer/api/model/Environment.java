package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Environment
 */
public class Environment extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	private Integer organizationId;
	@JsonExclude
	private List<String> addresses;
	@JsonExclude
	private List<String> catalogs;
	@JsonExclude
	private List<String> channels;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private List<String> countryGroups;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private List<String> creditCards;
	@JsonExclude
	private List<String> currencies;
	@JsonExclude
	private List<String> customers;
	@JsonExclude
	private List<String> gateways;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> languages;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> marketStockLocations;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private List<String> merchants;
	@JsonExclude
	private List<String> optionTypes;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private List<String> orderValidators;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private Object organization;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private List<String> paypalAccounts;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> priceLists;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
	private List<String> productTypes;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> propertyTypes;
	@JsonExclude
	private List<String> propertyValues;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private List<String> shippingCarrierTypes;
	@JsonExclude
	private List<String> shippingCarriers;
	@JsonExclude
	private List<String> shippingCategories;
	@JsonExclude
	private List<String> shippingLabels;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingPackages;
	@JsonExclude
	private List<String> shippingServiceCategories;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> shippingServiceZones;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private List<String> shippingZones;
	@JsonExclude
	private List<String> states;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private List<String> stockLocations;
	@JsonExclude
	private List<String> taxonomies;
	@JsonExclude
	private List<String> taxons;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> variantOptions;
	@JsonExclude
	private List<String> variants;
	@JsonExclude
	private List<String> webhooks;
	@JsonExclude
	private List<String> wireTransfers;


	public Environment() {
		super();
	}
	

	public Environment(Long id) {
		super(id);
	}
	

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	

	public Integer getOrganizationId() {
		return this.organizationId;
	}
	

	public Environment organizationId(Integer organizationId) {
		setOrganizationId(organizationId);
		return this;
	}
	

	public Integer organizationId() {
		return getOrganizationId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Environment name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Environment previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setOrganization(Object organization) {
		this.organization = organization;
	}
	

	public Object getOrganization() {
		return this.organization;
	}
	

	public Environment organization(Object organization) {
		setOrganization(organization);
		return this;
	}
	

	public Object organization() {
		return getOrganization();
	}
	

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	

	public List<String> getAddresses() {
		return this.addresses;
	}
	

	public Environment addresses(List<String> addresses) {
		setAddresses(addresses);
		return this;
	}
	

	public List<String> addresses() {
		return getAddresses();
	}
	

	public void setCatalogs(List<String> catalogs) {
		this.catalogs = catalogs;
	}
	

	public List<String> getCatalogs() {
		return this.catalogs;
	}
	

	public Environment catalogs(List<String> catalogs) {
		setCatalogs(catalogs);
		return this;
	}
	

	public List<String> catalogs() {
		return getCatalogs();
	}
	

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}
	

	public List<String> getChannels() {
		return this.channels;
	}
	

	public Environment channels(List<String> channels) {
		setChannels(channels);
		return this;
	}
	

	public List<String> channels() {
		return getChannels();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public Environment countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
	}
	

	public void setCountryGroups(List<String> countryGroups) {
		this.countryGroups = countryGroups;
	}
	

	public List<String> getCountryGroups() {
		return this.countryGroups;
	}
	

	public Environment countryGroups(List<String> countryGroups) {
		setCountryGroups(countryGroups);
		return this;
	}
	

	public List<String> countryGroups() {
		return getCountryGroups();
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public Environment countryLanguages(List<String> countryLanguages) {
		setCountryLanguages(countryLanguages);
		return this;
	}
	

	public List<String> countryLanguages() {
		return getCountryLanguages();
	}
	

	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}
	

	public List<String> getCurrencies() {
		return this.currencies;
	}
	

	public Environment currencies(List<String> currencies) {
		setCurrencies(currencies);
		return this;
	}
	

	public List<String> currencies() {
		return getCurrencies();
	}
	

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	

	public List<String> getCustomers() {
		return this.customers;
	}
	

	public Environment customers(List<String> customers) {
		setCustomers(customers);
		return this;
	}
	

	public List<String> customers() {
		return getCustomers();
	}
	

	public void setCreditCards(List<String> creditCards) {
		this.creditCards = creditCards;
	}
	

	public List<String> getCreditCards() {
		return this.creditCards;
	}
	

	public Environment creditCards(List<String> creditCards) {
		setCreditCards(creditCards);
		return this;
	}
	

	public List<String> creditCards() {
		return getCreditCards();
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public Environment images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

	public List<String> getLanguages() {
		return this.languages;
	}
	

	public Environment languages(List<String> languages) {
		setLanguages(languages);
		return this;
	}
	

	public List<String> languages() {
		return getLanguages();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Environment lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Environment lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public Environment markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setShippingCarriers(List<String> shippingCarriers) {
		this.shippingCarriers = shippingCarriers;
	}
	

	public List<String> getShippingCarriers() {
		return this.shippingCarriers;
	}
	

	public Environment shippingCarriers(List<String> shippingCarriers) {
		setShippingCarriers(shippingCarriers);
		return this;
	}
	

	public List<String> shippingCarriers() {
		return getShippingCarriers();
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public Environment marketPaymentTypes(List<String> marketPaymentTypes) {
		setMarketPaymentTypes(marketPaymentTypes);
		return this;
	}
	

	public List<String> marketPaymentTypes() {
		return getMarketPaymentTypes();
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public Environment marketShippingServices(List<String> marketShippingServices) {
		setMarketShippingServices(marketShippingServices);
		return this;
	}
	

	public List<String> marketShippingServices() {
		return getMarketShippingServices();
	}
	

	public void setMarketStockLocations(List<String> marketStockLocations) {
		this.marketStockLocations = marketStockLocations;
	}
	

	public List<String> getMarketStockLocations() {
		return this.marketStockLocations;
	}
	

	public Environment marketStockLocations(List<String> marketStockLocations) {
		setMarketStockLocations(marketStockLocations);
		return this;
	}
	

	public List<String> marketStockLocations() {
		return getMarketStockLocations();
	}
	

	public void setMerchants(List<String> merchants) {
		this.merchants = merchants;
	}
	

	public List<String> getMerchants() {
		return this.merchants;
	}
	

	public Environment merchants(List<String> merchants) {
		setMerchants(merchants);
		return this;
	}
	

	public List<String> merchants() {
		return getMerchants();
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public Environment merchandisingRules(List<String> merchandisingRules) {
		setMerchandisingRules(merchandisingRules);
		return this;
	}
	

	public List<String> merchandisingRules() {
		return getMerchandisingRules();
	}
	

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}
	

	public List<String> getOptionTypes() {
		return this.optionTypes;
	}
	

	public Environment optionTypes(List<String> optionTypes) {
		setOptionTypes(optionTypes);
		return this;
	}
	

	public List<String> optionTypes() {
		return getOptionTypes();
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public Environment optionValues(List<String> optionValues) {
		setOptionValues(optionValues);
		return this;
	}
	

	public List<String> optionValues() {
		return getOptionValues();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Environment orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setOrderValidators(List<String> orderValidators) {
		this.orderValidators = orderValidators;
	}
	

	public List<String> getOrderValidators() {
		return this.orderValidators;
	}
	

	public Environment orderValidators(List<String> orderValidators) {
		setOrderValidators(orderValidators);
		return this;
	}
	

	public List<String> orderValidators() {
		return getOrderValidators();
	}
	

	public void setGateways(List<String> gateways) {
		this.gateways = gateways;
	}
	

	public List<String> getGateways() {
		return this.gateways;
	}
	

	public Environment gateways(List<String> gateways) {
		setGateways(gateways);
		return this;
	}
	

	public List<String> gateways() {
		return getGateways();
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public Environment paymentTypes(List<String> paymentTypes) {
		setPaymentTypes(paymentTypes);
		return this;
	}
	

	public List<String> paymentTypes() {
		return getPaymentTypes();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public Environment paymentMethods(List<String> paymentMethods) {
		setPaymentMethods(paymentMethods);
		return this;
	}
	

	public List<String> paymentMethods() {
		return getPaymentMethods();
	}
	

	public void setPaypalAccounts(List<String> paypalAccounts) {
		this.paypalAccounts = paypalAccounts;
	}
	

	public List<String> getPaypalAccounts() {
		return this.paypalAccounts;
	}
	

	public Environment paypalAccounts(List<String> paypalAccounts) {
		setPaypalAccounts(paypalAccounts);
		return this;
	}
	

	public List<String> paypalAccounts() {
		return getPaypalAccounts();
	}
	

	public void setPriceLists(List<String> priceLists) {
		this.priceLists = priceLists;
	}
	

	public List<String> getPriceLists() {
		return this.priceLists;
	}
	

	public Environment priceLists(List<String> priceLists) {
		setPriceLists(priceLists);
		return this;
	}
	

	public List<String> priceLists() {
		return getPriceLists();
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public Environment prices(List<String> prices) {
		setPrices(prices);
		return this;
	}
	

	public List<String> prices() {
		return getPrices();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public Environment products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setProductTypes(List<String> productTypes) {
		this.productTypes = productTypes;
	}
	

	public List<String> getProductTypes() {
		return this.productTypes;
	}
	

	public Environment productTypes(List<String> productTypes) {
		setProductTypes(productTypes);
		return this;
	}
	

	public List<String> productTypes() {
		return getProductTypes();
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public Environment productProperties(List<String> productProperties) {
		setProductProperties(productProperties);
		return this;
	}
	

	public List<String> productProperties() {
		return getProductProperties();
	}
	

	public void setPropertyTypes(List<String> propertyTypes) {
		this.propertyTypes = propertyTypes;
	}
	

	public List<String> getPropertyTypes() {
		return this.propertyTypes;
	}
	

	public Environment propertyTypes(List<String> propertyTypes) {
		setPropertyTypes(propertyTypes);
		return this;
	}
	

	public List<String> propertyTypes() {
		return getPropertyTypes();
	}
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
	}
	

	public Environment propertyValues(List<String> propertyValues) {
		setPropertyValues(propertyValues);
		return this;
	}
	

	public List<String> propertyValues() {
		return getPropertyValues();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Environment resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
	}
	

	public Environment shipments(List<String> shipments) {
		setShipments(shipments);
		return this;
	}
	

	public List<String> shipments() {
		return getShipments();
	}
	

	public void setShippingCarrierTypes(List<String> shippingCarrierTypes) {
		this.shippingCarrierTypes = shippingCarrierTypes;
	}
	

	public List<String> getShippingCarrierTypes() {
		return this.shippingCarrierTypes;
	}
	

	public Environment shippingCarrierTypes(List<String> shippingCarrierTypes) {
		setShippingCarrierTypes(shippingCarrierTypes);
		return this;
	}
	

	public List<String> shippingCarrierTypes() {
		return getShippingCarrierTypes();
	}
	

	public void setShippingCategories(List<String> shippingCategories) {
		this.shippingCategories = shippingCategories;
	}
	

	public List<String> getShippingCategories() {
		return this.shippingCategories;
	}
	

	public Environment shippingCategories(List<String> shippingCategories) {
		setShippingCategories(shippingCategories);
		return this;
	}
	

	public List<String> shippingCategories() {
		return getShippingCategories();
	}
	

	public void setShippingLabels(List<String> shippingLabels) {
		this.shippingLabels = shippingLabels;
	}
	

	public List<String> getShippingLabels() {
		return this.shippingLabels;
	}
	

	public Environment shippingLabels(List<String> shippingLabels) {
		setShippingLabels(shippingLabels);
		return this;
	}
	

	public List<String> shippingLabels() {
		return getShippingLabels();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public Environment shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	public void setShippingPackages(List<String> shippingPackages) {
		this.shippingPackages = shippingPackages;
	}
	

	public List<String> getShippingPackages() {
		return this.shippingPackages;
	}
	

	public Environment shippingPackages(List<String> shippingPackages) {
		setShippingPackages(shippingPackages);
		return this;
	}
	

	public List<String> shippingPackages() {
		return getShippingPackages();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public Environment shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public Environment shippingServiceCategories(List<String> shippingServiceCategories) {
		setShippingServiceCategories(shippingServiceCategories);
		return this;
	}
	

	public List<String> shippingServiceCategories() {
		return getShippingServiceCategories();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public Environment shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public Environment shippingServiceZones(List<String> shippingServiceZones) {
		setShippingServiceZones(shippingServiceZones);
		return this;
	}
	

	public List<String> shippingServiceZones() {
		return getShippingServiceZones();
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	public Environment shippingZones(List<String> shippingZones) {
		setShippingZones(shippingZones);
		return this;
	}
	

	public List<String> shippingZones() {
		return getShippingZones();
	}
	

	public void setStates(List<String> states) {
		this.states = states;
	}
	

	public List<String> getStates() {
		return this.states;
	}
	

	public Environment states(List<String> states) {
		setStates(states);
		return this;
	}
	

	public List<String> states() {
		return getStates();
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public Environment stockLocations(List<String> stockLocations) {
		setStockLocations(stockLocations);
		return this;
	}
	

	public List<String> stockLocations() {
		return getStockLocations();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public Environment stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setTaxonomies(List<String> taxonomies) {
		this.taxonomies = taxonomies;
	}
	

	public List<String> getTaxonomies() {
		return this.taxonomies;
	}
	

	public Environment taxonomies(List<String> taxonomies) {
		setTaxonomies(taxonomies);
		return this;
	}
	

	public List<String> taxonomies() {
		return getTaxonomies();
	}
	

	public void setTaxons(List<String> taxons) {
		this.taxons = taxons;
	}
	

	public List<String> getTaxons() {
		return this.taxons;
	}
	

	public Environment taxons(List<String> taxons) {
		setTaxons(taxons);
		return this;
	}
	

	public List<String> taxons() {
		return getTaxons();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public Environment transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public Environment consumerRoles(List<String> consumerRoles) {
		setConsumerRoles(consumerRoles);
		return this;
	}
	

	public List<String> consumerRoles() {
		return getConsumerRoles();
	}
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
	}
	

	public Environment variantOptions(List<String> variantOptions) {
		setVariantOptions(variantOptions);
		return this;
	}
	

	public List<String> variantOptions() {
		return getVariantOptions();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public Environment variants(List<String> variants) {
		setVariants(variants);
		return this;
	}
	

	public List<String> variants() {
		return getVariants();
	}
	

	public void setWebhooks(List<String> webhooks) {
		this.webhooks = webhooks;
	}
	

	public List<String> getWebhooks() {
		return this.webhooks;
	}
	

	public Environment webhooks(List<String> webhooks) {
		setWebhooks(webhooks);
		return this;
	}
	

	public List<String> webhooks() {
		return getWebhooks();
	}
	

	public void setWireTransfers(List<String> wireTransfers) {
		this.wireTransfers = wireTransfers;
	}
	

	public List<String> getWireTransfers() {
		return this.wireTransfers;
	}
	

	public Environment wireTransfers(List<String> wireTransfers) {
		setWireTransfers(wireTransfers);
		return this;
	}
	

	public List<String> wireTransfers() {
		return getWireTransfers();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Environment x = (Environment)o;
	
		return super.equals(o)
			&& Objects.equals(this.organizationId, x.organizationId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.organization, x.organization)
			&& Objects.equals(this.addresses, x.addresses)
			&& Objects.equals(this.catalogs, x.catalogs)
			&& Objects.equals(this.channels, x.channels)
			&& Objects.equals(this.countries, x.countries)
			&& Objects.equals(this.countryGroups, x.countryGroups)
			&& Objects.equals(this.countryLanguages, x.countryLanguages)
			&& Objects.equals(this.currencies, x.currencies)
			&& Objects.equals(this.customers, x.customers)
			&& Objects.equals(this.creditCards, x.creditCards)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.languages, x.languages)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.shippingCarriers, x.shippingCarriers)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.marketStockLocations, x.marketStockLocations)
			&& Objects.equals(this.merchants, x.merchants)
			&& Objects.equals(this.merchandisingRules, x.merchandisingRules)
			&& Objects.equals(this.optionTypes, x.optionTypes)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.orderValidators, x.orderValidators)
			&& Objects.equals(this.gateways, x.gateways)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.paypalAccounts, x.paypalAccounts)
			&& Objects.equals(this.priceLists, x.priceLists)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.productTypes, x.productTypes)
			&& Objects.equals(this.productProperties, x.productProperties)
			&& Objects.equals(this.propertyTypes, x.propertyTypes)
			&& Objects.equals(this.propertyValues, x.propertyValues)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.shippingCarrierTypes, x.shippingCarrierTypes)
			&& Objects.equals(this.shippingCategories, x.shippingCategories)
			&& Objects.equals(this.shippingLabels, x.shippingLabels)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shippingPackages, x.shippingPackages)
			&& Objects.equals(this.shippingServices, x.shippingServices)
			&& Objects.equals(this.shippingServiceCategories, x.shippingServiceCategories)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.shippingServiceZones, x.shippingServiceZones)
			&& Objects.equals(this.shippingZones, x.shippingZones)
			&& Objects.equals(this.states, x.states)
			&& Objects.equals(this.stockLocations, x.stockLocations)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.taxonomies, x.taxonomies)
			&& Objects.equals(this.taxons, x.taxons)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.variantOptions, x.variantOptions)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.webhooks, x.webhooks)
			&& Objects.equals(this.wireTransfers, x.wireTransfers)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			organizationId, name, previousChanges, organization, addresses,
			catalogs, channels, countries, countryGroups, countryLanguages,
			currencies, customers, creditCards, images, languages,
			lineItems, lineItemStocks, markets, shippingCarriers, marketPaymentTypes,
			marketShippingServices, marketStockLocations, merchants, merchandisingRules, optionTypes,
			optionValues, orders, orderValidators, gateways, paymentTypes,
			paymentMethods, paypalAccounts, priceLists, prices, products,
			productTypes, productProperties, propertyTypes, propertyValues, resourceImages,
			shipments, shippingCarrierTypes, shippingCategories, shippingLabels, shippingMethods,
			shippingPackages, shippingServices, shippingServiceCategories, shippingServiceStockLocations, shippingServiceZones,
			shippingZones, states, stockLocations, stockItems, taxonomies,
			taxons, transactions, consumerRoles, variantOptions, variants,
			webhooks, wireTransfers 
		);
	
	}
	

	@Override
	public Environment clone() {
	
		Environment no = new Environment();
	
		no = super.clone(no);
	
		no.organizationId = this.organizationId;
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.organization = this.organization;
		no.addresses = this.addresses;
		no.catalogs = this.catalogs;
		no.channels = this.channels;
		no.countries = this.countries;
		no.countryGroups = this.countryGroups;
		no.countryLanguages = this.countryLanguages;
		no.currencies = this.currencies;
		no.customers = this.customers;
		no.creditCards = this.creditCards;
		no.images = this.images;
		no.languages = this.languages;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.markets = this.markets;
		no.shippingCarriers = this.shippingCarriers;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.marketShippingServices = this.marketShippingServices;
		no.marketStockLocations = this.marketStockLocations;
		no.merchants = this.merchants;
		no.merchandisingRules = this.merchandisingRules;
		no.optionTypes = this.optionTypes;
		no.optionValues = this.optionValues;
		no.orders = this.orders;
		no.orderValidators = this.orderValidators;
		no.gateways = this.gateways;
		no.paymentTypes = this.paymentTypes;
		no.paymentMethods = this.paymentMethods;
		no.paypalAccounts = this.paypalAccounts;
		no.priceLists = this.priceLists;
		no.prices = this.prices;
		no.products = this.products;
		no.productTypes = this.productTypes;
		no.productProperties = this.productProperties;
		no.propertyTypes = this.propertyTypes;
		no.propertyValues = this.propertyValues;
		no.resourceImages = this.resourceImages;
		no.shipments = this.shipments;
		no.shippingCarrierTypes = this.shippingCarrierTypes;
		no.shippingCategories = this.shippingCategories;
		no.shippingLabels = this.shippingLabels;
		no.shippingMethods = this.shippingMethods;
		no.shippingPackages = this.shippingPackages;
		no.shippingServices = this.shippingServices;
		no.shippingServiceCategories = this.shippingServiceCategories;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.shippingServiceZones = this.shippingServiceZones;
		no.shippingZones = this.shippingZones;
		no.states = this.states;
		no.stockLocations = this.stockLocations;
		no.stockItems = this.stockItems;
		no.taxonomies = this.taxonomies;
		no.taxons = this.taxons;
		no.transactions = this.transactions;
		no.consumerRoles = this.consumerRoles;
		no.variantOptions = this.variantOptions;
		no.variants = this.variants;
		no.webhooks = this.webhooks;
		no.wireTransfers = this.wireTransfers;
	
		return no;
	
	}
	
}
