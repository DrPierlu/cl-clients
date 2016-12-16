package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingServiceCategory
 */
public class ShippingServiceCategory extends ApiResource {

	private static final long serialVersionUID = -1481927389240L;


	private Integer shippingServiceId;
	private Integer shippingCategoryId;
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
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ShippingServiceCategory x = (ShippingServiceCategory) o;
	
		return super.equals(o) &&
			Objects.equals(this.shippingServiceId, x.shippingServiceId)  &&
			Objects.equals(this.shippingCategoryId, x.shippingCategoryId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shippingService, x.shippingService)  &&
			Objects.equals(this.shippingCategory, x.shippingCategory) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, shippingServiceId, shippingCategoryId, previousChanges, shippingService,
			shippingCategory 
		);
	
	}
	
}
