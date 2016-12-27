package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketShippingService
 */
public class MarketShippingService extends ApiResource {

	private static final long serialVersionUID = -1482880735299L;


	@JsonExclude
	private String name;
	private Integer marketId;
	private Integer shippingServiceId;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private Integer freeOverAmountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private String price;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String freeOverAmount;
	@JsonExclude
	private String formattedFreeOverAmount;


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
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public void setFreeOverAmountCents(Integer freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public Integer getFreeOverAmountCents() {
		return this.freeOverAmountCents;
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
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public void setFreeOverAmount(String freeOverAmount) {
		this.freeOverAmount = freeOverAmount;
	}
	

	public String getFreeOverAmount() {
		return this.freeOverAmount;
	}
	

	public void setFormattedFreeOverAmount(String formattedFreeOverAmount) {
		this.formattedFreeOverAmount = formattedFreeOverAmount;
	}
	

	public String getFormattedFreeOverAmount() {
		return this.formattedFreeOverAmount;
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
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.freeOverAmountCents, x.freeOverAmountCents)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.price, x.price)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
			&& Objects.equals(this.freeOverAmount, x.freeOverAmount)
			&& Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, marketId, shippingServiceId, priceCents, freeOverAmountCents,
			previousChanges, market, shippingService, price, formattedPrice,
			freeOverAmount, formattedFreeOverAmount 
		);
	
	}
	

	@Override
	public MarketShippingService clone() {
	
		MarketShippingService no = new MarketShippingService();
	
		no.name = this.name;
		no.marketId = this.marketId;
		no.shippingServiceId = this.shippingServiceId;
		no.priceCents = this.priceCents;
		no.freeOverAmountCents = this.freeOverAmountCents;
		no.previousChanges = this.previousChanges;
		no.market = this.market;
		no.shippingService = this.shippingService;
		no.price = this.price;
		no.formattedPrice = this.formattedPrice;
		no.freeOverAmount = this.freeOverAmount;
		no.formattedFreeOverAmount = this.formattedFreeOverAmount;
	
		return no;
	
	}
	
}
