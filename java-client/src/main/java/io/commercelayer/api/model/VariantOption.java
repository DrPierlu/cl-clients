
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * VariantOption
 */
public class VariantOption extends ApiResource {

	private String variantId = null;
	private String optionValueId = null;


	public VariantOption variantId(String variantId) {
		this.variantId = variantId;
		return this;
	}

	public String getVariantId() {
		return variantId;
	}

	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}

	public VariantOption optionValueId(String optionValueId) {
		this.optionValueId = optionValueId;
		return this;
	}

	public String getOptionValueId() {
		return optionValueId;
	}

	public void setOptionValueId(String optionValueId) {
		this.optionValueId = optionValueId;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VariantOption variantOption = (VariantOption) o;
		return super.equals(o) && 
			Objects.equals(this.variantId, variantOption.variantId)
				&& Objects.equals(this.optionValueId, variantOption.optionValueId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, variantId, optionValueId, creatorResource,
				createdAt, updatedAt);
	}

}
