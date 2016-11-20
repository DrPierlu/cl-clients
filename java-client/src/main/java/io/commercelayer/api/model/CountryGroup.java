
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * CountryGroup
 */
public class CountryGroup extends ApiResource {

	private String name = null;


	public CountryGroup name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CountryGroup creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public CountryGroup creatorResource(String creatorResource) {
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
		CountryGroup countryGroup = (CountryGroup) o;
		return super.equals(o) &&
			Objects.equals(this.name, countryGroup.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorId, creatorResource, createdAt, updatedAt);
	}

}
