package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelVariantOptions
 */
public class GetChannelVariantOptions extends SearchOperation<VariantOption> {

	public static final String OPERATION_PATH = "/channel/variant_options";


	public GetChannelVariantOptions() {
		super(OPERATION_PATH);
	}
	

	public Class<VariantOption> getResourceType() {
		return VariantOption.class;
	}
	
}
