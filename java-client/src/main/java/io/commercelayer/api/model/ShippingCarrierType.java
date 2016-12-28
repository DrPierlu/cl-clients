package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingCarrierType
 */
public class ShippingCarrierType extends ApiResource {

	private static final long serialVersionUID = -1482914097962L;


	private String name;
	@JsonExclude
	private Object previousChanges;


	public ShippingCarrierType() {
		super();
	}
	

	public ShippingCarrierType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingCarrierType name(String name) {
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
	

	public ShippingCarrierType previousChanges(Object previousChanges) {
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
	
		ShippingCarrierType x = (ShippingCarrierType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, previousChanges 
		);
	
	}
	

	@Override
	public ShippingCarrierType clone() {
	
		ShippingCarrierType no = new ShippingCarrierType();
	
		no.name = this.name;
		no.previousChanges = this.previousChanges;
	
		return no;
	
	}
	
}
