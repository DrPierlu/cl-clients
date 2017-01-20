package io.commercelayer.api.operation;

import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountVariants
 */
public class PostAccountVariants extends PostOperation<Variant> {

	public static final String OPERATION_PATH = "/account/variants";


	{
		addRequiredField("productId");
		addRequiredField("sku");
		addRequiredField("taxCode");
		addRequiredField("trackInventory");
	}


	public PostAccountVariants() {
		super(OPERATION_PATH);
	}
	

	public Class<Variant> getResourceType() {
		return Variant.class;
	}
	
}
