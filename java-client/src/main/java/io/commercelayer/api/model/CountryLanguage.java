package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * CountryLanguage
 */
public class CountryLanguage extends ApiResource {

	private static final long serialVersionUID = -1482880735274L;


	@JsonExclude
	private String name;
	private Integer countryId;
	private Integer languageId;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object language;


	public CountryLanguage() {
		super();
	}
	

	public CountryLanguage(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	

	public Integer getLanguageId() {
		return this.languageId;
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
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
	

	public void setLanguage(Object language) {
		this.language = language;
	}
	

	public Object getLanguage() {
		return this.language;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		CountryLanguage x = (CountryLanguage)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.languageId, x.languageId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.language, x.language)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryId, languageId, position, previousChanges,
			country, language 
		);
	
	}
	

	@Override
	public CountryLanguage clone() {
	
		CountryLanguage no = new CountryLanguage();
	
		no.name = this.name;
		no.countryId = this.countryId;
		no.languageId = this.languageId;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.country = this.country;
		no.language = this.language;
	
		return no;
	
	}
	
}
