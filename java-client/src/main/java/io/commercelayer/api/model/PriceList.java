package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PriceList
 */
public class PriceList extends ApiResource {

	private static final long serialVersionUID = -1484581108959L;


	private Integer currencyId;
	private String name;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private Object taxIncluded;


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
	

	public void setTaxIncluded(Object taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Object getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public PriceList taxIncluded(Object taxIncluded) {
		setTaxIncluded(taxIncluded);
		return this;
	}
	

	public Object taxIncluded() {
		return getTaxIncluded();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public PriceList previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.markets, x.markets)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			currencyId, name, taxIncluded, previousChanges, currency,
			prices, markets 
		);
	
	}
	

	@Override
	public PriceList clone() {
	
		PriceList no = new PriceList();
	
		no = super.clone(no);
	
		no.currencyId = this.currencyId;
		no.name = this.name;
		no.taxIncluded = this.taxIncluded;
		no.previousChanges = this.previousChanges;
		no.currency = this.currency;
		no.prices = this.prices;
		no.markets = this.markets;
	
		return no;
	
	}
	
}
