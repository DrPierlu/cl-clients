package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * Country
 */
public class Country extends ApiResource {

	private static final long serialVersionUID = -1484058602785L;


	private String code;
	private Integer countryGroupId;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private List<String> languages;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> states;


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
	

	public Country name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public Country countryGroupId(Integer countryGroupId) {
		setCountryGroupId(countryGroupId);
		return this;
	}
	

	public Integer countryGroupId() {
		return getCountryGroupId();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public Country code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Country previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public Country countryGroup(Object countryGroup) {
		setCountryGroup(countryGroup);
		return this;
	}
	

	public Object countryGroup() {
		return getCountryGroup();
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public Country countryLanguages(List<String> countryLanguages) {
		setCountryLanguages(countryLanguages);
		return this;
	}
	

	public List<String> countryLanguages() {
		return getCountryLanguages();
	}
	

	public void setStates(List<String> states) {
		this.states = states;
	}
	

	public List<String> getStates() {
		return this.states;
	}
	

	public Country states(List<String> states) {
		setStates(states);
		return this;
	}
	

	public List<String> states() {
		return getStates();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Country orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Country lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

	public List<String> getLanguages() {
		return this.languages;
	}
	

	public Country languages(List<String> languages) {
		setLanguages(languages);
		return this;
	}
	

	public List<String> languages() {
		return getLanguages();
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
	
		no = super.clone(no);
	
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
