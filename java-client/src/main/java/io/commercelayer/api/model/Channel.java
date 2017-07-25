package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Channel
 */
public class Channel extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private Object authCredentials;
	@JsonExclude
	private String code;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private List<String> customers;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> versions;


	public Channel() {
		super();
	}
	

	public Channel(Long id) {
		super(id);
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public Channel code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Channel name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Channel versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Channel orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public Channel markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public Channel invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public Channel countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Channel lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public Channel shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public Channel paymentMethods(List<String> paymentMethods) {
		setPaymentMethods(paymentMethods);
		return this;
	}
	

	public List<String> paymentMethods() {
		return getPaymentMethods();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public Channel transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Channel lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	

	public List<String> getCustomers() {
		return this.customers;
	}
	

	public Channel customers(List<String> customers) {
		setCustomers(customers);
		return this;
	}
	

	public List<String> customers() {
		return getCustomers();
	}
	

	public void setAuthCredentials(Object authCredentials) {
		this.authCredentials = authCredentials;
	}
	

	public Object getAuthCredentials() {
		return this.authCredentials;
	}
	

	public Channel authCredentials(Object authCredentials) {
		setAuthCredentials(authCredentials);
		return this;
	}
	

	public Object authCredentials() {
		return getAuthCredentials();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Channel x = (Channel)o;
	
		return super.equals(o)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.countries, x.countries)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.customers, x.customers)
			&& Objects.equals(this.authCredentials, x.authCredentials)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			code, name, versions, orders, markets,
			invoices, countries, lineItems, shippingMethods, paymentMethods,
			transactions, lineItemStocks, customers, authCredentials 
		);
	
	}
	

	@Override
	public Channel clone() {
	
		Channel no = new Channel();
	
		no = super.clone(no);
	
		no.code = this.code;
		no.name = this.name;
		no.versions = this.versions;
		no.orders = this.orders;
		no.markets = this.markets;
		no.invoices = this.invoices;
		no.countries = this.countries;
		no.lineItems = this.lineItems;
		no.shippingMethods = this.shippingMethods;
		no.paymentMethods = this.paymentMethods;
		no.transactions = this.transactions;
		no.lineItemStocks = this.lineItemStocks;
		no.customers = this.customers;
		no.authCredentials = this.authCredentials;
	
		return no;
	
	}
	
}
