package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * MarketPaymentType
 */
public class MarketPaymentType extends ApiResource {

	private static final long serialVersionUID = -1484907257161L;


	private Integer marketId;
	private Integer paymentTypeId;
	@JsonExclude
	private String countryCodeRegex;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String name;
	@JsonExclude
	private String notCountryCodeRegex;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String price;
	@JsonExclude
	private Integer priceCents;


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
	

	public MarketPaymentType name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public MarketPaymentType marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public MarketPaymentType paymentTypeId(Integer paymentTypeId) {
		setPaymentTypeId(paymentTypeId);
		return this;
	}
	

	public Integer paymentTypeId() {
		return getPaymentTypeId();
	}
	

	public void setCountryCodeRegex(String countryCodeRegex) {
		this.countryCodeRegex = countryCodeRegex;
	}
	

	public String getCountryCodeRegex() {
		return this.countryCodeRegex;
	}
	

	public MarketPaymentType countryCodeRegex(String countryCodeRegex) {
		setCountryCodeRegex(countryCodeRegex);
		return this;
	}
	

	public String countryCodeRegex() {
		return getCountryCodeRegex();
	}
	

	public void setNotCountryCodeRegex(String notCountryCodeRegex) {
		this.notCountryCodeRegex = notCountryCodeRegex;
	}
	

	public String getNotCountryCodeRegex() {
		return this.notCountryCodeRegex;
	}
	

	public MarketPaymentType notCountryCodeRegex(String notCountryCodeRegex) {
		setNotCountryCodeRegex(notCountryCodeRegex);
		return this;
	}
	

	public String notCountryCodeRegex() {
		return getNotCountryCodeRegex();
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public MarketPaymentType priceCents(Integer priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public Integer priceCents() {
		return getPriceCents();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public MarketPaymentType previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public MarketPaymentType market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public MarketPaymentType paymentType(Object paymentType) {
		setPaymentType(paymentType);
		return this;
	}
	

	public Object paymentType() {
		return getPaymentType();
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public MarketPaymentType price(String price) {
		setPrice(price);
		return this;
	}
	

	public String price() {
		return getPrice();
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public MarketPaymentType formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
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
	
		no = super.clone(no);
	
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
