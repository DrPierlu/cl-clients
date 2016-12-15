package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * State
 */
public class State extends ApiResource {

	private static final long serialVersionUID = -1481805606100L;


	private String countryId;
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
	

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	

	public String getCountryId() {
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
		if (o == null || getClass() != o.getClass()) return false;
	
		State x = (State) o;
	
		return super.equals(o) &&
			Objects.equals(this.countryId, x.countryId)  &&
			Objects.equals(this.code, x.code)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.country, x.country) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, countryId, code, previousChanges, country
			
		);
	
	}
	
}
