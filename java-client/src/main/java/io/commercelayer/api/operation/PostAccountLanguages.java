package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountLanguages
 */
public class PostAccountLanguages extends PostOperation<Language> {

	public static final String OPERATION_PATH = "/account/languages";


	{
		addRequiredField("code");
	}


	public PostAccountLanguages() {
		super(OPERATION_PATH);
	}
	

	public Class<Language> getResourceType() {
		return Language.class;
	}
	
}
