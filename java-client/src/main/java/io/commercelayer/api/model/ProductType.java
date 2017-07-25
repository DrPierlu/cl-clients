package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ProductType
 */
public class ProductType extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> optionTypes;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> propertyTypes;
	@JsonExclude
	private List<String> propertyValues;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> versions;


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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ProductType versions(List<String> versions) {
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
	

	public void setFeaturedImageId(String featuredImageId) {
		this.featuredImageId = featuredImageId;
	}
	

	public String getFeaturedImageId() {
		return this.featuredImageId;
	}
	

	public ProductType featuredImageId(String featuredImageId) {
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
	

	public ProductType featuredImage(Object featuredImage) {
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
	
		ProductType x = (ProductType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.optionTypes, x.optionTypes)
			&& Objects.equals(this.propertyTypes, x.propertyTypes)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.propertyValues, x.propertyValues)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, resourceImages, images, products,
			optionTypes, propertyTypes, optionValues, propertyValues, featuredImageId,
			featuredImage 
		);
	
	}
	

	@Override
	public ProductType clone() {
	
		ProductType no = new ProductType();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.products = this.products;
		no.optionTypes = this.optionTypes;
		no.propertyTypes = this.propertyTypes;
		no.optionValues = this.optionValues;
		no.propertyValues = this.propertyValues;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
	
		return no;
	
	}
	
}
