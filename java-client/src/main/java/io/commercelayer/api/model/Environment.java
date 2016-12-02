
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Environment
 */
public class Environment extends ApiResource {

	private String organizationId = null;
	private String name = null;

	public Environment organizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public Environment name(String name) {
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
		Environment environment = (Environment) o;
		return super.equals(o) && 
			Objects.equals(this.organizationId, environment.organizationId)
				&& Objects.equals(this.name, environment.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, organizationId, name, creatorResource, createdAt, updatedAt);
	}

}
