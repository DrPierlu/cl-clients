package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * Transaction
 */
public class Transaction extends ApiResource {

	private static final long serialVersionUID = -1484903989230L;


	private Integer amountCents;
	private String avsCode;
	private String avsMessage;
	private String checkoutUrl;
	private Integer currencyId;
	private String cvvCode;
	private String cvvMessage;
	private String errorCode;
	private String errorDetail;
	private Integer gatewayId;
	private String kind;
	private String message;
	private String name;
	private Integer orderId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	private String state;
	private String token;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object previousChanges;


	public Transaction() {
		super();
	}
	

	public Transaction(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Transaction name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public Transaction orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public Transaction gatewayId(Integer gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public Integer gatewayId() {
		return getGatewayId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public Transaction currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public Transaction paymentSourceId(Integer paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public Integer paymentSourceId() {
		return getPaymentSourceId();
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public Transaction paymentSourceResource(String paymentSourceResource) {
		setPaymentSourceResource(paymentSourceResource);
		return this;
	}
	

	public String paymentSourceResource() {
		return getPaymentSourceResource();
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public Transaction token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public Transaction kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public Transaction amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Transaction state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return this.message;
	}
	

	public Transaction message(String message) {
		setMessage(message);
		return this;
	}
	

	public String message() {
		return getMessage();
	}
	

	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	

	public String getCheckoutUrl() {
		return this.checkoutUrl;
	}
	

	public Transaction checkoutUrl(String checkoutUrl) {
		setCheckoutUrl(checkoutUrl);
		return this;
	}
	

	public String checkoutUrl() {
		return getCheckoutUrl();
	}
	

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}
	

	public String getAvsCode() {
		return this.avsCode;
	}
	

	public Transaction avsCode(String avsCode) {
		setAvsCode(avsCode);
		return this;
	}
	

	public String avsCode() {
		return getAvsCode();
	}
	

	public void setAvsMessage(String avsMessage) {
		this.avsMessage = avsMessage;
	}
	

	public String getAvsMessage() {
		return this.avsMessage;
	}
	

	public Transaction avsMessage(String avsMessage) {
		setAvsMessage(avsMessage);
		return this;
	}
	

	public String avsMessage() {
		return getAvsMessage();
	}
	

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	

	public String getCvvCode() {
		return this.cvvCode;
	}
	

	public Transaction cvvCode(String cvvCode) {
		setCvvCode(cvvCode);
		return this;
	}
	

	public String cvvCode() {
		return getCvvCode();
	}
	

	public void setCvvMessage(String cvvMessage) {
		this.cvvMessage = cvvMessage;
	}
	

	public String getCvvMessage() {
		return this.cvvMessage;
	}
	

	public Transaction cvvMessage(String cvvMessage) {
		setCvvMessage(cvvMessage);
		return this;
	}
	

	public String cvvMessage() {
		return getCvvMessage();
	}
	

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

	public String getErrorCode() {
		return this.errorCode;
	}
	

	public Transaction errorCode(String errorCode) {
		setErrorCode(errorCode);
		return this;
	}
	

	public String errorCode() {
		return getErrorCode();
	}
	

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	

	public String getErrorDetail() {
		return this.errorDetail;
	}
	

	public Transaction errorDetail(String errorDetail) {
		setErrorDetail(errorDetail);
		return this;
	}
	

	public String errorDetail() {
		return getErrorDetail();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Transaction previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public Transaction order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public Transaction gateway(Object gateway) {
		setGateway(gateway);
		return this;
	}
	

	public Object gateway() {
		return getGateway();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public Transaction currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public Transaction paymentSource(Object paymentSource) {
		setPaymentSource(paymentSource);
		return this;
	}
	

	public Object paymentSource() {
		return getPaymentSource();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Transaction x = (Transaction)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.message, x.message)
			&& Objects.equals(this.checkoutUrl, x.checkoutUrl)
			&& Objects.equals(this.avsCode, x.avsCode)
			&& Objects.equals(this.avsMessage, x.avsMessage)
			&& Objects.equals(this.cvvCode, x.cvvCode)
			&& Objects.equals(this.cvvMessage, x.cvvMessage)
			&& Objects.equals(this.errorCode, x.errorCode)
			&& Objects.equals(this.errorDetail, x.errorDetail)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.gateway, x.gateway)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.paymentSource, x.paymentSource)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, gatewayId, currencyId, paymentSourceId,
			paymentSourceResource, token, kind, amountCents, state,
			message, checkoutUrl, avsCode, avsMessage, cvvCode,
			cvvMessage, errorCode, errorDetail, previousChanges, order,
			gateway, currency, paymentSource 
		);
	
	}
	

	@Override
	public Transaction clone() {
	
		Transaction no = new Transaction();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.gatewayId = this.gatewayId;
		no.currencyId = this.currencyId;
		no.paymentSourceId = this.paymentSourceId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.token = this.token;
		no.kind = this.kind;
		no.amountCents = this.amountCents;
		no.state = this.state;
		no.message = this.message;
		no.checkoutUrl = this.checkoutUrl;
		no.avsCode = this.avsCode;
		no.avsMessage = this.avsMessage;
		no.cvvCode = this.cvvCode;
		no.cvvMessage = this.cvvMessage;
		no.errorCode = this.errorCode;
		no.errorDetail = this.errorDetail;
		no.previousChanges = this.previousChanges;
		no.order = this.order;
		no.gateway = this.gateway;
		no.currency = this.currency;
		no.paymentSource = this.paymentSource;
	
		return no;
	
	}
	
}
