package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * ShippingZone
 */
public class ShippingZone extends ApiResource {

	private static final long serialVersionUID = -1483100361790L;


	private String countryGroupId;
	private String name;
	@JsonExclude
	private String countryCodeRegex;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private String notCountryCodeRegex;
	@JsonExclude
	private String notStateCodeRegex;
	@JsonExclude
	private String notZipCodeRegex;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> shippingServiceZones;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private String stateCodeRegex;
	@JsonExclude
	private String zipCodeRegex;


	public ShippingZone() {
		super();
	}
	

	public ShippingZone(Long id) {
		super(id);
	}
	

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public String getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public ShippingZone countryGroupId(String countryGroupId) {
		setCountryGroupId(countryGroupId);
		return this;
	}
	

	public String countryGroupId() {
		return getCountryGroupId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingZone name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCountryCodeRegex(String countryCodeRegex) {
		this.countryCodeRegex = countryCodeRegex;
	}
	

	public String getCountryCodeRegex() {
		return this.countryCodeRegex;
	}
	

	public ShippingZone countryCodeRegex(String countryCodeRegex) {
		setCountryCodeRegex(countryCodeRegex);
		return this;
	}
	

	public String countryCodeRegex() {
		return getCountryCodeRegex();
	}
	

	public void setNotCountryCodeRegex(String notCountryCodeRegex) {
		this.notCountryCodeRegex = notCountryCodeRegex;
	}
	

	public String getNotCountryCodeRegex() {
		return this.notCountryCodeRegex;
	}
	

	public ShippingZone notCountryCodeRegex(String notCountryCodeRegex) {
		setNotCountryCodeRegex(notCountryCodeRegex);
		return this;
	}
	

	public String notCountryCodeRegex() {
		return getNotCountryCodeRegex();
	}
	

	public void setStateCodeRegex(String stateCodeRegex) {
		this.stateCodeRegex = stateCodeRegex;
	}
	

	public String getStateCodeRegex() {
		return this.stateCodeRegex;
	}
	

	public ShippingZone stateCodeRegex(String stateCodeRegex) {
		setStateCodeRegex(stateCodeRegex);
		return this;
	}
	

	public String stateCodeRegex() {
		return getStateCodeRegex();
	}
	

	public void setNotStateCodeRegex(String notStateCodeRegex) {
		this.notStateCodeRegex = notStateCodeRegex;
	}
	

	public String getNotStateCodeRegex() {
		return this.notStateCodeRegex;
	}
	

	public ShippingZone notStateCodeRegex(String notStateCodeRegex) {
		setNotStateCodeRegex(notStateCodeRegex);
		return this;
	}
	

	public String notStateCodeRegex() {
		return getNotStateCodeRegex();
	}
	

	public void setZipCodeRegex(String zipCodeRegex) {
		this.zipCodeRegex = zipCodeRegex;
	}
	

	public String getZipCodeRegex() {
		return this.zipCodeRegex;
	}
	

	public ShippingZone zipCodeRegex(String zipCodeRegex) {
		setZipCodeRegex(zipCodeRegex);
		return this;
	}
	

	public String zipCodeRegex() {
		return getZipCodeRegex();
	}
	

	public void setNotZipCodeRegex(String notZipCodeRegex) {
		this.notZipCodeRegex = notZipCodeRegex;
	}
	

	public String getNotZipCodeRegex() {
		return this.notZipCodeRegex;
	}
	

	public ShippingZone notZipCodeRegex(String notZipCodeRegex) {
		setNotZipCodeRegex(notZipCodeRegex);
		return this;
	}
	

	public String notZipCodeRegex() {
		return getNotZipCodeRegex();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingZone previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public ShippingZone countryGroup(Object countryGroup) {
		setCountryGroup(countryGroup);
		return this;
	}
	

	public Object countryGroup() {
		return getCountryGroup();
	}
	

	public void setShippingServiceZones(List<String> shippingServiceZones) {
		this.shippingServiceZones = shippingServiceZones;
	}
	

	public List<String> getShippingServiceZones() {
		return this.shippingServiceZones;
	}
	

	public ShippingZone shippingServiceZones(List<String> shippingServiceZones) {
		setShippingServiceZones(shippingServiceZones);
		return this;
	}
	

	public List<String> shippingServiceZones() {
		return getShippingServiceZones();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public ShippingZone shippingServices(List<String> shippingServices) {
		setShippingServices(shippingServices);
		return this;
	}
	

	public List<String> shippingServices() {
		return getShippingServices();
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
	
		no = super.clone(no);
	
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
