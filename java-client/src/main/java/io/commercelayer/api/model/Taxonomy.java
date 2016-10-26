
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Taxonomy
 */
public class Taxonomy extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	public Taxonomy environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Taxonomy name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Taxonomy creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Taxonomy creatorResource(String creatorResource) {
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
		Taxonomy taxonomy = (Taxonomy) o;
		return Objects.equals(this.resourceName, taxonomy.resourceName) && Objects.equals(this.id, taxonomy.id)
				&& Objects.equals(this.environmentId, taxonomy.environmentId)
				&& Objects.equals(this.name, taxonomy.name) && Objects.equals(this.creatorId, taxonomy.creatorId)
				&& Objects.equals(this.creatorResource, taxonomy.creatorResource)
				&& Objects.equals(this.createdAt, taxonomy.createdAt)
				&& Objects.equals(this.updatedAt, taxonomy.updatedAt)
				&& Objects.equals(this.expanded, taxonomy.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
