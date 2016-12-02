
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.commercelayer.api.model.common.ApiResource;

/**
 * StockItem
 */
public class StockItem extends ApiResource {

	private String stockLocationId = null;
	private String stockableId = null;
	private String stockableResource = null;

	@SerializedName("quantity")
	private String quantity = null;


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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StockItem stockItem = (StockItem) o;
		return super.equals(o) && 
			Objects.equals(this.stockLocationId, stockItem.stockLocationId)
				&& Objects.equals(this.stockableId, stockItem.stockableId)
				&& Objects.equals(this.stockableResource, stockItem.stockableResource)
				&& Objects.equals(this.quantity, stockItem.quantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, stockLocationId, stockableId, stockableResource, quantity,
				creatorResource, createdAt, updatedAt);
	}

}
