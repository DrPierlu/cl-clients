package io.commercelayer.api.operation;

import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCatalogs
 */
public class PostAccountCatalogs extends PostOperation<Catalog> {

	public static final String OPERATION_PATH = "/account/catalogs";


	{
		addRequiredField("name");
		addRequiredField("description");
	}


	public PostAccountCatalogs() {
		super(OPERATION_PATH);
	}
	

	public Class<Catalog> getResourceType() {
		return Catalog.class;
	}
	
}
