package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountVariantOptionsId
 */
public class PutAccountVariantOptionsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/variant_options/{id}";


	{
		addRequiredField("variantId");
		addRequiredField("optionValueId");
		addRequiredField("id");
	}


	public PutAccountVariantOptionsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountVariantOptionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return VariantOption.class;
	}
	
}
