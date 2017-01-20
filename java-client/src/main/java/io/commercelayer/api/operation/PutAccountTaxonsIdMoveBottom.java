package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountTaxonsIdMoveBottom
 */
public class PutAccountTaxonsIdMoveBottom extends MoveOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}/move_bottom";


	public PutAccountTaxonsIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonsIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxon.class;
	}
	
}
