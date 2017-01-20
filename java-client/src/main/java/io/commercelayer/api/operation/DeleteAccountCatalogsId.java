package io.commercelayer.api.operation;

import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCatalogsId
 */
public class DeleteAccountCatalogsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/catalogs/{id}";


	public DeleteAccountCatalogsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCatalogsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Catalog.class;
	}
	
}
