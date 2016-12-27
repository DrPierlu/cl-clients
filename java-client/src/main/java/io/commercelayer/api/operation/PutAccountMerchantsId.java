package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMerchantsId
 */
public class PutAccountMerchantsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	{
		addRequiredField("name");
		addRequiredField("countryId");
		addRequiredField("description");
		addRequiredField("id");
	}

	public PutAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
