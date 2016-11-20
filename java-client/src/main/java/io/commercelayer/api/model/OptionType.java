
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * OptionType
 */
public class OptionType extends ApiResource {

	private String name = null;


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
		return super.equals(o) && 
			Objects.equals(this.name, optionType.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorId, creatorResource, createdAt, updatedAt);
	}

}
