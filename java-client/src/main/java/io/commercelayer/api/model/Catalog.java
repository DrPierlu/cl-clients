
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * Catalog
 */
public class Catalog extends ApiResource {
 
  @SerializedName("environment_id")
  private String environmentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creator_id")
  private String creatorId = null;

  @SerializedName("creator_resource")
  private String creatorResource = null;


  public Catalog environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public Catalog name(String name) {
    this.name = name;
    return this;
  }

   
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Catalog description(String description) {
    this.description = description;
    return this;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Catalog creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public Catalog creatorResource(String creatorResource) {
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
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.resourceName, catalog.resourceName) &&
        Objects.equals(this.id, catalog.id) &&
        Objects.equals(this.environmentId, catalog.environmentId) &&
        Objects.equals(this.name, catalog.name) &&
        Objects.equals(this.description, catalog.description) &&
        Objects.equals(this.creatorId, catalog.creatorId) &&
        Objects.equals(this.creatorResource, catalog.creatorResource) &&
        Objects.equals(this.createdAt, catalog.createdAt) &&
        Objects.equals(this.updatedAt, catalog.updatedAt) &&
        Objects.equals(this.expanded, catalog.expanded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, id, environmentId, name, description, creatorId, creatorResource, createdAt, updatedAt, expanded);
  }

}

