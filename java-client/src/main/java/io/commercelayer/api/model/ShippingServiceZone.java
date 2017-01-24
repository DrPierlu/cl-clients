package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * ShippingServiceZone
 */
public class ShippingServiceZone extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer shippingServiceId;
	private Integer shippingZoneId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private Object shippingZone;


	public ShippingServiceZone() {
		super();
	}
	

	public ShippingServiceZone(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingServiceZone name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceZone shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setShippingZoneId(Integer shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
	}
	

	public Integer getShippingZoneId() {
		return this.shippingZoneId;
	}
	

	public ShippingServiceZone shippingZoneId(Integer shippingZoneId) {
		setShippingZoneId(shippingZoneId);
		return this;
	}
	

	public Integer shippingZoneId() {
		return getShippingZoneId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingServiceZone previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public ShippingServiceZone shippingService(Object shippingService) {
		setShippingService(shippingService);
		return this;
	}
	

	public Object shippingService() {
		return getShippingService();
	}
	

	public void setShippingZone(Object shippingZone) {
		this.shippingZone = shippingZone;
	}
	

	public Object getShippingZone() {
		return this.shippingZone;
	}
	

	public ShippingServiceZone shippingZone(Object shippingZone) {
		setShippingZone(shippingZone);
		return this;
	}
	

	public Object shippingZone() {
		return getShippingZone();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingServiceZone x = (ShippingServiceZone)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.shippingZoneId, x.shippingZoneId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.shippingZone, x.shippingZone)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shippingServiceId, shippingZoneId, previousChanges, shippingService,
			shippingZone 
		);
	
	}
	

	@Override
	public ShippingServiceZone clone() {
	
		ShippingServiceZone no = new ShippingServiceZone();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shippingServiceId = this.shippingServiceId;
		no.shippingZoneId = this.shippingZoneId;
		no.previousChanges = this.previousChanges;
		no.shippingService = this.shippingService;
		no.shippingZone = this.shippingZone;
	
		return no;
	
	}
	
}
