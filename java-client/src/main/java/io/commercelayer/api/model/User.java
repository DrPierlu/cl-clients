
package io.commercelayer.api.model;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

/**
 * User
 */
public class User extends ApiResource {

	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String passwordHash = null;
	private String passwordSalt = null;

	public User firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public User lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User email(String email) {
		this.email = email;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User passwordHash(String passwordHash) {
		this.passwordHash = passwordHash;
		return this;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public User passwordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
		return this;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public User creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public User creatorResource(String creatorResource) {
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
		User user = (User) o;
		return super.equals(o) && 
			Objects.equals(this.firstName, user.firstName) 
				&& Objects.equals(this.lastName, user.lastName)
				&& Objects.equals(this.email, user.email) 
				&& Objects.equals(this.passwordHash, user.passwordHash)
				&& Objects.equals(this.passwordSalt, user.passwordSalt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, firstName, lastName, email, passwordHash, passwordSalt, creatorId,
				creatorResource, createdAt, updatedAt);
	}

}
