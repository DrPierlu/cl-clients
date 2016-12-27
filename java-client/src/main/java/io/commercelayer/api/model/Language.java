package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Language
 */
public class Language extends ApiResource {

	private static final long serialVersionUID = -1482880735290L;


	@JsonExclude
	private String name;
	private String code;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private List<String> countries;


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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Language x = (Language)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.countryLanguages, x.countryLanguages)
			&& Objects.equals(this.countries, x.countries)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, code, previousChanges, countryLanguages, countries
			
		);
	
	}
	

	@Override
	public Language clone() {
	
		Language no = new Language();
	
		no.name = this.name;
		no.code = this.code;
		no.previousChanges = this.previousChanges;
		no.countryLanguages = this.countryLanguages;
		no.countries = this.countries;
	
		return no;
	
	}
	
}
