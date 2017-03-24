package io.commercelayer.api.model.common;

public interface UploadableResource {

	byte[] getAttachment();
	
	void setAttachment(byte[] attachment);
	
}
