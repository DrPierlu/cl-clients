package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * MerchandisingRule
 */
public class MerchandisingRule extends ApiResource {

	private static final long serialVersionUID = -1483024665710L;


	private String catalogId;
	private String productId;
	private String taxonId;
	@JsonExclude
	private Object catalog;
	@JsonExclude
	private String hero;
	@JsonExclude
	private String position;
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
	

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	

	public String getCatalogId() {
		return this.catalogId;
	}
	

	public MerchandisingRule catalogId(String catalogId) {
		setCatalogId(catalogId);
		return this;
	}
	

	public String catalogId() {
		return getCatalogId();
	}
	

	public void setTaxonId(String taxonId) {
		this.taxonId = taxonId;
	}
	

	public String getTaxonId() {
		return this.taxonId;
	}
	

	public MerchandisingRule taxonId(String taxonId) {
		setTaxonId(taxonId);
		return this;
	}
	

	public String taxonId() {
		return getTaxonId();
	}
	

	public void setProductId(String productId) {
		this.productId = productId;
	}
	

	public String getProductId() {
		return this.productId;
	}
	

	public MerchandisingRule productId(String productId) {
		setProductId(productId);
		return this;
	}
	

	public String productId() {
		return getProductId();
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public MerchandisingRule position(String position) {
		setPosition(position);
		return this;
	}
	

	public String position() {
		return getPosition();
	}
	

	public void setHero(String hero) {
		this.hero = hero;
	}
	

	public String getHero() {
		return this.hero;
	}
	

	public MerchandisingRule hero(String hero) {
		setHero(hero);
		return this;
	}
	

	public String hero() {
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
			catalogId, taxonId, productId, position, hero,
			previousChanges, catalog, taxon, product 
		);
	
	}
	

	@Override
	public MerchandisingRule clone() {
	
		MerchandisingRule no = new MerchandisingRule();
	
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
