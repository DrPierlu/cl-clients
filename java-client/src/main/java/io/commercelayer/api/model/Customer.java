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
	private Object creator;
	@JsonExclude
	private Integer creatorId;
	@JsonExclude
	private List<String> events;
	@JsonExclude
	private Boolean hasPassword;
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
	private List<String> resourceImages;
	@JsonExclude
	private String state;
	@JsonExclude
	private List<String> versions;


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
	

	public void setHasPassword(Boolean hasPassword) {
		this.hasPassword = hasPassword;
	}
	

	public Boolean getHasPassword() {
		return this.hasPassword;
	}
	

	public Customer hasPassword(Boolean hasPassword) {
		setHasPassword(hasPassword);
		return this;
	}
	

	public Boolean hasPassword() {
		return getHasPassword();
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
	

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	

	public Integer getCreatorId() {
		return this.creatorId;
	}
	

	public Customer creatorId(Integer creatorId) {
		setCreatorId(creatorId);
		return this;
	}
	

	public Integer creatorId() {
		return getCreatorId();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Customer state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setCreator(Object creator) {
		this.creator = creator;
	}
	

	public Object getCreator() {
		return this.creator;
	}
	

	public Customer creator(Object creator) {
		setCreator(creator);
		return this;
	}
	

	public Object creator() {
		return getCreator();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Customer versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
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
	

	public void setEvents(List<String> events) {
		this.events = events;
	}
	

	public List<String> getEvents() {
		return this.events;
	}
	

	public Customer events(List<String> events) {
		setEvents(events);
		return this;
	}
	

	public List<String> events() {
		return getEvents();
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
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Customer x = (Customer)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.hasPassword, x.hasPassword)
			&& Objects.equals(this.passwordHash, x.passwordHash)
			&& Objects.equals(this.passwordSalt, x.passwordSalt)
			&& Objects.equals(this.creatorId, x.creatorId)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.creator, x.creator)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.events, x.events)
			&& Objects.equals(this.orders, x.orders)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, email, hasPassword, passwordHash, passwordSalt,
			creatorId, state, creator, versions, resourceImages,
			images, events, orders 
		);
	
	}
	

	@Override
	public Customer clone() {
	
		Customer no = new Customer();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.email = this.email;
		no.hasPassword = this.hasPassword;
		no.passwordHash = this.passwordHash;
		no.passwordSalt = this.passwordSalt;
		no.creatorId = this.creatorId;
		no.state = this.state;
		no.creator = this.creator;
		no.versions = this.versions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.events = this.events;
		no.orders = this.orders;
	
		return no;
	
	}
	
}
