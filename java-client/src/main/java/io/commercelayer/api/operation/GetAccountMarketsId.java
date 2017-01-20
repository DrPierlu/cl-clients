package io.commercelayer.api.operation;

import io.commercelayer.api.model.Market;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMarketsId
 */
public class GetAccountMarketsId extends GetIdOperation<Market> {

	public static final String OPERATION_PATH = "/account/markets/{id}";


	public GetAccountMarketsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Market> getResourceType() {
		return Market.class;
	}
	
}
