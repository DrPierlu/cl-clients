package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.DeleteAccountContactsId;
import io.commercelayer.api.operation.GetAccountContactsId;
import io.commercelayer.api.operation.PostAccountContacts;
import io.commercelayer.api.operation.PutAccountContactsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ContactTest
 */
public class ContactTest extends IntegrationTest<Contact> {

	@Override
	public ApiResponse<Contact> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountContacts postOp = ApiOperations.PostAccountContacts();
	
		Contact res = new Contact();
	
		// FIELD NOT FOUND -> res.setStockLocationIds("stockLocationIds");
		// FIELD NOT FOUND -> res.setShippingMethodIds("shippingMethodIds");
		// FIELD NOT FOUND -> res.setTaxIdNumber("taxIdNumber");
		res.setPhone("phone");
		// FIELD NOT FOUND -> res.setPaymentMethodIds("paymentMethodIds");
		res.setName("name");
		// FIELD NOT FOUND -> res.setNationalIdNumber("nationalIdNumber");
		res.setCustom3("custom3");
		res.setCustom1("custom1");
		res.setCustom2("custom2");
		res.setEmail("email");
		// FIELD NOT FOUND -> res.setInvoiceIds("invoiceIds");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountContacts> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Contact> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockLocationIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingMethodIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxIdNumber());
		Assert.assertNotNull(postRes.getResource().getPhone());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentMethodIds());
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getNationalIdNumber());
		Assert.assertNotNull(postRes.getResource().getCustom3());
		Assert.assertNotNull(postRes.getResource().getCustom1());
		Assert.assertNotNull(postRes.getResource().getCustom2());
		Assert.assertNotNull(postRes.getResource().getEmail());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getInvoiceIds());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Contact> crudReadTest(Contact res, ApiCaller caller) {
	
		// GET
	
		GetAccountContactsId getOp = ApiOperations.GetAccountContactsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountContactsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Contact> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Contact> crudUpdateTest(Contact oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountContactsId putOp = ApiOperations.PutAccountContactsId();
		putOp.setId(oldRes.getId());
	
		Contact res = new Contact();
	
		// FIELD NOT FOUND -> res.setStockLocationIds(randomField(oldRes.getStockLocationIds()));
		// FIELD NOT FOUND -> res.setShippingMethodIds(randomField(oldRes.getShippingMethodIds()));
		// FIELD NOT FOUND -> res.setTaxIdNumber(randomField(oldRes.getTaxIdNumber()));
		res.setPhone(randomField(oldRes.getPhone()));
		// FIELD NOT FOUND -> res.setPaymentMethodIds(randomField(oldRes.getPaymentMethodIds()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setNationalIdNumber(randomField(oldRes.getNationalIdNumber()));
		res.setCustom3(randomField(oldRes.getCustom3()));
		res.setCustom1(randomField(oldRes.getCustom1()));
		res.setCustom2(randomField(oldRes.getCustom2()));
		res.setEmail(randomField(oldRes.getEmail()));
		// FIELD NOT FOUND -> res.setInvoiceIds(randomField(oldRes.getInvoiceIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountContactsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Contact> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockLocationIds(), putRes.getResource().getStockLocationIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingMethodIds(), putRes.getResource().getShippingMethodIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxIdNumber(), putRes.getResource().getTaxIdNumber());
		Assert.assertNotEquals(oldRes.getPhone(), putRes.getResource().getPhone());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentMethodIds(), putRes.getResource().getPaymentMethodIds());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getNationalIdNumber(), putRes.getResource().getNationalIdNumber());
		Assert.assertNotEquals(oldRes.getCustom3(), putRes.getResource().getCustom3());
		Assert.assertNotEquals(oldRes.getCustom1(), putRes.getResource().getCustom1());
		Assert.assertNotEquals(oldRes.getCustom2(), putRes.getResource().getCustom2());
		Assert.assertNotEquals(oldRes.getEmail(), putRes.getResource().getEmail());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getInvoiceIds(), putRes.getResource().getInvoiceIds());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Contact> crudDeleteTest(Contact res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountContactsId delOp = ApiOperations.DeleteAccountContactsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountContactsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Contact> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountContactsId getOp = ApiOperations.GetAccountContactsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountContactsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Contact> getRes = null;
	
		try {
			getRes = test(getReq, caller, false);
		}
		catch (TestException te) {
			if (te.causedByApiError()) {
				Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
				Assert.assertNull(getRes);
			}
			else throw te;
		}
	
	
		return delRes;
	
	}
	

	public static void main(String[] args) {
	
		ContactTest test = new ContactTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
