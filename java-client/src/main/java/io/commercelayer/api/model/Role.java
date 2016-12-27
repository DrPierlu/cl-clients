package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Role
 */
public class Role extends ApiResource {

	private static final long serialVersionUID = -1482880735340L;


	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> consumers;
	@JsonExclude
	private List<String> permissions;


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
	

	public void setConsumers(List<String> consumers) {
		this.consumers = consumers;
	}
	

	public List<String> getConsumers() {
		return this.consumers;
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Role x = (Role)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.consumers, x.consumers)
			&& Objects.equals(this.permissions, x.permissions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, consumerRoles, consumers, permissions
			
		);
	
	}
	

	@Override
	public Role clone() {
	
		Role no = new Role();
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.consumerRoles = this.consumerRoles;
		no.consumers = this.consumers;
		no.permissions = this.permissions;
	
		return no;
	
	}
	
}
