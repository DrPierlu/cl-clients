package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * CountryGroup
 */
public class CountryGroup extends ApiResource {

	private static final long serialVersionUID = -1481805605697L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	private List<String> countries;
	private List<String> shippingZones;
	private List<String> shippingMethods;


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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}
	

	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		CountryGroup x = (CountryGroup) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.countries, x.countries)  &&
			Objects.equals(this.shippingZones, x.shippingZones)  &&
			Objects.equals(this.shippingMethods, x.shippingMethods) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, previousChanges, countries, shippingZones,
			shippingMethods 
		);
	
	}
	
}
