
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * OptionValue
 */
public class OptionValue extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("option_type_id")
	private String optionTypeId = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public OptionValue environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public OptionValue name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OptionValue optionTypeId(String optionTypeId) {
		this.optionTypeId = optionTypeId;
		return this;
	}

	public String getOptionTypeId() {
		return optionTypeId;
	}

	public void setOptionTypeId(String optionTypeId) {
		this.optionTypeId = optionTypeId;
	}

	public OptionValue creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public OptionValue creatorResource(String creatorResource) {
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
		OptionValue optionValue = (OptionValue) o;
		return Objects.equals(this.resourceName, optionValue.resourceName) && Objects.equals(this.id, optionValue.id)
				&& Objects.equals(this.environmentId, optionValue.environmentId)
				&& Objects.equals(this.name, optionValue.name)
				&& Objects.equals(this.optionTypeId, optionValue.optionTypeId)
				&& Objects.equals(this.creatorId, optionValue.creatorId)
				&& Objects.equals(this.creatorResource, optionValue.creatorResource)
				&& Objects.equals(this.createdAt, optionValue.createdAt)
				&& Objects.equals(this.updatedAt, optionValue.updatedAt)
				&& Objects.equals(this.expanded, optionValue.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, optionTypeId, creatorId, creatorResource, createdAt,
				updatedAt, expanded);
	}

}
