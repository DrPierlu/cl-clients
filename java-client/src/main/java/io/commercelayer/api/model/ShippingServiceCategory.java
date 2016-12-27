package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingServiceCategory
 */
public class ShippingServiceCategory extends ApiResource {

	private static final long serialVersionUID = -1482880735351L;


	@JsonExclude
	private String name;
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
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
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
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingServiceCategory x = (ShippingServiceCategory)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
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
			name, shippingServiceId, shippingCategoryId, previousChanges, shippingService,
			shippingCategory 
		);
	
	}
	

	@Override
	public ShippingServiceCategory clone() {
	
		ShippingServiceCategory no = new ShippingServiceCategory();
	
		no.name = this.name;
		no.shippingServiceId = this.shippingServiceId;
		no.shippingCategoryId = this.shippingCategoryId;
		no.previousChanges = this.previousChanges;
		no.shippingService = this.shippingService;
		no.shippingCategory = this.shippingCategory;
	
		return no;
	
	}
	
}
