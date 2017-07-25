package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPriceListsId
 */
public class PutAccountPriceListsId extends PutOperation<PriceList> {

	public static final String OPERATION_PATH = "/account/price_lists/{id}";


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


	public PutAccountPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PriceList> getResourceType() {
		return PriceList.class;
	}
	
}
