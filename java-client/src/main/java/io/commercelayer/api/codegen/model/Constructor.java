package io.commercelayer.api.codegen.model;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constructor extends AbstractModelObject {

	private boolean parent;
	private List<Constructor.Param> signatureParams = new ArrayList<>();

	public Constructor() {
		super();
	}

	public Constructor(String name, Integer modifier) {
		this();
		this.name = name;
		this.modifier = modifier;
	}

	public Constructor(String name, Integer modifier, Constructor.Param... signatureParams) {
		this(name, modifier);
		this.signatureParams = Arrays.asList(signatureParams);
	}

	public void setModifier(Integer modifier) {
		if ((Modifier.constructorModifiers() & modifier.intValue()) == 0)
			throw new IllegalArgumentException("Invalid constructor modifier: " + modifier);
		this.modifier = modifier;
	}

	public List<Constructor.Param> getSignatureParams() {
		return signatureParams;
	}

	public void setSignatureParams(List<Param> signatureParams) {
		this.signatureParams = signatureParams;
	}

	public void addSignatureParam(Constructor.Param param) {
		this.signatureParams.add(param);
	}

	public boolean isParent() {
		return parent;
	}

	public void setParent(boolean parent) {
		this.parent = parent;
	}

	public String generate() {

		StringBuilder sb = new StringBuilder();

		sb.append(Modifier.toString(getModifier())).append(' ').append(getName()).append('(');

		if (!getSignatureParams().isEmpty()) {
			int params = 0;
			for (Constructor.Param p : getSignatureParams()) {
				if (params > 0)
					sb.append(", ");
				sb.append(strType(p.getType(), p.getListType())).append(' ').append(p.getName());
				params++;
			}
		}
		sb.append(')');

		sb.append(" {").append(newLine());

		if (isParent()) {
			sb.append("\tsuper(");
			if (!getSignatureParams().isEmpty()) {
				int i = 0;
				for (Constructor.Param p : getSignatureParams()) {
					if (i++ > 0) sb.append(", ");
					sb.append(p.getName());
				}
			}
			sb.append(");").append(newLine());
		}
		else {
			sb.append("\tsuper();").append(newLine());
			if (!getSignatureParams().isEmpty()) {
				for (Constructor.Param p : getSignatureParams()) {
					sb.append('\t').append(p.isDeclared()? "this" : "super").append('.');
					sb.append(p.getName()).append(" = ").append(p.getName()).append(';');
					sb.append(newLine());
				}
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

	public static class Param extends Method.Param {

		private boolean declared;

		public Param(Class<?> type, String name) {
			super(type, name);
		}

		public Param(Class<?> type, String name, boolean declared) {
			this(type, name);
			this.declared = declared;
		}

		public boolean isDeclared() {
			return declared;
		}

		public void setDeclared(boolean declared) {
			this.declared = declared;
		}

	}

}
