package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * Price
 */
public class Price extends ApiResource {

	private static final long serialVersionUID = -1483006114307L;


	private String amount;
	private String priceListId;
	private String sellableId;
	private String sellableResource;
	@JsonExclude
	private String amountCents;
	@JsonExclude
	private String compareAtAmount;
	@JsonExclude
	private String compareAtAmountCents;
	@JsonExclude
	private String discountAmount;
	@JsonExclude
	private String discountPercentage;
	@JsonExclude
	private String discountPercentageRounded;
	@JsonExclude
	private String exchanges;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedCompareAtAmount;
	@JsonExclude
	private String formattedDiscountAmount;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private Object sellable;


	public Price() {
		super();
	}
	

	public Price(Long id) {
		super(id);
	}
	

	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	

	public String getPriceListId() {
		return this.priceListId;
	}
	

	public Price priceListId(String priceListId) {
		setPriceListId(priceListId);
		return this;
	}
	

	public String priceListId() {
		return getPriceListId();
	}
	

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}
	

	public String getSellableId() {
		return this.sellableId;
	}
	

	public Price sellableId(String sellableId) {
		setSellableId(sellableId);
		return this;
	}
	

	public String sellableId() {
		return getSellableId();
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public Price sellableResource(String sellableResource) {
		setSellableResource(sellableResource);
		return this;
	}
	

	public String sellableResource() {
		return getSellableResource();
	}
	

	public void setAmountCents(String amountCents) {
		this.amountCents = amountCents;
	}
	

	public String getAmountCents() {
		return this.amountCents;
	}
	

	public Price amountCents(String amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public String amountCents() {
		return getAmountCents();
	}
	

	public void setCompareAtAmountCents(String compareAtAmountCents) {
		this.compareAtAmountCents = compareAtAmountCents;
	}
	

	public String getCompareAtAmountCents() {
		return this.compareAtAmountCents;
	}
	

	public Price compareAtAmountCents(String compareAtAmountCents) {
		setCompareAtAmountCents(compareAtAmountCents);
		return this;
	}
	

	public String compareAtAmountCents() {
		return getCompareAtAmountCents();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Price previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public Price priceList(Object priceList) {
		setPriceList(priceList);
		return this;
	}
	

	public Object priceList() {
		return getPriceList();
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public Price sellable(Object sellable) {
		setSellable(sellable);
		return this;
	}
	

	public Object sellable() {
		return getSellable();
	}
	

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	

	public Price discountAmount(String discountAmount) {
		setDiscountAmount(discountAmount);
		return this;
	}
	

	public String discountAmount() {
		return getDiscountAmount();
	}
	

	public void setFormattedDiscountAmount(String formattedDiscountAmount) {
		this.formattedDiscountAmount = formattedDiscountAmount;
	}
	

	public String getFormattedDiscountAmount() {
		return this.formattedDiscountAmount;
	}
	

	public Price formattedDiscountAmount(String formattedDiscountAmount) {
		setFormattedDiscountAmount(formattedDiscountAmount);
		return this;
	}
	

	public String formattedDiscountAmount() {
		return getFormattedDiscountAmount();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public Price amount(String amount) {
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
	

	public Price formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setCompareAtAmount(String compareAtAmount) {
		this.compareAtAmount = compareAtAmount;
	}
	

	public String getCompareAtAmount() {
		return this.compareAtAmount;
	}
	

	public Price compareAtAmount(String compareAtAmount) {
		setCompareAtAmount(compareAtAmount);
		return this;
	}
	

	public String compareAtAmount() {
		return getCompareAtAmount();
	}
	

	public void setFormattedCompareAtAmount(String formattedCompareAtAmount) {
		this.formattedCompareAtAmount = formattedCompareAtAmount;
	}
	

	public String getFormattedCompareAtAmount() {
		return this.formattedCompareAtAmount;
	}
	

	public Price formattedCompareAtAmount(String formattedCompareAtAmount) {
		setFormattedCompareAtAmount(formattedCompareAtAmount);
		return this;
	}
	

	public String formattedCompareAtAmount() {
		return getFormattedCompareAtAmount();
	}
	

	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	

	public String getDiscountPercentage() {
		return this.discountPercentage;
	}
	

	public Price discountPercentage(String discountPercentage) {
		setDiscountPercentage(discountPercentage);
		return this;
	}
	

	public String discountPercentage() {
		return getDiscountPercentage();
	}
	

	public void setDiscountPercentageRounded(String discountPercentageRounded) {
		this.discountPercentageRounded = discountPercentageRounded;
	}
	

	public String getDiscountPercentageRounded() {
		return this.discountPercentageRounded;
	}
	

	public Price discountPercentageRounded(String discountPercentageRounded) {
		setDiscountPercentageRounded(discountPercentageRounded);
		return this;
	}
	

	public String discountPercentageRounded() {
		return getDiscountPercentageRounded();
	}
	

	public void setExchanges(String exchanges) {
		this.exchanges = exchanges;
	}
	

	public String getExchanges() {
		return this.exchanges;
	}
	

	public Price exchanges(String exchanges) {
		setExchanges(exchanges);
		return this;
	}
	

	public String exchanges() {
		return getExchanges();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Price x = (Price)o;
	
		return super.equals(o)
			&& Objects.equals(this.priceListId, x.priceListId)
			&& Objects.equals(this.sellableId, x.sellableId)
			&& Objects.equals(this.sellableResource, x.sellableResource)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.compareAtAmountCents, x.compareAtAmountCents)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.priceList, x.priceList)
			&& Objects.equals(this.sellable, x.sellable)
			&& Objects.equals(this.discountAmount, x.discountAmount)
			&& Objects.equals(this.formattedDiscountAmount, x.formattedDiscountAmount)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.compareAtAmount, x.compareAtAmount)
			&& Objects.equals(this.formattedCompareAtAmount, x.formattedCompareAtAmount)
			&& Objects.equals(this.discountPercentage, x.discountPercentage)
			&& Objects.equals(this.discountPercentageRounded, x.discountPercentageRounded)
			&& Objects.equals(this.exchanges, x.exchanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			priceListId, sellableId, sellableResource, amountCents, compareAtAmountCents,
			previousChanges, priceList, sellable, discountAmount, formattedDiscountAmount,
			amount, formattedAmount, compareAtAmount, formattedCompareAtAmount, discountPercentage,
			discountPercentageRounded, exchanges 
		);
	
	}
	

	@Override
	public Price clone() {
	
		Price no = new Price();
	
		no.priceListId = this.priceListId;
		no.sellableId = this.sellableId;
		no.sellableResource = this.sellableResource;
		no.amountCents = this.amountCents;
		no.compareAtAmountCents = this.compareAtAmountCents;
		no.previousChanges = this.previousChanges;
		no.priceList = this.priceList;
		no.sellable = this.sellable;
		no.discountAmount = this.discountAmount;
		no.formattedDiscountAmount = this.formattedDiscountAmount;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.compareAtAmount = this.compareAtAmount;
		no.formattedCompareAtAmount = this.formattedCompareAtAmount;
		no.discountPercentage = this.discountPercentage;
		no.discountPercentageRounded = this.discountPercentageRounded;
		no.exchanges = this.exchanges;
	
		return no;
	
	}
	
}
