package io.commercelayer.api.operation;

import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountVariantsId
 */
public class PutAccountVariantsId extends PutOperation<Variant> {

	public static final String OPERATION_PATH = "/account/variants/{id}";


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


	public PutAccountVariantsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountVariantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Variant> getResourceType() {
		return Variant.class;
	}
	
}
