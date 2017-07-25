package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PaymentPrice
 */
public class PaymentPrice extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String amount;
	private Integer paymentTypeId;
	private Integer priceListId;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private List<String> versions;


	public PaymentPrice() {
		super();
	}
	

	public PaymentPrice(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PaymentPrice name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public PaymentPrice priceListId(Integer priceListId) {
		setPriceListId(priceListId);
		return this;
	}
	

	public Integer priceListId() {
		return getPriceListId();
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public PaymentPrice paymentTypeId(Integer paymentTypeId) {
		setPaymentTypeId(paymentTypeId);
		return this;
	}
	

	public Integer paymentTypeId() {
		return getPaymentTypeId();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public PaymentPrice amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public PaymentPrice priceList(Object priceList) {
		setPriceList(priceList);
		return this;
	}
	

	public Object priceList() {
		return getPriceList();
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public PaymentPrice paymentType(Object paymentType) {
		setPaymentType(paymentType);
		return this;
	}
	

	public Object paymentType() {
		return getPaymentType();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public PaymentPrice versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public PaymentPrice amount(String amount) {
		setAmount(amount);
		return this;
	}
	

	public String amount() {
		return getAmount();
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public PaymentPrice formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaymentPrice x = (PaymentPrice)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.priceListId, x.priceListId)
			&& Objects.equals(this.paymentTypeId, x.paymentTypeId)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.priceList, x.priceList)
			&& Objects.equals(this.paymentType, x.paymentType)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, priceListId, paymentTypeId, amountCents, priceList,
			paymentType, versions, amount, formattedAmount 
		);
	
	}
	

	@Override
	public PaymentPrice clone() {
	
		PaymentPrice no = new PaymentPrice();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.priceListId = this.priceListId;
		no.paymentTypeId = this.paymentTypeId;
		no.amountCents = this.amountCents;
		no.priceList = this.priceList;
		no.paymentType = this.paymentType;
		no.versions = this.versions;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
	
		return no;
	
	}
	
}
