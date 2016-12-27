package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * OrderValidator
 */
public class OrderValidator extends ApiResource {

	private static final long serialVersionUID = -1482880735311L;


	@JsonExclude
	private String name;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private Integer orderTotalMinCents;
	@JsonExclude
	private Integer orderTotalMaxCents;
	@JsonExclude
	private Integer orderItemsMin;
	@JsonExclude
	private Integer orderItemsMax;
	@JsonExclude
	private String paymentMethodAction;
	@JsonExclude
	private Integer paymentMethodRequiredPercentage;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private String orderTotalMin;
	@JsonExclude
	private String formattedOrderTotalMin;
	@JsonExclude
	private String orderTotalMax;
	@JsonExclude
	private String formattedOrderTotalMax;


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
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public void setOrderTotalMinCents(Integer orderTotalMinCents) {
		this.orderTotalMinCents = orderTotalMinCents;
	}
	

	public Integer getOrderTotalMinCents() {
		return this.orderTotalMinCents;
	}
	

	public void setOrderTotalMaxCents(Integer orderTotalMaxCents) {
		this.orderTotalMaxCents = orderTotalMaxCents;
	}
	

	public Integer getOrderTotalMaxCents() {
		return this.orderTotalMaxCents;
	}
	

	public void setOrderItemsMin(Integer orderItemsMin) {
		this.orderItemsMin = orderItemsMin;
	}
	

	public Integer getOrderItemsMin() {
		return this.orderItemsMin;
	}
	

	public void setOrderItemsMax(Integer orderItemsMax) {
		this.orderItemsMax = orderItemsMax;
	}
	

	public Integer getOrderItemsMax() {
		return this.orderItemsMax;
	}
	

	public void setPaymentMethodAction(String paymentMethodAction) {
		this.paymentMethodAction = paymentMethodAction;
	}
	

	public String getPaymentMethodAction() {
		return this.paymentMethodAction;
	}
	

	public void setPaymentMethodRequiredPercentage(Integer paymentMethodRequiredPercentage) {
		this.paymentMethodRequiredPercentage = paymentMethodRequiredPercentage;
	}
	

	public Integer getPaymentMethodRequiredPercentage() {
		return this.paymentMethodRequiredPercentage;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setOrderTotalMin(String orderTotalMin) {
		this.orderTotalMin = orderTotalMin;
	}
	

	public String getOrderTotalMin() {
		return this.orderTotalMin;
	}
	

	public void setFormattedOrderTotalMin(String formattedOrderTotalMin) {
		this.formattedOrderTotalMin = formattedOrderTotalMin;
	}
	

	public String getFormattedOrderTotalMin() {
		return this.formattedOrderTotalMin;
	}
	

	public void setOrderTotalMax(String orderTotalMax) {
		this.orderTotalMax = orderTotalMax;
	}
	

	public String getOrderTotalMax() {
		return this.orderTotalMax;
	}
	

	public void setFormattedOrderTotalMax(String formattedOrderTotalMax) {
		this.formattedOrderTotalMax = formattedOrderTotalMax;
	}
	

	public String getFormattedOrderTotalMax() {
		return this.formattedOrderTotalMax;
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
