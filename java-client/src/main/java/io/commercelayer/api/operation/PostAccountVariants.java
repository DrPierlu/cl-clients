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
		addRequiredField("priceIds");
		addRequiredField("lineItemIds");
		addRequiredField("stockItemIds");
		addRequiredField("shippingServiceStockLocationIds");
		addRequiredField("resourceImageIds");
		addRequiredField("imageIds");
		addRequiredField("resourceContentFieldIds");
		addRequiredField("contentFieldIds");
		addRequiredField("resourceMetaFieldIds");
		addRequiredField("metaFieldIds");
		addRequiredField("variantOptionIds");
		addRequiredField("optionValueIds");
	}


	public PostAccountVariants() {
		super(OPERATION_PATH);
	}
	

	public Class<Variant> getResourceType() {
		return Variant.class;
	}
	
}
