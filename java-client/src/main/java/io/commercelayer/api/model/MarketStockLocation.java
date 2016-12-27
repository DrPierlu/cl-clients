package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketStockLocation
 */
public class MarketStockLocation extends ApiResource {

	private static final long serialVersionUID = -1482845758047L;


	private String marketId;
	private String stockLocationId;
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object market;
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
	

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}
	

	public String getStockLocationId() {
		return this.stockLocationId;
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
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
	

	public void setStockLocation(Object stockLocation) {
		this.stockLocation = stockLocation;
	}
	

	public Object getStockLocation() {
		return this.stockLocation;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		MarketStockLocation x = (MarketStockLocation) o;
	
		return super.equals(o) &&
			Objects.equals(this.marketId, x.marketId)  &&
			Objects.equals(this.stockLocationId, x.stockLocationId)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.market, x.market)  &&
			Objects.equals(this.stockLocation, x.stockLocation) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, marketId, stockLocationId, position, previousChanges,
			market, stockLocation 
		);
	
	}
	
}
