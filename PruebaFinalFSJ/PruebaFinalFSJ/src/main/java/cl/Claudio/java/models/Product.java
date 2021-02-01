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
@Table(name = "PRODUCTS")
@SequenceGenerator(name = "PRODUCTS_SEQ")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTS_SEQ")
	private Long productId;
	
	private String productName;
	private String description;
	private Long standardCost;
	private Long listPrice;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID")
	@JsonIgnore
	private ProductCategory productCategory;
	
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Inventory> inventories;

	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(Long standardCost) {
		this.standardCost = standardCost;
	}

	public Long getListPrice() {
		return listPrice;
	}

	public void setListPrice(Long listPrice) {
		this.listPrice = listPrice;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Set<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	
	public Product(Long productId, String productName, String description, Long standardCost, Long listPrice,
			ProductCategory productCategory, Set<Inventory> inventories) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.standardCost = standardCost;
		this.listPrice = listPrice;
		this.productCategory = productCategory;
		this.inventories = inventories;
	}

	
	
	public Product() {
		super();
	}	
	

}
