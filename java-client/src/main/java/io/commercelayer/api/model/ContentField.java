package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ContentField
 */
public class ContentField extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String content;
	private String name;
	private String namespace;
	@JsonExclude
	private List<String> resourceContentFields;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> versions;


	public ContentField() {
		super();
	}
	

	public ContentField(Long id) {
		super(id);
	}
	

	public void setContent(String content) {
		this.content = content;
	}
	

	public String getContent() {
		return this.content;
	}
	

	public ContentField content(String content) {
		setContent(content);
		return this;
	}
	

	public String content() {
		return getContent();
	}
	

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	

	public String getNamespace() {
		return this.namespace;
	}
	

	public ContentField namespace(String namespace) {
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
	

	public ContentField name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ContentField versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public ContentField translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setResourceContentFields(List<String> resourceContentFields) {
		this.resourceContentFields = resourceContentFields;
	}
	

	public List<String> getResourceContentFields() {
		return this.resourceContentFields;
	}
	

	public ContentField resourceContentFields(List<String> resourceContentFields) {
		setResourceContentFields(resourceContentFields);
		return this;
	}
	

	public List<String> resourceContentFields() {
		return getResourceContentFields();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ContentField x = (ContentField)o;
	
		return super.equals(o)
			&& Objects.equals(this.content, x.content)
			&& Objects.equals(this.namespace, x.namespace)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.resourceContentFields, x.resourceContentFields)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			content, namespace, name, versions, translations,
			resourceContentFields 
		);
	
	}
	

	@Override
	public ContentField clone() {
	
		ContentField no = new ContentField();
	
		no = super.clone(no);
	
		no.content = this.content;
		no.namespace = this.namespace;
		no.name = this.name;
		no.versions = this.versions;
		no.translations = this.translations;
		no.resourceContentFields = this.resourceContentFields;
	
		return no;
	
	}
	
}
