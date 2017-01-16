package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Organization
 */
public class Organization extends ApiResource {

	private static final long serialVersionUID = -1484581108913L;


	private String name;
	@JsonExclude
	private List<String> environments;
	@JsonExclude
	private Object previousChanges;


	public Organization() {
		super();
	}
	

	public Organization(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Organization name(String name) {
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
	

	public Organization previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setEnvironments(List<String> environments) {
		this.environments = environments;
	}
	

	public List<String> getEnvironments() {
		return this.environments;
	}
	

	public Organization environments(List<String> environments) {
		setEnvironments(environments);
		return this;
	}
	

	public List<String> environments() {
		return getEnvironments();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Organization x = (Organization)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.environments, x.environments)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges, environments 
		);
	
	}
	

	@Override
	public Organization clone() {
	
		Organization no = new Organization();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.environments = this.environments;
	
		return no;
	
	}
	
}
