
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Merchant
 */
public class Merchant extends ApiResource {

	private String countryId = null;
	private String name = null;
	private String description = null;


	public Merchant countryId(String countryId) {
		this.countryId = countryId;
		return this;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Merchant name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Merchant description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Merchant merchant = (Merchant) o;
		return super.equals(o) && 
			Objects.equals(this.countryId, merchant.countryId) 
				&& Objects.equals(this.name, merchant.name)
				&& Objects.equals(this.description, merchant.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, countryId, name, description, creatorResource,
				createdAt, updatedAt);
	}

}
