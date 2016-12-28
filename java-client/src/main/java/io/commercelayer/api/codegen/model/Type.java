package io.commercelayer.api.codegen.model;

import java.util.Objects;

public class Type {
	
	private Class<?> typeClass;
	private Class<?> typeClassGen;
	
	private String typeStr;
	private String typeStrGen;
	
	public Type(Class<?> typeClass) {
		super();
		this.typeClass = typeClass;
	}
	
	public Type(Class<?> typeClass, Class<?> typeClassGen) {
		this(typeClass);
		this.typeClassGen = typeClassGen;
	}
	
	public Type(String typeStr) {
		super();
		this.typeStr = typeStr;
	}
	
	public Type(String typeStr, String typeStrGen) {
		this(typeStr);
		this.typeStrGen = typeStrGen;
	}
	
	public String getPackage() {
		if (this.typeClass != null) return this.typeClass.getPackage().getName();
		else
		if (this.typeStr != null) {
			int idx = this.typeStr.lastIndexOf('.');
			if (idx == -1) return null;
			else return this.typeStr.substring(0, idx);
		}
		else return null;
	}
	
	public String getName() {
		if (this.typeClass != null) return this.typeClass.getSimpleName();
		else
		if (this.typeStr != null) {
			int idx = this.typeStr.lastIndexOf('.');
			if (idx == -1) return this.typeStr;
			else return this.typeStr.substring(idx+1);
		}
		else return null;
	}
	
	public String getNameGen() {
		
		String name = getName();
		if (name == null) return null;
		
		String gen = null;
		
		if (this.typeClassGen != null) gen = this.typeClassGen.getSimpleName();
		else
		if (this.typeStrGen != null) {
			int idx = this.typeStrGen.lastIndexOf('.');
			if (idx == -1) gen = this.typeStrGen;
			else gen = this.typeStrGen.substring(idx+1);
		}
		
		if (gen != null) name = name.concat("<").concat(gen).concat(">");
		
		return name;
		
	}
	
	public String getImport() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPackage());
		if (sb.length() > 0) sb.append('.');
		sb.append(getName());
		return sb.toString();
	}
	
	public Class<?> getTypeClass() {
		return this.typeClass;
	}
	
	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Type x = (Type)o;
	
		return Objects.equals(this.typeClass, x.typeClass)
			&& Objects.equals(this.typeClassGen, x.typeClassGen)
			&& Objects.equals(this.typeStr, x.typeStr)
			&& Objects.equals(this.typeStrGen, x.typeStrGen)
		;
	
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(
			typeClass, typeClassGen, typeStr, typeStrGen
		);
	}
	
}
