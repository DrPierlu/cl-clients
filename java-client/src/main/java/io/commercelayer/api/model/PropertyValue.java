package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PropertyValue
 */
public class PropertyValue extends ApiResource {

	private static final long serialVersionUID = -1482880735338L;


	private String name;
	@JsonExclude
	private String slug;
	private Integer propertyTypeId;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object propertyType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	

	public Integer getPropertyTypeId() {
		return this.propertyTypeId;
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PropertyValue x = (PropertyValue)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.propertyTypeId, x.propertyTypeId)
			&& Objects.equals(this.position, x.position)
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
			name, slug, propertyTypeId, position, previousChanges,
			propertyType, resourceImages, images, translations, productProperties,
			products 
		);
	
	}
	

	@Override
	public PropertyValue clone() {
	
		PropertyValue no = new PropertyValue();
	
		no.name = this.name;
		no.slug = this.slug;
		no.propertyTypeId = this.propertyTypeId;
		no.position = this.position;
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
