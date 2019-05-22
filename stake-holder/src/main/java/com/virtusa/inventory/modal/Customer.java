package com.virtusa.inventory.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@NotNull
	private Integer id;

	@NotNull(message = "Gender must not be empty")
	private String gender;

	@NotNull
	private String occupation;

	@NotNull
	private String salutation;

	@NotNull(message = "Birth Date must not be empty")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;

	@NotNull(message = "First Name must not be empty")
	@Size(min = 3)
	private String firstName;

	@NotNull(message = "Last Name must not be empty")
	@Size(min = 3)
	private String lastName;

	@NotNull(message = "Email can't be empty")
	@Email(message = "Email is invalid")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	Address address;

	@OneToOne(cascade = CascadeType.ALL)
	LoyaltyCard card;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	List<Telephone> telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getfName() {
		return firstName;
	}

	public void setfName(String fName) {
		this.firstName = fName;
	}

	public String getlName() {
		return lastName;
	}

	public void setlName(String lName) {
		this.lastName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LoyaltyCard getCard() {
		return card;
	}

	public void setCard(LoyaltyCard card) {
		this.card = card;
	}

	public List<Telephone> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}

}
