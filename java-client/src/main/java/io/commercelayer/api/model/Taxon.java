
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * Taxon
 */
public class Taxon extends ApiResource {

	private String environmentId = null;
	private String name = null;
	private String taxonomyId = null;
	private String position = null;
	private String parentId = null;
	private String lft = null;
	private String rgt = null;
	private String depth = null;
	private String childrenCount = null;

	public Taxon environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Taxon name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Taxon taxonomyId(String taxonomyId) {
		this.taxonomyId = taxonomyId;
		return this;
	}

	public String getTaxonomyId() {
		return taxonomyId;
	}

	public void setTaxonomyId(String taxonomyId) {
		this.taxonomyId = taxonomyId;
	}

	public Taxon position(String position) {
		this.position = position;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Taxon parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Taxon lft(String lft) {
		this.lft = lft;
		return this;
	}

	public String getLft() {
		return lft;
	}

	public void setLft(String lft) {
		this.lft = lft;
	}

	public Taxon rgt(String rgt) {
		this.rgt = rgt;
		return this;
	}

	public String getRgt() {
		return rgt;
	}

	public void setRgt(String rgt) {
		this.rgt = rgt;
	}

	public Taxon depth(String depth) {
		this.depth = depth;
		return this;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public Taxon childrenCount(String childrenCount) {
		this.childrenCount = childrenCount;
		return this;
	}

	public String getChildrenCount() {
		return childrenCount;
	}

	public void setChildrenCount(String childrenCount) {
		this.childrenCount = childrenCount;
	}

	public Taxon creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Taxon creatorResource(String creatorResource) {
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
		Taxon taxon = (Taxon) o;
		return Objects.equals(this.resourceName, taxon.resourceName) 
				&& Objects.equals(this.id, taxon.id)
				&& Objects.equals(this.environmentId, taxon.environmentId) 
				&& Objects.equals(this.name, taxon.name)
				&& Objects.equals(this.taxonomyId, taxon.taxonomyId) 
				&& Objects.equals(this.position, taxon.position)
				&& Objects.equals(this.parentId, taxon.parentId) 
				&& Objects.equals(this.lft, taxon.lft)
				&& Objects.equals(this.rgt, taxon.rgt) 
				&& Objects.equals(this.depth, taxon.depth)
				&& Objects.equals(this.childrenCount, taxon.childrenCount)
				&& Objects.equals(this.creatorId, taxon.creatorId)
				&& Objects.equals(this.creatorResource, taxon.creatorResource)
				&& Objects.equals(this.createdAt, taxon.createdAt) 
				&& Objects.equals(this.updatedAt, taxon.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, name, taxonomyId, position, parentId, lft, rgt, depth,
				childrenCount, creatorId, creatorResource, createdAt, updatedAt);
	}

}
