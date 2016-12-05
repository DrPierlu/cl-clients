package io.commercelayer.api.codegen.model;

import java.util.ArrayList;
import java.util.List;

public class CustomConstructor extends Constructor {

	private List<String> body = new ArrayList<>();
	private List<Exception> exceptionList = new ArrayList<>();

	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public List<Exception> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Exception> exceptionList) {
		this.exceptionList = exceptionList;
	}
	
	public void addException(Exception e) {
		this.exceptionList.add(e);
	}

}
