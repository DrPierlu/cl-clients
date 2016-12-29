package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * ResourceImage
 */
public class ResourceImage extends ApiResource {

	private static final long serialVersionUID = -1483006114360L;


	private String imageId;
	private String imageableId;
	private String imageableResource;
	@JsonExclude
	private Object image;
	@JsonExclude
	private Object imageable;
	@JsonExclude
	private String position;
	@JsonExclude
	private Object previousChanges;


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
	

	public ResourceImage imageableId(String imageableId) {
		setImageableId(imageableId);
		return this;
	}
	

	public String imageableId() {
		return getImageableId();
	}
	

	public void setImageableResource(String imageableResource) {
		this.imageableResource = imageableResource;
	}
	

	public String getImageableResource() {
		return this.imageableResource;
	}
	

	public ResourceImage imageableResource(String imageableResource) {
		setImageableResource(imageableResource);
		return this;
	}
	

	public String imageableResource() {
		return getImageableResource();
	}
	

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	

	public String getImageId() {
		return this.imageId;
	}
	

	public ResourceImage imageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	

	public String imageId() {
		return getImageId();
	}
	

	public void setPosition(String position) {
		this.position = position;
	}
	

	public String getPosition() {
		return this.position;
	}
	

	public ResourceImage position(String position) {
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
	

	public ResourceImage previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setImageable(Object imageable) {
		this.imageable = imageable;
	}
	

	public Object getImageable() {
		return this.imageable;
	}
	

	public ResourceImage imageable(Object imageable) {
		setImageable(imageable);
		return this;
	}
	

	public Object imageable() {
		return getImageable();
	}
	

	public void setImage(Object image) {
		this.image = image;
	}
	

	public Object getImage() {
		return this.image;
	}
	

	public ResourceImage image(Object image) {
		setImage(image);
		return this;
	}
	

	public Object image() {
		return getImage();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ResourceImage x = (ResourceImage)o;
	
		return super.equals(o)
			&& Objects.equals(this.imageableId, x.imageableId)
			&& Objects.equals(this.imageableResource, x.imageableResource)
			&& Objects.equals(this.imageId, x.imageId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.imageable, x.imageable)
			&& Objects.equals(this.image, x.image)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			imageableId, imageableResource, imageId, position, previousChanges,
			imageable, image 
		);
	
	}
	

	@Override
	public ResourceImage clone() {
	
		ResourceImage no = new ResourceImage();
	
		no.imageableId = this.imageableId;
		no.imageableResource = this.imageableResource;
		no.imageId = this.imageId;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.imageable = this.imageable;
		no.image = this.image;
	
		return no;
	
	}
	
}
