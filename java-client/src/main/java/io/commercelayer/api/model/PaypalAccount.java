package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PaypalAccount
 */
public class PaypalAccount extends ApiResource {

	private static final long serialVersionUID = -1482880735317L;


	private String name;
	private String token;
	private String email;
	private String storageState;
	@JsonExclude
	private Object previousChanges;
	private List<String> transactions;
	private List<String> paymentMethods;


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
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public void setStorageState(String storageState) {
		this.storageState = storageState;
	}
	

	public String getStorageState() {
		return this.storageState;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
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
