package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Organization
 */
public class Organization extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private List<String> environments;
	@JsonExclude
	private List<String> versions;


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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Organization versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
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
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.environments, x.environments)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, versions, environments 
		);
	
	}
	

	@Override
	public Organization clone() {
	
		Organization no = new Organization();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.versions = this.versions;
		no.environments = this.environments;
	
		return no;
	
	}
	
}
