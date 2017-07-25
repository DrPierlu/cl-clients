package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * OptionValue
 */
public class OptionValue extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	private Integer optionTypeId;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private String slug;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> variantOptions;
	@JsonExclude
	private List<String> variants;
	@JsonExclude
	private List<String> versions;


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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public OptionValue slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setOptionTypeId(Integer optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public Integer getOptionTypeId() {
		return this.optionTypeId;
	}
	

	public OptionValue optionTypeId(Integer optionTypeId) {
		setOptionTypeId(optionTypeId);
		return this;
	}
	

	public Integer optionTypeId() {
		return getOptionTypeId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public OptionValue position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public OptionValue versions(List<String> versions) {
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
	

	public void setFeaturedImageId(String featuredImageId) {
		this.featuredImageId = featuredImageId;
	}
	

	public String getFeaturedImageId() {
		return this.featuredImageId;
	}
	

	public OptionValue featuredImageId(String featuredImageId) {
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
	

	public OptionValue featuredImage(Object featuredImage) {
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
	
		OptionValue x = (OptionValue)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.optionTypeId, x.optionTypeId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.optionType, x.optionType)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.variantOptions, x.variantOptions)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, optionTypeId, position, optionType,
			versions, resourceImages, images, translations, variantOptions,
			variants, featuredImageId, featuredImage 
		);
	
	}
	

	@Override
	public OptionValue clone() {
	
		OptionValue no = new OptionValue();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.slug = this.slug;
		no.optionTypeId = this.optionTypeId;
		no.position = this.position;
		no.optionType = this.optionType;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.variantOptions = this.variantOptions;
		no.variants = this.variants;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
	
		return no;
	
	}
	
}
