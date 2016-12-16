package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * Transaction
 */
public class Transaction extends ApiResource {

	private static final long serialVersionUID = -1481927389282L;


	private Integer orderId;
	private Integer gatewayId;
	private Integer currencyId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	private String token;
	private String kind;
	private Integer amountCents;
	private String state;
	private String message;
	private String avsCode;
	private String avsMessage;
	private String cvvCode;
	private String cvvMessage;
	private String errorCode;
	private String errorDetail;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Object paymentSource;


	public Transaction() {
		super();
	}
	

	public Transaction(Long id) {
		super(id);
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return this.message;
	}
	

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}
	

	public String getAvsCode() {
		return this.avsCode;
	}
	

	public void setAvsMessage(String avsMessage) {
		this.avsMessage = avsMessage;
	}
	

	public String getAvsMessage() {
		return this.avsMessage;
	}
	

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	

	public String getCvvCode() {
		return this.cvvCode;
	}
	

	public void setCvvMessage(String cvvMessage) {
		this.cvvMessage = cvvMessage;
	}
	

	public String getCvvMessage() {
		return this.cvvMessage;
	}
	

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

	public String getErrorCode() {
		return this.errorCode;
	}
	

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	

	public String getErrorDetail() {
		return this.errorDetail;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		Transaction x = (Transaction) o;
	
		return super.equals(o) &&
			Objects.equals(this.orderId, x.orderId)  &&
			Objects.equals(this.gatewayId, x.gatewayId)  &&
			Objects.equals(this.currencyId, x.currencyId)  &&
			Objects.equals(this.paymentSourceId, x.paymentSourceId)  &&
			Objects.equals(this.paymentSourceResource, x.paymentSourceResource)  &&
			Objects.equals(this.token, x.token)  &&
			Objects.equals(this.kind, x.kind)  &&
			Objects.equals(this.amountCents, x.amountCents)  &&
			Objects.equals(this.state, x.state)  &&
			Objects.equals(this.message, x.message)  &&
			Objects.equals(this.avsCode, x.avsCode)  &&
			Objects.equals(this.avsMessage, x.avsMessage)  &&
			Objects.equals(this.cvvCode, x.cvvCode)  &&
			Objects.equals(this.cvvMessage, x.cvvMessage)  &&
			Objects.equals(this.errorCode, x.errorCode)  &&
			Objects.equals(this.errorDetail, x.errorDetail)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.order, x.order)  &&
			Objects.equals(this.gateway, x.gateway)  &&
			Objects.equals(this.currency, x.currency)  &&
			Objects.equals(this.paymentSource, x.paymentSource) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, orderId, gatewayId, currencyId, paymentSourceId,
			paymentSourceResource, token, kind, amountCents, state,
			message, avsCode, avsMessage, cvvCode, cvvMessage,
			errorCode, errorDetail, previousChanges, order, gateway,
			currency, paymentSource 
		);
	
	}
	
}
