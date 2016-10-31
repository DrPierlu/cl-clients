
package io.commercelayer.api.model;

import java.util.Objects;

/**
 * StockLocation
 */
public class StockLocation extends ApiResource {

	private String environmentId = null;
	private String name = null;
	private String position = null;
	private String parentId = null;
	private String lft = null;
	private String rgt = null;
	private String depth = null;
	private String childrenCount = null;

	public StockLocation environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

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

	public StockLocation creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public StockLocation creatorResource(String creatorResource) {
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
		StockLocation stockLocation = (StockLocation) o;
		return Objects.equals(this.resourceName, stockLocation.resourceName)
				&& Objects.equals(this.id, stockLocation.id)
				&& Objects.equals(this.environmentId, stockLocation.environmentId)
				&& Objects.equals(this.name, stockLocation.name)
				&& Objects.equals(this.position, stockLocation.position)
				&& Objects.equals(this.parentId, stockLocation.parentId) && Objects.equals(this.lft, stockLocation.lft)
				&& Objects.equals(this.rgt, stockLocation.rgt) && Objects.equals(this.depth, stockLocation.depth)
				&& Objects.equals(this.childrenCount, stockLocation.childrenCount)
				&& Objects.equals(this.creatorId, stockLocation.creatorId)
				&& Objects.equals(this.creatorResource, stockLocation.creatorResource)
				&& Objects.equals(this.createdAt, stockLocation.createdAt)
				&& Objects.equals(this.updatedAt, stockLocation.updatedAt)
				&& Objects.equals(this.expanded, stockLocation.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, position, parentId, lft, rgt, depth, childrenCount,
				creatorId, creatorResource, createdAt, updatedAt, expanded);
	}

}
