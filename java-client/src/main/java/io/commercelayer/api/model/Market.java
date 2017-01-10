package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Market
 */
public class Market extends ApiResource {

	private static final long serialVersionUID = -1484058602878L;


	private Integer catalogId;
	private Integer channelId;
	private Integer countryGroupId;
	private Integer merchantId;
	private Integer orderValidatorId;
	private Integer priceListId;
	@JsonExclude
	private Object catalog;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private LocalDateTime lastResetIndexAt;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> marketStockLocations;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object orderValidator;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private List<String> shippingZones;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private List<String> stockLocations;


	public Market() {
		super();
	}
	

	public Market(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Market name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	

	public Integer getChannelId() {
		return this.channelId;
	}
	

	public Market channelId(Integer channelId) {
		setChannelId(channelId);
		return this;
	}
	

	public Integer channelId() {
		return getChannelId();
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public Market countryGroupId(Integer countryGroupId) {
		setCountryGroupId(countryGroupId);
		return this;
	}
	

	public Integer countryGroupId() {
		return getCountryGroupId();
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public Market merchantId(Integer merchantId) {
		setMerchantId(merchantId);
		return this;
	}
	

	public Integer merchantId() {
		return getMerchantId();
	}
	

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	

	public Integer getCatalogId() {
		return this.catalogId;
	}
	

	public Market catalogId(Integer catalogId) {
		setCatalogId(catalogId);
		return this;
	}
	

	public Integer catalogId() {
		return getCatalogId();
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public Market priceListId(Integer priceListId) {
		setPriceListId(priceListId);
		return this;
	}
	

	public Integer priceListId() {
		return getPriceListId();
	}
	

	public void setOrderValidatorId(Integer orderValidatorId) {
		this.orderValidatorId = orderValidatorId;
	}
	

	public Integer getOrderValidatorId() {
		return this.orderValidatorId;
	}
	

	public Market orderValidatorId(Integer orderValidatorId) {
		setOrderValidatorId(orderValidatorId);
		return this;
	}
	

	public Integer orderValidatorId() {
		return getOrderValidatorId();
	}
	

	public void setLastResetIndexAt(LocalDateTime lastResetIndexAt) {
		this.lastResetIndexAt = lastResetIndexAt;
	}
	

	public LocalDateTime getLastResetIndexAt() {
		return this.lastResetIndexAt;
	}
	

	public Market lastResetIndexAt(LocalDateTime lastResetIndexAt) {
		setLastResetIndexAt(lastResetIndexAt);
		return this;
	}
	

	public LocalDateTime lastResetIndexAt() {
		return getLastResetIndexAt();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Market previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public Market merchant(Object merchant) {
		setMerchant(merchant);
		return this;
	}
	

	public Object merchant() {
		return getMerchant();
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public Market countryGroup(Object countryGroup) {
		setCountryGroup(countryGroup);
		return this;
	}
	

	public Object countryGroup() {
		return getCountryGroup();
	}
	

	public void setCatalog(Object catalog) {
		this.catalog = catalog;
	}
	

	public Object getCatalog() {
		return this.catalog;
	}
	

	public Market catalog(Object catalog) {
		setCatalog(catalog);
		return this;
	}
	

	public Object catalog() {
		return getCatalog();
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public Market priceList(Object priceList) {
		setPriceList(priceList);
		return this;
	}
	

	public Object priceList() {
		return getPriceList();
	}
	

	public void setChannel(Object channel) {
		this.channel = channel;
	}
	

	public Object getChannel() {
		return this.channel;
	}
	

	public Market channel(Object channel) {
		setChannel(channel);
		return this;
	}
	

	public Object channel() {
		return getChannel();
	}
	

	public void setOrderValidator(Object orderValidator) {
		this.orderValidator = orderValidator;
	}
	

	public Object getOrderValidator() {
		return this.orderValidator;
	}
	

	public Market orderValidator(Object orderValidator) {
		setOrderValidator(orderValidator);
		return this;
	}
	

	public Object orderValidator() {
		return getOrderValidator();
	}
	

	public void setMarketStockLocations(List<String> marketStockLocations) {
		this.marketStockLocations = marketStockLocations;
	}
	

	public List<String> getMarketStockLocations() {
		return this.marketStockLocations;
	}
	

	public Market marketStockLocations(List<String> marketStockLocations) {
		setMarketStockLocations(marketStockLocations);
		return this;
	}
	

	public List<String> marketStockLocations() {
		return getMarketStockLocations();
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public Market marketShippingServices(List<String> marketShippingServices) {
		setMarketShippingServices(marketShippingServices);
		return this;
	}
	

	public List<String> marketShippingServices() {
		return getMarketShippingServices();
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public Market marketPaymentTypes(List<String> marketPaymentTypes) {
		setMarketPaymentTypes(marketPaymentTypes);
		return this;
	}
	

	public List<String> marketPaymentTypes() {
		return getMarketPaymentTypes();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Market lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public Market stockLocations(List<String> stockLocations) {
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
	

	public Market stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public Market shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public Market paymentTypes(List<String> paymentTypes) {
		setPaymentTypes(paymentTypes);
		return this;
	}
	

	public List<String> paymentTypes() {
		return getPaymentTypes();
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	public Market shippingZones(List<String> shippingZones) {
		setShippingZones(shippingZones);
		return this;
	}
	

	public List<String> shippingZones() {
		return getShippingZones();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public Market countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Market x = (Market)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.channelId, x.channelId)
			&& Objects.equals(this.countryGroupId, x.countryGroupId)
			&& Objects.equals(this.merchantId, x.merchantId)
			&& Objects.equals(this.catalogId, x.catalogId)
			&& Objects.equals(this.priceListId, x.priceListId)
			&& Objects.equals(this.orderValidatorId, x.orderValidatorId)
			&& Objects.equals(this.lastResetIndexAt, x.lastResetIndexAt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.countryGroup, x.countryGroup)
			&& Objects.equals(this.catalog, x.catalog)
			&& Objects.equals(this.priceList, x.priceList)
			&& Objects.equals(this.channel, x.channel)
			&& Objects.equals(this.orderValidator, x.orderValidator)
			&& Objects.equals(this.marketStockLocations, x.marketStockLocations)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.stockLocations, x.stockLocations)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServices, x.shippingServices)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.shippingZones, x.shippingZones)
			&& Objects.equals(this.countries, x.countries)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, channelId, countryGroupId, merchantId, catalogId,
			priceListId, orderValidatorId, lastResetIndexAt, previousChanges, merchant,
			countryGroup, catalog, priceList, channel, orderValidator,
			marketStockLocations, marketShippingServices, marketPaymentTypes, lineItemStocks, stockLocations,
			stockItems, shippingServices, paymentTypes, shippingZones, countries
			
		);
	
	}
	

	@Override
	public Market clone() {
	
		Market no = new Market();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.channelId = this.channelId;
		no.countryGroupId = this.countryGroupId;
		no.merchantId = this.merchantId;
		no.catalogId = this.catalogId;
		no.priceListId = this.priceListId;
		no.orderValidatorId = this.orderValidatorId;
		no.lastResetIndexAt = this.lastResetIndexAt;
		no.previousChanges = this.previousChanges;
		no.merchant = this.merchant;
		no.countryGroup = this.countryGroup;
		no.catalog = this.catalog;
		no.priceList = this.priceList;
		no.channel = this.channel;
		no.orderValidator = this.orderValidator;
		no.marketStockLocations = this.marketStockLocations;
		no.marketShippingServices = this.marketShippingServices;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.lineItemStocks = this.lineItemStocks;
		no.stockLocations = this.stockLocations;
		no.stockItems = this.stockItems;
		no.shippingServices = this.shippingServices;
		no.paymentTypes = this.paymentTypes;
		no.shippingZones = this.shippingZones;
		no.countries = this.countries;
	
		return no;
	
	}
	
}
