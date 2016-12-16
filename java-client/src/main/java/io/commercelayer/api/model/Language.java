package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Language
 */
public class Language extends ApiResource {

	private static final long serialVersionUID = -1481927389100L;


	private String code;
	@JsonExclude
	private Object previousChanges;
	private List<String> countryLanguages;
	private List<String> countries;


	public Language() {
		super();
	}
	

	public Language(Long id) {
		super(id);
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
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	

	public List<String> getCountries() {
		return this.countries;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Language x = (Language) o;
	
		return super.equals(o) &&
			Objects.equals(this.code, x.code)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.countryLanguages, x.countryLanguages)  &&
			Objects.equals(this.countries, x.countries) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, code, previousChanges, countryLanguages, countries
			
		);
	
	}
	
}
