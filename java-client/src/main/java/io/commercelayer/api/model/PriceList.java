package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PriceList
 */
public class PriceList extends ApiResource {

	private static final long serialVersionUID = -1481805605885L;


	private String currencyId;
	private String name;
	private String taxIncluded;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object currency;
	private List<String> prices;
	private List<String> markets;


	public PriceList() {
		super();
	}
	

	public PriceList(Long id) {
		super(id);
	}
	

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	

	public String getCurrencyId() {
		return this.currencyId;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public String getTaxIncluded() {
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
		if (o == null || getClass() != o.getClass()) return false;
	
		PriceList x = (PriceList) o;
	
		return super.equals(o) &&
			Objects.equals(this.currencyId, x.currencyId)  &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.taxIncluded, x.taxIncluded)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.currency, x.currency)  &&
			Objects.equals(this.prices, x.prices)  &&
			Objects.equals(this.markets, x.markets) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, currencyId, name, taxIncluded, previousChanges,
			currency, prices, markets 
		);
	
	}
	
}
