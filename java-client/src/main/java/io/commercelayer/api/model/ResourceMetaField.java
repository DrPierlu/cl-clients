package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ResourceMetaField
 */
public class ResourceMetaField extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer extensibleId;
	private String extensibleResource;
	private Integer metaFieldId;
	@JsonExclude
	private Object extensible;
	@JsonExclude
	private Object metaField;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> versions;


	public ResourceMetaField() {
		super();
	}
	

	public ResourceMetaField(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ResourceMetaField name(String name) {
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
	

	public ResourceMetaField extensibleId(Integer extensibleId) {
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
	

	public ResourceMetaField extensibleResource(String extensibleResource) {
		setExtensibleResource(extensibleResource);
		return this;
	}
	

	public String extensibleResource() {
		return getExtensibleResource();
	}
	

	public void setMetaFieldId(Integer metaFieldId) {
		this.metaFieldId = metaFieldId;
	}
	

	public Integer getMetaFieldId() {
		return this.metaFieldId;
	}
	

	public ResourceMetaField metaFieldId(Integer metaFieldId) {
		setMetaFieldId(metaFieldId);
		return this;
	}
	

	public Integer metaFieldId() {
		return getMetaFieldId();
	}
	

	public void setExtensible(Object extensible) {
		this.extensible = extensible;
	}
	

	public Object getExtensible() {
		return this.extensible;
	}
	

	public ResourceMetaField extensible(Object extensible) {
		setExtensible(extensible);
		return this;
	}
	

	public Object extensible() {
		return getExtensible();
	}
	

	public void setMetaField(Object metaField) {
		this.metaField = metaField;
	}
	

	public Object getMetaField() {
		return this.metaField;
	}
	

	public ResourceMetaField metaField(Object metaField) {
		setMetaField(metaField);
		return this;
	}
	

	public Object metaField() {
		return getMetaField();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ResourceMetaField versions(List<String> versions) {
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
	
		ResourceMetaField x = (ResourceMetaField)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.extensibleId, x.extensibleId)
			&& Objects.equals(this.extensibleResource, x.extensibleResource)
			&& Objects.equals(this.metaFieldId, x.metaFieldId)
			&& Objects.equals(this.extensible, x.extensible)
			&& Objects.equals(this.metaField, x.metaField)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, extensibleId, extensibleResource, metaFieldId, extensible,
			metaField, versions 
		);
	
	}
	

	@Override
	public ResourceMetaField clone() {
	
		ResourceMetaField no = new ResourceMetaField();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.extensibleId = this.extensibleId;
		no.extensibleResource = this.extensibleResource;
		no.metaFieldId = this.metaFieldId;
		no.extensible = this.extensible;
		no.metaField = this.metaField;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
