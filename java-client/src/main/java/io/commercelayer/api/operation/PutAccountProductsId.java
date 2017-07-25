package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountProductsId
 */
public class PutAccountProductsId extends PutOperation<Product> {

	public static final String OPERATION_PATH = "/account/products/{id}";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
		addRequiredField("description");
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
		addRequiredField("variantIds");
		addRequiredField("merchandisingRuleIds");
		addRequiredField("productPropertyIds");
		addRequiredField("propertyValueIds");
	}


	public PutAccountProductsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Product> getResourceType() {
		return Product.class;
	}
	
}
