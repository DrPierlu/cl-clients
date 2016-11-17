
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Permission
 */
public class Permission extends ApiResource {

	private String roleId = null;
	private String ability = null;
	private String action = null;
	private String resource = null;
	private String restrictions = null;
	private String position = null;

	public Permission roleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Permission ability(String ability) {
		this.ability = ability;
		return this;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public Permission action(String action) {
		this.action = action;
		return this;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Permission resource(String resource) {
		this.resource = resource;
		return this;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Permission restrictions(String restrictions) {
		this.restrictions = restrictions;
		return this;
	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	public Permission position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Permission creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Permission creatorResource(String creatorResource) {
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
		Permission permission = (Permission) o;
		return Objects.equals(this.resourceName, permission.resourceName) 
				&& Objects.equals(this.id, permission.id)
				&& Objects.equals(this.roleId, permission.roleId) 
				&& Objects.equals(this.ability, permission.ability)
				&& Objects.equals(this.action, permission.action) 
				&& Objects.equals(this.resource, permission.resource)
				&& Objects.equals(this.restrictions, permission.restrictions)
				&& Objects.equals(this.position, permission.position)
				&& Objects.equals(this.creatorId, permission.creatorId)
				&& Objects.equals(this.creatorResource, permission.creatorResource)
				&& Objects.equals(this.createdAt, permission.createdAt)
				&& Objects.equals(this.updatedAt, permission.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, roleId, ability, action, resource, restrictions, position, creatorId,
				creatorResource, createdAt, updatedAt);
	}

}
