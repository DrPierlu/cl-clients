package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Currency
 */
public class Currency extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String code;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private List<String> customsItems;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orderValidators;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> priceLists;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> versions;


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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Currency versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public Currency countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
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
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Currency lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public Currency transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setCustomsItems(List<String> customsItems) {
		this.customsItems = customsItems;
	}
	

	public List<String> getCustomsItems() {
		return this.customsItems;
	}
	

	public Currency customsItems(List<String> customsItems) {
		setCustomsItems(customsItems);
		return this;
	}
	

	public List<String> customsItems() {
		return getCustomsItems();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public Currency invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Currency x = (Currency)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.countries, x.countries)
			&& Objects.equals(this.priceLists, x.priceLists)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.orderValidators, x.orderValidators)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.customsItems, x.customsItems)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.prices, x.prices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, code, versions, countries, priceLists,
			orders, orderValidators, lineItems, transactions, customsItems,
			invoices, prices 
		);
	
	}
	

	@Override
	public Currency clone() {
	
		Currency no = new Currency();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.code = this.code;
		no.versions = this.versions;
		no.countries = this.countries;
		no.priceLists = this.priceLists;
		no.orders = this.orders;
		no.orderValidators = this.orderValidators;
		no.lineItems = this.lineItems;
		no.transactions = this.transactions;
		no.customsItems = this.customsItems;
		no.invoices = this.invoices;
		no.prices = this.prices;
	
		return no;
	
	}
	
}
