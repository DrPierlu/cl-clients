package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * OptionType
 */
public class OptionType extends ApiResource {

	private static final long serialVersionUID = -1482845758062L;


	private String name;
	private String productTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object productType;
	private List<String> resourceImages;
	private List<String> images;
	private List<String> translations;
	private List<String> optionValues;
	private List<String> variants;


	public OptionType() {
		super();
	}
	

	public OptionType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public String getProductTypeId() {
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
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		OptionType x = (OptionType) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.productTypeId, x.productTypeId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.productType, x.productType)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.images, x.images)  &&
			Objects.equals(this.translations, x.translations)  &&
			Objects.equals(this.optionValues, x.optionValues)  &&
			Objects.equals(this.variants, x.variants) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, productTypeId, previousChanges, productType,
			resourceImages, images, translations, optionValues, variants
			
		);
	
	}
	
}
