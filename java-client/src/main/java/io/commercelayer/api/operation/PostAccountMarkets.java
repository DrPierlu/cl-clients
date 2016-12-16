package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMarkets
 */
public class PostAccountMarkets extends PostOperation {

	public static final String OPERATION_PATH = "/account/markets";


	public PostAccountMarkets() {
		super(OPERATION_PATH);
	}
	
}
