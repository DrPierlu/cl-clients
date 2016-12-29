package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * OptionValue
 */
public class OptionValue extends ApiResource {

	private static final long serialVersionUID = -1483024665729L;


	private String name;
	private String optionTypeId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> variantOptions;
	@JsonExclude
	private List<String> variants;


	public OptionValue() {
		super();
	}
	

	public OptionValue(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public OptionValue name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setOptionTypeId(String optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public String getOptionTypeId() {
		return this.optionTypeId;
	}
	

	public OptionValue optionTypeId(String optionTypeId) {
		setOptionTypeId(optionTypeId);
		return this;
	}
	

	public String optionTypeId() {
		return getOptionTypeId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public OptionValue previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setOptionType(Object optionType) {
		this.optionType = optionType;
	}
	

	public Object getOptionType() {
		return this.optionType;
	}
	

	public OptionValue optionType(Object optionType) {
		setOptionType(optionType);
		return this;
	}
	

	public Object optionType() {
		return getOptionType();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public OptionValue resourceImages(List<String> resourceImages) {
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
	

	public OptionValue images(List<String> images) {
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
	

	public OptionValue translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
	}
	

	public OptionValue variantOptions(List<String> variantOptions) {
		setVariantOptions(variantOptions);
		return this;
	}
	

	public List<String> variantOptions() {
		return getVariantOptions();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public OptionValue variants(List<String> variants) {
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
	
		OptionValue x = (OptionValue)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.optionTypeId, x.optionTypeId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.optionType, x.optionType)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.variantOptions, x.variantOptions)
			&& Objects.equals(this.variants, x.variants)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, optionTypeId, previousChanges, optionType, resourceImages,
			images, translations, variantOptions, variants 
		);
	
	}
	

	@Override
	public OptionValue clone() {
	
		OptionValue no = new OptionValue();
	
		no.name = this.name;
		no.optionTypeId = this.optionTypeId;
		no.previousChanges = this.previousChanges;
		no.optionType = this.optionType;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.variantOptions = this.variantOptions;
		no.variants = this.variants;
	
		return no;
	
	}
	
}
