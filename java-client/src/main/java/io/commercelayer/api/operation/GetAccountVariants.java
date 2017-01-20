package io.commercelayer.api.operation;

import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountVariants
 */
public class GetAccountVariants extends SearchOperation<Variant> {

	public static final String OPERATION_PATH = "/account/variants";


	public GetAccountVariants() {
		super(OPERATION_PATH);
	}
	

	public Class<Variant> getResourceType() {
		return Variant.class;
	}
	
}
