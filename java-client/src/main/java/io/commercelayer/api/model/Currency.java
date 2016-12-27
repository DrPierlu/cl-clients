package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Currency
 */
public class Currency extends ApiResource {

	private static final long serialVersionUID = -1482880735279L;


	@JsonExclude
	private String name;
	private String code;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> priceLists;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> orderValidators;


	public Currency() {
		super();
	}
	

	public Currency(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Currency x = (Currency)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.priceLists, x.priceLists)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.orderValidators, x.orderValidators)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, code, previousChanges, priceLists, prices,
			orders, orderValidators 
		);
	
	}
	

	@Override
	public Currency clone() {
	
		Currency no = new Currency();
	
		no.name = this.name;
		no.code = this.code;
		no.previousChanges = this.previousChanges;
		no.priceLists = this.priceLists;
		no.prices = this.prices;
		no.orders = this.orders;
		no.orderValidators = this.orderValidators;
	
		return no;
	
	}
	
}
