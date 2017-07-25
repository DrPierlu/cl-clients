package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPriceLists
 */
public class PostAccountPriceLists extends PostOperation<PriceList> {

	public static final String OPERATION_PATH = "/account/price_lists";


	{
		addRequiredField("currencyId");
		addRequiredField("name");
		addRequiredField("taxIncluded");
		addRequiredField("priceIds");
		addRequiredField("shippingPriceIds");
		addRequiredField("paymentPriceIds");
		addRequiredField("marketPriceListIds");
		addRequiredField("marketIds");
	}


	public PostAccountPriceLists() {
		super(OPERATION_PATH);
	}
	

	public Class<PriceList> getResourceType() {
		return PriceList.class;
	}
	
}
