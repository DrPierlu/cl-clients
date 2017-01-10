package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * User
 */
public class User extends ApiResource {

	private static final long serialVersionUID = -1484058603283L;


	private String email;
	private String firstName;
	private String lastName;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private String name;
	@JsonExclude
	private String passwordHash;
	@JsonExclude
	private String passwordSalt;
	@JsonExclude
	private List<String> permissions;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> roles;


	public User() {
		super();
	}
	

	public User(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public User name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getFirstName() {
		return this.firstName;
	}
	

	public User firstName(String firstName) {
		setFirstName(firstName);
		return this;
	}
	

	public String firstName() {
		return getFirstName();
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getLastName() {
		return this.lastName;
	}
	

	public User lastName(String lastName) {
		setLastName(lastName);
		return this;
	}
	

	public String lastName() {
		return getLastName();
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public User email(String email) {
		setEmail(email);
		return this;
	}
	

	public String email() {
		return getEmail();
	}
	

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	

	public String getPasswordHash() {
		return this.passwordHash;
	}
	

	public User passwordHash(String passwordHash) {
		setPasswordHash(passwordHash);
		return this;
	}
	

	public String passwordHash() {
		return getPasswordHash();
	}
	

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	

	public String getPasswordSalt() {
		return this.passwordSalt;
	}
	

	public User passwordSalt(String passwordSalt) {
		setPasswordSalt(passwordSalt);
		return this;
	}
	

	public String passwordSalt() {
		return getPasswordSalt();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public User previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public User consumerRoles(List<String> consumerRoles) {
		setConsumerRoles(consumerRoles);
		return this;
	}
	

	public List<String> consumerRoles() {
		return getConsumerRoles();
	}
	

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	

	public List<String> getRoles() {
		return this.roles;
	}
	

	public User roles(List<String> roles) {
		setRoles(roles);
		return this;
	}
	

	public List<String> roles() {
		return getRoles();
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	public User permissions(List<String> permissions) {
		setPermissions(permissions);
		return this;
	}
	

	public List<String> permissions() {
		return getPermissions();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public User resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public User images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		User x = (User)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.firstName, x.firstName)
			&& Objects.equals(this.lastName, x.lastName)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.passwordHash, x.passwordHash)
			&& Objects.equals(this.passwordSalt, x.passwordSalt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.roles, x.roles)
			&& Objects.equals(this.permissions, x.permissions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, firstName, lastName, email, passwordHash,
			passwordSalt, previousChanges, consumerRoles, roles, permissions,
			resourceImages, images 
		);
	
	}
	

	@Override
	public User clone() {
	
		User no = new User();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.firstName = this.firstName;
		no.lastName = this.lastName;
		no.email = this.email;
		no.passwordHash = this.passwordHash;
		no.passwordSalt = this.passwordSalt;
		no.previousChanges = this.previousChanges;
		no.consumerRoles = this.consumerRoles;
		no.roles = this.roles;
		no.permissions = this.permissions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
	
		return no;
	
	}
	
}
