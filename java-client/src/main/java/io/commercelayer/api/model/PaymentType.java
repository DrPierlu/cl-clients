package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * PaymentType
 */
public class PaymentType extends ApiResource {

	private static final long serialVersionUID = -1484058602977L;


	private Integer gatewayId;
	private Integer merchantId;
	private String name;
	@JsonExclude
	private String description;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> markets;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private String paymentSourceKind;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private String slug;
	@JsonExclude
	private List<String> translations;


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
	

	public PaymentType name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setSlug(String slug) {
		this.slug = slug;
	}
	

	public String getSlug() {
		return this.slug;
	}
	

	public PaymentType slug(String slug) {
		setSlug(slug);
		return this;
	}
	

	public String slug() {
		return getSlug();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public PaymentType description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public PaymentType merchantId(Integer merchantId) {
		setMerchantId(merchantId);
		return this;
	}
	

	public Integer merchantId() {
		return getMerchantId();
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public PaymentType gatewayId(Integer gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public Integer gatewayId() {
		return getGatewayId();
	}
	

	public void setPaymentSourceKind(String paymentSourceKind) {
		this.paymentSourceKind = paymentSourceKind;
	}
	

	public String getPaymentSourceKind() {
		return this.paymentSourceKind;
	}
	

	public PaymentType paymentSourceKind(String paymentSourceKind) {
		setPaymentSourceKind(paymentSourceKind);
		return this;
	}
	

	public String paymentSourceKind() {
		return getPaymentSourceKind();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public PaymentType previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public PaymentType merchant(Object merchant) {
		setMerchant(merchant);
		return this;
	}
	

	public Object merchant() {
		return getMerchant();
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public PaymentType gateway(Object gateway) {
		setGateway(gateway);
		return this;
	}
	

	public Object gateway() {
		return getGateway();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public PaymentType resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public PaymentType images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public PaymentType translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public PaymentType marketPaymentTypes(List<String> marketPaymentTypes) {
		setMarketPaymentTypes(marketPaymentTypes);
		return this;
	}
	

	public List<String> marketPaymentTypes() {
		return getMarketPaymentTypes();
	}
	

	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}
	

	public List<String> getMarkets() {
		return this.markets;
	}
	

	public PaymentType markets(List<String> markets) {
		setMarkets(markets);
		return this;
	}
	

	public List<String> markets() {
		return getMarkets();
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
	
		no = super.clone(no);
	
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
