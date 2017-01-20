package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountTaxonsId
 */
public class GetAccountTaxonsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}";


	public GetAccountTaxonsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountTaxonsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxon.class;
	}
	
}
