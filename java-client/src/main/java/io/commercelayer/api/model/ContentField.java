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
	private String kind;
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> translations;


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
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public ContentField kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public ContentField previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ContentField x = (ContentField)o;
	
		return super.equals(o)
			&& Objects.equals(this.content, x.content)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.translations, x.translations)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			content, kind, name, previousChanges, translations
			
		);
	
	}
	

	@Override
	public ContentField clone() {
	
		ContentField no = new ContentField();
	
		no = super.clone(no);
	
		no.content = this.content;
		no.kind = this.kind;
		no.name = this.name;
		no.previousChanges = this.previousChanges;
		no.translations = this.translations;
	
		return no;
	
	}
	
}
