package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * MarketStockLocation
 */
public class MarketStockLocation extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer marketId;
	private Integer stockLocationId;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object stockLocation;
	@JsonExclude
	private List<String> versions;


	public MarketStockLocation() {
		super();
	}
	

	public MarketStockLocation(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public MarketStockLocation name(String name) {
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
	

	public MarketStockLocation marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setStockLocationId(Integer stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public Integer getStockLocationId() {
		return this.stockLocationId;
	}
	

	public MarketStockLocation stockLocationId(Integer stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public Integer stockLocationId() {
		return getStockLocationId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public MarketStockLocation position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public MarketStockLocation market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	public MarketStockLocation stockLocation(Object stockLocation) {
		setStockLocation(stockLocation);
		return this;
	}
	

	public Object stockLocation() {
		return getStockLocation();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public MarketStockLocation versions(List<String> versions) {
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
	
		MarketStockLocation x = (MarketStockLocation)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.stockLocation, x.stockLocation)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, stockLocationId, position, market,
			stockLocation, versions 
		);
	
	}
	

	@Override
	public MarketStockLocation clone() {
	
		MarketStockLocation no = new MarketStockLocation();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.stockLocationId = this.stockLocationId;
		no.position = this.position;
		no.market = this.market;
		no.stockLocation = this.stockLocation;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
