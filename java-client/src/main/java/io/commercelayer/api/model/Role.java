package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Role
 */
public class Role extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> consumers;
	@JsonExclude
	private List<String> permissions;
	@JsonExclude
	private List<String> versions;


	public Role() {
		super();
	}
	

	public Role(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Role name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Role versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public Role consumerRoles(List<String> consumerRoles) {
		setConsumerRoles(consumerRoles);
		return this;
	}
	

	public List<String> consumerRoles() {
		return getConsumerRoles();
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	public Role permissions(List<String> permissions) {
		setPermissions(permissions);
		return this;
	}
	

	public List<String> permissions() {
		return getPermissions();
	}
	

	public void setConsumers(List<String> consumers) {
		this.consumers = consumers;
	}
	

	public List<String> getConsumers() {
		return this.consumers;
	}
	

	public Role consumers(List<String> consumers) {
		setConsumers(consumers);
		return this;
	}
	

	public List<String> consumers() {
		return getConsumers();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Role x = (Role)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.permissions, x.permissions)
			&& Objects.equals(this.consumers, x.consumers)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, consumerRoles, permissions, consumers
			
		);
	
	}
	

	@Override
	public Role clone() {
	
		Role no = new Role();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.consumerRoles = this.consumerRoles;
		no.permissions = this.permissions;
		no.consumers = this.consumers;
	
		return no;
	
	}
	
}
