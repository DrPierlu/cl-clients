package io.commercelayer.api.codegen.model;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.commercelayer.api.codegen.model.Method.Param;

public class Constructor extends AbstractModelObject {

	private List<Param> signatureParams = new ArrayList<>();

	public Constructor() {
		super();
	}
	
	public Constructor(String name, Integer modifier) {
		this();
		this.name = name;
		this.modifier = modifier;
	}
	
	public Constructor(String name, Integer modifier, Param... signatureParams) {
		this(name, modifier);
		this.signatureParams = Arrays.asList(signatureParams);
	}


	public void setModifier(Integer modifier) {
		if ((Modifier.constructorModifiers() & modifier.intValue()) == 0)
			throw new IllegalArgumentException("Invalid constructor modifier: " + modifier);
		this.modifier = modifier;
	}

	public List<Param> getSignatureParams() {
		return signatureParams;
	}

	public void setSignatureParams(List<Param> signatureParams) {
		this.signatureParams = signatureParams;
	}
	
	public void addSignatureParam(Param param) {
		this.signatureParams.add(param);
	}
	
	
	public String generate() {

		StringBuilder sb = new StringBuilder();

		sb.append(Modifier.toString(getModifier())).append(' ').append(getName()).append('(');

		if (!getSignatureParams().isEmpty()) {
			int params = 0;
			for (Param p : getSignatureParams()) {
				if (params > 0)
					sb.append(", ");
				sb.append(strType(p.getType(), p.getListType())).append(' ').append(p.getName());
				params++;
			}
		}
		sb.append(')');
		
		
		sb.append(" {").append(newLine());

		sb.append("\tsuper();").append(newLine());
		if (!getSignatureParams().isEmpty()) {
			for (Param p : getSignatureParams()) {
				sb.append("\tthis.").append(p.getName()).append(" = ").append(p.getName()).append(';');
				sb.append(newLine());
			}
		}
		
		sb.append('}').append(newLine());

		return sb.toString();

	}
	
	public int getLinesBefore() {
		return 1;
	}

	public int getLinesAfter() {
		return 1;
	}

}
