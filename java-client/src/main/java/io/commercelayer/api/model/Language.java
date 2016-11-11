
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Language
 */
public class Language extends ApiResource {

	private String environmentId = null;
	private String code = null;

	public Language environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Language code(String code) {
		this.code = code;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Language creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Language creatorResource(String creatorResource) {
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
		Language language = (Language) o;
		return Objects.equals(this.resourceName, language.resourceName) && Objects.equals(this.id, language.id)
				&& Objects.equals(this.environmentId, language.environmentId)
				&& Objects.equals(this.code, language.code) && Objects.equals(this.creatorId, language.creatorId)
				&& Objects.equals(this.creatorResource, language.creatorResource)
				&& Objects.equals(this.createdAt, language.createdAt)
				&& Objects.equals(this.updatedAt, language.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, code, creatorId, creatorResource, createdAt, updatedAt);
	}

}
