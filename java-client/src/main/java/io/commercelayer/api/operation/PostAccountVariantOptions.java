package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountVariantOptions
 */
public class PostAccountVariantOptions extends PostOperation<VariantOption> {

	public static final String OPERATION_PATH = "/account/variant_options";


	{
		addRequiredField("variantId");
		addRequiredField("optionValueId");
	}


	public PostAccountVariantOptions() {
		super(OPERATION_PATH);
	}
	

	public Class<VariantOption> getResourceType() {
		return VariantOption.class;
	}
	
}
