package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Image
 */
public class Image extends ApiResource {

	private static final long serialVersionUID = -1L;


	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private String url;
	@JsonExclude
	private List<String> versions;


	public Image() {
		super();
	}
	

	public Image(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Image name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Image versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Image resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setUrl(String url) {
		this.url = url;
	}
	

	public String getUrl() {
		return this.url;
	}
	

	public Image url(String url) {
		setUrl(url);
		return this;
	}
	

	public String url() {
		return getUrl();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Image x = (Image)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.url, x.url)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, resourceImages, url 
		);
	
	}
	

	@Override
	public Image clone() {
	
		Image no = new Image();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.url = this.url;
	
		return no;
	
	}
	
}
