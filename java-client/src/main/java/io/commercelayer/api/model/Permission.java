package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * Permission
 */
public class Permission extends ApiResource {

	private static final long serialVersionUID = -1482845758125L;


	private String roleId;
	private String ability;
	private String action;
	private String resource;
	private String restrictions;
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object role;


	public Permission() {
		super();
	}
	

	public Permission(Long id) {
		super(id);
	}
	

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	

	public String getRoleId() {
		return this.roleId;
	}
	

	public void setAbility(String ability) {
		this.ability = ability;
	}
	

	public String getAbility() {
		return this.ability;
	}
	

	public void setAction(String action) {
		this.action = action;
	}
	

	public String getAction() {
		return this.action;
	}
	

	public void setResource(String resource) {
		this.resource = resource;
	}
	

	public String getResource() {
		return this.resource;
	}
	

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}
	

	public String getRestrictions() {
		return this.restrictions;
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setRole(Object role) {
		this.role = role;
	}
	

	public Object getRole() {
		return this.role;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Permission x = (Permission) o;
	
		return super.equals(o) &&
			Objects.equals(this.roleId, x.roleId)  &&
			Objects.equals(this.ability, x.ability)  &&
			Objects.equals(this.action, x.action)  &&
			Objects.equals(this.resource, x.resource)  &&
			Objects.equals(this.restrictions, x.restrictions)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.role, x.role) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, roleId, ability, action, resource,
			restrictions, position, previousChanges, role 
		);
	
	}
	
}
