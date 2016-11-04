
package io.commercelayer.api.model;

import java.time.LocalDateTime;
import java.util.Objects;

import io.commercelayer.api.model.common.BasicResource;

/**
 * Webhook
 */
public class Webhook extends BasicResource {

	private String environmentId = null;
	private String eventSubject = null;
	private String eventAction = null;
	private String eventUrl = null;
	private String sharedSecret = null;
	private LocalDateTime lastFiredAt = null;
	private LocalDateTime lastFailedAt = null;

	public Webhook environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Webhook eventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
		return this;
	}

	public String getEventSubject() {
		return eventSubject;
	}

	public void setEventSubject(String eventSubject) {
		this.eventSubject = eventSubject;
	}

	public Webhook eventAction(String eventAction) {
		this.eventAction = eventAction;
		return this;
	}

	public String getEventAction() {
		return eventAction;
	}

	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public Webhook eventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
		return this;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	public Webhook sharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
		return this;
	}

	public String getSharedSecret() {
		return sharedSecret;
	}

	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}

	public Webhook lastFiredAt(LocalDateTime lastFiredAt) {
		this.lastFiredAt = lastFiredAt;
		return this;
	}

	public LocalDateTime getLastFiredAt() {
		return lastFiredAt;
	}

	public void setLastFiredAt(LocalDateTime lastFiredAt) {
		this.lastFiredAt = lastFiredAt;
	}

	public Webhook lastFailedAt(LocalDateTime lastFailedAt) {
		this.lastFailedAt = lastFailedAt;
		return this;
	}

	public LocalDateTime getLastFailedAt() {
		return lastFailedAt;
	}

	public void setLastFailedAt(LocalDateTime lastFailedAt) {
		this.lastFailedAt = lastFailedAt;
	}

	public Webhook creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public Webhook creatorResource(String creatorResource) {
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
		Webhook webhook = (Webhook) o;
		return Objects.equals(this.resourceName, webhook.resourceName) && Objects.equals(this.id, webhook.id)
				&& Objects.equals(this.environmentId, webhook.environmentId)
				&& Objects.equals(this.eventSubject, webhook.eventSubject)
				&& Objects.equals(this.eventAction, webhook.eventAction)
				&& Objects.equals(this.eventUrl, webhook.eventUrl)
				&& Objects.equals(this.sharedSecret, webhook.sharedSecret)
				&& Objects.equals(this.lastFiredAt, webhook.lastFiredAt)
				&& Objects.equals(this.lastFailedAt, webhook.lastFailedAt)
				&& Objects.equals(this.creatorId, webhook.creatorId)
				&& Objects.equals(this.creatorResource, webhook.creatorResource)
				&& Objects.equals(this.createdAt, webhook.createdAt)
				&& Objects.equals(this.updatedAt, webhook.updatedAt) && Objects.equals(this.expanded, webhook.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, eventSubject, eventAction, eventUrl, sharedSecret,
				lastFiredAt, lastFailedAt, creatorId, creatorResource, createdAt, updatedAt, expanded);
	}

}
