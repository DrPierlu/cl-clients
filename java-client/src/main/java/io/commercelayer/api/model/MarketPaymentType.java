package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketPaymentType
 */
public class MarketPaymentType extends ApiResource {

	private static final long serialVersionUID = -1482880735298L;


	@JsonExclude
	private String name;
	private Integer marketId;
	private Integer paymentTypeId;
	@JsonExclude
	private String countryCodeRegex;
	@JsonExclude
	private String notCountryCodeRegex;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private String price;
	@JsonExclude
	private String formattedPrice;


	public MarketPaymentType() {
		super();
	}
	

	public MarketPaymentType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
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
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MarketPaymentType x = (MarketPaymentType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.paymentTypeId, x.paymentTypeId)
			&& Objects.equals(this.countryCodeRegex, x.countryCodeRegex)
			&& Objects.equals(this.notCountryCodeRegex, x.notCountryCodeRegex)
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.paymentType, x.paymentType)
			&& Objects.equals(this.price, x.price)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, paymentTypeId, countryCodeRegex, notCountryCodeRegex,
			priceCents, previousChanges, market, paymentType, price,
			formattedPrice 
		);
	
	}
	

	@Override
	public MarketPaymentType clone() {
	
		MarketPaymentType no = new MarketPaymentType();
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.paymentTypeId = this.paymentTypeId;
		no.countryCodeRegex = this.countryCodeRegex;
		no.notCountryCodeRegex = this.notCountryCodeRegex;
		no.priceCents = this.priceCents;
		no.previousChanges = this.previousChanges;
		no.market = this.market;
		no.paymentType = this.paymentType;
		no.price = this.price;
		no.formattedPrice = this.formattedPrice;
	
		return no;
	
	}
	
}
