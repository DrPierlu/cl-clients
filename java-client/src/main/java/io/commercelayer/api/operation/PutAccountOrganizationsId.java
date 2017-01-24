package io.commercelayer.api.operation;

import io.commercelayer.api.model.Organization;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrganizationsId
 */
public class PutAccountOrganizationsId extends PutOperation<Organization> {

	public static final String OPERATION_PATH = "/account/organizations/{id}";


	{
		addRequiredField("name");
	}


	public PutAccountOrganizationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrganizationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Organization> getResourceType() {
		return Organization.class;
	}
	
}
