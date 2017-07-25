package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * State
 */
public class State extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String code;
	private Integer countryId;
	@JsonExclude
	private Object country;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> versions;


	public State() {
		super();
	}
	

	public State(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public State name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public State countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public State code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public State country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public State versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		State x = (State)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryId, code, country, versions
			
		);
	
	}
	

	@Override
	public State clone() {
	
		State no = new State();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.countryId = this.countryId;
		no.code = this.code;
		no.country = this.country;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
