package io.commercelayer.api.model;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.SerializedName;

public abstract class ApiResource {

	@SerializedName("resource_name")
	protected String resourceName = null;

	@SerializedName("id")
	protected String id = null;

	@SerializedName("creator_id")
	protected String creatorId = null;

	@SerializedName("creator_resource")
	protected String creatorResource = null;

	@SerializedName("created_at")
	protected LocalDateTime createdAt = null;

	@SerializedName("updated_at")
	protected LocalDateTime updatedAt = null;

	@SerializedName("expanded")
	protected String expanded = null;

//	@SuppressWarnings("unchecked")
//	public T resourceName(String resourceName) {
//		this.resourceName = resourceName;
//		return (T)this;
//	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

//	@SuppressWarnings("unchecked")
//	public T id(String id) {
//		this.id = id;
//		return (T)this;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	@SuppressWarnings("unchecked")
//	public T creatorId(String creatorId) {
//		this.creatorId = creatorId;
//		return (T)this;
//	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

//	@SuppressWarnings("unchecked")
//	public T creatorResource(String creatorResource) {
//		this.creatorResource = creatorResource;
//		return (T)this;
//	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
	}

//	@SuppressWarnings("unchecked")
//	public T createdAt(DateTime createdAt) {
//		this.createdAt = createdAt;
//		return (T)this;
//	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

//	@SuppressWarnings("unchecked")
//	public T updatedAt(DateTime updatedAt) {
//		this.updatedAt = updatedAt;
//		return (T)this;
//	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

//	@SuppressWarnings("unchecked")
//	public T expanded(String expanded) {
//		this.expanded = expanded;
//		return (T)this;
//	}

	public String getExpanded() {
		return expanded;
	}

	public void setExpanded(String expanded) {
		this.expanded = expanded;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
