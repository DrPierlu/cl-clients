package io.commercelayer.api.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;

public class HttpClientTest {

	@Test
	public void sendGetTest() {

		HttpClient client = HttpClientFactory.getHttpClientInstance();

		HttpRequest request = new HttpRequest(Method.GET);

		request.setUrl("http://www.infogroup.it");

		HttpResponse response = null;

		try {
			response = client.send(request);
		} catch (HttpException he) {
			he.printStackTrace();
		}

		Assert.assertEquals(200, response.getCode());
		Assert.assertTrue(StringUtils.isNotBlank(response.getBody()));

	}

}
