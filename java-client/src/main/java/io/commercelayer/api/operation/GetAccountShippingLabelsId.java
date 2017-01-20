package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingLabelsId
 */
public class GetAccountShippingLabelsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_labels/{id}";


	public GetAccountShippingLabelsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingLabelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingLabel.class;
	}
	
}
