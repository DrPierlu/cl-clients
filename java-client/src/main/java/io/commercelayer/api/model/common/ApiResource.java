package io.commercelayer.api.model.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.util.LogUtils;

public abstract class ApiResource extends ApiObject implements Serializable {

	private static final long serialVersionUID = -7418858525047434358L;
	
	@JsonExclude
	protected String resourceName = null;
	@JsonExclude
	protected Long id = null;
	@JsonExclude
	protected String creatorResource = null;
	@JsonExclude
	protected LocalDateTime createdAt = null;
	@JsonExclude
	protected LocalDateTime updatedAt = null;
	
	public ApiResource() {
		super();
	}
	
	public ApiResource(Long id) {
		this();
		this.id = id;
	}
	
	public String getPlural() {
		return getClass().getSimpleName().concat("s");
	}


	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	public String resourceName() {
		return getResourceName();
	}
	
	public ApiResource resourceName(String resourceName) {
		setResourceName(resourceName);
		return this;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long id() {
		return getId();
	}
	
	public ApiResource id(Long id) {
		setId(id);
		return this;
	}


	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
	}
	
	public String creatorResource() {
		return getCreatorResource();
	}
	
	public ApiResource creatorResource(String creatorResource) {
		setCreatorResource(creatorResource);
		return this;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDateTime createdAt() {
		return getCreatedAt();
	}

	public ApiResource createdAt(LocalDateTime createdAt) {
		setCreatedAt(createdAt);
		return this;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public LocalDateTime updatedAt() {
		return getUpdatedAt();
	}
	
	public ApiResource updatedAt(LocalDateTime updatedAt) {
		setUpdatedAt(updatedAt);
		return this;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, LogUtils.TO_STRING_STYLE, false, ApiResource.class);
	}
	
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
		else
		if (o == null || getClass() != o.getClass()) return false;

		ApiResource address = (ApiResource) o;
		
		return Objects.equals(this.resourceName, address.resourceName) 
			&& Objects.equals(this.id, address.id)
			&& Objects.equals(this.creatorResource, address.creatorResource)
			&& Objects.equals(this.createdAt, address.createdAt)
			&& Objects.equals(this.updatedAt, address.updatedAt
		);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(
			resourceName, id, creatorResource, createdAt, updatedAt
		);
	}
	
	protected <T extends ApiResource> T clone(T res) {
		
		if (res == null) return res;
		
		res.setId(this.id);
		res.setCreatedAt(this.createdAt);
		res.setCreatorResource(this.creatorResource);
		res.setResourceName(this.resourceName);
		res.setUpdatedAt(this.updatedAt);
		
		return res;
		
	}

}
