package io.commercelayer.api.config;

public enum ResourceCatalog {

	ADDRESSES("/account/addresses");
	
	private String path;
	
	private ResourceCatalog(String path) {
		this.path = path;
	}
	
	public String path() {
		return this.path;
	}
	
}
