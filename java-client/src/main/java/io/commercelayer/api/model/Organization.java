
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Organization
 */
public class Organization extends ApiResource {

	private String name = null;

	public Organization name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Organization organization = (Organization) o;
		return super.equals(o) && 
			Objects.equals(this.name, organization.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorResource, createdAt, updatedAt);
	}

}
