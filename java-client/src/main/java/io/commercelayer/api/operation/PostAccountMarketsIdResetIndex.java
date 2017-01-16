package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarketsIdResetIndex
 */
public class PostAccountMarketsIdResetIndex extends PostOperation {

	public static final String OPERATION_PATH = "/account/markets/{id}/reset_index";


	{
		addRequiredField("id");
	}


	public PostAccountMarketsIdResetIndex() {
		super(OPERATION_PATH);
	}
	
}
