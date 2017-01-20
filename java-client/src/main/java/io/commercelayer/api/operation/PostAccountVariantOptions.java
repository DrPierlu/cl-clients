package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountVariantOptions
 */
public class PostAccountVariantOptions extends PostOperation {

	public static final String OPERATION_PATH = "/account/variant_options";


	{
		addRequiredField("variantId");
		addRequiredField("optionValueId");
	}


	public PostAccountVariantOptions() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return VariantOption.class;
	}
	
}
