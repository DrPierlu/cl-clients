package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * State
 */
public class State extends ApiResource {

	private static final long serialVersionUID = -1482880735357L;


	@JsonExclude
	private String name;
	private Integer countryId;
	private String code;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object country;


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
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
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
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.country, x.country)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryId, code, previousChanges, country
			
		);
	
	}
	

	@Override
	public State clone() {
	
		State no = new State();
	
		no.name = this.name;
		no.countryId = this.countryId;
		no.code = this.code;
		no.previousChanges = this.previousChanges;
		no.country = this.country;
	
		return no;
	
	}
	
}
