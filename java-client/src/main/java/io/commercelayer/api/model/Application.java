package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Application
 */
public class Application extends ApiResource {

	private static final long serialVersionUID = -1482880735268L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> roles;
	@JsonExclude
	private List<String> permissions;
	@JsonExclude
	private Object authCredentials;


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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	

	public List<String> getRoles() {
		return this.roles;
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	public void setAuthCredentials(Object authCredentials) {
		this.authCredentials = authCredentials;
	}
	

	public Object getAuthCredentials() {
		return this.authCredentials;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Application x = (Application)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.roles, x.roles)
			&& Objects.equals(this.permissions, x.permissions)
			&& Objects.equals(this.authCredentials, x.authCredentials)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, consumerRoles, roles, permissions,
			authCredentials 
		);
	
	}
	

	@Override
	public Application clone() {
	
		Application no = new Application();
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.consumerRoles = this.consumerRoles;
		no.roles = this.roles;
		no.permissions = this.permissions;
		no.authCredentials = this.authCredentials;
	
		return no;
	
	}
	
}
