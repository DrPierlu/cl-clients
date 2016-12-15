package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * Address
 */
public class Address extends ApiResource {

	private static final long serialVersionUID = -1481805605634L;


	private String geocodingCountry;
	private String geocodingZip;
	private String geocodingCity;
	private String geocodingStreet;
	private String geocodingNumber;
	private String provider;
	private String placeId;
	private String precision;
	private String accuracy;
	private String countryCode;
	private String country;
	private String stateCode;
	private String stateName;
	private String state;
	private String province;
	private String zip;
	private String city;
	private String district;
	private String streetName;
	private String streetNumber;
	private String streetAddress;
	private String subPremise;
	private String fullAddress;
	private String formattedAddress;
	private Float lat;
	private Float lng;
	private Float suggestedBoundsSwLat;
	private Float suggestedBoundsSwLng;
	private Float suggestedBoundsNeLat;
	private Float suggestedBoundsNeLng;
	@JsonExclude
	private Object previousChanges;
	private List<String> shippingMethods;


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
	

	public void setGeocodingZip(String geocodingZip) {
		this.geocodingZip = geocodingZip;
	}
	

	public String getGeocodingZip() {
		return this.geocodingZip;
	}
	

	public void setGeocodingCity(String geocodingCity) {
		this.geocodingCity = geocodingCity;
	}
	

	public String getGeocodingCity() {
		return this.geocodingCity;
	}
	

	public void setGeocodingStreet(String geocodingStreet) {
		this.geocodingStreet = geocodingStreet;
	}
	

	public String getGeocodingStreet() {
		return this.geocodingStreet;
	}
	

	public void setGeocodingNumber(String geocodingNumber) {
		this.geocodingNumber = geocodingNumber;
	}
	

	public String getGeocodingNumber() {
		return this.geocodingNumber;
	}
	

	public void setProvider(String provider) {
		this.provider = provider;
	}
	

	public String getProvider() {
		return this.provider;
	}
	

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	

	public String getPlaceId() {
		return this.placeId;
	}
	

	public void setPrecision(String precision) {
		this.precision = precision;
	}
	

	public String getPrecision() {
		return this.precision;
	}
	

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	

	public String getAccuracy() {
		return this.accuracy;
	}
	

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

	public String getCountryCode() {
		return this.countryCode;
	}
	

	public void setCountry(String country) {
		this.country = country;
	}
	

	public String getCountry() {
		return this.country;
	}
	

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	

	public String getStateCode() {
		return this.stateCode;
	}
	

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

	public String getStateName() {
		return this.stateName;
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public void setProvince(String province) {
		this.province = province;
	}
	

	public String getProvince() {
		return this.province;
	}
	

	public void setZip(String zip) {
		this.zip = zip;
	}
	

	public String getZip() {
		return this.zip;
	}
	

	public void setCity(String city) {
		this.city = city;
	}
	

	public String getCity() {
		return this.city;
	}
	

	public void setDistrict(String district) {
		this.district = district;
	}
	

	public String getDistrict() {
		return this.district;
	}
	

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	

	public String getStreetName() {
		return this.streetName;
	}
	

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	

	public String getStreetNumber() {
		return this.streetNumber;
	}
	

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	

	public String getStreetAddress() {
		return this.streetAddress;
	}
	

	public void setSubPremise(String subPremise) {
		this.subPremise = subPremise;
	}
	

	public String getSubPremise() {
		return this.subPremise;
	}
	

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	

	public String getFullAddress() {
		return this.fullAddress;
	}
	

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	

	public String getFormattedAddress() {
		return this.formattedAddress;
	}
	

	public void setLat(Float lat) {
		this.lat = lat;
	}
	

	public Float getLat() {
		return this.lat;
	}
	

	public void setLng(Float lng) {
		this.lng = lng;
	}
	

	public Float getLng() {
		return this.lng;
	}
	

	public void setSuggestedBoundsSwLat(Float suggestedBoundsSwLat) {
		this.suggestedBoundsSwLat = suggestedBoundsSwLat;
	}
	

	public Float getSuggestedBoundsSwLat() {
		return this.suggestedBoundsSwLat;
	}
	

	public void setSuggestedBoundsSwLng(Float suggestedBoundsSwLng) {
		this.suggestedBoundsSwLng = suggestedBoundsSwLng;
	}
	

	public Float getSuggestedBoundsSwLng() {
		return this.suggestedBoundsSwLng;
	}
	

	public void setSuggestedBoundsNeLat(Float suggestedBoundsNeLat) {
		this.suggestedBoundsNeLat = suggestedBoundsNeLat;
	}
	

	public Float getSuggestedBoundsNeLat() {
		return this.suggestedBoundsNeLat;
	}
	

	public void setSuggestedBoundsNeLng(Float suggestedBoundsNeLng) {
		this.suggestedBoundsNeLng = suggestedBoundsNeLng;
	}
	

	public Float getSuggestedBoundsNeLng() {
		return this.suggestedBoundsNeLng;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Address x = (Address) o;
	
		return super.equals(o) &&
			Objects.equals(this.geocodingCountry, x.geocodingCountry)  &&
			Objects.equals(this.geocodingZip, x.geocodingZip)  &&
			Objects.equals(this.geocodingCity, x.geocodingCity)  &&
			Objects.equals(this.geocodingStreet, x.geocodingStreet)  &&
			Objects.equals(this.geocodingNumber, x.geocodingNumber)  &&
			Objects.equals(this.provider, x.provider)  &&
			Objects.equals(this.placeId, x.placeId)  &&
			Objects.equals(this.precision, x.precision)  &&
			Objects.equals(this.accuracy, x.accuracy)  &&
			Objects.equals(this.countryCode, x.countryCode)  &&
			Objects.equals(this.country, x.country)  &&
			Objects.equals(this.stateCode, x.stateCode)  &&
			Objects.equals(this.stateName, x.stateName)  &&
			Objects.equals(this.state, x.state)  &&
			Objects.equals(this.province, x.province)  &&
			Objects.equals(this.zip, x.zip)  &&
			Objects.equals(this.city, x.city)  &&
			Objects.equals(this.district, x.district)  &&
			Objects.equals(this.streetName, x.streetName)  &&
			Objects.equals(this.streetNumber, x.streetNumber)  &&
			Objects.equals(this.streetAddress, x.streetAddress)  &&
			Objects.equals(this.subPremise, x.subPremise)  &&
			Objects.equals(this.fullAddress, x.fullAddress)  &&
			Objects.equals(this.formattedAddress, x.formattedAddress)  &&
			Objects.equals(this.lat, x.lat)  &&
			Objects.equals(this.lng, x.lng)  &&
			Objects.equals(this.suggestedBoundsSwLat, x.suggestedBoundsSwLat)  &&
			Objects.equals(this.suggestedBoundsSwLng, x.suggestedBoundsSwLng)  &&
			Objects.equals(this.suggestedBoundsNeLat, x.suggestedBoundsNeLat)  &&
			Objects.equals(this.suggestedBoundsNeLng, x.suggestedBoundsNeLng)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingMethods, x.shippingMethods) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, geocodingCountry, geocodingZip, geocodingCity, geocodingStreet,
			geocodingNumber, provider, placeId, precision, accuracy,
			countryCode, country, stateCode, stateName, state,
			province, zip, city, district, streetName,
			streetNumber, streetAddress, subPremise, fullAddress, formattedAddress,
			lat, lng, suggestedBoundsSwLat, suggestedBoundsSwLng, suggestedBoundsNeLat,
			suggestedBoundsNeLng, previousChanges, shippingMethods 
		);
	
	}
	
}
