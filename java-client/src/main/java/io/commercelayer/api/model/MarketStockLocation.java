package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * MarketStockLocation
 */
public class MarketStockLocation extends ApiResource {

	private static final long serialVersionUID = -1483024665672L;


	private String marketId;
	private String stockLocationId;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object stockLocation;


	public MarketStockLocation() {
		super();
	}
	

	public MarketStockLocation(Long id) {
		super(id);
	}
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public MarketStockLocation marketId(String marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public String marketId() {
		return getMarketId();
	}
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public MarketStockLocation stockLocationId(String stockLocationId) {
		setStockLocationId(stockLocationId);
		return this;
	}
	

	public String stockLocationId() {
		return getStockLocationId();
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public MarketStockLocation position(String position) {
		setPosition(position);
		return this;
	}
	

	public String position() {
		return getPosition();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public MarketStockLocation previousChanges(Object previousChanges) {
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MarketStockLocation x = (MarketStockLocation)o;
	
		return super.equals(o)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.stockLocationId, x.stockLocationId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.stockLocation, x.stockLocation)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			marketId, stockLocationId, position, previousChanges, market,
			stockLocation 
		);
	
	}
	

	@Override
	public MarketStockLocation clone() {
	
		MarketStockLocation no = new MarketStockLocation();
	
		no.marketId = this.marketId;
		no.stockLocationId = this.stockLocationId;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.market = this.market;
		no.stockLocation = this.stockLocation;
	
		return no;
	
	}
	
}
