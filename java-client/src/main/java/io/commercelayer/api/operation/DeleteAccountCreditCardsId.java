package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCreditCardsId
 */
public class DeleteAccountCreditCardsId extends DeleteOperation<CreditCard> {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	public DeleteAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CreditCard> getResourceType() {
		return CreditCard.class;
	}
	
}
