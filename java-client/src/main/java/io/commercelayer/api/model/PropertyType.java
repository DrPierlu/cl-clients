package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PropertyType
 */
public class PropertyType extends ApiResource {

	private static final long serialVersionUID = -1482880735336L;


	private String name;
	@JsonExclude
	private String slug;
	private Integer productTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object productType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> propertyValues;
	@JsonExclude
	private List<String> products;


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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public Integer getProductTypeId() {
		return this.productTypeId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setProductType(Object productType) {
		this.productType = productType;
	}
	

	public Object getProductType() {
		return this.productType;
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
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
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
	
		PropertyType x = (PropertyType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.propertyValues, x.propertyValues)
			&& Objects.equals(this.products, x.products)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, productTypeId, previousChanges, productType,
			resourceImages, images, translations, propertyValues, products
			
		);
	
	}
	

	@Override
	public PropertyType clone() {
	
		PropertyType no = new PropertyType();
	
		no.name = this.name;
		no.slug = this.slug;
		no.productTypeId = this.productTypeId;
		no.previousChanges = this.previousChanges;
		no.productType = this.productType;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.propertyValues = this.propertyValues;
		no.products = this.products;
	
		return no;
	
	}
	
}
