package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingServiceCategory
 */
public class ShippingServiceCategory extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer shippingCategoryId;
	private Integer shippingServiceId;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private List<String> versions;


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
	

	public ShippingServiceCategory name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingServiceCategory shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setShippingCategoryId(Integer shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public Integer getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public ShippingServiceCategory shippingCategoryId(Integer shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public Integer shippingCategoryId() {
		return getShippingCategoryId();
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
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingServiceCategory versions(List<String> versions) {
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
	
		ShippingServiceCategory x = (ShippingServiceCategory)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shippingServiceId, shippingCategoryId, shippingService, shippingCategory,
			versions 
		);
	
	}
	

	@Override
	public ShippingServiceCategory clone() {
	
		ShippingServiceCategory no = new ShippingServiceCategory();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shippingServiceId = this.shippingServiceId;
		no.shippingCategoryId = this.shippingCategoryId;
		no.shippingService = this.shippingService;
		no.shippingCategory = this.shippingCategory;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
