package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Catalog
 */
public class Catalog extends ApiResource {

	private static final long serialVersionUID = -1484566577527L;


	private String name;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> taxonomies;
	@JsonExclude
	private List<String> taxons;


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
	

	public Catalog name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Catalog previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public Catalog merchandisingRules(List<String> merchandisingRules) {
		setMerchandisingRules(merchandisingRules);
		return this;
	}
	

	public List<String> merchandisingRules() {
		return getMerchandisingRules();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public Catalog products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setTaxons(List<String> taxons) {
		this.taxons = taxons;
	}
	

	public List<String> getTaxons() {
		return this.taxons;
	}
	

	public Catalog taxons(List<String> taxons) {
		setTaxons(taxons);
		return this;
	}
	

	public List<String> taxons() {
		return getTaxons();
	}
	

	public void setTaxonomies(List<String> taxonomies) {
		this.taxonomies = taxonomies;
	}
	

	public List<String> getTaxonomies() {
		return this.taxonomies;
	}
	

	public Catalog taxonomies(List<String> taxonomies) {
		setTaxonomies(taxonomies);
		return this;
	}
	

	public List<String> taxonomies() {
		return getTaxonomies();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Catalog x = (Catalog)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.merchandisingRules, x.merchandisingRules)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.taxons, x.taxons)
			&& Objects.equals(this.taxonomies, x.taxonomies)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, merchandisingRules, products, taxons,
			taxonomies 
		);
	
	}
	

	@Override
	public Catalog clone() {
	
		Catalog no = new Catalog();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.merchandisingRules = this.merchandisingRules;
		no.products = this.products;
		no.taxons = this.taxons;
		no.taxonomies = this.taxonomies;
	
		return no;
	
	}
	
}
