
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * OptionType
 */
public class OptionType extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	public OptionType environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public OptionType name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OptionType creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public OptionType creatorResource(String creatorResource) {
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
		OptionType optionType = (OptionType) o;
		return Objects.equals(this.resourceName, optionType.resourceName) && Objects.equals(this.id, optionType.id)
				&& Objects.equals(this.environmentId, optionType.environmentId)
				&& Objects.equals(this.name, optionType.name) && Objects.equals(this.creatorId, optionType.creatorId)
				&& Objects.equals(this.creatorResource, optionType.creatorResource)
				&& Objects.equals(this.createdAt, optionType.createdAt)
				&& Objects.equals(this.updatedAt, optionType.updatedAt)
				&& Objects.equals(this.expanded, optionType.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
