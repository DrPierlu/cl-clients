package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Country
 */
public class Country extends ApiResource {

	private static final long serialVersionUID = -1481805605688L;


	private String countryGroupId;
	private String code;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object countryGroup;
	private List<String> countryLanguages;
	private List<String> states;
	private List<String> orders;
	private List<String> lineItemStocks;
	private List<String> languages;


	public Country() {
		super();
	}
	

	public Country(Long id) {
		super(id);
	}
	

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public String getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public void setStates(List<String> states) {
		this.states = states;
	}
	

	public List<String> getStates() {
		return this.states;
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

	public List<String> getLanguages() {
		return this.languages;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Country x = (Country) o;
	
		return super.equals(o) &&
			Objects.equals(this.countryGroupId, x.countryGroupId)  &&
			Objects.equals(this.code, x.code)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.countryGroup, x.countryGroup)  &&
			Objects.equals(this.countryLanguages, x.countryLanguages)  &&
			Objects.equals(this.states, x.states)  &&
			Objects.equals(this.orders, x.orders)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.languages, x.languages) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, countryGroupId, code, previousChanges, countryGroup,
			countryLanguages, states, orders, lineItemStocks, languages
			
		);
	
	}
	
}
