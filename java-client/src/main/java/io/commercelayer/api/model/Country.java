
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * Country
 */
public class Country extends ApiResource {

  @SerializedName("environment_id")
  private String environmentId = null;

  @SerializedName("country_group_id")
  private String countryGroupId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("creator_id")
  private String creatorId = null;

  @SerializedName("creator_resource")
  private String creatorResource = null;

  public Country environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public Country countryGroupId(String countryGroupId) {
    this.countryGroupId = countryGroupId;
    return this;
  }

  public String getCountryGroupId() {
    return countryGroupId;
  }

  public void setCountryGroupId(String countryGroupId) {
    this.countryGroupId = countryGroupId;
  }

  public Country code(String code) {
    this.code = code;
    return this;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Country creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public Country creatorResource(String creatorResource) {
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
    Country country = (Country) o;
    return Objects.equals(this.resourceName, country.resourceName) &&
        Objects.equals(this.id, country.id) &&
        Objects.equals(this.environmentId, country.environmentId) &&
        Objects.equals(this.countryGroupId, country.countryGroupId) &&
        Objects.equals(this.code, country.code) &&
        Objects.equals(this.creatorId, country.creatorId) &&
        Objects.equals(this.creatorResource, country.creatorResource) &&
        Objects.equals(this.createdAt, country.createdAt) &&
        Objects.equals(this.updatedAt, country.updatedAt) &&
        Objects.equals(this.expanded, country.expanded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, id, environmentId, countryGroupId, code, creatorId, creatorResource, createdAt, updatedAt, expanded);
  }

}

