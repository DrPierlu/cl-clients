package io.commercelayer.api.model;

import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * WireTransfer
 */
public class WireTransfer extends ApiResource {

	private static final long serialVersionUID = -1L;


	private List<String> invoices;
	private String name;
	private List<String> paymentMethods;
	private List<String> transactions;
	private List<String> versions;


	public WireTransfer() {
		super();
	}
	

	public WireTransfer(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public WireTransfer name(String name) {
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
	

	public WireTransfer versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public WireTransfer paymentMethods(List<String> paymentMethods) {
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
	

	public WireTransfer transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public WireTransfer invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		WireTransfer x = (WireTransfer)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.invoices, x.invoices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, paymentMethods, transactions, invoices
			
		);
	
	}
	

	@Override
	public WireTransfer clone() {
	
		WireTransfer no = new WireTransfer();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.paymentMethods = this.paymentMethods;
		no.transactions = this.transactions;
		no.invoices = this.invoices;
	
		return no;
	
	}
	
}
