package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Channel
 */
public class Channel extends ApiResource {

	private static final long serialVersionUID = -1482880735271L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private Object authCredentials;


	public Channel() {
		super();
	}
	

	public Channel(Long id) {
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
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setAuthCredentials(Object authCredentials) {
		this.authCredentials = authCredentials;
	}
	

	public Object getAuthCredentials() {
		return this.authCredentials;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Channel x = (Channel)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.authCredentials, x.authCredentials)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, orders, markets, lineItems,
			shippingMethods, paymentMethods, transactions, lineItemStocks, authCredentials
			
		);
	
	}
	

	@Override
	public Channel clone() {
	
		Channel no = new Channel();
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.orders = this.orders;
		no.markets = this.markets;
		no.lineItems = this.lineItems;
		no.shippingMethods = this.shippingMethods;
		no.paymentMethods = this.paymentMethods;
		no.transactions = this.transactions;
		no.lineItemStocks = this.lineItemStocks;
		no.authCredentials = this.authCredentials;
	
		return no;
	
	}
	
}
