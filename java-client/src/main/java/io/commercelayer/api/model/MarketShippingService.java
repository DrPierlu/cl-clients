package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * MarketShippingService
 */
public class MarketShippingService extends ApiResource {

	private static final long serialVersionUID = -1484907257170L;


	private Integer marketId;
	private Integer shippingServiceId;
	@JsonExclude
	private String formattedFreeOverAmount;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String freeOverAmount;
	@JsonExclude
	private Integer freeOverAmountCents;
	@JsonExclude
	private Object market;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String price;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private Object shippingService;


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
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public MarketShippingService priceCents(Integer priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public Integer priceCents() {
		return getPriceCents();
	}
	

	public void setFreeOverAmountCents(Integer freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public Integer getFreeOverAmountCents() {
		return this.freeOverAmountCents;
	}
	

	public MarketShippingService freeOverAmountCents(Integer freeOverAmountCents) {
		setFreeOverAmountCents(freeOverAmountCents);
		return this;
	}
	

	public Integer freeOverAmountCents() {
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
	
		no = super.clone(no);
	
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
