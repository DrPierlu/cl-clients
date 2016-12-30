package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * PropertyValue
 */
public class PropertyValue extends ApiResource {

	private static final long serialVersionUID = -1483100361697L;


	private String name;
	private String propertyTypeId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private Object propertyType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> translations;


	public PropertyValue() {
		super();
	}
	

	public PropertyValue(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PropertyValue name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPropertyTypeId(String propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	

	public String getPropertyTypeId() {
		return this.propertyTypeId;
	}
	

	public PropertyValue propertyTypeId(String propertyTypeId) {
		setPropertyTypeId(propertyTypeId);
		return this;
	}
	

	public String propertyTypeId() {
		return getPropertyTypeId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public PropertyValue previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setPropertyType(Object propertyType) {
		this.propertyType = propertyType;
	}
	

	public Object getPropertyType() {
		return this.propertyType;
	}
	

	public PropertyValue propertyType(Object propertyType) {
		setPropertyType(propertyType);
		return this;
	}
	

	public Object propertyType() {
		return getPropertyType();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public PropertyValue resourceImages(List<String> resourceImages) {
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
	

	public PropertyValue images(List<String> images) {
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
	

	public PropertyValue translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public PropertyValue productProperties(List<String> productProperties) {
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
	

	public PropertyValue products(List<String> products) {
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
	
		PropertyValue x = (PropertyValue)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.propertyTypeId, x.propertyTypeId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.propertyType, x.propertyType)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.productProperties, x.productProperties)
			&& Objects.equals(this.products, x.products)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, propertyTypeId, previousChanges, propertyType, resourceImages,
			images, translations, productProperties, products 
		);
	
	}
	

	@Override
	public PropertyValue clone() {
	
		PropertyValue no = new PropertyValue();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.propertyTypeId = this.propertyTypeId;
		no.previousChanges = this.previousChanges;
		no.propertyType = this.propertyType;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.productProperties = this.productProperties;
		no.products = this.products;
	
		return no;
	
	}
	
}
