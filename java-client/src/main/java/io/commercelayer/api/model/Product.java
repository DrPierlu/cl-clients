package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Product
 */
public class Product extends ApiResource {

	private static final long serialVersionUID = -1481805605891L;


	private String name;
	private String description;
	private String productTypeId;
	private String trackInventory;
	private String shippingCategoryId;
	private String taxCode;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Object productType;
	private List<String> prices;
	private List<String> lineItems;
	private List<String> lineItemStocks;
	private List<String> stockItems;
	private List<String> shippingServiceStockLocations;
	private List<String> resourceImages;
	private List<String> images;
	private List<String> translations;
	private List<String> variants;
	private List<String> merchandisingRules;
	private List<String> productProperties;
	private String hasVariants;


	public Product() {
		super();
	}
	

	public Product(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public String getProductTypeId() {
		return this.productTypeId;
	}
	

	public void setTrackInventory(String trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public String getTrackInventory() {
		return this.trackInventory;
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	

	public String getTaxCode() {
		return this.taxCode;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public void setProductType(Object productType) {
		this.productType = productType;
	}
	

	public Object getProductType() {
		return this.productType;
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
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
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public void setHasVariants(String hasVariants) {
		this.hasVariants = hasVariants;
	}
	

	public String getHasVariants() {
		return this.hasVariants;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Product x = (Product) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.description, x.description)  &&
			Objects.equals(this.productTypeId, x.productTypeId)  &&
			Objects.equals(this.trackInventory, x.trackInventory)  &&
			Objects.equals(this.shippingCategoryId, x.shippingCategoryId)  &&
			Objects.equals(this.taxCode, x.taxCode)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingCategory, x.shippingCategory)  &&
			Objects.equals(this.productType, x.productType)  &&
			Objects.equals(this.prices, x.prices)  &&
			Objects.equals(this.lineItems, x.lineItems)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.stockItems, x.stockItems)  &&
			Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.images, x.images)  &&
			Objects.equals(this.translations, x.translations)  &&
			Objects.equals(this.variants, x.variants)  &&
			Objects.equals(this.merchandisingRules, x.merchandisingRules)  &&
			Objects.equals(this.productProperties, x.productProperties)  &&
			Objects.equals(this.hasVariants, x.hasVariants) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, description, productTypeId, trackInventory,
			shippingCategoryId, taxCode, previousChanges, shippingCategory, productType,
			prices, lineItems, lineItemStocks, stockItems, shippingServiceStockLocations,
			resourceImages, images, translations, variants, merchandisingRules,
			productProperties, hasVariants 
		);
	
	}
	
}
