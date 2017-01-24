package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * Image
 */
public class Image extends ApiResource {

	private static final long serialVersionUID = -1485265142351L;


	@JsonExclude
	private String name;
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
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.url, x.url)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, url 
		);
	
	}
	

	@Override
	public Image clone() {
	
		Image no = new Image();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.url = this.url;
	
		return no;
	
	}
	
}
