package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * Permission
 */
public class Permission extends ApiResource {

	private static final long serialVersionUID = -1483100361645L;


	private String ability;
	private String action;
	private String resource;
	private String roleId;
	@JsonExclude
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String restrictions;
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
	

	public Permission roleId(String roleId) {
		setRoleId(roleId);
		return this;
	}
	

	public String roleId() {
		return getRoleId();
	}
	

	public void setAbility(String ability) {
		this.ability = ability;
	}
	

	public String getAbility() {
		return this.ability;
	}
	

	public Permission ability(String ability) {
		setAbility(ability);
		return this;
	}
	

	public String ability() {
		return getAbility();
	}
	

	public void setAction(String action) {
		this.action = action;
	}
	

	public String getAction() {
		return this.action;
	}
	

	public Permission action(String action) {
		setAction(action);
		return this;
	}
	

	public String action() {
		return getAction();
	}
	

	public void setResource(String resource) {
		this.resource = resource;
	}
	

	public String getResource() {
		return this.resource;
	}
	

	public Permission resource(String resource) {
		setResource(resource);
		return this;
	}
	

	public String resource() {
		return getResource();
	}
	

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}
	

	public String getRestrictions() {
		return this.restrictions;
	}
	

	public Permission restrictions(String restrictions) {
		setRestrictions(restrictions);
		return this;
	}
	

	public String restrictions() {
		return getRestrictions();
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public Permission position(String position) {
		setPosition(position);
		return this;
	}
	

	public String position() {
		return getPosition();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Permission previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setRole(Object role) {
		this.role = role;
	}
	

	public Object getRole() {
		return this.role;
	}
	

	public Permission role(Object role) {
		setRole(role);
		return this;
	}
	

	public Object role() {
		return getRole();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Permission x = (Permission)o;
	
		return super.equals(o)
			&& Objects.equals(this.roleId, x.roleId)
			&& Objects.equals(this.ability, x.ability)
			&& Objects.equals(this.action, x.action)
			&& Objects.equals(this.resource, x.resource)
			&& Objects.equals(this.restrictions, x.restrictions)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.role, x.role)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			roleId, ability, action, resource, restrictions,
			position, previousChanges, role 
		);
	
	}
	

	@Override
	public Permission clone() {
	
		Permission no = new Permission();
	
		no = super.clone(no);
	
		no.roleId = this.roleId;
		no.ability = this.ability;
		no.action = this.action;
		no.resource = this.resource;
		no.restrictions = this.restrictions;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.role = this.role;
	
		return no;
	
	}
	
}
