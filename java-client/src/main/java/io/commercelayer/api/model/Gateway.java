package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Gateway
 */
public class Gateway extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String kind;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Integer merchantId;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private String token;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> versions;


	public Gateway() {
		super();
	}
	

	public Gateway(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Gateway name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public Gateway merchantId(Integer merchantId) {
		setMerchantId(merchantId);
		return this;
	}
	

	public Integer merchantId() {
		return getMerchantId();
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public Gateway kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public Gateway token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public Gateway merchant(Object merchant) {
		setMerchant(merchant);
		return this;
	}
	

	public Object merchant() {
		return getMerchant();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Gateway versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public Gateway transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public Gateway paymentTypes(List<String> paymentTypes) {
		setPaymentTypes(paymentTypes);
		return this;
	}
	

	public List<String> paymentTypes() {
		return getPaymentTypes();
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public Gateway paymentMethods(List<String> paymentMethods) {
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
	
		Gateway x = (Gateway)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.merchantId, x.merchantId)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, merchantId, kind, token, merchant,
			versions, transactions, paymentTypes, paymentMethods 
		);
	
	}
	

	@Override
	public Gateway clone() {
	
		Gateway no = new Gateway();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.merchantId = this.merchantId;
		no.kind = this.kind;
		no.token = this.token;
		no.merchant = this.merchant;
		no.versions = this.versions;
		no.transactions = this.transactions;
		no.paymentTypes = this.paymentTypes;
		no.paymentMethods = this.paymentMethods;
	
		return no;
	
	}
	
}
