package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Variant
 */
public class Variant extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer productId;
	private String sku;
	@JsonExclude
	private List<String> contentFields;
	@JsonExclude
	private List<String> events;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> metaFields;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private Object product;
	@JsonExclude
	private List<String> resourceContentFields;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> resourceMetaFields;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Integer shippingCategoryId;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private String taxCode;
	@JsonExclude
	private Boolean trackInventory;
	@JsonExclude
	private List<String> variantOptions;
	@JsonExclude
	private List<String> versions;


	public Variant() {
		super();
	}
	

	public Variant(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Variant name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	

	public Integer getProductId() {
		return this.productId;
	}
	

	public Variant productId(Integer productId) {
		setProductId(productId);
		return this;
	}
	

	public Integer productId() {
		return getProductId();
	}
	

	public void setTrackInventory(Boolean trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public Boolean getTrackInventory() {
		return this.trackInventory;
	}
	

	public Variant trackInventory(Boolean trackInventory) {
		setTrackInventory(trackInventory);
		return this;
	}
	

	public Boolean trackInventory() {
		return getTrackInventory();
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public Variant shippingCategoryId(Integer shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public Integer shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setSku(String sku) {
		this.sku = sku;
	}
	

	public String getSku() {
		return this.sku;
	}
	

	public Variant sku(String sku) {
		setSku(sku);
		return this;
	}
	

	public String sku() {
		return getSku();
	}
	

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	

	public String getTaxCode() {
		return this.taxCode;
	}
	

	public Variant taxCode(String taxCode) {
		setTaxCode(taxCode);
		return this;
	}
	

	public String taxCode() {
		return getTaxCode();
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public Variant shippingCategory(Object shippingCategory) {
		setShippingCategory(shippingCategory);
		return this;
	}
	

	public Object shippingCategory() {
		return getShippingCategory();
	}
	

	public void setProduct(Object product) {
		this.product = product;
	}
	

	public Object getProduct() {
		return this.product;
	}
	

	public Variant product(Object product) {
		setProduct(product);
		return this;
	}
	

	public Object product() {
		return getProduct();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Variant versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public Variant prices(List<String> prices) {
		setPrices(prices);
		return this;
	}
	

	public List<String> prices() {
		return getPrices();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Variant lineItems(List<String> lineItems) {
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
	

	public Variant lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public Variant stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public Variant shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Variant resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public Variant images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setResourceContentFields(List<String> resourceContentFields) {
		this.resourceContentFields = resourceContentFields;
	}
	

	public List<String> getResourceContentFields() {
		return this.resourceContentFields;
	}
	

	public Variant resourceContentFields(List<String> resourceContentFields) {
		setResourceContentFields(resourceContentFields);
		return this;
	}
	

	public List<String> resourceContentFields() {
		return getResourceContentFields();
	}
	

	public void setContentFields(List<String> contentFields) {
		this.contentFields = contentFields;
	}
	

	public List<String> getContentFields() {
		return this.contentFields;
	}
	

	public Variant contentFields(List<String> contentFields) {
		setContentFields(contentFields);
		return this;
	}
	

	public List<String> contentFields() {
		return getContentFields();
	}
	

	public void setResourceMetaFields(List<String> resourceMetaFields) {
		this.resourceMetaFields = resourceMetaFields;
	}
	

	public List<String> getResourceMetaFields() {
		return this.resourceMetaFields;
	}
	

	public Variant resourceMetaFields(List<String> resourceMetaFields) {
		setResourceMetaFields(resourceMetaFields);
		return this;
	}
	

	public List<String> resourceMetaFields() {
		return getResourceMetaFields();
	}
	

	public void setMetaFields(List<String> metaFields) {
		this.metaFields = metaFields;
	}
	

	public List<String> getMetaFields() {
		return this.metaFields;
	}
	

	public Variant metaFields(List<String> metaFields) {
		setMetaFields(metaFields);
		return this;
	}
	

	public List<String> metaFields() {
		return getMetaFields();
	}
	

	public void setEvents(List<String> events) {
		this.events = events;
	}
	

	public List<String> getEvents() {
		return this.events;
	}
	

	public Variant events(List<String> events) {
		setEvents(events);
		return this;
	}
	

	public List<String> events() {
		return getEvents();
	}
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
	}
	

	public Variant variantOptions(List<String> variantOptions) {
		setVariantOptions(variantOptions);
		return this;
	}
	

	public List<String> variantOptions() {
		return getVariantOptions();
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public Variant optionValues(List<String> optionValues) {
		setOptionValues(optionValues);
		return this;
	}
	

	public List<String> optionValues() {
		return getOptionValues();
	}
	

	public void setFeaturedImageId(String featuredImageId) {
		this.featuredImageId = featuredImageId;
	}
	

	public String getFeaturedImageId() {
		return this.featuredImageId;
	}
	

	public Variant featuredImageId(String featuredImageId) {
		setFeaturedImageId(featuredImageId);
		return this;
	}
	

	public String featuredImageId() {
		return getFeaturedImageId();
	}
	

	public void setFeaturedImage(Object featuredImage) {
		this.featuredImage = featuredImage;
	}
	

	public Object getFeaturedImage() {
		return this.featuredImage;
	}
	

	public Variant featuredImage(Object featuredImage) {
		setFeaturedImage(featuredImage);
		return this;
	}
	

	public Object featuredImage() {
		return getFeaturedImage();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Variant x = (Variant)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.productId, x.productId)
			&& Objects.equals(this.trackInventory, x.trackInventory)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.sku, x.sku)
			&& Objects.equals(this.taxCode, x.taxCode)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.product, x.product)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.resourceContentFields, x.resourceContentFields)
			&& Objects.equals(this.contentFields, x.contentFields)
			&& Objects.equals(this.resourceMetaFields, x.resourceMetaFields)
			&& Objects.equals(this.metaFields, x.metaFields)
			&& Objects.equals(this.events, x.events)
			&& Objects.equals(this.variantOptions, x.variantOptions)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, productId, trackInventory, shippingCategoryId, sku,
			taxCode, shippingCategory, product, versions, prices,
			lineItems, lineItemStocks, stockItems, shippingServiceStockLocations, resourceImages,
			images, resourceContentFields, contentFields, resourceMetaFields, metaFields,
			events, variantOptions, optionValues, featuredImageId, featuredImage
			
		);
	
	}
	

	@Override
	public Variant clone() {
	
		Variant no = new Variant();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.productId = this.productId;
		no.trackInventory = this.trackInventory;
		no.shippingCategoryId = this.shippingCategoryId;
		no.sku = this.sku;
		no.taxCode = this.taxCode;
		no.shippingCategory = this.shippingCategory;
		no.product = this.product;
		no.versions = this.versions;
		no.prices = this.prices;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.stockItems = this.stockItems;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.resourceContentFields = this.resourceContentFields;
		no.contentFields = this.contentFields;
		no.resourceMetaFields = this.resourceMetaFields;
		no.metaFields = this.metaFields;
		no.events = this.events;
		no.variantOptions = this.variantOptions;
		no.optionValues = this.optionValues;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
	
		return no;
	
	}
	
}
