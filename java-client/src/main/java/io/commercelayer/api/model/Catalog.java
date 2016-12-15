package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Catalog
 */
public class Catalog extends ApiResource {

	private static final long serialVersionUID = -1481805605652L;


	private String name;
	private String description;
	@JsonExclude
	private Object previousChanges;
	private List<String> merchandisingRules;
	private List<String> products;
	private List<String> taxons;
	private List<String> taxonomies;


	public Catalog() {
		super();
	}
	

	public Catalog(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
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
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public void setTaxons(List<String> taxons) {
		this.taxons = taxons;
	}
	

	public List<String> getTaxons() {
		return this.taxons;
	}
	

	public void setTaxonomies(List<String> taxonomies) {
		this.taxonomies = taxonomies;
	}
	

	public List<String> getTaxonomies() {
		return this.taxonomies;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Catalog x = (Catalog) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.description, x.description)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.merchandisingRules, x.merchandisingRules)  &&
			Objects.equals(this.products, x.products)  &&
			Objects.equals(this.taxons, x.taxons)  &&
			Objects.equals(this.taxonomies, x.taxonomies) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, description, previousChanges, merchandisingRules,
			products, taxons, taxonomies 
		);
	
	}
	
}
