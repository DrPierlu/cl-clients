package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Country
 */
public class Country extends ApiResource {

	private static final long serialVersionUID = -1482880735275L;


	@JsonExclude
	private String name;
	private Integer countryGroupId;
	private String code;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private List<String> states;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> languages;


	public Country() {
		super();
	}
	

	public Country(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Country x = (Country)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryGroupId, x.countryGroupId)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.countryGroup, x.countryGroup)
			&& Objects.equals(this.countryLanguages, x.countryLanguages)
			&& Objects.equals(this.states, x.states)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.languages, x.languages)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryGroupId, code, previousChanges, countryGroup,
			countryLanguages, states, orders, lineItemStocks, languages
			
		);
	
	}
	

	@Override
	public Country clone() {
	
		Country no = new Country();
	
		no.name = this.name;
		no.countryGroupId = this.countryGroupId;
		no.code = this.code;
		no.previousChanges = this.previousChanges;
		no.countryGroup = this.countryGroup;
		no.countryLanguages = this.countryLanguages;
		no.states = this.states;
		no.orders = this.orders;
		no.lineItemStocks = this.lineItemStocks;
		no.languages = this.languages;
	
		return no;
	
	}
	
}
