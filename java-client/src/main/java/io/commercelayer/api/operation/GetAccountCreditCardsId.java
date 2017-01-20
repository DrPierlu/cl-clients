package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCreditCardsId
 */
public class GetAccountCreditCardsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	public GetAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return CreditCard.class;
	}
	
}
