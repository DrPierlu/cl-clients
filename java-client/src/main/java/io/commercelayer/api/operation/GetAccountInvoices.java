package io.commercelayer.api.operation;

import io.commercelayer.api.model.Invoice;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountInvoices
 */
public class GetAccountInvoices extends SearchOperation<Invoice> {

	public static final String OPERATION_PATH = "/account/invoices";


	public GetAccountInvoices() {
		super(OPERATION_PATH);
	}
	

	public Class<Invoice> getResourceType() {
		return Invoice.class;
	}
	
}
