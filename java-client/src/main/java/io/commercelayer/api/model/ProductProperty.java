package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * ProductProperty
 */
public class ProductProperty extends ApiResource {

	private static final long serialVersionUID = -1484566577855L;


	private Integer productId;
	private Integer propertyValueId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object product;
	@JsonExclude
	private Object propertyType;
	@JsonExclude
	private Integer propertyTypeId;
	@JsonExclude
	private Object propertyValue;


	public ProductProperty() {
		super();
	}
	

	public ProductProperty(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ProductProperty name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	

	public Integer getProductId() {
		return this.productId;
	}
	

	public ProductProperty productId(Integer productId) {
		setProductId(productId);
		return this;
	}
	

	public Integer productId() {
		return getProductId();
	}
	

	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	

	public Integer getPropertyTypeId() {
		return this.propertyTypeId;
	}
	

	public ProductProperty propertyTypeId(Integer propertyTypeId) {
		setPropertyTypeId(propertyTypeId);
		return this;
	}
	

	public Integer propertyTypeId() {
		return getPropertyTypeId();
	}
	

	public void setPropertyValueId(Integer propertyValueId) {
		this.propertyValueId = propertyValueId;
	}
	

	public Integer getPropertyValueId() {
		return this.propertyValueId;
	}
	

	public ProductProperty propertyValueId(Integer propertyValueId) {
		setPropertyValueId(propertyValueId);
		return this;
	}
	

	public Integer propertyValueId() {
		return getPropertyValueId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ProductProperty previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setProduct(Object product) {
		this.product = product;
	}
	

	public Object getProduct() {
		return this.product;
	}
	

	public ProductProperty product(Object product) {
		setProduct(product);
		return this;
	}
	

	public Object product() {
		return getProduct();
	}
	

	public void setPropertyType(Object propertyType) {
		this.propertyType = propertyType;
	}
	

	public Object getPropertyType() {
		return this.propertyType;
	}
	

	public ProductProperty propertyType(Object propertyType) {
		setPropertyType(propertyType);
		return this;
	}
	

	public Object propertyType() {
		return getPropertyType();
	}
	

	public void setPropertyValue(Object propertyValue) {
		this.propertyValue = propertyValue;
	}
	

	public Object getPropertyValue() {
		return this.propertyValue;
	}
	

	public ProductProperty propertyValue(Object propertyValue) {
		setPropertyValue(propertyValue);
		return this;
	}
	

	public Object propertyValue() {
		return getPropertyValue();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ProductProperty x = (ProductProperty)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.productId, x.productId)
			&& Objects.equals(this.propertyTypeId, x.propertyTypeId)
			&& Objects.equals(this.propertyValueId, x.propertyValueId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.product, x.product)
			&& Objects.equals(this.propertyType, x.propertyType)
			&& Objects.equals(this.propertyValue, x.propertyValue)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, productId, propertyTypeId, propertyValueId, previousChanges,
			product, propertyType, propertyValue 
		);
	
	}
	

	@Override
	public ProductProperty clone() {
	
		ProductProperty no = new ProductProperty();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.productId = this.productId;
		no.propertyTypeId = this.propertyTypeId;
		no.propertyValueId = this.propertyValueId;
		no.previousChanges = this.previousChanges;
		no.product = this.product;
		no.propertyType = this.propertyType;
		no.propertyValue = this.propertyValue;
	
		return no;
	
	}
	
}
