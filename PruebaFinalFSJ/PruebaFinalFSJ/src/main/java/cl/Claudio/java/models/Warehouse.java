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
@Table(name = "WAREHOUSES")
@SequenceGenerator(name = "WAREHOUSES_SEQ")
public class Warehouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WAREHOUSES_SEQ")
	private Long warehouseId;
	
	private String warehouseName;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "LOCATION_ID")
	private Location location;

	@OneToMany(mappedBy = "warehouse", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Inventory> inventories;

	
	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Set<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	
	public Warehouse(Long warehouseId, String warehouseName, Location location, Set<Inventory> inventories) {
		super();
		this.warehouseId = warehouseId;
		this.warehouseName = warehouseName;
		this.location = location;
		this.inventories = inventories;
	}

	public Warehouse() {
		super();
	}
	
	
}
