package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Address
 */
public class Address extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String geocodingCity;
	private String geocodingCountry;
	private String geocodingNumber;
	private String geocodingStreet;
	private String geocodingZip;
	@JsonExclude
	private Integer accuracy;
	@JsonExclude
	private String city;
	@JsonExclude
	private String country;
	@JsonExclude
	private String countryCode;
	@JsonExclude
	private String district;
	@JsonExclude
	private String geocoded;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private Float lat;
	@JsonExclude
	private Float lng;
	@JsonExclude
	private List<String> merchants;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private String placeId;
	@JsonExclude
	private String precision;
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
	private String staticImageUrl;
	@JsonExclude
	private List<String> stockLocations;
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
	private List<String> versions;
	@JsonExclude
	private String zip;


	public Address() {
		super();
	}
	

	public Address(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Address name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
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
	

	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}
	

	public Integer getAccuracy() {
		return this.accuracy;
	}
	

	public Address accuracy(Integer accuracy) {
		setAccuracy(accuracy);
		return this;
	}
	

	public Integer accuracy() {
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Address versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setStockLocations(List<String> stockLocations) {
		this.stockLocations = stockLocations;
	}
	

	public List<String> getStockLocations() {
		return this.stockLocations;
	}
	

	public Address stockLocations(List<String> stockLocations) {
		setStockLocations(stockLocations);
		return this;
	}
	

	public List<String> stockLocations() {
		return getStockLocations();
	}
	

	public void setMerchants(List<String> merchants) {
		this.merchants = merchants;
	}
	

	public List<String> getMerchants() {
		return this.merchants;
	}
	

	public Address merchants(List<String> merchants) {
		setMerchants(merchants);
		return this;
	}
	

	public List<String> merchants() {
		return getMerchants();
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
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public Address paymentMethods(List<String> paymentMethods) {
		setPaymentMethods(paymentMethods);
		return this;
	}
	

	public List<String> paymentMethods() {
		return getPaymentMethods();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public Address invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	public void setGeocoded(String geocoded) {
		this.geocoded = geocoded;
	}
	

	public String getGeocoded() {
		return this.geocoded;
	}
	

	public Address geocoded(String geocoded) {
		setGeocoded(geocoded);
		return this;
	}
	

	public String geocoded() {
		return getGeocoded();
	}
	

	public void setStaticImageUrl(String staticImageUrl) {
		this.staticImageUrl = staticImageUrl;
	}
	

	public String getStaticImageUrl() {
		return this.staticImageUrl;
	}
	

	public Address staticImageUrl(String staticImageUrl) {
		setStaticImageUrl(staticImageUrl);
		return this;
	}
	

	public String staticImageUrl() {
		return getStaticImageUrl();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Address x = (Address)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
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
			&& Objects.equals(this.lat, x.lat)
			&& Objects.equals(this.lng, x.lng)
			&& Objects.equals(this.suggestedBoundsSwLat, x.suggestedBoundsSwLat)
			&& Objects.equals(this.suggestedBoundsSwLng, x.suggestedBoundsSwLng)
			&& Objects.equals(this.suggestedBoundsNeLat, x.suggestedBoundsNeLat)
			&& Objects.equals(this.suggestedBoundsNeLng, x.suggestedBoundsNeLng)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.stockLocations, x.stockLocations)
			&& Objects.equals(this.merchants, x.merchants)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.geocoded, x.geocoded)
			&& Objects.equals(this.staticImageUrl, x.staticImageUrl)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, geocodingCountry, geocodingZip, geocodingCity, geocodingStreet,
			geocodingNumber, provider, placeId, precision, accuracy,
			countryCode, country, stateCode, stateName, state,
			province, zip, city, district, streetName,
			streetNumber, streetAddress, subPremise, lat, lng,
			suggestedBoundsSwLat, suggestedBoundsSwLng, suggestedBoundsNeLat, suggestedBoundsNeLng, versions,
			stockLocations, merchants, shippingMethods, paymentMethods, invoices,
			geocoded, staticImageUrl 
		);
	
	}
	

	@Override
	public Address clone() {
	
		Address no = new Address();
	
		no = super.clone(no);
	
		no.name = this.name;
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
		no.lat = this.lat;
		no.lng = this.lng;
		no.suggestedBoundsSwLat = this.suggestedBoundsSwLat;
		no.suggestedBoundsSwLng = this.suggestedBoundsSwLng;
		no.suggestedBoundsNeLat = this.suggestedBoundsNeLat;
		no.suggestedBoundsNeLng = this.suggestedBoundsNeLng;
		no.versions = this.versions;
		no.stockLocations = this.stockLocations;
		no.merchants = this.merchants;
		no.shippingMethods = this.shippingMethods;
		no.paymentMethods = this.paymentMethods;
		no.invoices = this.invoices;
		no.geocoded = this.geocoded;
		no.staticImageUrl = this.staticImageUrl;
	
		return no;
	
	}
	
}
