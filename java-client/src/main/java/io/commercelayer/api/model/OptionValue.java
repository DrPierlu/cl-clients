package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * OptionValue
 */
public class OptionValue extends ApiResource {

	private static final long serialVersionUID = -1482880735306L;


	private String name;
	@JsonExclude
	private String slug;
	private Integer optionTypeId;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setOptionTypeId(Integer optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public Integer getOptionTypeId() {
		return this.optionTypeId;
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
	

	public void setOptionType(Object optionType) {
		this.optionType = optionType;
	}
	

	public Object getOptionType() {
		return this.optionType;
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
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
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
	
		OptionValue x = (OptionValue)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.optionTypeId, x.optionTypeId)
			&& Objects.equals(this.position, x.position)
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
			name, slug, optionTypeId, position, previousChanges,
			optionType, resourceImages, images, translations, variantOptions,
			variants 
		);
	
	}
	

	@Override
	public OptionValue clone() {
	
		OptionValue no = new OptionValue();
	
		no.name = this.name;
		no.slug = this.slug;
		no.optionTypeId = this.optionTypeId;
		no.position = this.position;
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
