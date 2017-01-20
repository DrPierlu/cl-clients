package io.commercelayer.api.operation;

import io.commercelayer.api.model.Variant;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountVariants
 */
public class GetAccountVariants extends SearchOperation {

	public static final String OPERATION_PATH = "/account/variants";


	public GetAccountVariants() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Variant.class;
	}
	
}
