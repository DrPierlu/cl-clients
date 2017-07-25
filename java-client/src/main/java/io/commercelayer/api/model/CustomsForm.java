package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * CustomsForm
 */
public class CustomsForm extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer shipmentId;
	@JsonExclude
	private String contentsKind;
	@JsonExclude
	private Boolean customsCertify;
	@JsonExclude
	private List<String> customsItems;
	@JsonExclude
	private String customsSigner;
	@JsonExclude
	private String easypostId;
	@JsonExclude
	private String eelPfc;
	@JsonExclude
	private String name;
	@JsonExclude
	private String nonDeliveryOption;
	@JsonExclude
	private String restrictionKind;
	@JsonExclude
	private Object shipment;
	@JsonExclude
	private List<String> versions;


	public CustomsForm() {
		super();
	}
	

	public CustomsForm(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public CustomsForm name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public Integer getShipmentId() {
		return this.shipmentId;
	}
	

	public CustomsForm shipmentId(Integer shipmentId) {
		setShipmentId(shipmentId);
		return this;
	}
	

	public Integer shipmentId() {
		return getShipmentId();
	}
	

	public void setEasypostId(String easypostId) {
		this.easypostId = easypostId;
	}
	

	public String getEasypostId() {
		return this.easypostId;
	}
	

	public CustomsForm easypostId(String easypostId) {
		setEasypostId(easypostId);
		return this;
	}
	

	public String easypostId() {
		return getEasypostId();
	}
	

	public void setEelPfc(String eelPfc) {
		this.eelPfc = eelPfc;
	}
	

	public String getEelPfc() {
		return this.eelPfc;
	}
	

	public CustomsForm eelPfc(String eelPfc) {
		setEelPfc(eelPfc);
		return this;
	}
	

	public String eelPfc() {
		return getEelPfc();
	}
	

	public void setContentsKind(String contentsKind) {
		this.contentsKind = contentsKind;
	}
	

	public String getContentsKind() {
		return this.contentsKind;
	}
	

	public CustomsForm contentsKind(String contentsKind) {
		setContentsKind(contentsKind);
		return this;
	}
	

	public String contentsKind() {
		return getContentsKind();
	}
	

	public void setCustomsCertify(Boolean customsCertify) {
		this.customsCertify = customsCertify;
	}
	

	public Boolean getCustomsCertify() {
		return this.customsCertify;
	}
	

	public CustomsForm customsCertify(Boolean customsCertify) {
		setCustomsCertify(customsCertify);
		return this;
	}
	

	public Boolean customsCertify() {
		return getCustomsCertify();
	}
	

	public void setCustomsSigner(String customsSigner) {
		this.customsSigner = customsSigner;
	}
	

	public String getCustomsSigner() {
		return this.customsSigner;
	}
	

	public CustomsForm customsSigner(String customsSigner) {
		setCustomsSigner(customsSigner);
		return this;
	}
	

	public String customsSigner() {
		return getCustomsSigner();
	}
	

	public void setNonDeliveryOption(String nonDeliveryOption) {
		this.nonDeliveryOption = nonDeliveryOption;
	}
	

	public String getNonDeliveryOption() {
		return this.nonDeliveryOption;
	}
	

	public CustomsForm nonDeliveryOption(String nonDeliveryOption) {
		setNonDeliveryOption(nonDeliveryOption);
		return this;
	}
	

	public String nonDeliveryOption() {
		return getNonDeliveryOption();
	}
	

	public void setRestrictionKind(String restrictionKind) {
		this.restrictionKind = restrictionKind;
	}
	

	public String getRestrictionKind() {
		return this.restrictionKind;
	}
	

	public CustomsForm restrictionKind(String restrictionKind) {
		setRestrictionKind(restrictionKind);
		return this;
	}
	

	public String restrictionKind() {
		return getRestrictionKind();
	}
	

	public void setShipment(Object shipment) {
		this.shipment = shipment;
	}
	

	public Object getShipment() {
		return this.shipment;
	}
	

	public CustomsForm shipment(Object shipment) {
		setShipment(shipment);
		return this;
	}
	

	public Object shipment() {
		return getShipment();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public CustomsForm versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setCustomsItems(List<String> customsItems) {
		this.customsItems = customsItems;
	}
	

	public List<String> getCustomsItems() {
		return this.customsItems;
	}
	

	public CustomsForm customsItems(List<String> customsItems) {
		setCustomsItems(customsItems);
		return this;
	}
	

	public List<String> customsItems() {
		return getCustomsItems();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		CustomsForm x = (CustomsForm)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.shipmentId, x.shipmentId)
			&& Objects.equals(this.easypostId, x.easypostId)
			&& Objects.equals(this.eelPfc, x.eelPfc)
			&& Objects.equals(this.contentsKind, x.contentsKind)
			&& Objects.equals(this.customsCertify, x.customsCertify)
			&& Objects.equals(this.customsSigner, x.customsSigner)
			&& Objects.equals(this.nonDeliveryOption, x.nonDeliveryOption)
			&& Objects.equals(this.restrictionKind, x.restrictionKind)
			&& Objects.equals(this.shipment, x.shipment)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.customsItems, x.customsItems)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, shipmentId, easypostId, eelPfc, contentsKind,
			customsCertify, customsSigner, nonDeliveryOption, restrictionKind, shipment,
			versions, customsItems 
		);
	
	}
	

	@Override
	public CustomsForm clone() {
	
		CustomsForm no = new CustomsForm();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.shipmentId = this.shipmentId;
		no.easypostId = this.easypostId;
		no.eelPfc = this.eelPfc;
		no.contentsKind = this.contentsKind;
		no.customsCertify = this.customsCertify;
		no.customsSigner = this.customsSigner;
		no.nonDeliveryOption = this.nonDeliveryOption;
		no.restrictionKind = this.restrictionKind;
		no.shipment = this.shipment;
		no.versions = this.versions;
		no.customsItems = this.customsItems;
	
		return no;
	
	}
	
}
