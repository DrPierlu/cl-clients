package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * CountryLanguage
 */
public class CountryLanguage extends ApiResource {

	private static final long serialVersionUID = -1482845757906L;


	private String countryId;
	private String languageId;
	private String position;
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
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	

	public String getCountryId() {
		return this.countryId;
	}
	

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	

	public String getLanguageId() {
		return this.languageId;
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
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
		if (o == null || getClass() != o.getClass()) return false;
	
		CountryLanguage x = (CountryLanguage) o;
	
		return super.equals(o) &&
			Objects.equals(this.countryId, x.countryId)  &&
			Objects.equals(this.languageId, x.languageId)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.country, x.country)  &&
			Objects.equals(this.language, x.language) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, countryId, languageId, position, previousChanges,
			country, language 
		);
	
	}
	
}
