package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCustomsItemsId
 */
public class DeleteAccountCustomsItemsId extends DeleteOperation<CustomsItem> {

	public static final String OPERATION_PATH = "/account/customs_items/{id}";


	public DeleteAccountCustomsItemsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCustomsItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsItem> getResourceType() {
		return CustomsItem.class;
	}
	
}
