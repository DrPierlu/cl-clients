package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Taxon
 */
public class Taxon extends ApiResource {

	private static final long serialVersionUID = -1482880735361L;


	private String name;
	@JsonExclude
	private String slug;
	private Integer taxonomyId;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Integer parentId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object taxonomy;
	@JsonExclude
	private Object parent;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> children;
	@JsonExclude
	private List<String> ancestorHierarchies;
	@JsonExclude
	private List<String> selfAndAncestors;
	@JsonExclude
	private List<String> descendantHierarchies;
	@JsonExclude
	private List<String> selfAndDescendants;


	public Taxon() {
		super();
	}
	

	public Taxon(Long id) {
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
	

	public void setTaxonomyId(Integer taxonomyId) {
		this.taxonomyId = taxonomyId;
	}
	

	public Integer getTaxonomyId() {
		return this.taxonomyId;
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	

	public Integer getParentId() {
		return this.parentId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setTaxonomy(Object taxonomy) {
		this.taxonomy = taxonomy;
	}
	

	public Object getTaxonomy() {
		return this.taxonomy;
	}
	

	public void setParent(Object parent) {
		this.parent = parent;
	}
	

	public Object getParent() {
		return this.parent;
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
	

	public void setChildren(List<String> children) {
		this.children = children;
	}
	

	public List<String> getChildren() {
		return this.children;
	}
	

	public void setAncestorHierarchies(List<String> ancestorHierarchies) {
		this.ancestorHierarchies = ancestorHierarchies;
	}
	

	public List<String> getAncestorHierarchies() {
		return this.ancestorHierarchies;
	}
	

	public void setSelfAndAncestors(List<String> selfAndAncestors) {
		this.selfAndAncestors = selfAndAncestors;
	}
	

	public List<String> getSelfAndAncestors() {
		return this.selfAndAncestors;
	}
	

	public void setDescendantHierarchies(List<String> descendantHierarchies) {
		this.descendantHierarchies = descendantHierarchies;
	}
	

	public List<String> getDescendantHierarchies() {
		return this.descendantHierarchies;
	}
	

	public void setSelfAndDescendants(List<String> selfAndDescendants) {
		this.selfAndDescendants = selfAndDescendants;
	}
	

	public List<String> getSelfAndDescendants() {
		return this.selfAndDescendants;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Taxon x = (Taxon)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.taxonomyId, x.taxonomyId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.parentId, x.parentId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.taxonomy, x.taxonomy)
			&& Objects.equals(this.parent, x.parent)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.merchandisingRules, x.merchandisingRules)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.children, x.children)
			&& Objects.equals(this.ancestorHierarchies, x.ancestorHierarchies)
			&& Objects.equals(this.selfAndAncestors, x.selfAndAncestors)
			&& Objects.equals(this.descendantHierarchies, x.descendantHierarchies)
			&& Objects.equals(this.selfAndDescendants, x.selfAndDescendants)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, taxonomyId, position, parentId,
			previousChanges, taxonomy, parent, resourceImages, images,
			translations, merchandisingRules, products, children, ancestorHierarchies,
			selfAndAncestors, descendantHierarchies, selfAndDescendants 
		);
	
	}
	

	@Override
	public Taxon clone() {
	
		Taxon no = new Taxon();
	
		no.name = this.name;
		no.slug = this.slug;
		no.taxonomyId = this.taxonomyId;
		no.position = this.position;
		no.parentId = this.parentId;
		no.previousChanges = this.previousChanges;
		no.taxonomy = this.taxonomy;
		no.parent = this.parent;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.merchandisingRules = this.merchandisingRules;
		no.products = this.products;
		no.children = this.children;
		no.ancestorHierarchies = this.ancestorHierarchies;
		no.selfAndAncestors = this.selfAndAncestors;
		no.descendantHierarchies = this.descendantHierarchies;
		no.selfAndDescendants = this.selfAndDescendants;
	
		return no;
	
	}
	
}
