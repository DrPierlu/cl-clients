package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;

/**
 * OrderValidator
 */
public class OrderValidator extends ApiResource {

	private static final long serialVersionUID = -1483024665776L;


	@JsonExclude
	private Object currency;
	@JsonExclude
	private String currencyId;
	@JsonExclude
	private String formattedOrderTotalMax;
	@JsonExclude
	private String formattedOrderTotalMin;
	@JsonExclude
	private String orderItemsMax;
	@JsonExclude
	private String orderItemsMin;
	@JsonExclude
	private String orderTotalMax;
	@JsonExclude
	private String orderTotalMaxCents;
	@JsonExclude
	private String orderTotalMin;
	@JsonExclude
	private String orderTotalMinCents;
	@JsonExclude
	private String paymentMethodAction;
	@JsonExclude
	private String paymentMethodRequiredPercentage;
	@JsonExclude
	private Object previousChanges;


	public OrderValidator() {
		super();
	}
	

	public OrderValidator(Long id) {
		super(id);
	}
	

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	

	public String getCurrencyId() {
		return this.currencyId;
	}
	

	public OrderValidator currencyId(String currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public String currencyId() {
		return getCurrencyId();
	}
	

	public void setOrderTotalMinCents(String orderTotalMinCents) {
		this.orderTotalMinCents = orderTotalMinCents;
	}
	

	public String getOrderTotalMinCents() {
		return this.orderTotalMinCents;
	}
	

	public OrderValidator orderTotalMinCents(String orderTotalMinCents) {
		setOrderTotalMinCents(orderTotalMinCents);
		return this;
	}
	

	public String orderTotalMinCents() {
		return getOrderTotalMinCents();
	}
	

	public void setOrderTotalMaxCents(String orderTotalMaxCents) {
		this.orderTotalMaxCents = orderTotalMaxCents;
	}
	

	public String getOrderTotalMaxCents() {
		return this.orderTotalMaxCents;
	}
	

	public OrderValidator orderTotalMaxCents(String orderTotalMaxCents) {
		setOrderTotalMaxCents(orderTotalMaxCents);
		return this;
	}
	

	public String orderTotalMaxCents() {
		return getOrderTotalMaxCents();
	}
	

	public void setOrderItemsMin(String orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
	}
	

	public String getOrderItemsMin() {
		return this.orderItemsMin;
	}
	

	public OrderValidator orderItemsMin(String orderItemsMin) {
		setOrderItemsMin(orderItemsMin);
		return this;
	}
	

	public String orderItemsMin() {
		return getOrderItemsMin();
	}
	

	public void setOrderItemsMax(String orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
	}
	

	public String getOrderItemsMax() {
		return this.orderItemsMax;
	}
	

	public OrderValidator orderItemsMax(String orderItemsMax) {
		setOrderItemsMax(orderItemsMax);
		return this;
	}
	

	public String orderItemsMax() {
		return getOrderItemsMax();
	}
	

	public void setPaymentMethodAction(String paymentMethodAction) {
		this.paymentMethodAction = paymentMethodAction;
	}
	

	public String getPaymentMethodAction() {
		return this.paymentMethodAction;
	}
	

	public OrderValidator paymentMethodAction(String paymentMethodAction) {
		setPaymentMethodAction(paymentMethodAction);
		return this;
	}
	

	public String paymentMethodAction() {
		return getPaymentMethodAction();
	}
	

	public void setPaymentMethodRequiredPercentage(String paymentMethodRequiredPercentage) {
		this.paymentMethodRequiredPercentage = paymentMethodRequiredPercentage;
	}
	

	public String getPaymentMethodRequiredPercentage() {
		return this.paymentMethodRequiredPercentage;
	}
	

	public OrderValidator paymentMethodRequiredPercentage(String paymentMethodRequiredPercentage) {
		setPaymentMethodRequiredPercentage(paymentMethodRequiredPercentage);
		return this;
	}
	

	public String paymentMethodRequiredPercentage() {
		return getPaymentMethodRequiredPercentage();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public OrderValidator previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public OrderValidator currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setOrderTotalMin(String orderTotalMin) {
		this.orderTotalMin = orderTotalMin;
	}
	

	public String getOrderTotalMin() {
		return this.orderTotalMin;
	}
	

	public OrderValidator orderTotalMin(String orderTotalMin) {
		setOrderTotalMin(orderTotalMin);
		return this;
	}
	

	public String orderTotalMin() {
		return getOrderTotalMin();
	}
	

	public void setFormattedOrderTotalMin(String formattedOrderTotalMin) {
		this.formattedOrderTotalMin = formattedOrderTotalMin;
	}
	

	public String getFormattedOrderTotalMin() {
		return this.formattedOrderTotalMin;
	}
	

	public OrderValidator formattedOrderTotalMin(String formattedOrderTotalMin) {
		setFormattedOrderTotalMin(formattedOrderTotalMin);
		return this;
	}
	

	public String formattedOrderTotalMin() {
		return getFormattedOrderTotalMin();
	}
	

	public void setOrderTotalMax(String orderTotalMax) {
		this.orderTotalMax = orderTotalMax;
	}
	

	public String getOrderTotalMax() {
		return this.orderTotalMax;
	}
	

	public OrderValidator orderTotalMax(String orderTotalMax) {
		setOrderTotalMax(orderTotalMax);
		return this;
	}
	

	public String orderTotalMax() {
		return getOrderTotalMax();
	}
	

	public void setFormattedOrderTotalMax(String formattedOrderTotalMax) {
		this.formattedOrderTotalMax = formattedOrderTotalMax;
	}
	

	public String getFormattedOrderTotalMax() {
		return this.formattedOrderTotalMax;
	}
	

	public OrderValidator formattedOrderTotalMax(String formattedOrderTotalMax) {
		setFormattedOrderTotalMax(formattedOrderTotalMax);
		return this;
	}
	

	public String formattedOrderTotalMax() {
		return getFormattedOrderTotalMax();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		OrderValidator x = (OrderValidator)o;
	
		return super.equals(o)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.orderTotalMinCents, x.orderTotalMinCents)
			&& Objects.equals(this.orderTotalMaxCents, x.orderTotalMaxCents)
			&& Objects.equals(this.orderItemsMin, x.orderItemsMin)
			&& Objects.equals(this.orderItemsMax, x.orderItemsMax)
			&& Objects.equals(this.paymentMethodAction, x.paymentMethodAction)
			&& Objects.equals(this.paymentMethodRequiredPercentage, x.paymentMethodRequiredPercentage)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.orderTotalMin, x.orderTotalMin)
			&& Objects.equals(this.formattedOrderTotalMin, x.formattedOrderTotalMin)
			&& Objects.equals(this.orderTotalMax, x.orderTotalMax)
			&& Objects.equals(this.formattedOrderTotalMax, x.formattedOrderTotalMax)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			currencyId, orderTotalMinCents, orderTotalMaxCents, orderItemsMin, orderItemsMax,
			paymentMethodAction, paymentMethodRequiredPercentage, previousChanges, currency, orderTotalMin,
			formattedOrderTotalMin, orderTotalMax, formattedOrderTotalMax 
		);
	
	}
	

	@Override
	public OrderValidator clone() {
	
		OrderValidator no = new OrderValidator();
	
		no.currencyId = this.currencyId;
		no.orderTotalMinCents = this.orderTotalMinCents;
		no.orderTotalMaxCents = this.orderTotalMaxCents;
		no.orderItemsMin = this.orderItemsMin;
		no.orderItemsMax = this.orderItemsMax;
		no.paymentMethodAction = this.paymentMethodAction;
		no.paymentMethodRequiredPercentage = this.paymentMethodRequiredPercentage;
		no.previousChanges = this.previousChanges;
		no.currency = this.currency;
		no.orderTotalMin = this.orderTotalMin;
		no.formattedOrderTotalMin = this.formattedOrderTotalMin;
		no.orderTotalMax = this.orderTotalMax;
		no.formattedOrderTotalMax = this.formattedOrderTotalMax;
	
		return no;
	
	}
	
}
