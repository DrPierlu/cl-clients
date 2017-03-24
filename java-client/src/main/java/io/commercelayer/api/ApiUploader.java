package io.commercelayer.api;

import java.util.Base64;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.model.common.UploadableResource;

public class ApiUploader extends ApiConnector {
	
	public void upload(UploadableResource uploadableResource) throws ApiException, AuthException {
		
		String body = encode(uploadableResource.getAttachment());
		
	}
	
	
	protected String encode(byte[] attachment) {
		return Base64.getMimeEncoder().encodeToString(attachment);
	}
	
	protected byte[] decode(String base64) {
		return Base64.getMimeDecoder().decode(base64);
	}

}
