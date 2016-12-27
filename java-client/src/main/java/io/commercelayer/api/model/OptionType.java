package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * OptionType
 */
public class OptionType extends ApiResource {

	private static final long serialVersionUID = -1482880735305L;


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
	private List<String> optionValues;
	@JsonExclude
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		OptionType x = (OptionType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.variants, x.variants)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, productTypeId, previousChanges, productType,
			resourceImages, images, translations, optionValues, variants
			
		);
	
	}
	

	@Override
	public OptionType clone() {
	
		OptionType no = new OptionType();
	
		no.name = this.name;
		no.slug = this.slug;
		no.productTypeId = this.productTypeId;
		no.previousChanges = this.previousChanges;
		no.productType = this.productType;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.optionValues = this.optionValues;
		no.variants = this.variants;
	
		return no;
	
	}
	
}
