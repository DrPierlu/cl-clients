package io.commercelayer.api.operation;

import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCatalogsId
 */
public class GetAccountCatalogsId extends GetIdOperation<Catalog> {

	public static final String OPERATION_PATH = "/account/catalogs/{id}";


	public GetAccountCatalogsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCatalogsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Catalog> getResourceType() {
		return Catalog.class;
	}
	
}
