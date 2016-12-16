package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Market
 */
public class Market extends ApiResource {

	private static final long serialVersionUID = -1481927389110L;


	private Integer channelId;
	private Integer countryGroupId;
	private Integer merchantId;
	private Integer catalogId;
	private Integer priceListId;
	private Integer orderValidatorId;
	private LocalDateTime lastResetIndexAt;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private Object catalog;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private Object orderValidator;
	private List<String> marketStockLocations;
	private List<String> marketShippingServices;
	private List<String> marketPaymentTypes;
	private List<String> lineItemStocks;
	private List<String> stockLocations;
	private List<String> stockItems;
	private List<String> shippingServices;
	private List<String> paymentTypes;
	private List<String> shippingZones;


	public Market() {
		super();
	}
	

	public Market(Long id) {
		super(id);
	}
	

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	

	public Integer getChannelId() {
		return this.channelId;
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	

	public Integer getCatalogId() {
		return this.catalogId;
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public void setOrderValidatorId(Integer orderValidatorId) {
		this.orderValidatorId = orderValidatorId;
	}
	

	public Integer getOrderValidatorId() {
		return this.orderValidatorId;
	}
	

	public void setLastResetIndexAt(LocalDateTime lastResetIndexAt) {
		this.lastResetIndexAt = lastResetIndexAt;
	}
	

	public LocalDateTime getLastResetIndexAt() {
		return this.lastResetIndexAt;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public void setCatalog(Object catalog) {
		this.catalog = catalog;
	}
	

	public Object getCatalog() {
		return this.catalog;
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public void setChannel(Object channel) {
		this.channel = channel;
	}
	

	public Object getChannel() {
		return this.channel;
	}
	

	public void setOrderValidator(Object orderValidator) {
		this.orderValidator = orderValidator;
	}
	

	public Object getOrderValidator() {
		return this.orderValidator;
	}
	

	public void setMarketStockLocations(List<String> marketStockLocations) {
		this.marketStockLocations = marketStockLocations;
	}
	

	public List<String> getMarketStockLocations() {
		return this.marketStockLocations;
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
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
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
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
		if (o == null || getClass() != o.getClass()) return false;
	
		Market x = (Market) o;
	
		return super.equals(o) &&
			Objects.equals(this.channelId, x.channelId)  &&
			Objects.equals(this.countryGroupId, x.countryGroupId)  &&
			Objects.equals(this.merchantId, x.merchantId)  &&
			Objects.equals(this.catalogId, x.catalogId)  &&
			Objects.equals(this.priceListId, x.priceListId)  &&
			Objects.equals(this.orderValidatorId, x.orderValidatorId)  &&
			Objects.equals(this.lastResetIndexAt, x.lastResetIndexAt)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.merchant, x.merchant)  &&
			Objects.equals(this.countryGroup, x.countryGroup)  &&
			Objects.equals(this.catalog, x.catalog)  &&
			Objects.equals(this.priceList, x.priceList)  &&
			Objects.equals(this.channel, x.channel)  &&
			Objects.equals(this.orderValidator, x.orderValidator)  &&
			Objects.equals(this.marketStockLocations, x.marketStockLocations)  &&
			Objects.equals(this.marketShippingServices, x.marketShippingServices)  &&
			Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.stockLocations, x.stockLocations)  &&
			Objects.equals(this.stockItems, x.stockItems)  &&
			Objects.equals(this.shippingServices, x.shippingServices)  &&
			Objects.equals(this.paymentTypes, x.paymentTypes)  &&
			Objects.equals(this.shippingZones, x.shippingZones) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, channelId, countryGroupId, merchantId, catalogId,
			priceListId, orderValidatorId, lastResetIndexAt, previousChanges, merchant,
			countryGroup, catalog, priceList, channel, orderValidator,
			marketStockLocations, marketShippingServices, marketPaymentTypes, lineItemStocks, stockLocations,
			stockItems, shippingServices, paymentTypes, shippingZones 
		);
	
	}
	
}
