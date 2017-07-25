package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ConsumerRole
 */
public class ConsumerRole extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer consumerId;
	private String consumerResource;
	private Integer roleId;
	@JsonExclude
	private Object consumer;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object role;
	@JsonExclude
	private List<String> versions;


	public ConsumerRole() {
		super();
	}
	

	public ConsumerRole(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ConsumerRole name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}
	

	public Integer getConsumerId() {
		return this.consumerId;
	}
	

	public ConsumerRole consumerId(Integer consumerId) {
		setConsumerId(consumerId);
		return this;
	}
	

	public Integer consumerId() {
		return getConsumerId();
	}
	

	public void setConsumerResource(String consumerResource) {
		this.consumerResource = consumerResource;
	}
	

	public String getConsumerResource() {
		return this.consumerResource;
	}
	

	public ConsumerRole consumerResource(String consumerResource) {
		setConsumerResource(consumerResource);
		return this;
	}
	

	public String consumerResource() {
		return getConsumerResource();
	}
	

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	

	public Integer getRoleId() {
		return this.roleId;
	}
	

	public ConsumerRole roleId(Integer roleId) {
		setRoleId(roleId);
		return this;
	}
	

	public Integer roleId() {
		return getRoleId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public ConsumerRole position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setConsumer(Object consumer) {
		this.consumer = consumer;
	}
	

	public Object getConsumer() {
		return this.consumer;
	}
	

	public ConsumerRole consumer(Object consumer) {
		setConsumer(consumer);
		return this;
	}
	

	public Object consumer() {
		return getConsumer();
	}
	

	public void setRole(Object role) {
		this.role = role;
	}
	

	public Object getRole() {
		return this.role;
	}
	

	public ConsumerRole role(Object role) {
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
	

	public ConsumerRole versions(List<String> versions) {
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
	
		ConsumerRole x = (ConsumerRole)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.consumerId, x.consumerId)
			&& Objects.equals(this.consumerResource, x.consumerResource)
			&& Objects.equals(this.roleId, x.roleId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.consumer, x.consumer)
			&& Objects.equals(this.role, x.role)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, consumerId, consumerResource, roleId, position,
			consumer, role, versions 
		);
	
	}
	

	@Override
	public ConsumerRole clone() {
	
		ConsumerRole no = new ConsumerRole();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.consumerId = this.consumerId;
		no.consumerResource = this.consumerResource;
		no.roleId = this.roleId;
		no.position = this.position;
		no.consumer = this.consumer;
		no.role = this.role;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
