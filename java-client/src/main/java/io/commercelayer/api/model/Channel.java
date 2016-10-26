
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Channel
 */
public class Channel extends ApiResource {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("name")
	private String name = null;

	public Channel environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Channel name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Channel creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Channel creatorResource(String creatorResource) {
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
		Channel channel = (Channel) o;
		return Objects.equals(this.resourceName, channel.resourceName) && Objects.equals(this.id, channel.id)
				&& Objects.equals(this.environmentId, channel.environmentId) && Objects.equals(this.name, channel.name)
				&& Objects.equals(this.creatorId, channel.creatorId)
				&& Objects.equals(this.creatorResource, channel.creatorResource)
				&& Objects.equals(this.createdAt, channel.createdAt)
				&& Objects.equals(this.updatedAt, channel.updatedAt) && Objects.equals(this.expanded, channel.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
