
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Currency
 */
public class Currency extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("code")
	private String code = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	
	public Currency environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Currency code(String code) {
		this.code = code;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Currency creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Currency creatorResource(String creatorResource) {
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
		Currency currency = (Currency) o;
		return Objects.equals(this.resourceName, currency.resourceName) && Objects.equals(this.id, currency.id)
				&& Objects.equals(this.environmentId, currency.environmentId)
				&& Objects.equals(this.code, currency.code) && Objects.equals(this.creatorId, currency.creatorId)
				&& Objects.equals(this.creatorResource, currency.creatorResource)
				&& Objects.equals(this.createdAt, currency.createdAt)
				&& Objects.equals(this.updatedAt, currency.updatedAt)
				&& Objects.equals(this.expanded, currency.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, code, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}