package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * MarketPriceList
 */
public class MarketPriceList extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer marketId;
	private Integer priceListId;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private List<String> versions;


	public MarketPriceList() {
		super();
	}
	

	public MarketPriceList(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public MarketPriceList name(String name) {
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
	

	public MarketPriceList marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public MarketPriceList priceListId(Integer priceListId) {
		setPriceListId(priceListId);
		return this;
	}
	

	public Integer priceListId() {
		return getPriceListId();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public MarketPriceList market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public MarketPriceList priceList(Object priceList) {
		setPriceList(priceList);
		return this;
	}
	

	public Object priceList() {
		return getPriceList();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public MarketPriceList versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MarketPriceList x = (MarketPriceList)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.priceListId, x.priceListId)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.priceList, x.priceList)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, priceListId, market, priceList,
			versions 
		);
	
	}
	

	@Override
	public MarketPriceList clone() {
	
		MarketPriceList no = new MarketPriceList();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.priceListId = this.priceListId;
		no.market = this.market;
		no.priceList = this.priceList;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
