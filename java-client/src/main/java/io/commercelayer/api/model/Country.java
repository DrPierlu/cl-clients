
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Country
 */
public class Country extends ApiResource {

	private String countryGroupId = null;
	private String code = null;

	
	public Country countryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
		return this;
	}

	public String getCountryGroupId() {
		return countryGroupId;
	}

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}

	public Country code(String code) {
		this.code = code;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Country country = (Country) o;
		return super.equals(o) &&
			Objects.equals(this.countryGroupId, country.countryGroupId)
				&& Objects.equals(this.code, country.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, countryGroupId, code, creatorResource,
				createdAt, updatedAt);
	}

}
