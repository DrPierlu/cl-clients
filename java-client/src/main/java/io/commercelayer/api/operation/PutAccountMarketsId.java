package io.commercelayer.api.operation;

import io.commercelayer.api.model.Market;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMarketsId
 */
public class PutAccountMarketsId extends PutOperation<Market> {

	public static final String OPERATION_PATH = "/account/markets/{id}";


	{
		addRequiredField("merchantId");
		addRequiredField("countryGroupId");
		addRequiredField("catalogId");
		addRequiredField("priceListId");
		addRequiredField("channelId");
		addRequiredField("orderValidatorId");
		addRequiredField("id");
	}


	public PutAccountMarketsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMarketsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Market> getResourceType() {
		return Market.class;
	}
	
}
