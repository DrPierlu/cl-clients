package io.commercelayer.api.test.common.mock;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.util.LogUtils;

public class ApiCallerMock extends ApiCaller {

	public ApiCallerMock(ApiToken apiToken) {
		super(apiToken);
		LogUtils.singleInfoMessage(this, "********** ApiCallerMock created **********");
	}

}
