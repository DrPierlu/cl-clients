package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountTaxonomiesId
 */
public class DeleteAccountTaxonomiesId extends DeleteOperation<Taxonomy> {

	public static final String OPERATION_PATH = "/account/taxonomies/{id}";


	public DeleteAccountTaxonomiesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountTaxonomiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Taxonomy> getResourceType() {
		return Taxonomy.class;
	}
	
}
