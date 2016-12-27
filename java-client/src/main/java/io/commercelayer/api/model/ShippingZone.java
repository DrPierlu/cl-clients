package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingZone
 */
public class ShippingZone extends ApiResource {

	private static final long serialVersionUID = -1482880735355L;


	private Integer countryGroupId;
	private String name;
	@JsonExclude
	private String countryCodeRegex;
	@JsonExclude
	private String notCountryCodeRegex;
	@JsonExclude
	private String stateCodeRegex;
	@JsonExclude
	private String notStateCodeRegex;
	@JsonExclude
	private String zipCodeRegex;
	@JsonExclude
	private String notZipCodeRegex;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private List<String> shippingServiceZones;
	@JsonExclude
	private List<String> shippingServices;


	public ShippingZone() {
		super();
	}
	

	public ShippingZone(Long id) {
		super(id);
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setCountryCodeRegex(String countryCodeRegex) {
		this.countryCodeRegex = countryCodeRegex;
	}
	

	public String getCountryCodeRegex() {
		return this.countryCodeRegex;
	}
	

	public void setNotCountryCodeRegex(String notCountryCodeRegex) {
		this.notCountryCodeRegex = notCountryCodeRegex;
	}
	

	public String getNotCountryCodeRegex() {
		return this.notCountryCodeRegex;
	}
	

	public void setStateCodeRegex(String stateCodeRegex) {
		this.stateCodeRegex = stateCodeRegex;
	}
	

	public String getStateCodeRegex() {
		return this.stateCodeRegex;
	}
	

	public void setNotStateCodeRegex(String notStateCodeRegex) {
		this.notStateCodeRegex = notStateCodeRegex;
	}
	

	public String getNotStateCodeRegex() {
		return this.notStateCodeRegex;
	}
	

	public void setZipCodeRegex(String zipCodeRegex) {
		this.zipCodeRegex = zipCodeRegex;
	}
	

	public String getZipCodeRegex() {
		return this.zipCodeRegex;
	}
	

	public void setNotZipCodeRegex(String notZipCodeRegex) {
		this.notZipCodeRegex = notZipCodeRegex;
	}
	

	public String getNotZipCodeRegex() {
		return this.notZipCodeRegex;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingZone x = (ShippingZone)o;
	
		return super.equals(o)
			&& Objects.equals(this.countryGroupId, x.countryGroupId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryCodeRegex, x.countryCodeRegex)
			&& Objects.equals(this.notCountryCodeRegex, x.notCountryCodeRegex)
			&& Objects.equals(this.stateCodeRegex, x.stateCodeRegex)
			&& Objects.equals(this.notStateCodeRegex, x.notStateCodeRegex)
			&& Objects.equals(this.zipCodeRegex, x.zipCodeRegex)
			&& Objects.equals(this.notZipCodeRegex, x.notZipCodeRegex)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.countryGroup, x.countryGroup)
			&& Objects.equals(this.shippingServiceZones, x.shippingServiceZones)
			&& Objects.equals(this.shippingServices, x.shippingServices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			countryGroupId, name, countryCodeRegex, notCountryCodeRegex, stateCodeRegex,
			notStateCodeRegex, zipCodeRegex, notZipCodeRegex, previousChanges, countryGroup,
			shippingServiceZones, shippingServices 
		);
	
	}
	

	@Override
	public ShippingZone clone() {
	
		ShippingZone no = new ShippingZone();
	
		no.countryGroupId = this.countryGroupId;
		no.name = this.name;
		no.countryCodeRegex = this.countryCodeRegex;
		no.notCountryCodeRegex = this.notCountryCodeRegex;
		no.stateCodeRegex = this.stateCodeRegex;
		no.notStateCodeRegex = this.notStateCodeRegex;
		no.zipCodeRegex = this.zipCodeRegex;
		no.notZipCodeRegex = this.notZipCodeRegex;
		no.previousChanges = this.previousChanges;
		no.countryGroup = this.countryGroup;
		no.shippingServiceZones = this.shippingServiceZones;
		no.shippingServices = this.shippingServices;
	
		return no;
	
	}
	
}
