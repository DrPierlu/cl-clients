package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ResourceImage
 */
public class ResourceImage extends ApiResource {

	private static final long serialVersionUID = -1482845758187L;


	private String imageableId;
	private String imageableResource;
	private String imageId;
	private String position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object imageable;
	@JsonExclude
	private Object image;


	public ResourceImage() {
		super();
	}
	

	public ResourceImage(Long id) {
		super(id);
	}
	

	public void setImageableId(String imageableId) {
		this.imageableId = imageableId;
	}
	

	public String getImageableId() {
		return this.imageableId;
	}
	

	public void setImageableResource(String imageableResource) {
		this.imageableResource = imageableResource;
	}
	

	public String getImageableResource() {
		return this.imageableResource;
	}
	

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	

	public String getImageId() {
		return this.imageId;
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setImageable(Object imageable) {
		this.imageable = imageable;
	}
	

	public Object getImageable() {
		return this.imageable;
	}
	

	public void setImage(Object image) {
		this.image = image;
	}
	

	public Object getImage() {
		return this.image;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ResourceImage x = (ResourceImage) o;
	
		return super.equals(o) &&
			Objects.equals(this.imageableId, x.imageableId)  &&
			Objects.equals(this.imageableResource, x.imageableResource)  &&
			Objects.equals(this.imageId, x.imageId)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.imageable, x.imageable)  &&
			Objects.equals(this.image, x.image) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, imageableId, imageableResource, imageId, position,
			previousChanges, imageable, image 
		);
	
	}
	
}
