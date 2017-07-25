package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Country
 */
public class Country extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String code;
	private Integer countryGroupId;
	@JsonExclude
	private Object countryGroup;
	@JsonExclude
	private List<String> countryLanguages;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private List<String> customsItems;
	@JsonExclude
	private Object defaultLanguage;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private List<String> languages;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private String name;
	@JsonExclude
	private List<String> orders;
	@JsonExclude
	private List<String> priceLists;
	@JsonExclude
	private String selling;
	@JsonExclude
	private List<String> states;
	@JsonExclude
	private List<String> versions;


	public Country() {
		super();
	}
	

	public Country(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Country name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setCountryGroupId(Integer countryGroupId) {
		this.countryGroupId = countryGroupId;
	}
	

	public Integer getCountryGroupId() {
		return this.countryGroupId;
	}
	

	public Country countryGroupId(Integer countryGroupId) {
		setCountryGroupId(countryGroupId);
		return this;
	}
	

	public Integer countryGroupId() {
		return getCountryGroupId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public Country currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getCode() {
		return this.code;
	}
	

	public Country code(String code) {
		setCode(code);
		return this;
	}
	

	public String code() {
		return getCode();
	}
	

	public void setCountryGroup(Object countryGroup) {
		this.countryGroup = countryGroup;
	}
	

	public Object getCountryGroup() {
		return this.countryGroup;
	}
	

	public Country countryGroup(Object countryGroup) {
		setCountryGroup(countryGroup);
		return this;
	}
	

	public Object countryGroup() {
		return getCountryGroup();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public Country currency(Object currency) {
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
	

	public Country versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setPriceLists(List<String> priceLists) {
		this.priceLists = priceLists;
	}
	

	public List<String> getPriceLists() {
		return this.priceLists;
	}
	

	public Country priceLists(List<String> priceLists) {
		setPriceLists(priceLists);
		return this;
	}
	

	public List<String> priceLists() {
		return getPriceLists();
	}
	

	public void setStates(List<String> states) {
		this.states = states;
	}
	

	public List<String> getStates() {
		return this.states;
	}
	

	public Country states(List<String> states) {
		setStates(states);
		return this;
	}
	

	public List<String> states() {
		return getStates();
	}
	

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	

	public List<String> getOrders() {
		return this.orders;
	}
	

	public Country orders(List<String> orders) {
		setOrders(orders);
		return this;
	}
	

	public List<String> orders() {
		return getOrders();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Country lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Country lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public Country invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	public void setCustomsItems(List<String> customsItems) {
		this.customsItems = customsItems;
	}
	

	public List<String> getCustomsItems() {
		return this.customsItems;
	}
	

	public Country customsItems(List<String> customsItems) {
		setCustomsItems(customsItems);
		return this;
	}
	

	public List<String> customsItems() {
		return getCustomsItems();
	}
	

	public void setCountryLanguages(List<String> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
	

	public List<String> getCountryLanguages() {
		return this.countryLanguages;
	}
	

	public Country countryLanguages(List<String> countryLanguages) {
		setCountryLanguages(countryLanguages);
		return this;
	}
	

	public List<String> countryLanguages() {
		return getCountryLanguages();
	}
	

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

	public List<String> getLanguages() {
		return this.languages;
	}
	

	public Country languages(List<String> languages) {
		setLanguages(languages);
		return this;
	}
	

	public List<String> languages() {
		return getLanguages();
	}
	

	public void setDefaultLanguage(Object defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	

	public Object getDefaultLanguage() {
		return this.defaultLanguage;
	}
	

	public Country defaultLanguage(Object defaultLanguage) {
		setDefaultLanguage(defaultLanguage);
		return this;
	}
	

	public Object defaultLanguage() {
		return getDefaultLanguage();
	}
	

	public void setSelling(String selling) {
		this.selling = selling;
	}
	

	public String getSelling() {
		return this.selling;
	}
	

	public Country selling(String selling) {
		setSelling(selling);
		return this;
	}
	

	public String selling() {
		return getSelling();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Country x = (Country)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.countryGroupId, x.countryGroupId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.code, x.code)
			&& Objects.equals(this.countryGroup, x.countryGroup)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.priceLists, x.priceLists)
			&& Objects.equals(this.states, x.states)
			&& Objects.equals(this.orders, x.orders)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.customsItems, x.customsItems)
			&& Objects.equals(this.countryLanguages, x.countryLanguages)
			&& Objects.equals(this.languages, x.languages)
			&& Objects.equals(this.defaultLanguage, x.defaultLanguage)
			&& Objects.equals(this.selling, x.selling)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, countryGroupId, currencyId, code, countryGroup,
			currency, versions, priceLists, states, orders,
			lineItemStocks, lineItems, invoices, customsItems, countryLanguages,
			languages, defaultLanguage, selling 
		);
	
	}
	

	@Override
	public Country clone() {
	
		Country no = new Country();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.countryGroupId = this.countryGroupId;
		no.currencyId = this.currencyId;
		no.code = this.code;
		no.countryGroup = this.countryGroup;
		no.currency = this.currency;
		no.versions = this.versions;
		no.priceLists = this.priceLists;
		no.states = this.states;
		no.orders = this.orders;
		no.lineItemStocks = this.lineItemStocks;
		no.lineItems = this.lineItems;
		no.invoices = this.invoices;
		no.customsItems = this.customsItems;
		no.countryLanguages = this.countryLanguages;
		no.languages = this.languages;
		no.defaultLanguage = this.defaultLanguage;
		no.selling = this.selling;
	
		return no;
	
	}
	
}
