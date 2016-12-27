package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * Price
 */
public class Price extends ApiResource {

	private static final long serialVersionUID = -1482880735319L;


	@JsonExclude
	private String name;
	private Integer priceListId;
	private Integer sellableId;
	private String sellableResource;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private Integer compareAtAmountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private Object sellable;
	@JsonExclude
	private String discountAmount;
	@JsonExclude
	private String formattedDiscountAmount;
	private String amount;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String compareAtAmount;
	@JsonExclude
	private String formattedCompareAtAmount;
	@JsonExclude
	private String discounted;
	@JsonExclude
	private String discountPercentage;
	@JsonExclude
	private String discountPercentageRounded;
	@JsonExclude
	private String exchanges;


	public Price() {
		super();
	}
	

	public Price(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public void setSellableId(Integer sellableId) {
		this.sellableId = sellableId;
	}
	

	public Integer getSellableId() {
		return this.sellableId;
	}
	

	public void setSellableResource(String sellableResource) {
		this.sellableResource = sellableResource;
	}
	

	public String getSellableResource() {
		return this.sellableResource;
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public void setCompareAtAmountCents(Integer compareAtAmountCents) {
		this.compareAtAmountCents = compareAtAmountCents;
	}
	

	public Integer getCompareAtAmountCents() {
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
	

	public void setDiscounted(String discounted) {
		this.discounted = discounted;
	}
	

	public String getDiscounted() {
		return this.discounted;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Price x = (Price)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
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
			&& Objects.equals(this.discounted, x.discounted)
			&& Objects.equals(this.discountPercentage, x.discountPercentage)
			&& Objects.equals(this.discountPercentageRounded, x.discountPercentageRounded)
			&& Objects.equals(this.exchanges, x.exchanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, priceListId, sellableId, sellableResource, amountCents,
			compareAtAmountCents, previousChanges, priceList, sellable, discountAmount,
			formattedDiscountAmount, amount, formattedAmount, compareAtAmount, formattedCompareAtAmount,
			discounted, discountPercentage, discountPercentageRounded, exchanges 
		);
	
	}
	

	@Override
	public Price clone() {
	
		Price no = new Price();
	
		no.name = this.name;
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
		no.discounted = this.discounted;
		no.discountPercentage = this.discountPercentage;
		no.discountPercentageRounded = this.discountPercentageRounded;
		no.exchanges = this.exchanges;
	
		return no;
	
	}
	
}
