package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketShippingService
 */
public class MarketShippingService extends ApiResource {

	private static final long serialVersionUID = -1482845758047L;


	private String marketId;
	private String shippingServiceId;
	private String priceCents;
	private String freeOverAmountCents;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object shippingService;
	private String price;
	private String formattedPrice;
	private String freeOverAmount;
	private String formattedFreeOverAmount;


	public MarketShippingService() {
		super();
	}
	

	public MarketShippingService(Long id) {
		super(id);
	}
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public void setFreeOverAmountCents(String freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public String getFreeOverAmountCents() {
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
		if (o == null || getClass() != o.getClass()) return false;
	
		MarketShippingService x = (MarketShippingService) o;
	
		return super.equals(o) &&
			Objects.equals(this.marketId, x.marketId)  &&
			Objects.equals(this.shippingServiceId, x.shippingServiceId)  &&
			Objects.equals(this.priceCents, x.priceCents)  &&
			Objects.equals(this.freeOverAmountCents, x.freeOverAmountCents)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.market, x.market)  &&
			Objects.equals(this.shippingService, x.shippingService)  &&
			Objects.equals(this.price, x.price)  &&
			Objects.equals(this.formattedPrice, x.formattedPrice)  &&
			Objects.equals(this.freeOverAmount, x.freeOverAmount)  &&
			Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, marketId, shippingServiceId, priceCents, freeOverAmountCents,
			previousChanges, market, shippingService, price, formattedPrice,
			freeOverAmount, formattedFreeOverAmount 
		);
	
	}
	
}
