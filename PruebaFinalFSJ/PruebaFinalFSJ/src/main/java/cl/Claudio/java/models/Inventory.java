package cl.Claudio.java.models;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORIES")
//@IdClass(value = PKInventory.class)
public class Inventory {
	
	@EmbeddedId
	private PKInventory pk;
	
	//@Id
	//private Long warehouseId;
	//@Id
	//private Long productId;
	
	private Integer quantity;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "WAREHOUSE_ID", insertable = false, updatable = false)
	private Warehouse warehouse;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID", insertable = false, updatable = false)
	private Product product;

	
	public Inventory(Integer quantity, Warehouse warehouse, Product product) {
		super();
		this.quantity = quantity;
		this.warehouse = warehouse;
		this.product = product;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Product getProduct() {
		return product;
	}

	public void setProducts(Product product) {
		this.product = product;
	}


	public Inventory() {
		super();
	}
	

}
