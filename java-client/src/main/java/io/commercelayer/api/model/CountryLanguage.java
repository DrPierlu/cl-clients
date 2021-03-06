package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * CountryLanguage
 */
public class CountryLanguage extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer countryId;
	private Integer languageId;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object language;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer position;
	@JsonExclude
	private List<String> versions;


	public CountryLanguage() {
		super();
	}
	

	public CountryLanguage(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public CountryLanguage name(String name) {
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
	

	public CountryLanguage countryId(Integer countryId) {
		setCountryId(countryId);
		return this;
	}
	

	public Integer countryId() {
		return getCountryId();
	}
	

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	

	public Integer getLanguageId() {
		return this.languageId;
	}
	

	public CountryLanguage languageId(Integer languageId) {
		setLanguageId(languageId);
		return this;
	}
	

	public Integer languageId() {
		return getLanguageId();
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public CountryLanguage position(Integer position) {
		setPosition(position);
		return this;
	}
	

	public Integer position() {
		return getPosition();
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public CountryLanguage country(Object country) {
		setCountry(country);
		return this;
	}
	

	public Object country() {
		return getCountry();
	}
	

	public void setLanguage(Object language) {
		this.language = language;
	}
	

	public Object getLanguage() {
		return this.language;
	}
	

	public CountryLanguage language(Object language) {
		setLanguage(language);
		return this;
	}
	

	public Object language() {
		return getLanguage();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public CountryLanguage versions(List<String> versions) {
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
	
		CountryLanguage x = (CountryLanguage)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.languageId, x.languageId)
			&& Objects.equals(this.position, x.position)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.language, x.language)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryId, languageId, position, country,
			language, versions 
		);
	
	}
	

	@Override
	public CountryLanguage clone() {
	
		CountryLanguage no = new CountryLanguage();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.countryId = this.countryId;
		no.languageId = this.languageId;
		no.position = this.position;
		no.country = this.country;
		no.language = this.language;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
