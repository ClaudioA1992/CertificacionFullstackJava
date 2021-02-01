package cl.Claudio.java.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LOCATIONS")
@SequenceGenerator(name = "LOCATIONS_SEQ")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOCATIONS_SEQ")
	private Long locationId;
	
	private String address;
	private String postalCode;
	private String city;
	private String lState;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;
	
	@OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Warehouse> warehouses;

	
	public Location(Long locationId, String address, String postalCode, String city, String lState, Country country,
			Set<Warehouse> warehouses) {
		super();
		this.locationId = locationId;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.lState = lState;
		this.country = country;
		this.warehouses = warehouses;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return lState;
	}

	public void setState(String lState) {
		this.lState = lState;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<Warehouse> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(Set<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}

	
	public Location() {
		super();
	}
	

}
