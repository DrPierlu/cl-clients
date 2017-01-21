package io.commercelayer.api;

import java.util.Base64;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.model.custom.ImageExt;

public class ApiUploader extends ApiConnector {
	
	public void uploadImage(ImageExt image) throws ApiException, AuthException {
		
	}
	
	
	protected String encode(byte[] attachment) {
		return Base64.getMimeEncoder().encodeToString(attachment);
	}
	
	protected byte[] decode(String base64) {
		return Base64.getMimeDecoder().decode(base64);
	}

}
