package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Product
 */
public class Product extends ApiResource {

	private static final long serialVersionUID = -1482880735322L;


	private String name;
	@JsonExclude
	private String slug;
	@JsonExclude
	private String description;
	private Integer productTypeId;
	@JsonExclude
	private Object trackInventory;
	@JsonExclude
	private Integer shippingCategoryId;
	@JsonExclude
	private String sku;
	@JsonExclude
	private String taxCode;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Object productType;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> variants;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
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
	

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public Integer getProductTypeId() {
		return this.productTypeId;
	}
	

	public void setTrackInventory(Object trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public Object getTrackInventory() {
		return this.trackInventory;
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setSku(String sku) {
		this.sku = sku;
	}
	

	public String getSku() {
		return this.sku;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Product x = (Product)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.trackInventory, x.trackInventory)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.sku, x.sku)
			&& Objects.equals(this.taxCode, x.taxCode)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.merchandisingRules, x.merchandisingRules)
			&& Objects.equals(this.productProperties, x.productProperties)
			&& Objects.equals(this.hasVariants, x.hasVariants)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, productTypeId, trackInventory,
			shippingCategoryId, sku, taxCode, previousChanges, shippingCategory,
			productType, prices, lineItems, lineItemStocks, stockItems,
			shippingServiceStockLocations, resourceImages, images, translations, variants,
			merchandisingRules, productProperties, hasVariants 
		);
	
	}
	

	@Override
	public Product clone() {
	
		Product no = new Product();
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.productTypeId = this.productTypeId;
		no.trackInventory = this.trackInventory;
		no.shippingCategoryId = this.shippingCategoryId;
		no.sku = this.sku;
		no.taxCode = this.taxCode;
		no.previousChanges = this.previousChanges;
		no.shippingCategory = this.shippingCategory;
		no.productType = this.productType;
		no.prices = this.prices;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.stockItems = this.stockItems;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.variants = this.variants;
		no.merchandisingRules = this.merchandisingRules;
		no.productProperties = this.productProperties;
		no.hasVariants = this.hasVariants;
	
		return no;
	
	}
	
}
