
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.commercelayer.api.model.common.BasicResource;

/**
 * StockItem
 */
public class StockItem extends BasicResource {

	private String environmentId = null;
	private String stockLocationId = null;
	private String stockableId = null;
	private String stockableResource = null;

	@SerializedName("quantity")
	private String quantity = null;

	public StockItem environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public StockItem stockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
		return this;
	}

	public String getStockLocationId() {
		return stockLocationId;
	}

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}

	public StockItem stockableId(String stockableId) {
		this.stockableId = stockableId;
		return this;
	}

	public String getStockableId() {
		return stockableId;
	}

	public void setStockableId(String stockableId) {
		this.stockableId = stockableId;
	}

	public StockItem stockableResource(String stockableResource) {
		this.stockableResource = stockableResource;
		return this;
	}

	public String getStockableResource() {
		return stockableResource;
	}

	public void setStockableResource(String stockableResource) {
		this.stockableResource = stockableResource;
	}

	public StockItem quantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public StockItem creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public StockItem creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StockItem stockItem = (StockItem) o;
		return Objects.equals(this.resourceName, stockItem.resourceName) && Objects.equals(this.id, stockItem.id)
				&& Objects.equals(this.environmentId, stockItem.environmentId)
				&& Objects.equals(this.stockLocationId, stockItem.stockLocationId)
				&& Objects.equals(this.stockableId, stockItem.stockableId)
				&& Objects.equals(this.stockableResource, stockItem.stockableResource)
				&& Objects.equals(this.quantity, stockItem.quantity)
				&& Objects.equals(this.creatorId, stockItem.creatorId)
				&& Objects.equals(this.creatorResource, stockItem.creatorResource)
				&& Objects.equals(this.createdAt, stockItem.createdAt)
				&& Objects.equals(this.updatedAt, stockItem.updatedAt)
				&& Objects.equals(this.expanded, stockItem.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, stockLocationId, stockableId, stockableResource, quantity,
				creatorId, creatorResource, createdAt, updatedAt, expanded);
	}

}
