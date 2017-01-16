package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ProductType
 */
public class ProductType extends ApiResource {

	private static final long serialVersionUID = -1484566577855L;


	private String name;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> optionTypes;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> propertyTypes;
	@JsonExclude
	private List<String> propertyValues;
	@JsonExclude
	private List<String> resourceImages;


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
	

	public ProductType name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ProductType previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public ProductType resourceImages(List<String> resourceImages) {
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
	

	public ProductType images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public ProductType products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}
	

	public List<String> getOptionTypes() {
		return this.optionTypes;
	}
	

	public ProductType optionTypes(List<String> optionTypes) {
		setOptionTypes(optionTypes);
		return this;
	}
	

	public List<String> optionTypes() {
		return getOptionTypes();
	}
	

	public void setPropertyTypes(List<String> propertyTypes) {
		this.propertyTypes = propertyTypes;
	}
	

	public List<String> getPropertyTypes() {
		return this.propertyTypes;
	}
	

	public ProductType propertyTypes(List<String> propertyTypes) {
		setPropertyTypes(propertyTypes);
		return this;
	}
	

	public List<String> propertyTypes() {
		return getPropertyTypes();
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public ProductType optionValues(List<String> optionValues) {
		setOptionValues(optionValues);
		return this;
	}
	

	public List<String> optionValues() {
		return getOptionValues();
	}
	

	public void setPropertyValues(List<String> propertyValues) {
		this.propertyValues = propertyValues;
	}
	

	public List<String> getPropertyValues() {
		return this.propertyValues;
	}
	

	public ProductType propertyValues(List<String> propertyValues) {
		setPropertyValues(propertyValues);
		return this;
	}
	

	public List<String> propertyValues() {
		return getPropertyValues();
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
	
		no = super.clone(no);
	
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
