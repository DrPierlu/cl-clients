package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * ShippingServiceZone
 */
public class ShippingServiceZone extends ApiResource {

	private static final long serialVersionUID = -1483006114438L;


	private String shippingServiceId;
	private String shippingZoneId;
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
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceZone shippingServiceId(String shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public String shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setShippingZoneId(String shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
	}
	

	public String getShippingZoneId() {
		return this.shippingZoneId;
	}
	

	public ShippingServiceZone shippingZoneId(String shippingZoneId) {
		setShippingZoneId(shippingZoneId);
		return this;
	}
	

	public String shippingZoneId() {
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
			shippingServiceId, shippingZoneId, previousChanges, shippingService, shippingZone
			
		);
	
	}
	

	@Override
	public ShippingServiceZone clone() {
	
		ShippingServiceZone no = new ShippingServiceZone();
	
		no.shippingServiceId = this.shippingServiceId;
		no.shippingZoneId = this.shippingZoneId;
		no.previousChanges = this.previousChanges;
		no.shippingService = this.shippingService;
		no.shippingZone = this.shippingZone;
	
		return no;
	
	}
	
}
