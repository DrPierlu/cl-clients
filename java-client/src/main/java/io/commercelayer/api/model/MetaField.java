package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * MetaField
 */
public class MetaField extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String key;
	private String namespace;
	private String value;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;


	public MetaField() {
		super();
	}
	

	public MetaField(Long id) {
		super(id);
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
	

	public void setKey(String key) {
		this.key = key;
	}
	

	public String getKey() {
		return this.key;
	}
	

	public MetaField key(String key) {
		setKey(key);
		return this;
	}
	

	public String key() {
		return getKey();
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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public MetaField previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		MetaField x = (MetaField)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.namespace, x.namespace)
			&& Objects.equals(this.key, x.key)
			&& Objects.equals(this.value, x.value)
			&& Objects.equals(this.previousChanges, x.previousChanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, namespace, key, value, previousChanges
			
		);
	
	}
	

	@Override
	public MetaField clone() {
	
		MetaField no = new MetaField();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.namespace = this.namespace;
		no.key = this.key;
		no.value = this.value;
		no.previousChanges = this.previousChanges;
	
		return no;
	
	}
	
}
