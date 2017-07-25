package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Language
 */
public class Language extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String code;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> versions;


	public Language() {
		super();
	}
	

	public Language(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Language name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public Language code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Language versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public Language countryLanguages(List<String> countryLanguages) {
		setCountryLanguages(countryLanguages);
		return this;
	}
	

	public List<String> countryLanguages() {
		return getCountryLanguages();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Language orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public Language countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Language x = (Language)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.countryLanguages, x.countryLanguages)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.countries, x.countries)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, code, versions, countryLanguages, orders,
			countries 
		);
	
	}
	

	@Override
	public Language clone() {
	
		Language no = new Language();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.code = this.code;
		no.versions = this.versions;
		no.countryLanguages = this.countryLanguages;
		no.orders = this.orders;
		no.countries = this.countries;
	
		return no;
	
	}
	
}
