package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketPaymentType
 */
public class MarketPaymentType extends ApiResource {

	private static final long serialVersionUID = -1482845758031L;


	private String marketId;
	private String paymentTypeId;
	private String countryCodeRegex;
	private String notCountryCodeRegex;
	private String priceCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object paymentType;
	private String price;
	private String formattedPrice;


	public MarketPaymentType() {
		super();
	}
	

	public MarketPaymentType(Long id) {
		super(id);
	}
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public void setPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public String getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public void setCountryCodeRegex(String countryCodeRegex) {
		this.countryCodeRegex = countryCodeRegex;
	}
	

	public String getCountryCodeRegex() {
		return this.countryCodeRegex;
	}
	

	public void setNotCountryCodeRegex(String notCountryCodeRegex) {
		this.notCountryCodeRegex = notCountryCodeRegex;
	}
	

	public String getNotCountryCodeRegex() {
		return this.notCountryCodeRegex;
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		MarketPaymentType x = (MarketPaymentType) o;
	
		return super.equals(o) &&
			Objects.equals(this.marketId, x.marketId)  &&
			Objects.equals(this.paymentTypeId, x.paymentTypeId)  &&
			Objects.equals(this.countryCodeRegex, x.countryCodeRegex)  &&
			Objects.equals(this.notCountryCodeRegex, x.notCountryCodeRegex)  &&
			Objects.equals(this.priceCents, x.priceCents)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.market, x.market)  &&
			Objects.equals(this.paymentType, x.paymentType)  &&
			Objects.equals(this.price, x.price)  &&
			Objects.equals(this.formattedPrice, x.formattedPrice) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, marketId, paymentTypeId, countryCodeRegex, notCountryCodeRegex,
			priceCents, previousChanges, market, paymentType, price,
			formattedPrice 
		);
	
	}
	
}
