package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.DeleteAccountChannelsId;
import io.commercelayer.api.operation.GetAccountChannelsId;
import io.commercelayer.api.operation.PostAccountChannels;
import io.commercelayer.api.operation.PutAccountChannelsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * ChannelTest
 */
public class ChannelTest extends IntegrationTest<Channel> {

	@Override
	public ApiResponse<Channel> crudCreateTest(ApiCaller caller) {

		// POST

		PostAccountChannels postOp = ApiOperations.PostAccountChannels();

		Channel a = new Channel();

		a.setName(randomField("Channel"));

		postOp.setPayload(a);

		ApiRequest<PostAccountChannels> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<Channel> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<Channel> crudReadTest(Channel res, ApiCaller caller) {

		// GET

		GetAccountChannelsId getOp = ApiOperations.GetAccountChannelsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountChannelsId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Channel> getRes = test(getReq, caller);

		Assert.assertNotNull(getRes.getResource().getName());

		return getRes;

	}


	@Override
	public ApiResponse<Channel> crudUpdateTest(Channel oldRes, ApiCaller caller) {

		// PUT

		PutAccountChannelsId putOp = ApiOperations.PutAccountChannelsId();
		putOp.setId(oldRes.getId());

		Channel a = new Channel();

		a.setName(randomField(oldRes.getName()));

		putOp.setPayload(a);

		ApiRequest<PutAccountChannelsId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Channel> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());

		return putRes;

	}


	@Override
	public ApiResponse<Channel> crudDeleteTest(Channel res, ApiCaller caller) {

		// DELETE

		DeleteAccountChannelsId delOp = ApiOperations.DeleteAccountChannelsId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountChannelsId> delReq = new ApiRequest<>(delOp);
		
		ApiResponse<Channel> delRes = test(delReq, caller);

		// GET

		GetAccountChannelsId getOp = ApiOperations.GetAccountChannelsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountChannelsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Channel> getRes = test(getReq, caller, false);
		
		Assert.assertNull(getRes.getResource());
		
		return delRes;

	}


	public static void main(String[] args) {

		ChannelTest test = new ChannelTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
