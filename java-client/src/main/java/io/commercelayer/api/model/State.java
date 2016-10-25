
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * State
 */
public class State extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("country_id")
	private String countryId = null;

	@SerializedName("code")
	private String code = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

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

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public State creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
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
				&& Objects.equals(this.createdAt, state.createdAt) && Objects.equals(this.updatedAt, state.updatedAt)
				&& Objects.equals(this.expanded, state.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, countryId, code, creatorId, creatorResource, createdAt,
				updatedAt, expanded);
	}

}
