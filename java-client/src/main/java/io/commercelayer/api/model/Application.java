package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Application
 */
public class Application extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private Object authCredentials;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> permissions;
	@JsonExclude
	private List<String> roles;
	@JsonExclude
	private List<String> versions;


	public Application() {
		super();
	}
	

	public Application(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Application name(String name) {
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
	

	public Application versions(List<String> versions) {
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
	

	public Application consumerRoles(List<String> consumerRoles) {
		setConsumerRoles(consumerRoles);
		return this;
	}
	

	public List<String> consumerRoles() {
		return getConsumerRoles();
	}
	

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	

	public List<String> getRoles() {
		return this.roles;
	}
	

	public Application roles(List<String> roles) {
		setRoles(roles);
		return this;
	}
	

	public List<String> roles() {
		return getRoles();
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	public Application permissions(List<String> permissions) {
		setPermissions(permissions);
		return this;
	}
	

	public List<String> permissions() {
		return getPermissions();
	}
	

	public void setAuthCredentials(Object authCredentials) {
		this.authCredentials = authCredentials;
	}
	

	public Object getAuthCredentials() {
		return this.authCredentials;
	}
	

	public Application authCredentials(Object authCredentials) {
		setAuthCredentials(authCredentials);
		return this;
	}
	

	public Object authCredentials() {
		return getAuthCredentials();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Application x = (Application)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.roles, x.roles)
			&& Objects.equals(this.permissions, x.permissions)
			&& Objects.equals(this.authCredentials, x.authCredentials)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, consumerRoles, roles, permissions,
			authCredentials 
		);
	
	}
	

	@Override
	public Application clone() {
	
		Application no = new Application();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.consumerRoles = this.consumerRoles;
		no.roles = this.roles;
		no.permissions = this.permissions;
		no.authCredentials = this.authCredentials;
	
		return no;
	
	}
	
}
