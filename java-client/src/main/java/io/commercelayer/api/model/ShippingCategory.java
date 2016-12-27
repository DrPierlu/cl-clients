package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingCategory
 */
public class ShippingCategory extends ApiResource {

	private static final long serialVersionUID = -1482880735344L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> products;
	@JsonExclude
	private List<String> variants;
	@JsonExclude
	private List<String> shippingServiceCategories;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> shippingServices;


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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setProducts(List<String> products) {
		this.products = products;
	}
	

	public List<String> getProducts() {
		return this.products;
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public void setShippingServiceCategories(List<String> shippingServiceCategories) {
		this.shippingServiceCategories = shippingServiceCategories;
	}
	

	public List<String> getShippingServiceCategories() {
		return this.shippingServiceCategories;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
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
