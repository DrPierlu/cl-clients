package io.commercelayer.api.codegen.model;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModelObject {

	protected String name;
	protected Integer modifier;
	protected String comment;
	protected int linesBefore = 0;
	protected int linesAfter = 0;
	protected List<Class<? extends Annotation>> annotationList = new ArrayList<>();

	public abstract String generate();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public final int getLinesBefore() {
		return linesBefore;
	}

	public void setLinesBefore(int linesBefore) {
		this.linesBefore = linesBefore;
	}

	public final int getLinesAfter() {
		return linesAfter;
	}

	public void setLinesAfter(int linesAfter) {
		this.linesAfter = linesAfter;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void setComment(String comment, Object... params) {
		this.comment = String.format(comment, params);
	}

	protected String newLine() {
		return "\n";
	}

	protected String newLines(int numLines) {
		if (numLines <= 0) return "";
		else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numLines; i++) sb.append('\n');
			return sb.toString();
		}
	}

	public String emptyLine() {
		return "";
	}

	protected List<String> emptyLines(int numLines) {
		List<String> lines = new ArrayList<>();
		if (numLines > 0)
			for (int i = 0; i < numLines; i++) lines.add("");
		return lines;
	}

	
	public List<Class<? extends Annotation>> getAnnotationList() {
		return annotationList;
	}
	
	public boolean addAnnotation(Class<? extends Annotation> annotation) {
		if (!annotation.isAnnotation()) return false;
		this.annotationList.add(annotation);
		return true;
	}
	
	public StringBuilder writeComment(StringBuilder sb) {
		if (sb == null) return null;
		if (getComment() != null) {
			sb.append("/**").append(newLine());
			sb.append(" * ").append(getComment()).append(newLine());
			sb.append(" */").append(newLine());
		}
		return sb;
	}

}
