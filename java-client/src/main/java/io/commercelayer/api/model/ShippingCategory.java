package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingCategory
 */
public class ShippingCategory extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> shippingServiceCategories;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private List<String> variants;


	public ShippingCategory() {
		super();
	}
	

	public ShippingCategory(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingCategory name(String name) {
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
	

	public ShippingCategory previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public ShippingCategory products(List<String> products) {
		setProducts(products);
		return this;
	}
	

	public List<String> products() {
		return getProducts();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public ShippingCategory variants(List<String> variants) {
		setVariants(variants);
		return this;
	}
	

	public List<String> variants() {
		return getVariants();
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public ShippingCategory shippingServiceCategories(List<String> shippingServiceCategories) {
		setShippingServiceCategories(shippingServiceCategories);
		return this;
	}
	

	public List<String> shippingServiceCategories() {
		return getShippingServiceCategories();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public ShippingCategory lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public ShippingCategory shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingCategory x = (ShippingCategory)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.products, x.products)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.shippingServiceCategories, x.shippingServiceCategories)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.shippingServices, x.shippingServices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, products, variants, shippingServiceCategories,
			lineItemStocks, shippingServices 
		);
	
	}
	

	@Override
	public ShippingCategory clone() {
	
		ShippingCategory no = new ShippingCategory();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.products = this.products;
		no.variants = this.variants;
		no.shippingServiceCategories = this.shippingServiceCategories;
		no.lineItemStocks = this.lineItemStocks;
		no.shippingServices = this.shippingServices;
	
		return no;
	
	}
	
}
