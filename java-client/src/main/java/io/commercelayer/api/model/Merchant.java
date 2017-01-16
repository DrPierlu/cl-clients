package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Merchant
 */
public class Merchant extends ApiResource {

	private static final long serialVersionUID = -1484581108860L;


	private Integer countryId;
	private String name;
	@JsonExclude
	private Object country;
	@JsonExclude
	private String description;
	@JsonExclude
	private List<String> gateways;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private Object previousChanges;


	public Merchant() {
		super();
	}
	

	public Merchant(Long id) {
		super(id);
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public Merchant countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Merchant name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public Merchant description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Merchant previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public Merchant country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public Merchant markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setGateways(List<String> gateways) {
		this.gateways = gateways;
	}
	

	public List<String> getGateways() {
		return this.gateways;
	}
	

	public Merchant gateways(List<String> gateways) {
		setGateways(gateways);
		return this;
	}
	

	public List<String> gateways() {
		return getGateways();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Merchant orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public Merchant paymentTypes(List<String> paymentTypes) {
		setPaymentTypes(paymentTypes);
		return this;
	}
	

	public List<String> paymentTypes() {
		return getPaymentTypes();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Merchant x = (Merchant)o;
	
		return super.equals(o)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.gateways, x.gateways)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			countryId, name, description, previousChanges, country,
			markets, gateways, orders, paymentTypes 
		);
	
	}
	

	@Override
	public Merchant clone() {
	
		Merchant no = new Merchant();
	
		no = super.clone(no);
	
		no.countryId = this.countryId;
		no.name = this.name;
		no.description = this.description;
		no.previousChanges = this.previousChanges;
		no.country = this.country;
		no.markets = this.markets;
		no.gateways = this.gateways;
		no.orders = this.orders;
		no.paymentTypes = this.paymentTypes;
	
		return no;
	
	}
	
}
