package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Permission
 */
public class Permission extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String ability;
	private String action;
	private String resource;
	private Integer roleId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object role;
	@JsonExclude
	private List<String> versions;


	public Permission() {
		super();
	}
	

	public Permission(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Permission name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	

	public Integer getRoleId() {
		return this.roleId;
	}
	

	public Permission roleId(Integer roleId) {
		setRoleId(roleId);
		return this;
	}
	

	public Integer roleId() {
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
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public Permission position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Permission versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Permission x = (Permission)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.roleId, x.roleId)
			&& Objects.equals(this.ability, x.ability)
			&& Objects.equals(this.action, x.action)
			&& Objects.equals(this.resource, x.resource)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.role, x.role)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, roleId, ability, action, resource,
			position, role, versions 
		);
	
	}
	

	@Override
	public Permission clone() {
	
		Permission no = new Permission();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.roleId = this.roleId;
		no.ability = this.ability;
		no.action = this.action;
		no.resource = this.resource;
		no.position = this.position;
		no.role = this.role;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
