package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * Image
 */
public class Image extends ApiResource {

	private static final long serialVersionUID = -1483024665579L;


	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String url;


	public Image() {
		super();
	}
	

	public Image(Long id) {
		super(id);
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Image previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.url, x.url)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			previousChanges, url 
		);
	
	}
	

	@Override
	public Image clone() {
	
		Image no = new Image();
	
		no.previousChanges = this.previousChanges;
		no.url = this.url;
	
		return no;
	
	}
	
}
