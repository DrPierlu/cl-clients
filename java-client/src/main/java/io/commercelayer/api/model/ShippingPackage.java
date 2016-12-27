package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingPackage
 */
public class ShippingPackage extends ApiResource {

	private static final long serialVersionUID = -1482880735349L;


	private String name;
	@JsonExclude
	private String slug;
	@JsonExclude
	private String description;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;


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
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingPackage x = (ShippingPackage)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, previousChanges, resourceImages,
			images, translations 
		);
	
	}
	

	@Override
	public ShippingPackage clone() {
	
		ShippingPackage no = new ShippingPackage();
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.previousChanges = this.previousChanges;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
	
		return no;
	
	}
	
}
