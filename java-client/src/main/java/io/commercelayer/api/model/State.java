
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * State
 */
public class State extends ApiResource {

	private String countryId = null;
	private String code = null;


	public State countryId(String countryId) {
		this.countryId = countryId;
		return this;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public State code(String code) {
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
		State state = (State) o;
		return super.equals(o) && 
			Objects.equals(this.countryId, state.countryId) 
				&& Objects.equals(this.code, state.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, countryId, code, creatorResource, createdAt,
				updatedAt);
	}

}
