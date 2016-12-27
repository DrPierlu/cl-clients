package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * Image
 */
public class Image extends ApiResource {

	private static final long serialVersionUID = -1482880735292L;


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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setUrl(String url) {
		this.url = url;
	}
	

	public String getUrl() {
		return this.url;
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
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.url = this.url;
	
		return no;
	
	}
	
}
