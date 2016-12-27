package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PropertyValue
 */
public class PropertyValue extends ApiResource {

	private static final long serialVersionUID = -1482845758172L;


	private String name;
	private String propertyTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object propertyType;
	private List<String> resourceImages;
	private List<String> images;
	private List<String> translations;
	private List<String> productProperties;
	private List<String> products;


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
	

	public void setPropertyTypeId(String propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	

	public String getPropertyTypeId() {
		return this.propertyTypeId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setPropertyType(Object propertyType) {
		this.propertyType = propertyType;
	}
	

	public Object getPropertyType() {
		return this.propertyType;
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
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		PropertyValue x = (PropertyValue) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.propertyTypeId, x.propertyTypeId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.propertyType, x.propertyType)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.images, x.images)  &&
			Objects.equals(this.translations, x.translations)  &&
			Objects.equals(this.productProperties, x.productProperties)  &&
			Objects.equals(this.products, x.products) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, propertyTypeId, previousChanges, propertyType,
			resourceImages, images, translations, productProperties, products
			
		);
	
	}
	
}
