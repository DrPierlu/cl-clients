package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingPackage
 */
public class ShippingPackage extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private String description;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String featuredImageId;
	@JsonExclude
	private Float height;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private String kind;
	@JsonExclude
	private Float length;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private String slug;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> versions;
	@JsonExclude
	private Float width;


	public ShippingPackage() {
		super();
	}
	

	public ShippingPackage(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingPackage name(String name) {
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
	

	public ShippingPackage slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public ShippingPackage description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setLength(Float length) {
		this.length = length;
	}
	

	public Float getLength() {
		return this.length;
	}
	

	public ShippingPackage length(Float length) {
		setLength(length);
		return this;
	}
	

	public Float length() {
		return getLength();
	}
	

	public void setWidth(Float width) {
		this.width = width;
	}
	

	public Float getWidth() {
		return this.width;
	}
	

	public ShippingPackage width(Float width) {
		setWidth(width);
		return this;
	}
	

	public Float width() {
		return getWidth();
	}
	

	public void setHeight(Float height) {
		this.height = height;
	}
	

	public Float getHeight() {
		return this.height;
	}
	

	public ShippingPackage height(Float height) {
		setHeight(height);
		return this;
	}
	

	public Float height() {
		return getHeight();
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public ShippingPackage kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingPackage versions(List<String> versions) {
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
	

	public ShippingPackage resourceImages(List<String> resourceImages) {
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
	

	public ShippingPackage images(List<String> images) {
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
	

	public ShippingPackage translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public ShippingPackage shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	public void setFeaturedImageId(String featuredImageId) {
		this.featuredImageId = featuredImageId;
	}
	

	public String getFeaturedImageId() {
		return this.featuredImageId;
	}
	

	public ShippingPackage featuredImageId(String featuredImageId) {
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
	

	public ShippingPackage featuredImage(Object featuredImage) {
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
	
		ShippingPackage x = (ShippingPackage)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.length, x.length)
			&& Objects.equals(this.width, x.width)
			&& Objects.equals(this.height, x.height)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.featuredImageId, x.featuredImageId)
			&& Objects.equals(this.featuredImage, x.featuredImage)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, length, width,
			height, kind, versions, resourceImages, images,
			translations, shippingMethods, featuredImageId, featuredImage 
		);
	
	}
	

	@Override
	public ShippingPackage clone() {
	
		ShippingPackage no = new ShippingPackage();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.length = this.length;
		no.width = this.width;
		no.height = this.height;
		no.kind = this.kind;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.shippingMethods = this.shippingMethods;
		no.featuredImageId = this.featuredImageId;
		no.featuredImage = this.featuredImage;
	
		return no;
	
	}
	
}
