package io.commercelayer.api.security;

public class ApiApplication extends AuthObject {

	private String id;


	public ApiApplication() {
		super();
	}
	
	
	public ApiApplication(String id) {
		this();
		this.id = id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}
