package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PropertyType
 */
public class PropertyType extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	private Integer productTypeId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
	private Object productType;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> propertyValues;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private String slug;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> versions;


	public PropertyType() {
		super();
	}
	

	public PropertyType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PropertyType name(String name) {
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
	

	public PropertyType slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public Integer getProductTypeId() {
		return this.productTypeId;
	}
	

	public PropertyType productTypeId(Integer productTypeId) {
		setProductTypeId(productTypeId);
		return this;
	}
	

	public Integer productTypeId() {
		return getProductTypeId();
	}
	

	public void setProductType(Object productType) {
		this.productType = productType;
	}
	

	public Object getProductType() {
		return this.productType;
	}
	

	public PropertyType productType(Object productType) {
		setProductType(productType);
		return this;
	}
	

	public Object productType() {
		return getProductType();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public PropertyType versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public PropertyType resourceImages(List<String> resourceImages) {
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
	

	public PropertyType images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public PropertyType translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
	}
	

	public PropertyType propertyValues(List<String> propertyValues) {
		setPropertyValues(propertyValues);
		return this;
	}
	

	public List<String> propertyValues() {
		return getPropertyValues();
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public PropertyType productProperties(List<String> productProperties) {
		setProductProperties(productProperties);
		return this;
	}
	

	public List<String> productProperties() {
		return getProductProperties();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public PropertyType products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PropertyType x = (PropertyType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.propertyValues, x.propertyValues)
			&& Objects.equals(this.productProperties, x.productProperties)
			&& Objects.equals(this.products, x.products)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, productTypeId, productType, versions,
			resourceImages, images, translations, propertyValues, productProperties,
			products 
		);
	
	}
	

	@Override
	public PropertyType clone() {
	
		PropertyType no = new PropertyType();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.slug = this.slug;
		no.productTypeId = this.productTypeId;
		no.productType = this.productType;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.propertyValues = this.propertyValues;
		no.productProperties = this.productProperties;
		no.products = this.products;
	
		return no;
	
	}
	
}
