
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * State
 */
public class State extends ApiResource {

	private String environmentId = null;
	private String countryId = null;
	private String code = null;

	public State environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public State creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public State creatorResource(String creatorResource) {
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
		State state = (State) o;
		return Objects.equals(this.resourceName, state.resourceName) && Objects.equals(this.id, state.id)
				&& Objects.equals(this.environmentId, state.environmentId)
				&& Objects.equals(this.countryId, state.countryId) && Objects.equals(this.code, state.code)
				&& Objects.equals(this.creatorId, state.creatorId)
				&& Objects.equals(this.creatorResource, state.creatorResource)
				&& Objects.equals(this.createdAt, state.createdAt) && Objects.equals(this.updatedAt, state.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, countryId, code, creatorId, creatorResource, createdAt,
				updatedAt);
	}

}
