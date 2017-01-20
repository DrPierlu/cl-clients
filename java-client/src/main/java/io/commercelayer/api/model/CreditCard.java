package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * CreditCard
 */
public class CreditCard extends ApiResource {

	private static final long serialVersionUID = -1484903988718L;


	private String firstName;
	private String lastName;
	private Integer month;
	private String number;
	private Integer year;
	@JsonExclude
	private String cardResource;
	@JsonExclude
	private String eligibleForCardUpdater;
	@JsonExclude
	private String email;
	@JsonExclude
	private String fingerprint;
	@JsonExclude
	private String firstSixDigits;
	@JsonExclude
	private String lastFourDigits;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String storageState;
	@JsonExclude
	private String token;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private String verificationValue;


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
	

	public CreditCard name(String name) {
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
	

	public CreditCard token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setCardResource(String cardResource) {
		this.cardResource = cardResource;
	}
	

	public String getCardResource() {
		return this.cardResource;
	}
	

	public CreditCard cardResource(String cardResource) {
		setCardResource(cardResource);
		return this;
	}
	

	public String cardResource() {
		return getCardResource();
	}
	

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	

	public String getFingerprint() {
		return this.fingerprint;
	}
	

	public CreditCard fingerprint(String fingerprint) {
		setFingerprint(fingerprint);
		return this;
	}
	

	public String fingerprint() {
		return getFingerprint();
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getFirstName() {
		return this.firstName;
	}
	

	public CreditCard firstName(String firstName) {
		setFirstName(firstName);
		return this;
	}
	

	public String firstName() {
		return getFirstName();
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getLastName() {
		return this.lastName;
	}
	

	public CreditCard lastName(String lastName) {
		setLastName(lastName);
		return this;
	}
	

	public String lastName() {
		return getLastName();
	}
	

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getNumber() {
		return this.number;
	}
	

	public CreditCard number(String number) {
		setNumber(number);
		return this;
	}
	

	public String number() {
		return getNumber();
	}
	

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}
	

	public String getLastFourDigits() {
		return this.lastFourDigits;
	}
	

	public CreditCard lastFourDigits(String lastFourDigits) {
		setLastFourDigits(lastFourDigits);
		return this;
	}
	

	public String lastFourDigits() {
		return getLastFourDigits();
	}
	

	public void setFirstSixDigits(String firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}
	

	public String getFirstSixDigits() {
		return this.firstSixDigits;
	}
	

	public CreditCard firstSixDigits(String firstSixDigits) {
		setFirstSixDigits(firstSixDigits);
		return this;
	}
	

	public String firstSixDigits() {
		return getFirstSixDigits();
	}
	

	public void setMonth(Integer month) {
		this.month = month;
	}
	

	public Integer getMonth() {
		return this.month;
	}
	

	public CreditCard month(Integer month) {
		setMonth(month);
		return this;
	}
	

	public Integer month() {
		return getMonth();
	}
	

	public void setYear(Integer year) {
		this.year = year;
	}
	

	public Integer getYear() {
		return this.year;
	}
	

	public CreditCard year(Integer year) {
		setYear(year);
		return this;
	}
	

	public Integer year() {
		return getYear();
	}
	

	public void setVerificationValue(String verificationValue) {
		this.verificationValue = verificationValue;
	}
	

	public String getVerificationValue() {
		return this.verificationValue;
	}
	

	public CreditCard verificationValue(String verificationValue) {
		setVerificationValue(verificationValue);
		return this;
	}
	

	public String verificationValue() {
		return getVerificationValue();
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public CreditCard email(String email) {
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
	

	public CreditCard storageState(String storageState) {
		setStorageState(storageState);
		return this;
	}
	

	public String storageState() {
		return getStorageState();
	}
	

	public void setEligibleForCardUpdater(String eligibleForCardUpdater) {
		this.eligibleForCardUpdater = eligibleForCardUpdater;
	}
	

	public String getEligibleForCardUpdater() {
		return this.eligibleForCardUpdater;
	}
	

	public CreditCard eligibleForCardUpdater(String eligibleForCardUpdater) {
		setEligibleForCardUpdater(eligibleForCardUpdater);
		return this;
	}
	

	public String eligibleForCardUpdater() {
		return getEligibleForCardUpdater();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public CreditCard previousChanges(Object previousChanges) {
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
	

	public CreditCard transactions(List<String> transactions) {
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
	

	public CreditCard paymentMethods(List<String> paymentMethods) {
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
	
		no = super.clone(no);
	
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
