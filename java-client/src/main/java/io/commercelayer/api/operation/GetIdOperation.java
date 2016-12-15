package io.commercelayer.api.operation;

public class GetIdOperation extends GetOperation implements IdOperation {
	
	public GetIdOperation(String path) {
		super(path);
	}
	
	public GetIdOperation(String path, Long id) {
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
