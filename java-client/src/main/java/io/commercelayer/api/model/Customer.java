package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Customer
 */
public class Customer extends ApiResource {

	private static final long serialVersionUID = -1482845757953L;


	private String email;
	@JsonExclude
	private Object previousChanges;
	private List<String> resourceImages;
	private List<String> images;


	public Customer() {
		super();
	}
	

	public Customer(Long id) {
		super(id);
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Customer x = (Customer) o;
	
		return super.equals(o) &&
			Objects.equals(this.email, x.email)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.resourceImages, x.resourceImages)  &&
			Objects.equals(this.images, x.images) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, email, previousChanges, resourceImages, images
			
		);
	
	}
	
}