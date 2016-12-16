package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOrganizationsId
 */
public class PutAccountOrganizationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/organizations/{id}";


	public PutAccountOrganizationsId() {
		super(OPERATION_PATH);
	}
	
}
