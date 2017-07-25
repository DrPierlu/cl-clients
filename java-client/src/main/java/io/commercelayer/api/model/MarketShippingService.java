package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * MarketShippingService
 */
public class MarketShippingService extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer marketId;
	private Integer shippingServiceId;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private List<String> versions;


	public MarketShippingService() {
		super();
	}
	

	public MarketShippingService(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public MarketShippingService name(String name) {
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
	

	public MarketShippingService marketId(Integer marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public Integer marketId() {
		return getMarketId();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public MarketShippingService shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public MarketShippingService market(Object market) {
		setMarket(market);
		return this;
	}
	

	public Object market() {
		return getMarket();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public MarketShippingService shippingService(Object shippingService) {
		setShippingService(shippingService);
		return this;
	}
	

	public Object shippingService() {
		return getShippingService();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public MarketShippingService versions(List<String> versions) {
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
	
		MarketShippingService x = (MarketShippingService)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, shippingServiceId, market, shippingService,
			versions 
		);
	
	}
	

	@Override
	public MarketShippingService clone() {
	
		MarketShippingService no = new MarketShippingService();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.shippingServiceId = this.shippingServiceId;
		no.market = this.market;
		no.shippingService = this.shippingService;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
