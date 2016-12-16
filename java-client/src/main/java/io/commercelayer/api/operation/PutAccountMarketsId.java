package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMarketsId
 */
public class PutAccountMarketsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/markets/{id}";


	public PutAccountMarketsId() {
		super(OPERATION_PATH);
	}
	
}
