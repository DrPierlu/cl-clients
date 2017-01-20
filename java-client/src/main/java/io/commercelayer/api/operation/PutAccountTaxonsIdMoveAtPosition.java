package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountTaxonsIdMoveAtPosition
 */
public class PutAccountTaxonsIdMoveAtPosition extends MoveOperation<Taxon> {

	public static final String OPERATION_PATH = "/account/taxons/{id}/move_at/{position}";


	public PutAccountTaxonsIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonsIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Taxon> getResourceType() {
		return Taxon.class;
	}
	
}
