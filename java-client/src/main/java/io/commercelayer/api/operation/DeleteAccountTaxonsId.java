package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountTaxonsId
 */
public class DeleteAccountTaxonsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}";


	public DeleteAccountTaxonsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountTaxonsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxon.class;
	}
	
}
