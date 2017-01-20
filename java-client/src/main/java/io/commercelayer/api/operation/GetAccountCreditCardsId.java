package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCreditCardsId
 */
public class GetAccountCreditCardsId extends GetIdOperation<CreditCard> {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	public GetAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CreditCard> getResourceType() {
		return CreditCard.class;
	}
	
}
