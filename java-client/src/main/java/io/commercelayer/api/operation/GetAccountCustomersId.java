package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCustomersId
 */
public class GetAccountCustomersId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/customers/{id}";


	public GetAccountCustomersId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCustomersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Customer.class;
	}
	
}
