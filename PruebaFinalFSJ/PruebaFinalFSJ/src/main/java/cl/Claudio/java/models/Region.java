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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "REGIONS")
@SequenceGenerator(name = "REGIONS_SEQ")
public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGIONS_SEQ")
	private Long regionId;
	
	private String regionName;
	
	@OneToMany(mappedBy = "region", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Country> countries;

	
	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	
	public Region(Long regionId, String regionName, Set<Country> countries) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
		this.countries = countries;
	}

	public Region() {
		super();
	}

		
}
