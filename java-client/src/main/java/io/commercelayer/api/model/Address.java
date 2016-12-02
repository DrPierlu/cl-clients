
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Address
 */
public class Address extends ApiResource {

	private String geocodingCountry = null;
	private String geocodingZip = null;
	private String geocodingCity = null;
	private String geocodingStreet = null;
	private String geocodingNumber = null;
	private String provider = null;
	private String placeId = null;
	private String precision = null;
	private String accuracy = null;
	private String countryCode = null;
	private String country = null;
	private String stateCode = null;
	private String stateName = null;
	private String state = null;
	private String province = null;
	private String zip = null;
	private String city = null;
	private String district = null;
	private String streetName = null;
	private String streetNumber = null;
	private String streetAddress = null;
	private String subPremise = null;
	private String fullAddress = null;
	private String formattedAddress = null;
	private Float lat = null;
	private Float lng = null;
	private Float suggestedBoundsSwLat = null;
	private Float suggestedBoundsSwLng = null;
	private Float suggestedBoundsNeLat = null;
	private Float suggestedBoundsNeLng = null;


	public Address geocodingCountry(String geocodingCountry) {
		this.geocodingCountry = geocodingCountry;
		return this;
	}

	public String getGeocodingCountry() {
		return geocodingCountry;
	}

	public void setGeocodingCountry(String geocodingCountry) {
		this.geocodingCountry = geocodingCountry;
	}

	public Address geocodingZip(String geocodingZip) {
		this.geocodingZip = geocodingZip;
		return this;
	}

	public String getGeocodingZip() {
		return geocodingZip;
	}

	public void setGeocodingZip(String geocodingZip) {
		this.geocodingZip = geocodingZip;
	}

	public Address geocodingCity(String geocodingCity) {
		this.geocodingCity = geocodingCity;
		return this;
	}

	public String getGeocodingCity() {
		return geocodingCity;
	}

	public void setGeocodingCity(String geocodingCity) {
		this.geocodingCity = geocodingCity;
	}

	public Address geocodingStreet(String geocodingStreet) {
		this.geocodingStreet = geocodingStreet;
		return this;
	}

	public String getGeocodingStreet() {
		return geocodingStreet;
	}

	public void setGeocodingStreet(String geocodingStreet) {
		this.geocodingStreet = geocodingStreet;
	}

	public Address geocodingNumber(String geocodingNumber) {
		this.geocodingNumber = geocodingNumber;
		return this;
	}

	public String getGeocodingNumber() {
		return geocodingNumber;
	}

	public void setGeocodingNumber(String geocodingNumber) {
		this.geocodingNumber = geocodingNumber;
	}

	public Address provider(String provider) {
		this.provider = provider;
		return this;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Address placeId(String placeId) {
		this.placeId = placeId;
		return this;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public Address precision(String precision) {
		this.precision = precision;
		return this;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public Address accuracy(String accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public Address countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Address country(String country) {
		this.country = country;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address stateCode(String stateCode) {
		this.stateCode = stateCode;
		return this;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Address stateName(String stateName) {
		this.stateName = stateName;
		return this;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Address state(String state) {
		this.state = state;
		return this;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address province(String province) {
		this.province = province;
		return this;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Address zip(String zip) {
		this.zip = zip;
		return this;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address district(String district) {
		this.district = district;
		return this;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Address streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Address streetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
		return this;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Address streetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public Address subPremise(String subPremise) {
		this.subPremise = subPremise;
		return this;
	}

	public String getSubPremise() {
		return subPremise;
	}

	public void setSubPremise(String subPremise) {
		this.subPremise = subPremise;
	}

	public Address fullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
		return this;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Address formattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
		return this;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public Address lat(Float lat) {
		this.lat = lat;
		return this;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Address lng(Float lng) {
		this.lng = lng;
		return this;
	}

	public Float getLng() {
		return lng;
	}

	public void setLng(Float lng) {
		this.lng = lng;
	}

	public Address suggestedBoundsSwLat(Float suggestedBoundsSwLat) {
		this.suggestedBoundsSwLat = suggestedBoundsSwLat;
		return this;
	}

	public Float getSuggestedBoundsSwLat() {
		return suggestedBoundsSwLat;
	}

	public void setSuggestedBoundsSwLat(Float suggestedBoundsSwLat) {
		this.suggestedBoundsSwLat = suggestedBoundsSwLat;
	}

	public Address suggestedBoundsSwLng(Float suggestedBoundsSwLng) {
		this.suggestedBoundsSwLng = suggestedBoundsSwLng;
		return this;
	}

	public Float getSuggestedBoundsSwLng() {
		return suggestedBoundsSwLng;
	}

	public void setSuggestedBoundsSwLng(Float suggestedBoundsSwLng) {
		this.suggestedBoundsSwLng = suggestedBoundsSwLng;
	}

	public Address suggestedBoundsNeLat(Float suggestedBoundsNeLat) {
		this.suggestedBoundsNeLat = suggestedBoundsNeLat;
		return this;
	}

	public Float getSuggestedBoundsNeLat() {
		return suggestedBoundsNeLat;
	}

	public void setSuggestedBoundsNeLat(Float suggestedBoundsNeLat) {
		this.suggestedBoundsNeLat = suggestedBoundsNeLat;
	}

	public Address suggestedBoundsNeLng(Float suggestedBoundsNeLng) {
		this.suggestedBoundsNeLng = suggestedBoundsNeLng;
		return this;
	}

	public Float getSuggestedBoundsNeLng() {
		return suggestedBoundsNeLng;
	}

	public void setSuggestedBoundsNeLng(Float suggestedBoundsNeLng) {
		this.suggestedBoundsNeLng = suggestedBoundsNeLng;
	}

	

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return super.equals(o) &&
			Objects.equals(this.geocodingCountry, address.geocodingCountry)
				&& Objects.equals(this.geocodingZip, address.geocodingZip)
				&& Objects.equals(this.geocodingCity, address.geocodingCity)
				&& Objects.equals(this.geocodingStreet, address.geocodingStreet)
				&& Objects.equals(this.geocodingNumber, address.geocodingNumber)
				&& Objects.equals(this.provider, address.provider) 
				&& Objects.equals(this.placeId, address.placeId)
				&& Objects.equals(this.precision, address.precision) 
				&& Objects.equals(this.accuracy, address.accuracy)
				&& Objects.equals(this.countryCode, address.countryCode)
				&& Objects.equals(this.country, address.country) 
				&& Objects.equals(this.stateCode, address.stateCode)
				&& Objects.equals(this.stateName, address.stateName) 
				&& Objects.equals(this.state, address.state)
				&& Objects.equals(this.province, address.province) 
				&& Objects.equals(this.zip, address.zip)
				&& Objects.equals(this.city, address.city) 
				&& Objects.equals(this.district, address.district)
				&& Objects.equals(this.streetName, address.streetName)
				&& Objects.equals(this.streetNumber, address.streetNumber)
				&& Objects.equals(this.streetAddress, address.streetAddress)
				&& Objects.equals(this.subPremise, address.subPremise)
				&& Objects.equals(this.fullAddress, address.fullAddress)
				&& Objects.equals(this.formattedAddress, address.formattedAddress)
				&& Objects.equals(this.lat, address.lat) 
				&& Objects.equals(this.lng, address.lng)
				&& Objects.equals(this.suggestedBoundsSwLat, address.suggestedBoundsSwLat)
				&& Objects.equals(this.suggestedBoundsSwLng, address.suggestedBoundsSwLng)
				&& Objects.equals(this.suggestedBoundsNeLat, address.suggestedBoundsNeLat)
				&& Objects.equals(this.suggestedBoundsNeLng, address.suggestedBoundsNeLng);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, geocodingCountry, geocodingZip, geocodingCity,
				geocodingStreet, geocodingNumber, provider, placeId, precision, accuracy, countryCode, country,
				stateCode, stateName, state, province, zip, city, district, streetName, streetNumber, streetAddress,
				subPremise, fullAddress, formattedAddress, lat, lng, suggestedBoundsSwLat, suggestedBoundsSwLng,
				suggestedBoundsNeLat, suggestedBoundsNeLng, creatorResource, createdAt, updatedAt);
	}

}
