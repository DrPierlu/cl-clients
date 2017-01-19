package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingCarrier
 */
public class ShippingCarrier extends ApiResource {

	private static final long serialVersionUID = -1484836418648L;


	private String name;
	private Integer shippingCarrierTypeId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCarrierType;
	@JsonExclude
	private List<String> shippingServices;


	public ShippingCarrier() {
		super();
	}
	

	public ShippingCarrier(Long id) {
		super(id);
	}
	

	public void setShippingCarrierTypeId(Integer shippingCarrierTypeId) {
		this.shippingCarrierTypeId = shippingCarrierTypeId;
	}
	

	public Integer getShippingCarrierTypeId() {
		return this.shippingCarrierTypeId;
	}
	

	public ShippingCarrier shippingCarrierTypeId(Integer shippingCarrierTypeId) {
		setShippingCarrierTypeId(shippingCarrierTypeId);
		return this;
	}
	

	public Integer shippingCarrierTypeId() {
		return getShippingCarrierTypeId();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingCarrier name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingCarrier previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingCarrierType(Object shippingCarrierType) {
		this.shippingCarrierType = shippingCarrierType;
	}
	

	public Object getShippingCarrierType() {
		return this.shippingCarrierType;
	}
	

	public ShippingCarrier shippingCarrierType(Object shippingCarrierType) {
		setShippingCarrierType(shippingCarrierType);
		return this;
	}
	

	public Object shippingCarrierType() {
		return getShippingCarrierType();
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public ShippingCarrier shippingServices(List<String> shippingServices) {
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
	
		ShippingCarrier x = (ShippingCarrier)o;
	
		return super.equals(o)
			&& Objects.equals(this.shippingCarrierTypeId, x.shippingCarrierTypeId)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCarrierType, x.shippingCarrierType)
			&& Objects.equals(this.shippingServices, x.shippingServices)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			shippingCarrierTypeId, name, previousChanges, shippingCarrierType, shippingServices
			
		);
	
	}
	

	@Override
	public ShippingCarrier clone() {
	
		ShippingCarrier no = new ShippingCarrier();
	
		no = super.clone(no);
	
		no.shippingCarrierTypeId = this.shippingCarrierTypeId;
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.shippingCarrierType = this.shippingCarrierType;
		no.shippingServices = this.shippingServices;
	
		return no;
	
	}
	
}
