package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCreditCardsId
 */
public class DeleteAccountCreditCardsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	public DeleteAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return CreditCard.class;
	}
	
}
