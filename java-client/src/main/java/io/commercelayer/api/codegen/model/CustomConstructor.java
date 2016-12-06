package io.commercelayer.api.codegen.model;

import java.util.ArrayList;
import java.util.List;

public class CustomConstructor extends Constructor {

	private List<String> body = new ArrayList<>();
	private List<Class<? extends Exception>> exceptionList = new ArrayList<>();

	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public List<Class<? extends Exception>> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Class<? extends Exception>> exceptionList) {
		this.exceptionList = exceptionList;
	}
	
	public void addException(Class<? extends Exception> e) {
		this.exceptionList.add(e);
	}

}
