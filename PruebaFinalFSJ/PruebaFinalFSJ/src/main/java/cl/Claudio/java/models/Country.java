package cl.Claudio.java.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "COUNTRIES")
public class Country {
	
	@Id
	@Column(length = 2)
	private String countryId;
	
	private String countryName;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "REGION_ID")
	private Region region;
	
	@OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Location> locations;

	
	public Country(String countryId, String countryName, Region region, Set<Location> locations) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.region = region;
		this.locations = locations;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Set<Location> getLocations() {
		return locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	
	public Country() {
		super();
	}
		

}
