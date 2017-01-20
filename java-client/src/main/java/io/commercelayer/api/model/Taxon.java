package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Taxon
 */
public class Taxon extends ApiResource {

	private static final long serialVersionUID = -1484903989142L;


	private String name;
	private Integer taxonomyId;
	@JsonExclude
	private List<String> ancestorHierarchies;
	@JsonExclude
	private List<String> children;
	@JsonExclude
	private List<String> descendantHierarchies;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private Object parent;
	@JsonExclude
	private Integer parentId;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> selfAndAncestors;
	@JsonExclude
	private List<String> selfAndDescendants;
	@JsonExclude
	private String slug;
	@JsonExclude
	private Object taxonomy;
	@JsonExclude
	private List<String> translations;


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
	

	public Taxon name(String name) {
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
	

	public Taxon slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setTaxonomyId(Integer taxonomyId) {
		this.taxonomyId = taxonomyId;
	}
	

	public Integer getTaxonomyId() {
		return this.taxonomyId;
	}
	

	public Taxon taxonomyId(Integer taxonomyId) {
		setTaxonomyId(taxonomyId);
		return this;
	}
	

	public Integer taxonomyId() {
		return getTaxonomyId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public Taxon position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	

	public Integer getParentId() {
		return this.parentId;
	}
	

	public Taxon parentId(Integer parentId) {
		setParentId(parentId);
		return this;
	}
	

	public Integer parentId() {
		return getParentId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Taxon previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setTaxonomy(Object taxonomy) {
		this.taxonomy = taxonomy;
	}
	

	public Object getTaxonomy() {
		return this.taxonomy;
	}
	

	public Taxon taxonomy(Object taxonomy) {
		setTaxonomy(taxonomy);
		return this;
	}
	

	public Object taxonomy() {
		return getTaxonomy();
	}
	

	public void setParent(Object parent) {
		this.parent = parent;
	}
	

	public Object getParent() {
		return this.parent;
	}
	

	public Taxon parent(Object parent) {
		setParent(parent);
		return this;
	}
	

	public Object parent() {
		return getParent();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Taxon resourceImages(List<String> resourceImages) {
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
	

	public Taxon images(List<String> images) {
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
	

	public Taxon translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public Taxon merchandisingRules(List<String> merchandisingRules) {
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
	

	public Taxon products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setChildren(List<String> children) {
		this.children = children;
	}
	

	public List<String> getChildren() {
		return this.children;
	}
	

	public Taxon children(List<String> children) {
		setChildren(children);
		return this;
	}
	

	public List<String> children() {
		return getChildren();
	}
	

	public void setAncestorHierarchies(List<String> ancestorHierarchies) {
		this.ancestorHierarchies = ancestorHierarchies;
	}
	

	public List<String> getAncestorHierarchies() {
		return this.ancestorHierarchies;
	}
	

	public Taxon ancestorHierarchies(List<String> ancestorHierarchies) {
		setAncestorHierarchies(ancestorHierarchies);
		return this;
	}
	

	public List<String> ancestorHierarchies() {
		return getAncestorHierarchies();
	}
	

	public void setSelfAndAncestors(List<String> selfAndAncestors) {
		this.selfAndAncestors = selfAndAncestors;
	}
	

	public List<String> getSelfAndAncestors() {
		return this.selfAndAncestors;
	}
	

	public Taxon selfAndAncestors(List<String> selfAndAncestors) {
		setSelfAndAncestors(selfAndAncestors);
		return this;
	}
	

	public List<String> selfAndAncestors() {
		return getSelfAndAncestors();
	}
	

	public void setDescendantHierarchies(List<String> descendantHierarchies) {
		this.descendantHierarchies = descendantHierarchies;
	}
	

	public List<String> getDescendantHierarchies() {
		return this.descendantHierarchies;
	}
	

	public Taxon descendantHierarchies(List<String> descendantHierarchies) {
		setDescendantHierarchies(descendantHierarchies);
		return this;
	}
	

	public List<String> descendantHierarchies() {
		return getDescendantHierarchies();
	}
	

	public void setSelfAndDescendants(List<String> selfAndDescendants) {
		this.selfAndDescendants = selfAndDescendants;
	}
	

	public List<String> getSelfAndDescendants() {
		return this.selfAndDescendants;
	}
	

	public Taxon selfAndDescendants(List<String> selfAndDescendants) {
		setSelfAndDescendants(selfAndDescendants);
		return this;
	}
	

	public List<String> selfAndDescendants() {
		return getSelfAndDescendants();
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
	
		no = super.clone(no);
	
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
