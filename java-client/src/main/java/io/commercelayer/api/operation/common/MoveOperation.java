package io.commercelayer.api.operation.common;

public class MoveOperation extends GetIdOperation {
	
	private static final String PARAM_POSITION = "position";

	protected MoveOperation(String path) {
		super(path);
	}
	
	protected MoveOperation(String path, Long id) {
		this(path);
		setId(id);
	}

	
	public Long getPosition() {
		return (Long)getPathParam(PARAM_POSITION);
	}

	public void setPosition(Long position) {
		addPathParam(PARAM_POSITION, position);
	}

}
