package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ConsumerRole
 */
public class ConsumerRole extends ApiResource {

	private static final long serialVersionUID = -1481927389031L;


	private Integer consumerId;
	private String consumerResource;
	private Integer roleId;
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object consumer;
	@JsonExclude
	private Object role;


	public ConsumerRole() {
		super();
	}
	

	public ConsumerRole(Long id) {
		super(id);
	}
	

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}
	

	public Integer getConsumerId() {
		return this.consumerId;
	}
	

	public void setConsumerResource(String consumerResource) {
		this.consumerResource = consumerResource;
	}
	

	public String getConsumerResource() {
		return this.consumerResource;
	}
	

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	

	public Integer getRoleId() {
		return this.roleId;
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setConsumer(Object consumer) {
		this.consumer = consumer;
	}
	

	public Object getConsumer() {
		return this.consumer;
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
	
		ConsumerRole x = (ConsumerRole) o;
	
		return super.equals(o) &&
			Objects.equals(this.consumerId, x.consumerId)  &&
			Objects.equals(this.consumerResource, x.consumerResource)  &&
			Objects.equals(this.roleId, x.roleId)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.consumer, x.consumer)  &&
			Objects.equals(this.role, x.role) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, consumerId, consumerResource, roleId, position,
			previousChanges, consumer, role 
		);
	
	}
	
}
