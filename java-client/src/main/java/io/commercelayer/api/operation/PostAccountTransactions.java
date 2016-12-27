package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountTransactions
 */
public class PostAccountTransactions extends PostOperation {

	public static final String OPERATION_PATH = "/account/transactions";


	{
		addRequiredField("gatewayId");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceId");
		addRequiredField("kind");
		addRequiredField("orderId");
		addRequiredField("amount");
	}


	public PostAccountTransactions() {
		super(OPERATION_PATH);
	}
	
}
