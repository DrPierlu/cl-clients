package io.commercelayer.api.operation.common;

public class GetIdOperation extends GetOperation implements IdOperation {
	
	protected GetIdOperation(String path) {
		super(path);
	}
	
	protected GetIdOperation(String path, Long id) {
		this(path);
		setId(id);
	}
	

	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}

}
