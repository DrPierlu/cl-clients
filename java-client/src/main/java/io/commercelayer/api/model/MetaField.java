package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * MetaField
 */
public class MetaField extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	private String namespace;
	private String value;
	@JsonExclude
	private List<String> resourceMetaFields;
	@JsonExclude
	private List<String> versions;


	public MetaField() {
		super();
	}
	

	public MetaField(Long id) {
		super(id);
	}
	

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	

	public String getNamespace() {
		return this.namespace;
	}
	

	public MetaField namespace(String namespace) {
		setNamespace(namespace);
		return this;
	}
	

	public String namespace() {
		return getNamespace();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public MetaField name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setValue(String value) {
		this.value = value;
	}
	

	public String getValue() {
		return this.value;
	}
	

	public MetaField value(String value) {
		setValue(value);
		return this;
	}
	

	public String value() {
		return getValue();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public MetaField versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setResourceMetaFields(List<String> resourceMetaFields) {
		this.resourceMetaFields = resourceMetaFields;
	}
	

	public List<String> getResourceMetaFields() {
		return this.resourceMetaFields;
	}
	

	public MetaField resourceMetaFields(List<String> resourceMetaFields) {
		setResourceMetaFields(resourceMetaFields);
		return this;
	}
	

	public List<String> resourceMetaFields() {
		return getResourceMetaFields();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MetaField x = (MetaField)o;
	
		return super.equals(o)
			&& Objects.equals(this.namespace, x.namespace)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.value, x.value)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceMetaFields, x.resourceMetaFields)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			namespace, name, value, versions, resourceMetaFields
			
		);
	
	}
	

	@Override
	public MetaField clone() {
	
		MetaField no = new MetaField();
	
		no = super.clone(no);
	
		no.namespace = this.namespace;
		no.name = this.name;
		no.value = this.value;
		no.versions = this.versions;
		no.resourceMetaFields = this.resourceMetaFields;
	
		return no;
	
	}
	
}
