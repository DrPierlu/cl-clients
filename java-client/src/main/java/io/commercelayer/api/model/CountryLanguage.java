
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * CountryLanguage
 */
public class CountryLanguage extends ApiResource {

	private String countryId = null;
	private String languageId = null;
	private String position = null;

	
	public CountryLanguage countryId(String countryId) {
		this.countryId = countryId;
		return this;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public CountryLanguage languageId(String languageId) {
		this.languageId = languageId;
		return this;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public CountryLanguage position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CountryLanguage countryLanguage = (CountryLanguage) o;
		return super.equals(o) && 
			Objects.equals(this.countryId, countryLanguage.countryId)
				&& Objects.equals(this.languageId, countryLanguage.languageId)
				&& Objects.equals(this.position, countryLanguage.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, countryId, languageId, position, 
				creatorResource, createdAt, updatedAt);
	}

}
