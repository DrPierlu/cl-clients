package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountTaxonsId
 */
public class PutAccountTaxonsId extends PutOperation<Taxon> {

	public static final String OPERATION_PATH = "/account/taxons/{id}";


	{
		addRequiredField("taxonomyId");
		addRequiredField("name");
		addRequiredField("parentId");
		addRequiredField("id");
	}


	public PutAccountTaxonsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Taxon> getResourceType() {
		return Taxon.class;
	}
	
}
