package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * ConsumerRole
 */
public class ConsumerRole extends ApiResource {

	private static final long serialVersionUID = -1483100361424L;


	private String consumerId;
	private String consumerResource;
	private String roleId;
	@JsonExclude
	private Object consumer;
	@JsonExclude
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object role;


	public ConsumerRole() {
		super();
	}
	

	public ConsumerRole(Long id) {
		super(id);
	}
	

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	

	public String getConsumerId() {
		return this.consumerId;
	}
	

	public ConsumerRole consumerId(String consumerId) {
		setConsumerId(consumerId);
		return this;
	}
	

	public String consumerId() {
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
	

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	

	public String getRoleId() {
		return this.roleId;
	}
	

	public ConsumerRole roleId(String roleId) {
		setRoleId(roleId);
		return this;
	}
	

	public String roleId() {
		return getRoleId();
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public ConsumerRole position(String position) {
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
	

	public ConsumerRole previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ConsumerRole x = (ConsumerRole)o;
	
		return super.equals(o)
			&& Objects.equals(this.consumerId, x.consumerId)
			&& Objects.equals(this.consumerResource, x.consumerResource)
			&& Objects.equals(this.roleId, x.roleId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumer, x.consumer)
			&& Objects.equals(this.role, x.role)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			consumerId, consumerResource, roleId, position, previousChanges,
			consumer, role 
		);
	
	}
	

	@Override
	public ConsumerRole clone() {
	
		ConsumerRole no = new ConsumerRole();
	
		no = super.clone(no);
	
		no.consumerId = this.consumerId;
		no.consumerResource = this.consumerResource;
		no.roleId = this.roleId;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.consumer = this.consumer;
		no.role = this.role;
	
		return no;
	
	}
	
}
