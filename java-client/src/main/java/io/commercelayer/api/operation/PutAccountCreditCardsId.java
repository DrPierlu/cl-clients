package io.commercelayer.api.operation;

import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCreditCardsId
 */
public class PutAccountCreditCardsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("number");
		addRequiredField("month");
		addRequiredField("year");
		addRequiredField("id");
	}


	public PutAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return CreditCard.class;
	}
	
}
