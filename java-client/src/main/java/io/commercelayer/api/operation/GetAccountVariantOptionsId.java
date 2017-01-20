package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountVariantOptionsId
 */
public class GetAccountVariantOptionsId extends GetIdOperation<VariantOption> {

	public static final String OPERATION_PATH = "/account/variant_options/{id}";


	public GetAccountVariantOptionsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountVariantOptionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<VariantOption> getResourceType() {
		return VariantOption.class;
	}
	
}
