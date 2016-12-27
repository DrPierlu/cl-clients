package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ProductType
 */
public class ProductType extends ApiResource {

	private static final long serialVersionUID = -1482880735332L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> optionTypes;
	@JsonExclude
	private List<String> propertyTypes;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private List<String> propertyValues;


	public ProductType() {
		super();
	}
	

	public ProductType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
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
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}
	

	public List<String> getOptionTypes() {
		return this.optionTypes;
	}
	

	public void setPropertyTypes(List<String> propertyTypes) {
		this.propertyTypes = propertyTypes;
	}
	

	public List<String> getPropertyTypes() {
		return this.propertyTypes;
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ProductType x = (ProductType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.optionTypes, x.optionTypes)
			&& Objects.equals(this.propertyTypes, x.propertyTypes)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.propertyValues, x.propertyValues)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, resourceImages, images, products,
			optionTypes, propertyTypes, optionValues, propertyValues 
		);
	
	}
	

	@Override
	public ProductType clone() {
	
		ProductType no = new ProductType();
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.products = this.products;
		no.optionTypes = this.optionTypes;
		no.propertyTypes = this.propertyTypes;
		no.optionValues = this.optionValues;
		no.propertyValues = this.propertyValues;
	
		return no;
	
	}
	
}
