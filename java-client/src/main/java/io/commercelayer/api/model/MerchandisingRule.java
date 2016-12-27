package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MerchandisingRule
 */
public class MerchandisingRule extends ApiResource {

	private static final long serialVersionUID = -1482845758062L;


	private String catalogId;
	private String taxonId;
	private String productId;
	private String position;
	private String hero;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object catalog;
	@JsonExclude
	private Object taxon;
	@JsonExclude
	private Object product;


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
	

	public void setTaxonId(String taxonId) {
		this.taxonId = taxonId;
	}
	

	public String getTaxonId() {
		return this.taxonId;
	}
	

	public void setProductId(String productId) {
		this.productId = productId;
	}
	

	public String getProductId() {
		return this.productId;
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public void setHero(String hero) {
		this.hero = hero;
	}
	

	public String getHero() {
		return this.hero;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCatalog(Object catalog) {
		this.catalog = catalog;
	}
	

	public Object getCatalog() {
		return this.catalog;
	}
	

	public void setTaxon(Object taxon) {
		this.taxon = taxon;
	}
	

	public Object getTaxon() {
		return this.taxon;
	}
	

	public void setProduct(Object product) {
		this.product = product;
	}
	

	public Object getProduct() {
		return this.product;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		MerchandisingRule x = (MerchandisingRule) o;
	
		return super.equals(o) &&
			Objects.equals(this.catalogId, x.catalogId)  &&
			Objects.equals(this.taxonId, x.taxonId)  &&
			Objects.equals(this.productId, x.productId)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.hero, x.hero)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.catalog, x.catalog)  &&
			Objects.equals(this.taxon, x.taxon)  &&
			Objects.equals(this.product, x.product) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, catalogId, taxonId, productId, position,
			hero, previousChanges, catalog, taxon, product
			
		);
	
	}
	
}
