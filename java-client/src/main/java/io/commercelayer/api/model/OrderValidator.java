package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * OrderValidator
 */
public class OrderValidator extends ApiResource {

	private static final long serialVersionUID = -1484581108905L;


	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private String formattedOrderTotalMax;
	@JsonExclude
	private String formattedOrderTotalMin;
	@JsonExclude
	private String name;
	@JsonExclude
	private Integer orderItemsMax;
	@JsonExclude
	private Integer orderItemsMin;
	@JsonExclude
	private String orderTotalMax;
	@JsonExclude
	private Integer orderTotalMaxCents;
	@JsonExclude
	private String orderTotalMin;
	@JsonExclude
	private Integer orderTotalMinCents;
	@JsonExclude
	private String paymentMethodAction;
	@JsonExclude
	private Integer paymentMethodRequiredPercentage;
	@JsonExclude
	private Object previousChanges;


	public OrderValidator() {
		super();
	}
	

	public OrderValidator(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public OrderValidator name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public OrderValidator currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setOrderTotalMinCents(Integer orderTotalMinCents) {
		this.orderTotalMinCents = orderTotalMinCents;
	}
	

	public Integer getOrderTotalMinCents() {
		return this.orderTotalMinCents;
	}
	

	public OrderValidator orderTotalMinCents(Integer orderTotalMinCents) {
		setOrderTotalMinCents(orderTotalMinCents);
		return this;
	}
	

	public Integer orderTotalMinCents() {
		return getOrderTotalMinCents();
	}
	

	public void setOrderTotalMaxCents(Integer orderTotalMaxCents) {
		this.orderTotalMaxCents = orderTotalMaxCents;
	}
	

	public Integer getOrderTotalMaxCents() {
		return this.orderTotalMaxCents;
	}
	

	public OrderValidator orderTotalMaxCents(Integer orderTotalMaxCents) {
		setOrderTotalMaxCents(orderTotalMaxCents);
		return this;
	}
	

	public Integer orderTotalMaxCents() {
		return getOrderTotalMaxCents();
	}
	

	public void setOrderItemsMin(Integer orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
	}
	

	public Integer getOrderItemsMin() {
		return this.orderItemsMin;
	}
	

	public OrderValidator orderItemsMin(Integer orderItemsMin) {
		setOrderItemsMin(orderItemsMin);
		return this;
	}
	

	public Integer orderItemsMin() {
		return getOrderItemsMin();
	}
	

	public void setOrderItemsMax(Integer orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
	}
	

	public Integer getOrderItemsMax() {
		return this.orderItemsMax;
	}
	

	public OrderValidator orderItemsMax(Integer orderItemsMax) {
		setOrderItemsMax(orderItemsMax);
		return this;
	}
	

	public Integer orderItemsMax() {
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
	

	public void setPaymentMethodRequiredPercentage(Integer paymentMethodRequiredPercentage) {
		this.paymentMethodRequiredPercentage = paymentMethodRequiredPercentage;
	}
	

	public Integer getPaymentMethodRequiredPercentage() {
		return this.paymentMethodRequiredPercentage;
	}
	

	public OrderValidator paymentMethodRequiredPercentage(Integer paymentMethodRequiredPercentage) {
		setPaymentMethodRequiredPercentage(paymentMethodRequiredPercentage);
		return this;
	}
	

	public Integer paymentMethodRequiredPercentage() {
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
			&& Objects.equals(this.name, x.name)
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
			name, currencyId, orderTotalMinCents, orderTotalMaxCents, orderItemsMin,
			orderItemsMax, paymentMethodAction, paymentMethodRequiredPercentage, previousChanges, currency,
			orderTotalMin, formattedOrderTotalMin, orderTotalMax, formattedOrderTotalMax 
		);
	
	}
	

	@Override
	public OrderValidator clone() {
	
		OrderValidator no = new OrderValidator();
	
		no = super.clone(no);
	
		no.name = this.name;
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
