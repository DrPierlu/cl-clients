package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * CountryGroup
 */
public class CountryGroup extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private List<String> countries;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shippingZones;
	@JsonExclude
	private List<String> versions;


	public CountryGroup() {
		super();
	}
	

	public CountryGroup(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public CountryGroup name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public CountryGroup versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public CountryGroup countries(List<String> countries) {
		setCountries(countries);
		return this;
	}
	

	public List<String> countries() {
		return getCountries();
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	public CountryGroup shippingZones(List<String> shippingZones) {
		setShippingZones(shippingZones);
		return this;
	}
	

	public List<String> shippingZones() {
		return getShippingZones();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public CountryGroup markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public CountryGroup shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		CountryGroup x = (CountryGroup)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.countries, x.countries)
			&& Objects.equals(this.shippingZones, x.shippingZones)
			&& Objects.equals(this.markets, x.markets)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, countries, shippingZones, markets,
			shippingMethods 
		);
	
	}
	

	@Override
	public CountryGroup clone() {
	
		CountryGroup no = new CountryGroup();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.countries = this.countries;
		no.shippingZones = this.shippingZones;
		no.markets = this.markets;
		no.shippingMethods = this.shippingMethods;
	
		return no;
	
	}
	
}
