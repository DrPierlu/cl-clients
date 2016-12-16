package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCountryGroups
 */
public class PostAccountCountryGroups extends PostOperation {

	public static final String OPERATION_PATH = "/account/country_groups";


	public PostAccountCountryGroups() {
		super(OPERATION_PATH);
	}
	
}
