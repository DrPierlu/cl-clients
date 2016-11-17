
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Currency
 */
public class Currency extends ApiResource {

	private String environmentId = null;
	private String code = null;

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

	public Currency creatorResource(String creatorResource) {
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
		Currency currency = (Currency) o;
		return Objects.equals(this.resourceName, currency.resourceName) 
				&& Objects.equals(this.id, currency.id)
				&& Objects.equals(this.environmentId, currency.environmentId)
				&& Objects.equals(this.code, currency.code) 
				&& Objects.equals(this.creatorId, currency.creatorId)
				&& Objects.equals(this.creatorResource, currency.creatorResource)
				&& Objects.equals(this.createdAt, currency.createdAt)
				&& Objects.equals(this.updatedAt, currency.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, code, creatorId, creatorResource, createdAt, updatedAt);
	}

}
