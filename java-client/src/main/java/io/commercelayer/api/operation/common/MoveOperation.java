package io.commercelayer.api.operation.common;

public class MoveOperation extends GetOperation implements IdOperation {
	
	private static final String PARAM_POSITION = "position";

	public MoveOperation(String path) {
		super(path);
	}
	
	public MoveOperation(String path, Long id) {
		this(path);
		setId(id);
	}

	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}
	
	public Long getPosition() {
		return (Long)getPathParam(PARAM_POSITION);
	}

	public void setPosition(Long position) {
		addPathParam(PARAM_POSITION, position);
	}

}
