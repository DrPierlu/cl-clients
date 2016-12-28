package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Role
 */
public class Role extends ApiResource {

	private static final long serialVersionUID = -1482914097950L;


	private String name;
	@JsonExclude
	private String description;
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
	

	public Role name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public Role description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Role previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Role x = (Role)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.consumers, x.consumers)
			&& Objects.equals(this.permissions, x.permissions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, description, previousChanges, consumerRoles, consumers,
			permissions 
		);
	
	}
	

	@Override
	public Role clone() {
	
		Role no = new Role();
	
		no.name = this.name;
		no.description = this.description;
		no.previousChanges = this.previousChanges;
		no.consumerRoles = this.consumerRoles;
		no.consumers = this.consumers;
		no.permissions = this.permissions;
	
		return no;
	
	}
	
}
