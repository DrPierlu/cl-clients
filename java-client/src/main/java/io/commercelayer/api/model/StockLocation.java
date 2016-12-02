
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * StockLocation
 */
public class StockLocation extends ApiResource {

	private String name = null;
	private String position = null;
	private String parentId = null;
	private String lft = null;
	private String rgt = null;
	private String depth = null;
	private String childrenCount = null;


	public StockLocation name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StockLocation position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public StockLocation parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public StockLocation lft(String lft) {
		this.lft = lft;
		return this;
	}

	public String getLft() {
		return lft;
	}

	public void setLft(String lft) {
		this.lft = lft;
	}

	public StockLocation rgt(String rgt) {
		this.rgt = rgt;
		return this;
	}

	public String getRgt() {
		return rgt;
	}

	public void setRgt(String rgt) {
		this.rgt = rgt;
	}

	public StockLocation depth(String depth) {
		this.depth = depth;
		return this;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public StockLocation childrenCount(String childrenCount) {
		this.childrenCount = childrenCount;
		return this;
	}

	public String getChildrenCount() {
		return childrenCount;
	}

	public void setChildrenCount(String childrenCount) {
		this.childrenCount = childrenCount;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StockLocation stockLocation = (StockLocation) o;
		return super.equals(o) && 
			Objects.equals(this.name, stockLocation.name)
				&& Objects.equals(this.position, stockLocation.position)
				&& Objects.equals(this.parentId, stockLocation.parentId) 
				&& Objects.equals(this.lft, stockLocation.lft)
				&& Objects.equals(this.rgt, stockLocation.rgt) 
				&& Objects.equals(this.depth, stockLocation.depth)
				&& Objects.equals(this.childrenCount, stockLocation.childrenCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, name, position, parentId, lft, rgt, depth, childrenCount,
				creatorResource, createdAt, updatedAt);
	}

}
