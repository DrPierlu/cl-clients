package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * MerchandisingRule
 */
public class MerchandisingRule extends ApiResource {

	private static final long serialVersionUID = -1484836418463L;


	private Integer catalogId;
	private Integer productId;
	private Integer taxonId;
	@JsonExclude
	private Object catalog;
	@JsonExclude
	private Object hero;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object product;
	@JsonExclude
	private Object taxon;


	public MerchandisingRule() {
		super();
	}
	

	public MerchandisingRule(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public MerchandisingRule name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	

	public Integer getCatalogId() {
		return this.catalogId;
	}
	

	public MerchandisingRule catalogId(Integer catalogId) {
		setCatalogId(catalogId);
		return this;
	}
	

	public Integer catalogId() {
		return getCatalogId();
	}
	

	public void setTaxonId(Integer taxonId) {
		this.taxonId = taxonId;
	}
	

	public Integer getTaxonId() {
		return this.taxonId;
	}
	

	public MerchandisingRule taxonId(Integer taxonId) {
		setTaxonId(taxonId);
		return this;
	}
	

	public Integer taxonId() {
		return getTaxonId();
	}
	

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	

	public Integer getProductId() {
		return this.productId;
	}
	

	public MerchandisingRule productId(Integer productId) {
		setProductId(productId);
		return this;
	}
	

	public Integer productId() {
		return getProductId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public MerchandisingRule position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setHero(Object hero) {
		this.hero = hero;
	}
	

	public Object getHero() {
		return this.hero;
	}
	

	public MerchandisingRule hero(Object hero) {
		setHero(hero);
		return this;
	}
	

	public Object hero() {
		return getHero();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public MerchandisingRule previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setCatalog(Object catalog) {
		this.catalog = catalog;
	}
	

	public Object getCatalog() {
		return this.catalog;
	}
	

	public MerchandisingRule catalog(Object catalog) {
		setCatalog(catalog);
		return this;
	}
	

	public Object catalog() {
		return getCatalog();
	}
	

	public void setTaxon(Object taxon) {
		this.taxon = taxon;
	}
	

	public Object getTaxon() {
		return this.taxon;
	}
	

	public MerchandisingRule taxon(Object taxon) {
		setTaxon(taxon);
		return this;
	}
	

	public Object taxon() {
		return getTaxon();
	}
	

	public void setProduct(Object product) {
		this.product = product;
	}
	

	public Object getProduct() {
		return this.product;
	}
	

	public MerchandisingRule product(Object product) {
		setProduct(product);
		return this;
	}
	

	public Object product() {
		return getProduct();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MerchandisingRule x = (MerchandisingRule)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.catalogId, x.catalogId)
			&& Objects.equals(this.taxonId, x.taxonId)
			&& Objects.equals(this.productId, x.productId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.hero, x.hero)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.catalog, x.catalog)
			&& Objects.equals(this.taxon, x.taxon)
			&& Objects.equals(this.product, x.product)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, catalogId, taxonId, productId, position,
			hero, previousChanges, catalog, taxon, product
			
		);
	
	}
	

	@Override
	public MerchandisingRule clone() {
	
		MerchandisingRule no = new MerchandisingRule();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.catalogId = this.catalogId;
		no.taxonId = this.taxonId;
		no.productId = this.productId;
		no.position = this.position;
		no.hero = this.hero;
		no.previousChanges = this.previousChanges;
		no.catalog = this.catalog;
		no.taxon = this.taxon;
		no.product = this.product;
	
		return no;
	
	}
	
}
