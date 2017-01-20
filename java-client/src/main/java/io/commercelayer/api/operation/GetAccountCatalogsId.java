package io.commercelayer.api.operation;

import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCatalogsId
 */
public class GetAccountCatalogsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/catalogs/{id}";


	public GetAccountCatalogsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCatalogsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Catalog.class;
	}
	
}
