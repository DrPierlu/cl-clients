package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOrdersIdTaxRates
 */
public class PutAccountOrdersIdTaxRates extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}/tax_rates";


	{
		addRequiredField("id");
	}


	public PutAccountOrdersIdTaxRates() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrdersIdTaxRates(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
