package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.Objects;


/**
 * Contact
 */
public class Contact extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String name;
	@JsonExclude
	private String custom1;
	@JsonExclude
	private String custom2;
	@JsonExclude
	private String custom3;
	@JsonExclude
	private String email;
	@JsonExclude
	private String nationalIdNumber;
	@JsonExclude
	private String phone;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private String taxIdNumber;


	public Contact() {
		super();
	}
	

	public Contact(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Contact name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}
	

	public String getNationalIdNumber() {
		return this.nationalIdNumber;
	}
	

	public Contact nationalIdNumber(String nationalIdNumber) {
		setNationalIdNumber(nationalIdNumber);
		return this;
	}
	

	public String nationalIdNumber() {
		return getNationalIdNumber();
	}
	

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}
	

	public String getTaxIdNumber() {
		return this.taxIdNumber;
	}
	

	public Contact taxIdNumber(String taxIdNumber) {
		setTaxIdNumber(taxIdNumber);
		return this;
	}
	

	public String taxIdNumber() {
		return getTaxIdNumber();
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public Contact email(String email) {
		setEmail(email);
		return this;
	}
	

	public String email() {
		return getEmail();
	}
	

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public String getPhone() {
		return this.phone;
	}
	

	public Contact phone(String phone) {
		setPhone(phone);
		return this;
	}
	

	public String phone() {
		return getPhone();
	}
	

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}
	

	public String getCustom1() {
		return this.custom1;
	}
	

	public Contact custom1(String custom1) {
		setCustom1(custom1);
		return this;
	}
	

	public String custom1() {
		return getCustom1();
	}
	

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}
	

	public String getCustom2() {
		return this.custom2;
	}
	

	public Contact custom2(String custom2) {
		setCustom2(custom2);
		return this;
	}
	

	public String custom2() {
		return getCustom2();
	}
	

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}
	

	public String getCustom3() {
		return this.custom3;
	}
	

	public Contact custom3(String custom3) {
		setCustom3(custom3);
		return this;
	}
	

	public String custom3() {
		return getCustom3();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Contact previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Contact x = (Contact)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.nationalIdNumber, x.nationalIdNumber)
			&& Objects.equals(this.taxIdNumber, x.taxIdNumber)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.phone, x.phone)
			&& Objects.equals(this.custom1, x.custom1)
			&& Objects.equals(this.custom2, x.custom2)
			&& Objects.equals(this.custom3, x.custom3)
			&& Objects.equals(this.previousChanges, x.previousChanges)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, nationalIdNumber, taxIdNumber, email, phone,
			custom1, custom2, custom3, previousChanges 
		);
	
	}
	

	@Override
	public Contact clone() {
	
		Contact no = new Contact();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.nationalIdNumber = this.nationalIdNumber;
		no.taxIdNumber = this.taxIdNumber;
		no.email = this.email;
		no.phone = this.phone;
		no.custom1 = this.custom1;
		no.custom2 = this.custom2;
		no.custom3 = this.custom3;
		no.previousChanges = this.previousChanges;
	
		return no;
	
	}
	
}
