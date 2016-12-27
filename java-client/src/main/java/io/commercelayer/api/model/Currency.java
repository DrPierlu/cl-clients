package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Currency
 */
public class Currency extends ApiResource {

	private static final long serialVersionUID = -1482845757953L;


	private String code;
	@JsonExclude
	private Object previousChanges;
	private List<String> priceLists;
	private List<String> prices;
	private List<String> orders;
	private List<String> orderValidators;


	public Currency() {
		super();
	}
	

	public Currency(Long id) {
		super(id);
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setPriceLists(List<String> priceLists) {
		this.priceLists = priceLists;
	}
	

	public List<String> getPriceLists() {
		return this.priceLists;
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public void setOrderValidators(List<String> orderValidators) {
		this.orderValidators = orderValidators;
	}
	

	public List<String> getOrderValidators() {
		return this.orderValidators;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Currency x = (Currency) o;
	
		return super.equals(o) &&
			Objects.equals(this.code, x.code)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.priceLists, x.priceLists)  &&
			Objects.equals(this.prices, x.prices)  &&
			Objects.equals(this.orders, x.orders)  &&
			Objects.equals(this.orderValidators, x.orderValidators) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, code, previousChanges, priceLists, prices,
			orders, orderValidators 
		);
	
	}
	
}
