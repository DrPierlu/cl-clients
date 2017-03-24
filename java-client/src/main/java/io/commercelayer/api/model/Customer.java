package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Customer
 */
public class Customer extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String email;
	@JsonExclude
	private Object featuredImage;
	@JsonExclude
	private String hasPassword;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private String passwordHash;
	@JsonExclude
	private String passwordSalt;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;


	public Customer() {
		super();
	}
	

	public Customer(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Customer name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public Customer email(String email) {
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
	

	public Customer passwordHash(String passwordHash) {
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
	

	public Customer passwordSalt(String passwordSalt) {
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
	

	public Customer previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Customer resourceImages(List<String> resourceImages) {
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
	

	public Customer images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Customer orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setFeaturedImage(Object featuredImage) {
		this.featuredImage = featuredImage;
	}
	

	public Object getFeaturedImage() {
		return this.featuredImage;
	}
	

	public Customer featuredImage(Object featuredImage) {
		setFeaturedImage(featuredImage);
		return this;
	}
	

	public Object featuredImage() {
		return getFeaturedImage();
	}
	

	public void setHasPassword(String hasPassword) {
		this.hasPassword = hasPassword;
	}
	

	public String getHasPassword() {
		return this.hasPassword;
	}
	

	public Customer hasPassword(String hasPassword) {
		setHasPassword(hasPassword);
		return this;
	}
	

	public String hasPassword() {
		return getHasPassword();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Customer x = (Customer)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.passwordHash, x.passwordHash)
			&& Objects.equals(this.passwordSalt, x.passwordSalt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.featuredImage, x.featuredImage)
			&& Objects.equals(this.hasPassword, x.hasPassword)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, email, passwordHash, passwordSalt, previousChanges,
			resourceImages, images, orders, featuredImage, hasPassword
			
		);
	
	}
	

	@Override
	public Customer clone() {
	
		Customer no = new Customer();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.email = this.email;
		no.passwordHash = this.passwordHash;
		no.passwordSalt = this.passwordSalt;
		no.previousChanges = this.previousChanges;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.orders = this.orders;
		no.featuredImage = this.featuredImage;
		no.hasPassword = this.hasPassword;
	
		return no;
	
	}
	
}
