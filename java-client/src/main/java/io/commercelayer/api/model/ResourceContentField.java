package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * ResourceContentField
 */
public class ResourceContentField extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer contentFieldId;
	private Integer extensibleId;
	private String extensibleResource;
	@JsonExclude
	private Object contentField;
	@JsonExclude
	private Object extensible;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;


	public ResourceContentField() {
		super();
	}
	

	public ResourceContentField(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ResourceContentField name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setExtensibleId(Integer extensibleId) {
		this.extensibleId = extensibleId;
	}
	

	public Integer getExtensibleId() {
		return this.extensibleId;
	}
	

	public ResourceContentField extensibleId(Integer extensibleId) {
		setExtensibleId(extensibleId);
		return this;
	}
	

	public Integer extensibleId() {
		return getExtensibleId();
	}
	

	public void setExtensibleResource(String extensibleResource) {
		this.extensibleResource = extensibleResource;
	}
	

	public String getExtensibleResource() {
		return this.extensibleResource;
	}
	

	public ResourceContentField extensibleResource(String extensibleResource) {
		setExtensibleResource(extensibleResource);
		return this;
	}
	

	public String extensibleResource() {
		return getExtensibleResource();
	}
	

	public void setContentFieldId(Integer contentFieldId) {
		this.contentFieldId = contentFieldId;
	}
	

	public Integer getContentFieldId() {
		return this.contentFieldId;
	}
	

	public ResourceContentField contentFieldId(Integer contentFieldId) {
		setContentFieldId(contentFieldId);
		return this;
	}
	

	public Integer contentFieldId() {
		return getContentFieldId();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ResourceContentField previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setExtensible(Object extensible) {
		this.extensible = extensible;
	}
	

	public Object getExtensible() {
		return this.extensible;
	}
	

	public ResourceContentField extensible(Object extensible) {
		setExtensible(extensible);
		return this;
	}
	

	public Object extensible() {
		return getExtensible();
	}
	

	public void setContentField(Object contentField) {
		this.contentField = contentField;
	}
	

	public Object getContentField() {
		return this.contentField;
	}
	

	public ResourceContentField contentField(Object contentField) {
		setContentField(contentField);
		return this;
	}
	

	public Object contentField() {
		return getContentField();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ResourceContentField x = (ResourceContentField)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.extensibleId, x.extensibleId)
			&& Objects.equals(this.extensibleResource, x.extensibleResource)
			&& Objects.equals(this.contentFieldId, x.contentFieldId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.extensible, x.extensible)
			&& Objects.equals(this.contentField, x.contentField)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, extensibleId, extensibleResource, contentFieldId, previousChanges,
			extensible, contentField 
		);
	
	}
	

	@Override
	public ResourceContentField clone() {
	
		ResourceContentField no = new ResourceContentField();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.extensibleId = this.extensibleId;
		no.extensibleResource = this.extensibleResource;
		no.contentFieldId = this.contentFieldId;
		no.previousChanges = this.previousChanges;
		no.extensible = this.extensible;
		no.contentField = this.contentField;
	
		return no;
	
	}
	
}
