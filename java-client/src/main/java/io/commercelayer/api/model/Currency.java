package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Currency
 */
public class Currency extends ApiResource {

	private static final long serialVersionUID = -1484907257063L;


	private String code;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orderValidators;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> priceLists;
	@JsonExclude
	private List<String> prices;


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
	

	public Currency name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public Currency code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Currency previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setPriceLists(List<String> priceLists) {
		this.priceLists = priceLists;
	}
	

	public List<String> getPriceLists() {
		return this.priceLists;
	}
	

	public Currency priceLists(List<String> priceLists) {
		setPriceLists(priceLists);
		return this;
	}
	

	public List<String> priceLists() {
		return getPriceLists();
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public Currency prices(List<String> prices) {
		setPrices(prices);
		return this;
	}
	

	public List<String> prices() {
		return getPrices();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Currency orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setOrderValidators(List<String> orderValidators) {
		this.orderValidators = orderValidators;
	}
	

	public List<String> getOrderValidators() {
		return this.orderValidators;
	}
	

	public Currency orderValidators(List<String> orderValidators) {
		setOrderValidators(orderValidators);
		return this;
	}
	

	public List<String> orderValidators() {
		return getOrderValidators();
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
	
		no = super.clone(no);
	
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
