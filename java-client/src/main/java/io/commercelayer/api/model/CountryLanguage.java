
package io.commercelayer.api.model;

import java.util.Objects;

/**
 * CountryLanguage
 */
public class CountryLanguage extends ApiResource {

	private String environmentId = null;
	private String countryId = null;
	private String languageId = null;
	private String position = null;

	public CountryLanguage environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public CountryLanguage creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public CountryLanguage creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
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
		return Objects.equals(this.resourceName, countryLanguage.resourceName)
				&& Objects.equals(this.id, countryLanguage.id)
				&& Objects.equals(this.environmentId, countryLanguage.environmentId)
				&& Objects.equals(this.countryId, countryLanguage.countryId)
				&& Objects.equals(this.languageId, countryLanguage.languageId)
				&& Objects.equals(this.position, countryLanguage.position)
				&& Objects.equals(this.creatorId, countryLanguage.creatorId)
				&& Objects.equals(this.creatorResource, countryLanguage.creatorResource)
				&& Objects.equals(this.createdAt, countryLanguage.createdAt)
				&& Objects.equals(this.updatedAt, countryLanguage.updatedAt)
				&& Objects.equals(this.expanded, countryLanguage.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, countryId, languageId, position, creatorId,
				creatorResource, createdAt, updatedAt, expanded);
	}

}
