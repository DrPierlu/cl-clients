package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Gateway
 */
public class Gateway extends ApiResource {

	private static final long serialVersionUID = -1484903988757L;


	private String kind;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Integer merchantId;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String token;
	@JsonExclude
	private List<String> transactions;


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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Gateway previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, merchantId, kind, token, previousChanges,
			merchant, transactions, paymentTypes 
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
		no.previousChanges = this.previousChanges;
		no.merchant = this.merchant;
		no.transactions = this.transactions;
		no.paymentTypes = this.paymentTypes;
	
		return no;
	
	}
	
}
