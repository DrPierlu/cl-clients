package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountAddresses
 */
public class PostAccountAddresses extends PostOperation {

	public static final String OPERATION_PATH = "/account/addresses";


	public PostAccountAddresses() {
		super(OPERATION_PATH);
	}
	
}
