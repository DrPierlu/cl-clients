package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * Price
 */
public class Price extends ApiResource {

	private static final long serialVersionUID = -1482845758140L;


	private String priceListId;
	private String sellableId;
	private String sellableResource;
	private String amountCents;
	private String compareAtAmountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private Object sellable;
	private String discountAmount;
	private String formattedDiscountAmount;
	private String amount;
	private String formattedAmount;
	private String compareAtAmount;
	private String formattedCompareAtAmount;
	private String discountPercentage;
	private String discountPercentageRounded;
	private String exchanges;


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
	

	public void setSellableId(String sellableId) {
		this.sellableId = sellableId;
	}
	

	public String getSellableId() {
		return this.sellableId;
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public void setAmountCents(String amountCents) {
		this.amountCents = amountCents;
	}
	

	public String getAmountCents() {
		return this.amountCents;
	}
	

	public void setCompareAtAmountCents(String compareAtAmountCents) {
		this.compareAtAmountCents = compareAtAmountCents;
	}
	

	public String getCompareAtAmountCents() {
		return this.compareAtAmountCents;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public void setSellable(Object sellable) {
		this.sellable = sellable;
	}
	

	public Object getSellable() {
		return this.sellable;
	}
	

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	

	public void setFormattedDiscountAmount(String formattedDiscountAmount) {
		this.formattedDiscountAmount = formattedDiscountAmount;
	}
	

	public String getFormattedDiscountAmount() {
		return this.formattedDiscountAmount;
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public void setCompareAtAmount(String compareAtAmount) {
		this.compareAtAmount = compareAtAmount;
	}
	

	public String getCompareAtAmount() {
		return this.compareAtAmount;
	}
	

	public void setFormattedCompareAtAmount(String formattedCompareAtAmount) {
		this.formattedCompareAtAmount = formattedCompareAtAmount;
	}
	

	public String getFormattedCompareAtAmount() {
		return this.formattedCompareAtAmount;
	}
	

	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	

	public String getDiscountPercentage() {
		return this.discountPercentage;
	}
	

	public void setDiscountPercentageRounded(String discountPercentageRounded) {
		this.discountPercentageRounded = discountPercentageRounded;
	}
	

	public String getDiscountPercentageRounded() {
		return this.discountPercentageRounded;
	}
	

	public void setExchanges(String exchanges) {
		this.exchanges = exchanges;
	}
	

	public String getExchanges() {
		return this.exchanges;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Price x = (Price) o;
	
		return super.equals(o) &&
			Objects.equals(this.priceListId, x.priceListId)  &&
			Objects.equals(this.sellableId, x.sellableId)  &&
			Objects.equals(this.sellableResource, x.sellableResource)  &&
			Objects.equals(this.amountCents, x.amountCents)  &&
			Objects.equals(this.compareAtAmountCents, x.compareAtAmountCents)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.priceList, x.priceList)  &&
			Objects.equals(this.sellable, x.sellable)  &&
			Objects.equals(this.discountAmount, x.discountAmount)  &&
			Objects.equals(this.formattedDiscountAmount, x.formattedDiscountAmount)  &&
			Objects.equals(this.amount, x.amount)  &&
			Objects.equals(this.formattedAmount, x.formattedAmount)  &&
			Objects.equals(this.compareAtAmount, x.compareAtAmount)  &&
			Objects.equals(this.formattedCompareAtAmount, x.formattedCompareAtAmount)  &&
			Objects.equals(this.discountPercentage, x.discountPercentage)  &&
			Objects.equals(this.discountPercentageRounded, x.discountPercentageRounded)  &&
			Objects.equals(this.exchanges, x.exchanges) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, priceListId, sellableId, sellableResource, amountCents,
			compareAtAmountCents, previousChanges, priceList, sellable, discountAmount,
			formattedDiscountAmount, amount, formattedAmount, compareAtAmount, formattedCompareAtAmount,
			discountPercentage, discountPercentageRounded, exchanges 
		);
	
	}
	
}
