package io.commercelayer.api.operation;

import io.commercelayer.api.model.Market;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarkets
 */
public class PostAccountMarkets extends PostOperation {

	public static final String OPERATION_PATH = "/account/markets";


	{
		addRequiredField("merchantId");
		addRequiredField("countryGroupId");
		addRequiredField("catalogId");
		addRequiredField("priceListId");
		addRequiredField("channelId");
		addRequiredField("orderValidatorId");
	}


	public PostAccountMarkets() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Market.class;
	}
	
}
