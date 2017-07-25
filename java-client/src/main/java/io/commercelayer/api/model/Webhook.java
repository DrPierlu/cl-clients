package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


/**
 * Webhook
 */
public class Webhook extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String eventKind;
	private String eventUrl;
	@JsonExclude
	private Object creator;
	@JsonExclude
	private Integer creatorId;
	@JsonExclude
	private LocalDateTime lastFiredAt;
	@JsonExclude
	private String name;
	@JsonExclude
	private String sharedSecret;
	@JsonExclude
	private List<String> versions;


	public Webhook() {
		super();
	}
	

	public Webhook(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Webhook name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setEventKind(String eventKind) {
		this.eventKind = eventKind;
	}
	

	public String getEventKind() {
		return this.eventKind;
	}
	

	public Webhook eventKind(String eventKind) {
		setEventKind(eventKind);
		return this;
	}
	

	public String eventKind() {
		return getEventKind();
	}
	

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	

	public String getEventUrl() {
		return this.eventUrl;
	}
	

	public Webhook eventUrl(String eventUrl) {
		setEventUrl(eventUrl);
		return this;
	}
	

	public String eventUrl() {
		return getEventUrl();
	}
	

	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}
	

	public String getSharedSecret() {
		return this.sharedSecret;
	}
	

	public Webhook sharedSecret(String sharedSecret) {
		setSharedSecret(sharedSecret);
		return this;
	}
	

	public String sharedSecret() {
		return getSharedSecret();
	}
	

	public void setLastFiredAt(LocalDateTime lastFiredAt) {
		this.lastFiredAt = lastFiredAt;
	}
	

	public LocalDateTime getLastFiredAt() {
		return this.lastFiredAt;
	}
	

	public Webhook lastFiredAt(LocalDateTime lastFiredAt) {
		setLastFiredAt(lastFiredAt);
		return this;
	}
	

	public LocalDateTime lastFiredAt() {
		return getLastFiredAt();
	}
	

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	

	public Integer getCreatorId() {
		return this.creatorId;
	}
	

	public Webhook creatorId(Integer creatorId) {
		setCreatorId(creatorId);
		return this;
	}
	

	public Integer creatorId() {
		return getCreatorId();
	}
	

	public void setCreator(Object creator) {
		this.creator = creator;
	}
	

	public Object getCreator() {
		return this.creator;
	}
	

	public Webhook creator(Object creator) {
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
	

	public Webhook versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Webhook x = (Webhook)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.eventKind, x.eventKind)
			&& Objects.equals(this.eventUrl, x.eventUrl)
			&& Objects.equals(this.sharedSecret, x.sharedSecret)
			&& Objects.equals(this.lastFiredAt, x.lastFiredAt)
			&& Objects.equals(this.creatorId, x.creatorId)
			&& Objects.equals(this.creator, x.creator)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, eventKind, eventUrl, sharedSecret, lastFiredAt,
			creatorId, creator, versions 
		);
	
	}
	

	@Override
	public Webhook clone() {
	
		Webhook no = new Webhook();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.eventKind = this.eventKind;
		no.eventUrl = this.eventUrl;
		no.sharedSecret = this.sharedSecret;
		no.lastFiredAt = this.lastFiredAt;
		no.creatorId = this.creatorId;
		no.creator = this.creator;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
