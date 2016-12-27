package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PriceList
 */
public class PriceList extends ApiResource {

	private static final long serialVersionUID = -1482880735320L;


	private Integer currencyId;
	private String name;
	@JsonExclude
	private Object taxIncluded;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> markets;


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
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setTaxIncluded(Object taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Object getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
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
