package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCreditCardsId
 */
public class PutAccountCreditCardsId extends PutOperation<CreditCard> {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("number");
		addRequiredField("month");
		addRequiredField("year");
	}


	public PutAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CreditCard> getResourceType() {
		return CreditCard.class;
	}
	
}
