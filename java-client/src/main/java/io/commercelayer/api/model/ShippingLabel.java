package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingLabel
 */
public class ShippingLabel extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer shipmentId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object shipment;
	@JsonExclude
	private List<String> versions;


	public ShippingLabel() {
		super();
	}
	

	public ShippingLabel(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingLabel name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public Integer getShipmentId() {
		return this.shipmentId;
	}
	

	public ShippingLabel shipmentId(Integer shipmentId) {
		setShipmentId(shipmentId);
		return this;
	}
	

	public Integer shipmentId() {
		return getShipmentId();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingLabel versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingLabel x = (ShippingLabel)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shipmentId, x.shipmentId)
			&& Objects.equals(this.shipment, x.shipment)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shipmentId, shipment, versions 
		);
	
	}
	

	@Override
	public ShippingLabel clone() {
	
		ShippingLabel no = new ShippingLabel();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shipmentId = this.shipmentId;
		no.shipment = this.shipment;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
