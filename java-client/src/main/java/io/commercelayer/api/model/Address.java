package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * Address
 */
public class Address extends ApiResource {

	private static final long serialVersionUID = -1483006113992L;


	private String geocodingCity;
	private String geocodingCountry;
	private String geocodingNumber;
	private String geocodingStreet;
	private String geocodingZip;
	@JsonExclude
	private String accuracy;
	@JsonExclude
	private String city;
	@JsonExclude
	private String country;
	@JsonExclude
	private String countryCode;
	@JsonExclude
	private String district;
	@JsonExclude
	private String formattedAddress;
	@JsonExclude
	private String fullAddress;
	@JsonExclude
	private Float lat;
	@JsonExclude
	private Float lng;
	@JsonExclude
	private String placeId;
	@JsonExclude
	private String precision;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String provider;
	@JsonExclude
	private String province;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private String state;
	@JsonExclude
	private String stateCode;
	@JsonExclude
	private String stateName;
	@JsonExclude
	private String streetAddress;
	@JsonExclude
	private String streetName;
	@JsonExclude
	private String streetNumber;
	@JsonExclude
	private String subPremise;
	@JsonExclude
	private Float suggestedBoundsNeLat;
	@JsonExclude
	private Float suggestedBoundsNeLng;
	@JsonExclude
	private Float suggestedBoundsSwLat;
	@JsonExclude
	private Float suggestedBoundsSwLng;
	@JsonExclude
	private String zip;


	public Address() {
		super();
	}
	

	public Address(Long id) {
		super(id);
	}
	

	public void setGeocodingCountry(String geocodingCountry) {
		this.geocodingCountry = geocodingCountry;
	}
	

	public String getGeocodingCountry() {
		return this.geocodingCountry;
	}
	

	public Address geocodingCountry(String geocodingCountry) {
		setGeocodingCountry(geocodingCountry);
		return this;
	}
	

	public String geocodingCountry() {
		return getGeocodingCountry();
	}
	

	public void setGeocodingZip(String geocodingZip) {
		this.geocodingZip = geocodingZip;
	}
	

	public String getGeocodingZip() {
		return this.geocodingZip;
	}
	

	public Address geocodingZip(String geocodingZip) {
		setGeocodingZip(geocodingZip);
		return this;
	}
	

	public String geocodingZip() {
		return getGeocodingZip();
	}
	

	public void setGeocodingCity(String geocodingCity) {
		this.geocodingCity = geocodingCity;
	}
	

	public String getGeocodingCity() {
		return this.geocodingCity;
	}
	

	public Address geocodingCity(String geocodingCity) {
		setGeocodingCity(geocodingCity);
		return this;
	}
	

	public String geocodingCity() {
		return getGeocodingCity();
	}
	

	public void setGeocodingStreet(String geocodingStreet) {
		this.geocodingStreet = geocodingStreet;
	}
	

	public String getGeocodingStreet() {
		return this.geocodingStreet;
	}
	

	public Address geocodingStreet(String geocodingStreet) {
		setGeocodingStreet(geocodingStreet);
		return this;
	}
	

	public String geocodingStreet() {
		return getGeocodingStreet();
	}
	

	public void setGeocodingNumber(String geocodingNumber) {
		this.geocodingNumber = geocodingNumber;
	}
	

	public String getGeocodingNumber() {
		return this.geocodingNumber;
	}
	

	public Address geocodingNumber(String geocodingNumber) {
		setGeocodingNumber(geocodingNumber);
		return this;
	}
	

	public String geocodingNumber() {
		return getGeocodingNumber();
	}
	

	public void setProvider(String provider) {
		this.provider = provider;
	}
	

	public String getProvider() {
		return this.provider;
	}
	

	public Address provider(String provider) {
		setProvider(provider);
		return this;
	}
	

	public String provider() {
		return getProvider();
	}
	

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	

	public String getPlaceId() {
		return this.placeId;
	}
	

	public Address placeId(String placeId) {
		setPlaceId(placeId);
		return this;
	}
	

	public String placeId() {
		return getPlaceId();
	}
	

	public void setPrecision(String precision) {
		this.precision = precision;
	}
	

	public String getPrecision() {
		return this.precision;
	}
	

	public Address precision(String precision) {
		setPrecision(precision);
		return this;
	}
	

	public String precision() {
		return getPrecision();
	}
	

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	

	public String getAccuracy() {
		return this.accuracy;
	}
	

	public Address accuracy(String accuracy) {
		setAccuracy(accuracy);
		return this;
	}
	

	public String accuracy() {
		return getAccuracy();
	}
	

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

	public String getCountryCode() {
		return this.countryCode;
	}
	

	public Address countryCode(String countryCode) {
		setCountryCode(countryCode);
		return this;
	}
	

	public String countryCode() {
		return getCountryCode();
	}
	

	public void setCountry(String country) {
		this.country = country;
	}
	

	public String getCountry() {
		return this.country;
	}
	

	public Address country(String country) {
		setCountry(country);
		return this;
	}
	

	public String country() {
		return getCountry();
	}
	

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	

	public String getStateCode() {
		return this.stateCode;
	}
	

	public Address stateCode(String stateCode) {
		setStateCode(stateCode);
		return this;
	}
	

	public String stateCode() {
		return getStateCode();
	}
	

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

	public String getStateName() {
		return this.stateName;
	}
	

	public Address stateName(String stateName) {
		setStateName(stateName);
		return this;
	}
	

	public String stateName() {
		return getStateName();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Address state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setProvince(String province) {
		this.province = province;
	}
	

	public String getProvince() {
		return this.province;
	}
	

	public Address province(String province) {
		setProvince(province);
		return this;
	}
	

	public String province() {
		return getProvince();
	}
	

	public void setZip(String zip) {
		this.zip = zip;
	}
	

	public String getZip() {
		return this.zip;
	}
	

	public Address zip(String zip) {
		setZip(zip);
		return this;
	}
	

	public String zip() {
		return getZip();
	}
	

	public void setCity(String city) {
		this.city = city;
	}
	

	public String getCity() {
		return this.city;
	}
	

	public Address city(String city) {
		setCity(city);
		return this;
	}
	

	public String city() {
		return getCity();
	}
	

	public void setDistrict(String district) {
		this.district = district;
	}
	

	public String getDistrict() {
		return this.district;
	}
	

	public Address district(String district) {
		setDistrict(district);
		return this;
	}
	

	public String district() {
		return getDistrict();
	}
	

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	

	public String getStreetName() {
		return this.streetName;
	}
	

	public Address streetName(String streetName) {
		setStreetName(streetName);
		return this;
	}
	

	public String streetName() {
		return getStreetName();
	}
	

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	

	public String getStreetNumber() {
		return this.streetNumber;
	}
	

	public Address streetNumber(String streetNumber) {
		setStreetNumber(streetNumber);
		return this;
	}
	

	public String streetNumber() {
		return getStreetNumber();
	}
	

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	

	public String getStreetAddress() {
		return this.streetAddress;
	}
	

	public Address streetAddress(String streetAddress) {
		setStreetAddress(streetAddress);
		return this;
	}
	

	public String streetAddress() {
		return getStreetAddress();
	}
	

	public void setSubPremise(String subPremise) {
		this.subPremise = subPremise;
	}
	

	public String getSubPremise() {
		return this.subPremise;
	}
	

	public Address subPremise(String subPremise) {
		setSubPremise(subPremise);
		return this;
	}
	

	public String subPremise() {
		return getSubPremise();
	}
	

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	

	public String getFullAddress() {
		return this.fullAddress;
	}
	

	public Address fullAddress(String fullAddress) {
		setFullAddress(fullAddress);
		return this;
	}
	

	public String fullAddress() {
		return getFullAddress();
	}
	

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	

	public String getFormattedAddress() {
		return this.formattedAddress;
	}
	

	public Address formattedAddress(String formattedAddress) {
		setFormattedAddress(formattedAddress);
		return this;
	}
	

	public String formattedAddress() {
		return getFormattedAddress();
	}
	

	public void setLat(Float lat) {
		this.lat = lat;
	}
	

	public Float getLat() {
		return this.lat;
	}
	

	public Address lat(Float lat) {
		setLat(lat);
		return this;
	}
	

	public Float lat() {
		return getLat();
	}
	

	public void setLng(Float lng) {
		this.lng = lng;
	}
	

	public Float getLng() {
		return this.lng;
	}
	

	public Address lng(Float lng) {
		setLng(lng);
		return this;
	}
	

	public Float lng() {
		return getLng();
	}
	

	public void setSuggestedBoundsSwLat(Float suggestedBoundsSwLat) {
		this.suggestedBoundsSwLat = suggestedBoundsSwLat;
	}
	

	public Float getSuggestedBoundsSwLat() {
		return this.suggestedBoundsSwLat;
	}
	

	public Address suggestedBoundsSwLat(Float suggestedBoundsSwLat) {
		setSuggestedBoundsSwLat(suggestedBoundsSwLat);
		return this;
	}
	

	public Float suggestedBoundsSwLat() {
		return getSuggestedBoundsSwLat();
	}
	

	public void setSuggestedBoundsSwLng(Float suggestedBoundsSwLng) {
		this.suggestedBoundsSwLng = suggestedBoundsSwLng;
	}
	

	public Float getSuggestedBoundsSwLng() {
		return this.suggestedBoundsSwLng;
	}
	

	public Address suggestedBoundsSwLng(Float suggestedBoundsSwLng) {
		setSuggestedBoundsSwLng(suggestedBoundsSwLng);
		return this;
	}
	

	public Float suggestedBoundsSwLng() {
		return getSuggestedBoundsSwLng();
	}
	

	public void setSuggestedBoundsNeLat(Float suggestedBoundsNeLat) {
		this.suggestedBoundsNeLat = suggestedBoundsNeLat;
	}
	

	public Float getSuggestedBoundsNeLat() {
		return this.suggestedBoundsNeLat;
	}
	

	public Address suggestedBoundsNeLat(Float suggestedBoundsNeLat) {
		setSuggestedBoundsNeLat(suggestedBoundsNeLat);
		return this;
	}
	

	public Float suggestedBoundsNeLat() {
		return getSuggestedBoundsNeLat();
	}
	

	public void setSuggestedBoundsNeLng(Float suggestedBoundsNeLng) {
		this.suggestedBoundsNeLng = suggestedBoundsNeLng;
	}
	

	public Float getSuggestedBoundsNeLng() {
		return this.suggestedBoundsNeLng;
	}
	

	public Address suggestedBoundsNeLng(Float suggestedBoundsNeLng) {
		setSuggestedBoundsNeLng(suggestedBoundsNeLng);
		return this;
	}
	

	public Float suggestedBoundsNeLng() {
		return getSuggestedBoundsNeLng();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Address previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public Address shippingMethods(List<String> shippingMethods) {
		setShippingMethods(shippingMethods);
		return this;
	}
	

	public List<String> shippingMethods() {
		return getShippingMethods();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Address x = (Address)o;
	
		return super.equals(o)
			&& Objects.equals(this.geocodingCountry, x.geocodingCountry)
			&& Objects.equals(this.geocodingZip, x.geocodingZip)
			&& Objects.equals(this.geocodingCity, x.geocodingCity)
			&& Objects.equals(this.geocodingStreet, x.geocodingStreet)
			&& Objects.equals(this.geocodingNumber, x.geocodingNumber)
			&& Objects.equals(this.provider, x.provider)
			&& Objects.equals(this.placeId, x.placeId)
			&& Objects.equals(this.precision, x.precision)
			&& Objects.equals(this.accuracy, x.accuracy)
			&& Objects.equals(this.countryCode, x.countryCode)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.stateCode, x.stateCode)
			&& Objects.equals(this.stateName, x.stateName)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.province, x.province)
			&& Objects.equals(this.zip, x.zip)
			&& Objects.equals(this.city, x.city)
			&& Objects.equals(this.district, x.district)
			&& Objects.equals(this.streetName, x.streetName)
			&& Objects.equals(this.streetNumber, x.streetNumber)
			&& Objects.equals(this.streetAddress, x.streetAddress)
			&& Objects.equals(this.subPremise, x.subPremise)
			&& Objects.equals(this.fullAddress, x.fullAddress)
			&& Objects.equals(this.formattedAddress, x.formattedAddress)
			&& Objects.equals(this.lat, x.lat)
			&& Objects.equals(this.lng, x.lng)
			&& Objects.equals(this.suggestedBoundsSwLat, x.suggestedBoundsSwLat)
			&& Objects.equals(this.suggestedBoundsSwLng, x.suggestedBoundsSwLng)
			&& Objects.equals(this.suggestedBoundsNeLat, x.suggestedBoundsNeLat)
			&& Objects.equals(this.suggestedBoundsNeLng, x.suggestedBoundsNeLng)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			geocodingCountry, geocodingZip, geocodingCity, geocodingStreet, geocodingNumber,
			provider, placeId, precision, accuracy, countryCode,
			country, stateCode, stateName, state, province,
			zip, city, district, streetName, streetNumber,
			streetAddress, subPremise, fullAddress, formattedAddress, lat,
			lng, suggestedBoundsSwLat, suggestedBoundsSwLng, suggestedBoundsNeLat, suggestedBoundsNeLng,
			previousChanges, shippingMethods 
		);
	
	}
	

	@Override
	public Address clone() {
	
		Address no = new Address();
	
		no.geocodingCountry = this.geocodingCountry;
		no.geocodingZip = this.geocodingZip;
		no.geocodingCity = this.geocodingCity;
		no.geocodingStreet = this.geocodingStreet;
		no.geocodingNumber = this.geocodingNumber;
		no.provider = this.provider;
		no.placeId = this.placeId;
		no.precision = this.precision;
		no.accuracy = this.accuracy;
		no.countryCode = this.countryCode;
		no.country = this.country;
		no.stateCode = this.stateCode;
		no.stateName = this.stateName;
		no.state = this.state;
		no.province = this.province;
		no.zip = this.zip;
		no.city = this.city;
		no.district = this.district;
		no.streetName = this.streetName;
		no.streetNumber = this.streetNumber;
		no.streetAddress = this.streetAddress;
		no.subPremise = this.subPremise;
		no.fullAddress = this.fullAddress;
		no.formattedAddress = this.formattedAddress;
		no.lat = this.lat;
		no.lng = this.lng;
		no.suggestedBoundsSwLat = this.suggestedBoundsSwLat;
		no.suggestedBoundsSwLng = this.suggestedBoundsSwLng;
		no.suggestedBoundsNeLat = this.suggestedBoundsNeLat;
		no.suggestedBoundsNeLng = this.suggestedBoundsNeLng;
		no.previousChanges = this.previousChanges;
		no.shippingMethods = this.shippingMethods;
	
		return no;
	
	}
	
}
