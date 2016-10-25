
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Language
 */
public class Language extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("code")
	private String code = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

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

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Language creatorResource(String creatorResource) {
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
		Language language = (Language) o;
		return Objects.equals(this.resourceName, language.resourceName) && Objects.equals(this.id, language.id)
				&& Objects.equals(this.environmentId, language.environmentId)
				&& Objects.equals(this.code, language.code) && Objects.equals(this.creatorId, language.creatorId)
				&& Objects.equals(this.creatorResource, language.creatorResource)
				&& Objects.equals(this.createdAt, language.createdAt)
				&& Objects.equals(this.updatedAt, language.updatedAt)
				&& Objects.equals(this.expanded, language.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, code, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
