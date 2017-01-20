package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountTaxonsIdMoveTop
 */
public class PutAccountTaxonsIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}/move_top";


	public PutAccountTaxonsIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonsIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxon.class;
	}
	
}
