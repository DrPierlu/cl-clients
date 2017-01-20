package io.commercelayer.api.security;

import io.commercelayer.api.domain.Authentication;

public interface AuthRequest extends Authentication {

	String getGrantType();
	
}
