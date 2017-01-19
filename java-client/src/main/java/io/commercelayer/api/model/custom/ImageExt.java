package io.commercelayer.api.model.custom;

import io.commercelayer.api.model.Image;

public class ImageExt extends Image {

	private static final long serialVersionUID = 2649471080725872390L;
	
	private byte[] attachment;


	public byte[] getAttachment() {
		return attachment;
	}


	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

}
