
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Currency
 */
public class Currency extends ApiResource {

	private String code = null;


	public Currency code(String code) {
		this.code = code;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Currency currency = (Currency) o;
		return super.equals(o) && 
			Objects.equals(this.code, currency.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, code, creatorResource, createdAt, updatedAt);
	}

}
