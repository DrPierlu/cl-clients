package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * ResourceImage
 */
public class ResourceImage extends ApiResource {

	private static final long serialVersionUID = -1484566577886L;


	private Integer imageId;
	private Integer imageableId;
	private String imageableResource;
	@JsonExclude
	private Object image;
	@JsonExclude
	private Object imageable;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String sluggedUrl;


	public ResourceImage() {
		super();
	}
	

	public ResourceImage(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ResourceImage name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setImageableId(Integer imageableId) {
		this.imageableId = imageableId;
	}
	

	public Integer getImageableId() {
		return this.imageableId;
	}
	

	public ResourceImage imageableId(Integer imageableId) {
		setImageableId(imageableId);
		return this;
	}
	

	public Integer imageableId() {
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
	

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	

	public Integer getImageId() {
		return this.imageId;
	}
	

	public ResourceImage imageId(Integer imageId) {
		setImageId(imageId);
		return this;
	}
	

	public Integer imageId() {
		return getImageId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public ResourceImage position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
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
	

	public void setSluggedUrl(String sluggedUrl) {
		this.sluggedUrl = sluggedUrl;
	}
	

	public String getSluggedUrl() {
		return this.sluggedUrl;
	}
	

	public ResourceImage sluggedUrl(String sluggedUrl) {
		setSluggedUrl(sluggedUrl);
		return this;
	}
	

	public String sluggedUrl() {
		return getSluggedUrl();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ResourceImage x = (ResourceImage)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.imageableId, x.imageableId)
			&& Objects.equals(this.imageableResource, x.imageableResource)
			&& Objects.equals(this.imageId, x.imageId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.imageable, x.imageable)
			&& Objects.equals(this.image, x.image)
			&& Objects.equals(this.sluggedUrl, x.sluggedUrl)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, imageableId, imageableResource, imageId, position,
			previousChanges, imageable, image, sluggedUrl 
		);
	
	}
	

	@Override
	public ResourceImage clone() {
	
		ResourceImage no = new ResourceImage();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.imageableId = this.imageableId;
		no.imageableResource = this.imageableResource;
		no.imageId = this.imageId;
		no.position = this.position;
		no.previousChanges = this.previousChanges;
		no.imageable = this.imageable;
		no.image = this.image;
		no.sluggedUrl = this.sluggedUrl;
	
		return no;
	
	}
	
}
