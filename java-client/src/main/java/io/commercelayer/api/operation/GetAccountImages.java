package io.commercelayer.api.operation;

import io.commercelayer.api.model.Image;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountImages
 */
public class GetAccountImages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/images";


	public GetAccountImages() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Image.class;
	}
	
}
