package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Taxonomy
 */
public class Taxonomy extends ApiResource {

	private static final long serialVersionUID = -1482845758312L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	private List<String> resourceImages;
	private List<String> images;
	private List<String> translations;
	private List<String> taxons;
	private List<String> products;


	public Taxonomy() {
		super();
	}
	

	public Taxonomy(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
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
	

	public void setTaxons(List<String> taxons) {
		this.taxons = taxons;
	}
	

	public List<String> getTaxons() {
		return this.taxons;
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Taxonomy x = (Taxonomy) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.images, x.images)  &&
			Objects.equals(this.translations, x.translations)  &&
			Objects.equals(this.taxons, x.taxons)  &&
			Objects.equals(this.products, x.products) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, previousChanges, resourceImages, images,
			translations, taxons, products 
		);
	
	}
	
}
