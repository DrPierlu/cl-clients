package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingPrice
 */
public class ShippingPrice extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String amount;
	private Integer priceListId;
	private Integer shippingServiceId;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedFreeOverAmount;
	@JsonExclude
	private String freeOverAmount;
	@JsonExclude
	private Integer freeOverAmountCents;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object priceList;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private List<String> versions;


	public ShippingPrice() {
		super();
	}
	

	public ShippingPrice(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingPrice name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}
	

	public Integer getPriceListId() {
		return this.priceListId;
	}
	

	public ShippingPrice priceListId(Integer priceListId) {
		setPriceListId(priceListId);
		return this;
	}
	

	public Integer priceListId() {
		return getPriceListId();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingPrice shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public ShippingPrice amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setFreeOverAmountCents(Integer freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public Integer getFreeOverAmountCents() {
		return this.freeOverAmountCents;
	}
	

	public ShippingPrice freeOverAmountCents(Integer freeOverAmountCents) {
		setFreeOverAmountCents(freeOverAmountCents);
		return this;
	}
	

	public Integer freeOverAmountCents() {
		return getFreeOverAmountCents();
	}
	

	public void setPriceList(Object priceList) {
		this.priceList = priceList;
	}
	

	public Object getPriceList() {
		return this.priceList;
	}
	

	public ShippingPrice priceList(Object priceList) {
		setPriceList(priceList);
		return this;
	}
	

	public Object priceList() {
		return getPriceList();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public ShippingPrice shippingService(Object shippingService) {
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
	

	public ShippingPrice versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public ShippingPrice amount(String amount) {
		setAmount(amount);
		return this;
	}
	

	public String amount() {
		return getAmount();
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public ShippingPrice formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setFreeOverAmount(String freeOverAmount) {
		this.freeOverAmount = freeOverAmount;
	}
	

	public String getFreeOverAmount() {
		return this.freeOverAmount;
	}
	

	public ShippingPrice freeOverAmount(String freeOverAmount) {
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
	

	public ShippingPrice formattedFreeOverAmount(String formattedFreeOverAmount) {
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
	
		ShippingPrice x = (ShippingPrice)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.priceListId, x.priceListId)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.freeOverAmountCents, x.freeOverAmountCents)
			&& Objects.equals(this.priceList, x.priceList)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.freeOverAmount, x.freeOverAmount)
			&& Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, priceListId, shippingServiceId, amountCents, freeOverAmountCents,
			priceList, shippingService, versions, amount, formattedAmount,
			freeOverAmount, formattedFreeOverAmount 
		);
	
	}
	

	@Override
	public ShippingPrice clone() {
	
		ShippingPrice no = new ShippingPrice();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.priceListId = this.priceListId;
		no.shippingServiceId = this.shippingServiceId;
		no.amountCents = this.amountCents;
		no.freeOverAmountCents = this.freeOverAmountCents;
		no.priceList = this.priceList;
		no.shippingService = this.shippingService;
		no.versions = this.versions;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.freeOverAmount = this.freeOverAmount;
		no.formattedFreeOverAmount = this.formattedFreeOverAmount;
	
		return no;
	
	}
	
}
