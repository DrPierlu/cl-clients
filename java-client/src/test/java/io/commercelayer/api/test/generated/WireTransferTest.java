package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.WireTransfer;
import io.commercelayer.api.operation.DeleteAccountWireTransfersId;
import io.commercelayer.api.operation.GetAccountWireTransfersId;
import io.commercelayer.api.operation.PostAccountWireTransfers;
import io.commercelayer.api.operation.PutAccountWireTransfersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * WireTransferTest
 */
public class WireTransferTest extends IntegrationTest<WireTransfer> {

	@Override
	public ApiResponse<WireTransfer> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountWireTransfers postOp = ApiOperations.PostAccountWireTransfers();
	
		WireTransfer res = new WireTransfer();
	
		/* No payload data */
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountWireTransfers> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<WireTransfer> postRes = test(postReq, caller);
	
	
		/* No test assertions */
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<WireTransfer> crudReadTest(WireTransfer res, ApiCaller caller) {
	
		// GET
	
		GetAccountWireTransfersId getOp = ApiOperations.GetAccountWireTransfersId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountWireTransfersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<WireTransfer> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<WireTransfer> crudUpdateTest(WireTransfer oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountWireTransfersId putOp = ApiOperations.PutAccountWireTransfersId();
		putOp.setId(oldRes.getId());
	
		WireTransfer res = new WireTransfer();
	
	
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountWireTransfersId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<WireTransfer> putRes = test(putReq, caller);
	
	
	
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<WireTransfer> crudDeleteTest(WireTransfer res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountWireTransfersId delOp = ApiOperations.DeleteAccountWireTransfersId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountWireTransfersId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<WireTransfer> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountWireTransfersId getOp = ApiOperations.GetAccountWireTransfersId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountWireTransfersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<WireTransfer> getRes = null;
	
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
	
		WireTransferTest test = new WireTransferTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
