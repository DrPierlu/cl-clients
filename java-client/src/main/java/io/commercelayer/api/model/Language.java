
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Language
 */
public class Language extends ApiResource {

	private String code = null;


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
		return super.equals(o) && 
			Objects.equals(this.code, language.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, code, creatorId, creatorResource, createdAt, updatedAt);
	}

}
