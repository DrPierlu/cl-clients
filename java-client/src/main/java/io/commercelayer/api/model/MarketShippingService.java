package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * MarketShippingService
 */
public class MarketShippingService extends ApiResource {

	private static final long serialVersionUID = -1482914097621L;


	private String marketId;
	private String shippingServiceId;
	@JsonExclude
	private String priceCents;
	@JsonExclude
	private String freeOverAmountCents;
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
	

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	

	public String getMarketId() {
		return this.marketId;
	}
	

	public MarketShippingService marketId(String marketId) {
		setMarketId(marketId);
		return this;
	}
	

	public String marketId() {
		return getMarketId();
	}
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public MarketShippingService shippingServiceId(String shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public String shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setPriceCents(String priceCents) {
		this.priceCents = priceCents;
	}
	

	public String getPriceCents() {
		return this.priceCents;
	}
	

	public MarketShippingService priceCents(String priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public String priceCents() {
		return getPriceCents();
	}
	

	public void setFreeOverAmountCents(String freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public String getFreeOverAmountCents() {
		return this.freeOverAmountCents;
	}
	

	public MarketShippingService freeOverAmountCents(String freeOverAmountCents) {
		setFreeOverAmountCents(freeOverAmountCents);
		return this;
	}
	

	public String freeOverAmountCents() {
		return getFreeOverAmountCents();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public MarketShippingService previousChanges(Object previousChanges) {
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
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public MarketShippingService price(String price) {
		setPrice(price);
		return this;
	}
	

	public String price() {
		return getPrice();
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public MarketShippingService formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
	}
	

	public void setFreeOverAmount(String freeOverAmount) {
		this.freeOverAmount = freeOverAmount;
	}
	

	public String getFreeOverAmount() {
		return this.freeOverAmount;
	}
	

	public MarketShippingService freeOverAmount(String freeOverAmount) {
		setFreeOverAmount(freeOverAmount);
		return this;
	}
	

	public String freeOverAmount() {
		return getFreeOverAmount();
	}
	

	public void setFormattedFreeOverAmount(String formattedFreeOverAmount) {
		this.formattedFreeOverAmount = formattedFreeOverAmount;
	}
	

	public String getFormattedFreeOverAmount() {
		return this.formattedFreeOverAmount;
	}
	

	public MarketShippingService formattedFreeOverAmount(String formattedFreeOverAmount) {
		setFormattedFreeOverAmount(formattedFreeOverAmount);
		return this;
	}
	

	public String formattedFreeOverAmount() {
		return getFormattedFreeOverAmount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MarketShippingService x = (MarketShippingService)o;
	
		return super.equals(o)
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
			marketId, shippingServiceId, priceCents, freeOverAmountCents, previousChanges,
			market, shippingService, price, formattedPrice, freeOverAmount,
			formattedFreeOverAmount 
		);
	
	}
	

	@Override
	public MarketShippingService clone() {
	
		MarketShippingService no = new MarketShippingService();
	
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
