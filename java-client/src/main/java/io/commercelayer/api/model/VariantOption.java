package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * VariantOption
 */
public class VariantOption extends ApiResource {

	private static final long serialVersionUID = -1483100361869L;


	private String optionValueId;
	private String variantId;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private String optionTypeId;
	@JsonExclude
	private Object optionValue;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object variant;


	public VariantOption() {
		super();
	}
	

	public VariantOption(Long id) {
		super(id);
	}
	

	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}
	

	public String getVariantId() {
		return this.variantId;
	}
	

	public VariantOption variantId(String variantId) {
		setVariantId(variantId);
		return this;
	}
	

	public String variantId() {
		return getVariantId();
	}
	

	public void setOptionTypeId(String optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public String getOptionTypeId() {
		return this.optionTypeId;
	}
	

	public VariantOption optionTypeId(String optionTypeId) {
		setOptionTypeId(optionTypeId);
		return this;
	}
	

	public String optionTypeId() {
		return getOptionTypeId();
	}
	

	public void setOptionValueId(String optionValueId) {
		this.optionValueId = optionValueId;
	}
	

	public String getOptionValueId() {
		return this.optionValueId;
	}
	

	public VariantOption optionValueId(String optionValueId) {
		setOptionValueId(optionValueId);
		return this;
	}
	

	public String optionValueId() {
		return getOptionValueId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public VariantOption previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setVariant(Object variant) {
		this.variant = variant;
	}
	

	public Object getVariant() {
		return this.variant;
	}
	

	public VariantOption variant(Object variant) {
		setVariant(variant);
		return this;
	}
	

	public Object variant() {
		return getVariant();
	}
	

	public void setOptionType(Object optionType) {
		this.optionType = optionType;
	}
	

	public Object getOptionType() {
		return this.optionType;
	}
	

	public VariantOption optionType(Object optionType) {
		setOptionType(optionType);
		return this;
	}
	

	public Object optionType() {
		return getOptionType();
	}
	

	public void setOptionValue(Object optionValue) {
		this.optionValue = optionValue;
	}
	

	public Object getOptionValue() {
		return this.optionValue;
	}
	

	public VariantOption optionValue(Object optionValue) {
		setOptionValue(optionValue);
		return this;
	}
	

	public Object optionValue() {
		return getOptionValue();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		VariantOption x = (VariantOption)o;
	
		return super.equals(o)
			&& Objects.equals(this.variantId, x.variantId)
			&& Objects.equals(this.optionTypeId, x.optionTypeId)
			&& Objects.equals(this.optionValueId, x.optionValueId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.variant, x.variant)
			&& Objects.equals(this.optionType, x.optionType)
			&& Objects.equals(this.optionValue, x.optionValue)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			variantId, optionTypeId, optionValueId, previousChanges, variant,
			optionType, optionValue 
		);
	
	}
	

	@Override
	public VariantOption clone() {
	
		VariantOption no = new VariantOption();
	
		no = super.clone(no);
	
		no.variantId = this.variantId;
		no.optionTypeId = this.optionTypeId;
		no.optionValueId = this.optionValueId;
		no.previousChanges = this.previousChanges;
		no.variant = this.variant;
		no.optionType = this.optionType;
		no.optionValue = this.optionValue;
	
		return no;
	
	}
	
}
