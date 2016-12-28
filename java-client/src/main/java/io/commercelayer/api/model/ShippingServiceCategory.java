package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingServiceCategory
 */
public class ShippingServiceCategory extends ApiResource {

	private static final long serialVersionUID = -1482914098007L;


	private String shippingServiceId;
	private String shippingCategoryId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private Object shippingCategory;


	public ShippingServiceCategory() {
		super();
	}
	

	public ShippingServiceCategory(Long id) {
		super(id);
	}
	

	public void setShippingServiceId(String shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public String getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceCategory shippingServiceId(String shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public String shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public ShippingServiceCategory shippingCategoryId(String shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public String shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ShippingServiceCategory previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public ShippingServiceCategory shippingService(Object shippingService) {
		setShippingService(shippingService);
		return this;
	}
	

	public Object shippingService() {
		return getShippingService();
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public ShippingServiceCategory shippingCategory(Object shippingCategory) {
		setShippingCategory(shippingCategory);
		return this;
	}
	

	public Object shippingCategory() {
		return getShippingCategory();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingServiceCategory x = (ShippingServiceCategory)o;
	
		return super.equals(o)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			shippingServiceId, shippingCategoryId, previousChanges, shippingService, shippingCategory
			
		);
	
	}
	

	@Override
	public ShippingServiceCategory clone() {
	
		ShippingServiceCategory no = new ShippingServiceCategory();
	
		no.shippingServiceId = this.shippingServiceId;
		no.shippingCategoryId = this.shippingCategoryId;
		no.previousChanges = this.previousChanges;
		no.shippingService = this.shippingService;
		no.shippingCategory = this.shippingCategory;
	
		return no;
	
	}
	
}
