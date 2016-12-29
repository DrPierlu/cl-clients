package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * OptionType
 */
public class OptionType extends ApiResource {

	private static final long serialVersionUID = -1483006114235L;


	private String name;
	private String productTypeId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object productType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> translations;
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
	

	public OptionType name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public String getProductTypeId() {
		return this.productTypeId;
	}
	

	public OptionType productTypeId(String productTypeId) {
		setProductTypeId(productTypeId);
		return this;
	}
	

	public String productTypeId() {
		return getProductTypeId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public OptionType previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setProductType(Object productType) {
		this.productType = productType;
	}
	

	public Object getProductType() {
		return this.productType;
	}
	

	public OptionType productType(Object productType) {
		setProductType(productType);
		return this;
	}
	

	public Object productType() {
		return getProductType();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public OptionType resourceImages(List<String> resourceImages) {
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
	

	public OptionType images(List<String> images) {
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
	

	public OptionType translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setOptionValues(List<String> optionValues) {
		this.optionValues = optionValues;
	}
	

	public List<String> getOptionValues() {
		return this.optionValues;
	}
	

	public OptionType optionValues(List<String> optionValues) {
		setOptionValues(optionValues);
		return this;
	}
	

	public List<String> optionValues() {
		return getOptionValues();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public OptionType variants(List<String> variants) {
		setVariants(variants);
		return this;
	}
	

	public List<String> variants() {
		return getVariants();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		OptionType x = (OptionType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
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
			name, productTypeId, previousChanges, productType, resourceImages,
			images, translations, optionValues, variants 
		);
	
	}
	

	@Override
	public OptionType clone() {
	
		OptionType no = new OptionType();
	
		no.name = this.name;
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
