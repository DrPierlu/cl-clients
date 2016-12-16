package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountImages
 */
public class GetAccountImages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/images";


	public GetAccountImages() {
		super(OPERATION_PATH);
	}
	
}
