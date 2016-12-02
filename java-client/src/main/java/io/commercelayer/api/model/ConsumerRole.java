
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * ConsumerRole
 */
public class ConsumerRole extends ApiResource {

	private String consumerId = null;
	private String consumerResource = null;
	private String roleId = null;
	private String position = null;


	public ConsumerRole consumerId(String consumerId) {
		this.consumerId = consumerId;
		return this;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public ConsumerRole consumerResource(String consumerResource) {
		this.consumerResource = consumerResource;
		return this;
	}

	public String getConsumerResource() {
		return consumerResource;
	}

	public void setConsumerResource(String consumerResource) {
		this.consumerResource = consumerResource;
	}

	public ConsumerRole roleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public ConsumerRole position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConsumerRole consumerRole = (ConsumerRole) o;
		return super.equals(o) &&
			Objects.equals(this.consumerId, consumerRole.consumerId)
				&& Objects.equals(this.consumerResource, consumerRole.consumerResource)
				&& Objects.equals(this.roleId, consumerRole.roleId)
				&& Objects.equals(this.position, consumerRole.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, consumerId, consumerResource, roleId, position, 
				creatorResource, createdAt, updatedAt);
	}

}
