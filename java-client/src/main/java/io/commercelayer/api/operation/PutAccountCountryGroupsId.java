package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCountryGroupsId
 */
public class PutAccountCountryGroupsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/country_groups/{id}";


	public PutAccountCountryGroupsId() {
		super(OPERATION_PATH);
	}
	
}
