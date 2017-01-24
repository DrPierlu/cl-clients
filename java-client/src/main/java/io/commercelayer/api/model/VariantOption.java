package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * VariantOption
 */
public class VariantOption extends ApiResource {

	private static final long serialVersionUID = -1485265142814L;


	private Integer optionValueId;
	private Integer variantId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private Integer optionTypeId;
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
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public VariantOption name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}
	

	public Integer getVariantId() {
		return this.variantId;
	}
	

	public VariantOption variantId(Integer variantId) {
		setVariantId(variantId);
		return this;
	}
	

	public Integer variantId() {
		return getVariantId();
	}
	

	public void setOptionTypeId(Integer optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public Integer getOptionTypeId() {
		return this.optionTypeId;
	}
	

	public VariantOption optionTypeId(Integer optionTypeId) {
		setOptionTypeId(optionTypeId);
		return this;
	}
	

	public Integer optionTypeId() {
		return getOptionTypeId();
	}
	

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}
	

	public Integer getOptionValueId() {
		return this.optionValueId;
	}
	

	public VariantOption optionValueId(Integer optionValueId) {
		setOptionValueId(optionValueId);
		return this;
	}
	

	public Integer optionValueId() {
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
			&& Objects.equals(this.name, x.name)
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
			name, variantId, optionTypeId, optionValueId, previousChanges,
			variant, optionType, optionValue 
		);
	
	}
	

	@Override
	public VariantOption clone() {
	
		VariantOption no = new VariantOption();
	
		no = super.clone(no);
	
		no.name = this.name;
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
