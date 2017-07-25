package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * CustomsItem
 */
public class CustomsItem extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer customsFormId;
	private Integer lineItemStockId;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private String code;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private Object customsForm;
	@JsonExclude
	private String easypostId;
	@JsonExclude
	private String hsTariffNumber;
	@JsonExclude
	private Object lineItemStock;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object originCountry;
	@JsonExclude
	private Integer originCountryId;
	@JsonExclude
	private Integer quantity;
	@JsonExclude
	private List<String> versions;
	@JsonExclude
	private Float weight;


	public CustomsItem() {
		super();
	}
	

	public CustomsItem(Long id) {
		super(id);
	}
	

	public void setCustomsFormId(Integer customsFormId) {
		this.customsFormId = customsFormId;
	}
	

	public Integer getCustomsFormId() {
		return this.customsFormId;
	}
	

	public CustomsItem customsFormId(Integer customsFormId) {
		setCustomsFormId(customsFormId);
		return this;
	}
	

	public Integer customsFormId() {
		return getCustomsFormId();
	}
	

	public void setLineItemStockId(Integer lineItemStockId) {
		this.lineItemStockId = lineItemStockId;
	}
	

	public Integer getLineItemStockId() {
		return this.lineItemStockId;
	}
	

	public CustomsItem lineItemStockId(Integer lineItemStockId) {
		setLineItemStockId(lineItemStockId);
		return this;
	}
	

	public Integer lineItemStockId() {
		return getLineItemStockId();
	}
	

	public void setOriginCountryId(Integer originCountryId) {
		this.originCountryId = originCountryId;
	}
	

	public Integer getOriginCountryId() {
		return this.originCountryId;
	}
	

	public CustomsItem originCountryId(Integer originCountryId) {
		setOriginCountryId(originCountryId);
		return this;
	}
	

	public Integer originCountryId() {
		return getOriginCountryId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public CustomsItem currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setEasypostId(String easypostId) {
		this.easypostId = easypostId;
	}
	

	public String getEasypostId() {
		return this.easypostId;
	}
	

	public CustomsItem easypostId(String easypostId) {
		setEasypostId(easypostId);
		return this;
	}
	

	public String easypostId() {
		return getEasypostId();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public CustomsItem code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public CustomsItem name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public Integer getQuantity() {
		return this.quantity;
	}
	

	public CustomsItem quantity(Integer quantity) {
		setQuantity(quantity);
		return this;
	}
	

	public Integer quantity() {
		return getQuantity();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public CustomsItem amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	

	public Float getWeight() {
		return this.weight;
	}
	

	public CustomsItem weight(Float weight) {
		setWeight(weight);
		return this;
	}
	

	public Float weight() {
		return getWeight();
	}
	

	public void setHsTariffNumber(String hsTariffNumber) {
		this.hsTariffNumber = hsTariffNumber;
	}
	

	public String getHsTariffNumber() {
		return this.hsTariffNumber;
	}
	

	public CustomsItem hsTariffNumber(String hsTariffNumber) {
		setHsTariffNumber(hsTariffNumber);
		return this;
	}
	

	public String hsTariffNumber() {
		return getHsTariffNumber();
	}
	

	public void setLineItemStock(Object lineItemStock) {
		this.lineItemStock = lineItemStock;
	}
	

	public Object getLineItemStock() {
		return this.lineItemStock;
	}
	

	public CustomsItem lineItemStock(Object lineItemStock) {
		setLineItemStock(lineItemStock);
		return this;
	}
	

	public Object lineItemStock() {
		return getLineItemStock();
	}
	

	public void setCustomsForm(Object customsForm) {
		this.customsForm = customsForm;
	}
	

	public Object getCustomsForm() {
		return this.customsForm;
	}
	

	public CustomsItem customsForm(Object customsForm) {
		setCustomsForm(customsForm);
		return this;
	}
	

	public Object customsForm() {
		return getCustomsForm();
	}
	

	public void setOriginCountry(Object originCountry) {
		this.originCountry = originCountry;
	}
	

	public Object getOriginCountry() {
		return this.originCountry;
	}
	

	public CustomsItem originCountry(Object originCountry) {
		setOriginCountry(originCountry);
		return this;
	}
	

	public Object originCountry() {
		return getOriginCountry();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public CustomsItem currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public CustomsItem versions(List<String> versions) {
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
	
		CustomsItem x = (CustomsItem)o;
	
		return super.equals(o)
			&& Objects.equals(this.customsFormId, x.customsFormId)
			&& Objects.equals(this.lineItemStockId, x.lineItemStockId)
			&& Objects.equals(this.originCountryId, x.originCountryId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.easypostId, x.easypostId)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.quantity, x.quantity)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.weight, x.weight)
			&& Objects.equals(this.hsTariffNumber, x.hsTariffNumber)
			&& Objects.equals(this.lineItemStock, x.lineItemStock)
			&& Objects.equals(this.customsForm, x.customsForm)
			&& Objects.equals(this.originCountry, x.originCountry)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.versions, x.versions)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			customsFormId, lineItemStockId, originCountryId, currencyId, easypostId,
			code, name, quantity, amountCents, weight,
			hsTariffNumber, lineItemStock, customsForm, originCountry, currency,
			versions 
		);
	
	}
	

	@Override
	public CustomsItem clone() {
	
		CustomsItem no = new CustomsItem();
	
		no = super.clone(no);
	
		no.customsFormId = this.customsFormId;
		no.lineItemStockId = this.lineItemStockId;
		no.originCountryId = this.originCountryId;
		no.currencyId = this.currencyId;
		no.easypostId = this.easypostId;
		no.code = this.code;
		no.name = this.name;
		no.quantity = this.quantity;
		no.amountCents = this.amountCents;
		no.weight = this.weight;
		no.hsTariffNumber = this.hsTariffNumber;
		no.lineItemStock = this.lineItemStock;
		no.customsForm = this.customsForm;
		no.originCountry = this.originCountry;
		no.currency = this.currency;
		no.versions = this.versions;
	
		return no;
	
	}
	
}
