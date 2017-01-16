package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PaypalAccount
 */
public class PaypalAccount extends ApiResource {

	private static final long serialVersionUID = -1484581108937L;


	private String email;
	private String name;
	private List<String> paymentMethods;
	private String storageState;
	private String token;
	private List<String> transactions;
	@JsonExclude
	private Object previousChanges;


	public PaypalAccount() {
		super();
	}
	

	public PaypalAccount(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PaypalAccount name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public PaypalAccount token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public PaypalAccount email(String email) {
		setEmail(email);
		return this;
	}
	

	public String email() {
		return getEmail();
	}
	

	public void setStorageState(String storageState) {
		this.storageState = storageState;
	}
	

	public String getStorageState() {
		return this.storageState;
	}
	

	public PaypalAccount storageState(String storageState) {
		setStorageState(storageState);
		return this;
	}
	

	public String storageState() {
		return getStorageState();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public PaypalAccount previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public PaypalAccount transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public PaypalAccount paymentMethods(List<String> paymentMethods) {
		setPaymentMethods(paymentMethods);
		return this;
	}
	

	public List<String> paymentMethods() {
		return getPaymentMethods();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaypalAccount x = (PaypalAccount)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.storageState, x.storageState)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, token, email, storageState, previousChanges,
			transactions, paymentMethods 
		);
	
	}
	

	@Override
	public PaypalAccount clone() {
	
		PaypalAccount no = new PaypalAccount();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.token = this.token;
		no.email = this.email;
		no.storageState = this.storageState;
		no.previousChanges = this.previousChanges;
		no.transactions = this.transactions;
		no.paymentMethods = this.paymentMethods;
	
		return no;
	
	}
	
}
