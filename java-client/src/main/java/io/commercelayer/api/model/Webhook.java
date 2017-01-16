package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.time.LocalDateTime;
import java.util.Objects;


/**
 * Webhook
 */
public class Webhook extends ApiResource {

	private static final long serialVersionUID = -1484581109221L;


	private String eventAction;
	private String eventSubject;
	private String eventUrl;
	@JsonExclude
	private String expand;
	@JsonExclude
	private LocalDateTime lastFiredAt;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String sharedSecret;


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
	

	public void setEventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
	}
	

	public String getEventSubject() {
		return this.eventSubject;
	}
	

	public Webhook eventSubject(String eventSubject) {
		setEventSubject(eventSubject);
		return this;
	}
	

	public String eventSubject() {
		return getEventSubject();
	}
	

	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}
	

	public String getEventAction() {
		return this.eventAction;
	}
	

	public Webhook eventAction(String eventAction) {
		setEventAction(eventAction);
		return this;
	}
	

	public String eventAction() {
		return getEventAction();
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
	

	public void setExpand(String expand) {
		this.expand = expand;
	}
	

	public String getExpand() {
		return this.expand;
	}
	

	public Webhook expand(String expand) {
		setExpand(expand);
		return this;
	}
	

	public String expand() {
		return getExpand();
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
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Webhook previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Webhook x = (Webhook)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.eventSubject, x.eventSubject)
			&& Objects.equals(this.eventAction, x.eventAction)
			&& Objects.equals(this.eventUrl, x.eventUrl)
			&& Objects.equals(this.sharedSecret, x.sharedSecret)
			&& Objects.equals(this.expand, x.expand)
			&& Objects.equals(this.lastFiredAt, x.lastFiredAt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, eventSubject, eventAction, eventUrl, sharedSecret,
			expand, lastFiredAt, previousChanges 
		);
	
	}
	

	@Override
	public Webhook clone() {
	
		Webhook no = new Webhook();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.eventSubject = this.eventSubject;
		no.eventAction = this.eventAction;
		no.eventUrl = this.eventUrl;
		no.sharedSecret = this.sharedSecret;
		no.expand = this.expand;
		no.lastFiredAt = this.lastFiredAt;
		no.previousChanges = this.previousChanges;
	
		return no;
	
	}
	
}
