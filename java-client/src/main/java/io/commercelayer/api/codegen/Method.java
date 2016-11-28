package io.commercelayer.api.codegen;

import java.util.ArrayList;
import java.util.List;

public class Method extends AbstractModelObject {

	private String name;
	private Integer modifier;
	private Class<?> returnType;
	private List<Class<?>> signatureParams = new ArrayList<>();
	private List<String> body = new ArrayList<>();

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

	public Class<?> getReturnType() {
		return returnType;
	}

	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}

	public List<Class<?>> getSignatureParams() {
		return signatureParams;
	}

	public void setSignatureParams(List<Class<?>> signatureParams) {
		this.signatureParams = signatureParams;
	}

	public void addSignatureParam(Class<?> param) {
		this.signatureParams.add(param);
	}
	
	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public String generate() {
		return null;
	}
	
}
