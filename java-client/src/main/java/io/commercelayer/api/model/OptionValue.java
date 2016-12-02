
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * OptionValue
 */
public class OptionValue extends ApiResource {

	private String name = null;
	private String optionTypeId = null;


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
	

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OptionValue optionValue = (OptionValue) o;
		return super.equals(o) && 
			Objects.equals(this.name, optionValue.name)
				&& Objects.equals(this.optionTypeId, optionValue.optionTypeId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, optionTypeId, creatorResource, createdAt,
				updatedAt);
	}

}
