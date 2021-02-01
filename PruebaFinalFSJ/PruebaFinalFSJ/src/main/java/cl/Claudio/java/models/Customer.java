package cl.Claudio.java.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
@SequenceGenerator(name = "CUSTOMERS_SEQ")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "CUSTOMERS_SEQ")
	private Long customerId;
	
	private String name;
	private String address;
	private String website;
	private Long creditLimit;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private Set<Contact> contacts;

	
	public Customer(Long customerId, String name, String address, String website, Long creditLimit,
			Set<Contact> contacts) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.website = website;
		this.creditLimit = creditLimit;
		this.contacts = contacts;
	}


	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}


	public Customer() {
		super();
	}
	

}
