package io.commercelayer.api.operation.common;

import io.commercelayer.api.operation.DeleteAccountAddressesId;
import io.commercelayer.api.operation.GetAccountAddresses;
import io.commercelayer.api.operation.GetAccountAddressesId;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.PutAccountAddressesId;

public final class ApiOperations {

	// Address
	public static GetAccountAddressesId GetAccountAddressesId() 		{ return new GetAccountAddressesId(); }
	public static GetAccountAddresses GetAccountAddresses() 			{ return new GetAccountAddresses(); }
	public static PostAccountAddresses PostAccountAddresses() 			{ return new PostAccountAddresses(); }
	public static PutAccountAddressesId PutAccountAddressesId() 		{ return new PutAccountAddressesId(); }
	public static DeleteAccountAddressesId DeleteAccountAddressesId() 	{ return new DeleteAccountAddressesId(); }

}
