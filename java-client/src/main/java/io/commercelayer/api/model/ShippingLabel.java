package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingLabel
 */
public class ShippingLabel extends ApiResource {

	private static final long serialVersionUID = -1482914097974L;


	private String shipmentId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shipment;


	public ShippingLabel() {
		super();
	}
	

	public ShippingLabel(Long id) {
		super(id);
	}
	

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public String getShipmentId() {
		return this.shipmentId;
	}
	

	public ShippingLabel shipmentId(String shipmentId) {
		setShipmentId(shipmentId);
		return this;
	}
	

	public String shipmentId() {
		return getShipmentId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingLabel previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShipment(Object shipment) {
		this.shipment = shipment;
	}
	

	public Object getShipment() {
		return this.shipment;
	}
	

	public ShippingLabel shipment(Object shipment) {
		setShipment(shipment);
		return this;
	}
	

	public Object shipment() {
		return getShipment();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingLabel x = (ShippingLabel)o;
	
		return super.equals(o)
			&& Objects.equals(this.shipmentId, x.shipmentId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shipment, x.shipment)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			shipmentId, previousChanges, shipment 
		);
	
	}
	

	@Override
	public ShippingLabel clone() {
	
		ShippingLabel no = new ShippingLabel();
	
		no.shipmentId = this.shipmentId;
		no.previousChanges = this.previousChanges;
		no.shipment = this.shipment;
	
		return no;
	
	}
	
}
