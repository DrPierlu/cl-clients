package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Merchant
 */
public class Merchant extends ApiResource {

	private static final long serialVersionUID = -1482845758062L;


	private String countryId;
	private String name;
	private String description;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object country;
	private List<String> markets;
	private List<String> gateways;
	private List<String> orders;
	private List<String> paymentTypes;


	public Merchant() {
		super();
	}
	

	public Merchant(Long id) {
		super(id);
	}
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	

	public String getCountryId() {
		return this.countryId;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public void setGateways(List<String> gateways) {
		this.gateways = gateways;
	}
	

	public List<String> getGateways() {
		return this.gateways;
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Merchant x = (Merchant) o;
	
		return super.equals(o) &&
			Objects.equals(this.countryId, x.countryId)  &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.description, x.description)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.country, x.country)  &&
			Objects.equals(this.markets, x.markets)  &&
			Objects.equals(this.gateways, x.gateways)  &&
			Objects.equals(this.orders, x.orders)  &&
			Objects.equals(this.paymentTypes, x.paymentTypes) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, countryId, name, description, previousChanges,
			country, markets, gateways, orders, paymentTypes
			
		);
	
	}
	
}
