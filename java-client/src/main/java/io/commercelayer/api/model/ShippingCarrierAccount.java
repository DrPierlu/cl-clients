package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingCarrierAccount
 */
public class ShippingCarrierAccount extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer shippingCarrierId;
	@JsonExclude
	private String easypostId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object shippingCarrier;
	@JsonExclude
	private String shippingLabelFormat;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private List<String> versions;


	public ShippingCarrierAccount() {
		super();
	}
	

	public ShippingCarrierAccount(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingCarrierAccount name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShippingCarrierId(Integer shippingCarrierId) {
		this.shippingCarrierId = shippingCarrierId;
	}
	

	public Integer getShippingCarrierId() {
		return this.shippingCarrierId;
	}
	

	public ShippingCarrierAccount shippingCarrierId(Integer shippingCarrierId) {
		setShippingCarrierId(shippingCarrierId);
		return this;
	}
	

	public Integer shippingCarrierId() {
		return getShippingCarrierId();
	}
	

	public void setEasypostId(String easypostId) {
		this.easypostId = easypostId;
	}
	

	public String getEasypostId() {
		return this.easypostId;
	}
	

	public ShippingCarrierAccount easypostId(String easypostId) {
		setEasypostId(easypostId);
		return this;
	}
	

	public String easypostId() {
		return getEasypostId();
	}
	

	public void setShippingLabelFormat(String shippingLabelFormat) {
		this.shippingLabelFormat = shippingLabelFormat;
	}
	

	public String getShippingLabelFormat() {
		return this.shippingLabelFormat;
	}
	

	public ShippingCarrierAccount shippingLabelFormat(String shippingLabelFormat) {
		setShippingLabelFormat(shippingLabelFormat);
		return this;
	}
	

	public String shippingLabelFormat() {
		return getShippingLabelFormat();
	}
	

	public void setShippingCarrier(Object shippingCarrier) {
		this.shippingCarrier = shippingCarrier;
	}
	

	public Object getShippingCarrier() {
		return this.shippingCarrier;
	}
	

	public ShippingCarrierAccount shippingCarrier(Object shippingCarrier) {
		setShippingCarrier(shippingCarrier);
		return this;
	}
	

	public Object shippingCarrier() {
		return getShippingCarrier();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingCarrierAccount versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public ShippingCarrierAccount shippingServices(List<String> shippingServices) {
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
	
		ShippingCarrierAccount x = (ShippingCarrierAccount)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shippingCarrierId, x.shippingCarrierId)
			&& Objects.equals(this.easypostId, x.easypostId)
			&& Objects.equals(this.shippingLabelFormat, x.shippingLabelFormat)
			&& Objects.equals(this.shippingCarrier, x.shippingCarrier)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.shippingServices, x.shippingServices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shippingCarrierId, easypostId, shippingLabelFormat, shippingCarrier,
			versions, shippingServices 
		);
	
	}
	

	@Override
	public ShippingCarrierAccount clone() {
	
		ShippingCarrierAccount no = new ShippingCarrierAccount();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shippingCarrierId = this.shippingCarrierId;
		no.easypostId = this.easypostId;
		no.shippingLabelFormat = this.shippingLabelFormat;
		no.shippingCarrier = this.shippingCarrier;
		no.versions = this.versions;
		no.shippingServices = this.shippingServices;
	
		return no;
	
	}
	
}
