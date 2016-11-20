
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Application
 */
public class Application extends ApiResource {

	private String name = null;

	public Application name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Application creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Application creatorResource(String creatorResource) {
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
		Application application = (Application) o;
		return super.equals(o) &&
			Objects.equals(this.name, application.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, creatorId, creatorResource, createdAt, updatedAt);
	}

}
