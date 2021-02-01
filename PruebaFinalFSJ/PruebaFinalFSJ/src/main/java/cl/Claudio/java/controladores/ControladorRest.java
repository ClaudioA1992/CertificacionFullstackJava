package cl.Claudio.java.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.Claudio.java.models.Product;
import cl.Claudio.java.models.ProductCategory;
import cl.Claudio.java.models.Warehouse;
import cl.Claudio.java.services.ProductCategoryService;
import cl.Claudio.java.services.ProductService;
import cl.Claudio.java.services.WarehouseService;

@RestController
public class ControladorRest {

	@Autowired
	WarehouseService ws;

	@Autowired
	ProductCategoryService pcs;
	
	@Autowired
	ProductService ps;

	@RequestMapping(value = "/warehousesList", method = RequestMethod.GET)
	public List<Warehouse> warehousesList() {

		List<Warehouse> warehouses = ws.callAllWarehouses();

		return warehouses;

	}

	@RequestMapping(value = "/categoryList", method = RequestMethod.GET)
	public List<ProductCategory> categoryList() {

		List<ProductCategory> categories = pcs.callAllProductCategories();

		return categories;

	}
	
	@RequestMapping(value = "/productsWithInventoryList", method = RequestMethod.GET)
	public List<Product> productsWithInventoryList() {
		
		List<Product> products = ps.callAllProducts();
		
		return products;
		
	}
}
