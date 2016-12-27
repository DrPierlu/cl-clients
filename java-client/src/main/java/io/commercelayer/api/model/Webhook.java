package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.time.LocalDateTime;

/**
 * Webhook
 */
public class Webhook extends ApiResource {

	private static final long serialVersionUID = -1482880735368L;


	@JsonExclude
	private String name;
	private String eventSubject;
	private String eventAction;
	private String eventUrl;
	@JsonExclude
	private String sharedSecret;
	@JsonExclude
	private String expand;
	@JsonExclude
	private LocalDateTime lastFiredAt;
	@JsonExclude
	private Object previousChanges;


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
	

	public void setEventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
	}
	

	public String getEventSubject() {
		return this.eventSubject;
	}
	

	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}
	

	public String getEventAction() {
		return this.eventAction;
	}
	

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	

	public String getEventUrl() {
		return this.eventUrl;
	}
	

	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}
	

	public String getSharedSecret() {
		return this.sharedSecret;
	}
	

	public void setExpand(String expand) {
		this.expand = expand;
	}
	

	public String getExpand() {
		return this.expand;
	}
	

	public void setLastFiredAt(LocalDateTime lastFiredAt) {
		this.lastFiredAt = lastFiredAt;
	}
	

	public LocalDateTime getLastFiredAt() {
		return this.lastFiredAt;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
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
