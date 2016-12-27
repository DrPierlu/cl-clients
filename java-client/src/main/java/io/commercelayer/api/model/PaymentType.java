package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * PaymentType
 */
public class PaymentType extends ApiResource {

	private static final long serialVersionUID = -1482880735314L;


	private String name;
	@JsonExclude
	private String slug;
	@JsonExclude
	private String description;
	private Integer merchantId;
	private Integer gatewayId;
	@JsonExclude
	private String paymentSourceKind;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> markets;


	public PaymentType() {
		super();
	}
	

	public PaymentType(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public void setPaymentSourceKind(String paymentSourceKind) {
		this.paymentSourceKind = paymentSourceKind;
	}
	

	public String getPaymentSourceKind() {
		return this.paymentSourceKind;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaymentType x = (PaymentType)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.slug, x.slug)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.merchantId, x.merchantId)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.paymentSourceKind, x.paymentSourceKind)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.gateway, x.gateway)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.markets, x.markets)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, slug, description, merchantId, gatewayId,
			paymentSourceKind, previousChanges, merchant, gateway, resourceImages,
			images, translations, marketPaymentTypes, markets 
		);
	
	}
	

	@Override
	public PaymentType clone() {
	
		PaymentType no = new PaymentType();
	
		no.name = this.name;
		no.slug = this.slug;
		no.description = this.description;
		no.merchantId = this.merchantId;
		no.gatewayId = this.gatewayId;
		no.paymentSourceKind = this.paymentSourceKind;
		no.previousChanges = this.previousChanges;
		no.merchant = this.merchant;
		no.gateway = this.gateway;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.markets = this.markets;
	
		return no;
	
	}
	
}
