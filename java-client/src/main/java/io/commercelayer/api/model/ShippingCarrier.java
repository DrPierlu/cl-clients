package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * ShippingCarrier
 */
public class ShippingCarrier extends ApiResource {

	private static final long serialVersionUID = -1481927389224L;


	private Integer shippingCarrierTypeId;
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingCarrierType;
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
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingCarrierType(Object shippingCarrierType) {
		this.shippingCarrierType = shippingCarrierType;
	}
	

	public Object getShippingCarrierType() {
		return this.shippingCarrierType;
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
		if (o == null || getClass() != o.getClass()) return false;
	
		ShippingCarrier x = (ShippingCarrier) o;
	
		return super.equals(o) &&
			Objects.equals(this.shippingCarrierTypeId, x.shippingCarrierTypeId)  &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingCarrierType, x.shippingCarrierType)  &&
			Objects.equals(this.shippingServices, x.shippingServices) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, shippingCarrierTypeId, name, previousChanges, shippingCarrierType,
			shippingServices 
		);
	
	}
	
}
