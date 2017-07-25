package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PriceList
 */
public class PriceList extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer currencyId;
	private String name;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private List<String> marketPriceLists;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> paymentPrices;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> shippingPrices;
	@JsonExclude
	private Boolean taxIncluded;
	@JsonExclude
	private List<String> versions;


	public PriceList() {
		super();
	}
	

	public PriceList(Long id) {
		super(id);
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public PriceList currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PriceList name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Boolean getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public PriceList taxIncluded(Boolean taxIncluded) {
		setTaxIncluded(taxIncluded);
		return this;
	}
	

	public Boolean taxIncluded() {
		return getTaxIncluded();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public PriceList currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public PriceList versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public PriceList prices(List<String> prices) {
		setPrices(prices);
		return this;
	}
	

	public List<String> prices() {
		return getPrices();
	}
	

	public void setShippingPrices(List<String> shippingPrices) {
		this.shippingPrices = shippingPrices;
	}
	

	public List<String> getShippingPrices() {
		return this.shippingPrices;
	}
	

	public PriceList shippingPrices(List<String> shippingPrices) {
		setShippingPrices(shippingPrices);
		return this;
	}
	

	public List<String> shippingPrices() {
		return getShippingPrices();
	}
	

	public void setPaymentPrices(List<String> paymentPrices) {
		this.paymentPrices = paymentPrices;
	}
	

	public List<String> getPaymentPrices() {
		return this.paymentPrices;
	}
	

	public PriceList paymentPrices(List<String> paymentPrices) {
		setPaymentPrices(paymentPrices);
		return this;
	}
	

	public List<String> paymentPrices() {
		return getPaymentPrices();
	}
	

	public void setMarketPriceLists(List<String> marketPriceLists) {
		this.marketPriceLists = marketPriceLists;
	}
	

	public List<String> getMarketPriceLists() {
		return this.marketPriceLists;
	}
	

	public PriceList marketPriceLists(List<String> marketPriceLists) {
		setMarketPriceLists(marketPriceLists);
		return this;
	}
	

	public List<String> marketPriceLists() {
		return getMarketPriceLists();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public PriceList markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PriceList x = (PriceList)o;
	
		return super.equals(o)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.shippingPrices, x.shippingPrices)
			&& Objects.equals(this.paymentPrices, x.paymentPrices)
			&& Objects.equals(this.marketPriceLists, x.marketPriceLists)
			&& Objects.equals(this.markets, x.markets)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			currencyId, name, taxIncluded, currency, versions,
			prices, shippingPrices, paymentPrices, marketPriceLists, markets
			
		);
	
	}
	

	@Override
	public PriceList clone() {
	
		PriceList no = new PriceList();
	
		no = super.clone(no);
	
		no.currencyId = this.currencyId;
		no.name = this.name;
		no.taxIncluded = this.taxIncluded;
		no.currency = this.currency;
		no.versions = this.versions;
		no.prices = this.prices;
		no.shippingPrices = this.shippingPrices;
		no.paymentPrices = this.paymentPrices;
		no.marketPriceLists = this.marketPriceLists;
		no.markets = this.markets;
	
		return no;
	
	}
	
}
