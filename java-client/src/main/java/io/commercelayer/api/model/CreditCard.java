package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * CreditCard
 */
public class CreditCard extends ApiResource {

	private static final long serialVersionUID = -1482880735278L;


	@JsonExclude
	private String name;
	@JsonExclude
	private String token;
	@JsonExclude
	private String cardResource;
	@JsonExclude
	private String fingerprint;
	private String firstName;
	private String lastName;
	private String number;
	@JsonExclude
	private String lastFourDigits;
	@JsonExclude
	private String firstSixDigits;
	private Integer month;
	private Integer year;
	@JsonExclude
	private String verificationValue;
	@JsonExclude
	private String email;
	@JsonExclude
	private String storageState;
	@JsonExclude
	private String eligibleForCardUpdater;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> paymentMethods;


	public CreditCard() {
		super();
	}
	

	public CreditCard(Long id) {
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
	

	public void setCardResource(String cardResource) {
		this.cardResource = cardResource;
	}
	

	public String getCardResource() {
		return this.cardResource;
	}
	

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	

	public String getFingerprint() {
		return this.fingerprint;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getFirstName() {
		return this.firstName;
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getLastName() {
		return this.lastName;
	}
	

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getNumber() {
		return this.number;
	}
	

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}
	

	public String getLastFourDigits() {
		return this.lastFourDigits;
	}
	

	public void setFirstSixDigits(String firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}
	

	public String getFirstSixDigits() {
		return this.firstSixDigits;
	}
	

	public void setMonth(Integer month) {
		this.month = month;
	}
	

	public Integer getMonth() {
		return this.month;
	}
	

	public void setYear(Integer year) {
		this.year = year;
	}
	

	public Integer getYear() {
		return this.year;
	}
	

	public void setVerificationValue(String verificationValue) {
		this.verificationValue = verificationValue;
	}
	

	public String getVerificationValue() {
		return this.verificationValue;
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
	

	public void setEligibleForCardUpdater(String eligibleForCardUpdater) {
		this.eligibleForCardUpdater = eligibleForCardUpdater;
	}
	

	public String getEligibleForCardUpdater() {
		return this.eligibleForCardUpdater;
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
	
		CreditCard x = (CreditCard)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.cardResource, x.cardResource)
			&& Objects.equals(this.fingerprint, x.fingerprint)
			&& Objects.equals(this.firstName, x.firstName)
			&& Objects.equals(this.lastName, x.lastName)
			&& Objects.equals(this.number, x.number)
			&& Objects.equals(this.lastFourDigits, x.lastFourDigits)
			&& Objects.equals(this.firstSixDigits, x.firstSixDigits)
			&& Objects.equals(this.month, x.month)
			&& Objects.equals(this.year, x.year)
			&& Objects.equals(this.verificationValue, x.verificationValue)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.storageState, x.storageState)
			&& Objects.equals(this.eligibleForCardUpdater, x.eligibleForCardUpdater)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, token, cardResource, fingerprint, firstName,
			lastName, number, lastFourDigits, firstSixDigits, month,
			year, verificationValue, email, storageState, eligibleForCardUpdater,
			previousChanges, transactions, paymentMethods 
		);
	
	}
	

	@Override
	public CreditCard clone() {
	
		CreditCard no = new CreditCard();
	
		no.name = this.name;
		no.token = this.token;
		no.cardResource = this.cardResource;
		no.fingerprint = this.fingerprint;
		no.firstName = this.firstName;
		no.lastName = this.lastName;
		no.number = this.number;
		no.lastFourDigits = this.lastFourDigits;
		no.firstSixDigits = this.firstSixDigits;
		no.month = this.month;
		no.year = this.year;
		no.verificationValue = this.verificationValue;
		no.email = this.email;
		no.storageState = this.storageState;
		no.eligibleForCardUpdater = this.eligibleForCardUpdater;
		no.previousChanges = this.previousChanges;
		no.transactions = this.transactions;
		no.paymentMethods = this.paymentMethods;
	
		return no;
	
	}
	
}
