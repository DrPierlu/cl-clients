package io.commercelayer.api.operation;

import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountVariantsId
 */
public class GetAccountVariantsId extends GetIdOperation<Variant> {

	public static final String OPERATION_PATH = "/account/variants/{id}";


	public GetAccountVariantsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountVariantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Variant> getResourceType() {
		return Variant.class;
	}
	
}
