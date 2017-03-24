package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
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
	private Object previousChanges;


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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingCarrier x = (ShippingCarrier)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.previousChanges, x.previousChanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, kind, previousChanges 
		);
	
	}
	

	@Override
	public ShippingCarrier clone() {
	
		ShippingCarrier no = new ShippingCarrier();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.kind = this.kind;
		no.previousChanges = this.previousChanges;
	
		return no;
	
	}
	
}
