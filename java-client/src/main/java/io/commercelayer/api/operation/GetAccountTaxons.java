package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountTaxons
 */
public class GetAccountTaxons extends SearchOperation<Taxon> {

	public static final String OPERATION_PATH = "/account/taxons";


	public GetAccountTaxons() {
		super(OPERATION_PATH);
	}
	

	public Class<Taxon> getResourceType() {
		return Taxon.class;
	}
	
}
