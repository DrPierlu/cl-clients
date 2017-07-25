package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingCarrier
 */
public class ShippingCarrier extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String kind;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> shippingCarrierAccounts;
	@JsonExclude
	private List<String> versions;


	public ShippingCarrier() {
		super();
	}
	

	public ShippingCarrier(Long id) {
		super(id);
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
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public ShippingCarrier kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingCarrier versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setShippingCarrierAccounts(List<String> shippingCarrierAccounts) {
		this.shippingCarrierAccounts = shippingCarrierAccounts;
	}
	

	public List<String> getShippingCarrierAccounts() {
		return this.shippingCarrierAccounts;
	}
	

	public ShippingCarrier shippingCarrierAccounts(List<String> shippingCarrierAccounts) {
		setShippingCarrierAccounts(shippingCarrierAccounts);
		return this;
	}
	

	public List<String> shippingCarrierAccounts() {
		return getShippingCarrierAccounts();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingCarrier x = (ShippingCarrier)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.shippingCarrierAccounts, x.shippingCarrierAccounts)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, kind, versions, shippingCarrierAccounts 
		);
	
	}
	

	@Override
	public ShippingCarrier clone() {
	
		ShippingCarrier no = new ShippingCarrier();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.kind = this.kind;
		no.versions = this.versions;
		no.shippingCarrierAccounts = this.shippingCarrierAccounts;
	
		return no;
	
	}
	
}
