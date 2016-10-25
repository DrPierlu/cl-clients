
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * VariantOption
 */
public class VariantOption extends ApiObject {

	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("variant_id")
	private String variantId = null;

	@SerializedName("option_value_id")
	private String optionValueId = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public VariantOption environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public VariantOption creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public VariantOption creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
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
		return Objects.equals(this.resourceName, variantOption.resourceName)
				&& Objects.equals(this.id, variantOption.id)
				&& Objects.equals(this.environmentId, variantOption.environmentId)
				&& Objects.equals(this.variantId, variantOption.variantId)
				&& Objects.equals(this.optionValueId, variantOption.optionValueId)
				&& Objects.equals(this.creatorId, variantOption.creatorId)
				&& Objects.equals(this.creatorResource, variantOption.creatorResource)
				&& Objects.equals(this.createdAt, variantOption.createdAt)
				&& Objects.equals(this.updatedAt, variantOption.updatedAt)
				&& Objects.equals(this.expanded, variantOption.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, variantId, optionValueId, creatorId, creatorResource,
				createdAt, updatedAt, expanded);
	}

}
