package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * OptionType
 */
public class OptionType extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	private Integer productTypeId;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> optionValues;
	@JsonExclude
	private Object productType;
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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public OptionType slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public Integer getProductTypeId() {
		return this.productTypeId;
	}
	

	public OptionType productTypeId(Integer productTypeId) {
		setProductTypeId(productTypeId);
		return this;
	}
	

	public Integer productTypeId() {
		return getProductTypeId();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public OptionType versions(List<String> versions) {
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
	

	public void setVariantOptions(List<String> variantOptions) {
		this.variantOptions = variantOptions;
	}
	

	public List<String> getVariantOptions() {
		return this.variantOptions;
	}
	

	public OptionType variantOptions(List<String> variantOptions) {
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
	

	public OptionType variants(List<String> variants) {
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
	

	public OptionType featuredImageId(String featuredImageId) {
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
	

	public OptionType featuredImage(Object featuredImage) {
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
	
		OptionType x = (OptionType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.optionValues, x.optionValues)
			&& Objects.equals(this.variantOptions, x.variantOptions)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, productTypeId, productType, versions,
			resourceImages, images, translations, optionValues, variantOptions,
			variants, featuredImageId, featuredImage 
		);
	
	}
	

	@Override
	public OptionType clone() {
	
		OptionType no = new OptionType();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.slug = this.slug;
		no.productTypeId = this.productTypeId;
		no.productType = this.productType;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.optionValues = this.optionValues;
		no.variantOptions = this.variantOptions;
		no.variants = this.variants;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
	
		return no;
	
	}
	
}
