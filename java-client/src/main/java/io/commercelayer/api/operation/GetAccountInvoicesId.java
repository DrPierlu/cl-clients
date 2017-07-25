package io.commercelayer.api.operation;

import io.commercelayer.api.model.Invoice;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountInvoicesId
 */
public class GetAccountInvoicesId extends GetIdOperation<Invoice> {

	public static final String OPERATION_PATH = "/account/invoices/{id}";


	public GetAccountInvoicesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountInvoicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Invoice> getResourceType() {
		return Invoice.class;
	}
	
}
