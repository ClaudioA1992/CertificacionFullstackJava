package cl.Claudio.java.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.Claudio.java.models.Product;
import cl.Claudio.java.models.ProductCategory;
import cl.Claudio.java.models.Warehouse;
import cl.Claudio.java.services.InventoryService;
import cl.Claudio.java.services.ProductCategoryService;
import cl.Claudio.java.services.ProductService;
import cl.Claudio.java.services.WarehouseService;

@Controller
public class ControladorPrincipal {
	
	@Autowired
	ProductService ps;
	
	@Autowired
	InventoryService is;
	
	@Autowired
	WarehouseService ws;
	
	@Autowired
	ProductCategoryService pcs;
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
		
	}
	
	@RequestMapping("/viewProducts")
	public ModelAndView viewProducts() {
		
		ModelAndView mav = new ModelAndView("productsView");
	
		List<Product> lp = ps.callAllProducts();
		
		mav.addObject("products", lp);
		
		return mav;
		
	}
	
	@RequestMapping("/viewInventoriesByWarehouse")
	public ModelAndView viewInventoriesByWarehouse() {
		
		ModelAndView mav = new ModelAndView("inventoriesByWarehouseView");
		
		List<Warehouse> lw = ws.callAllWarehouses();
		
		mav.addObject("warehouses", lw);
		
		return mav;
		
	}
	
	@RequestMapping("/viewProductsMonitor")
	public ModelAndView viewProductsMonitor() {
		
		ModelAndView mav = new ModelAndView("productsMonitor");
		
		List<Product> products = ps.callAllProducts();
		
		List<Warehouse> warehouses = ws.callAllWarehouses();
		
		List<ProductCategory> productCategories = pcs.callAllProductCategories();
		
		mav.addObject("products", products);
		mav.addObject("warehouses", warehouses);
		mav.addObject("pcs", productCategories);
		
		return mav;
		
	}
	
	@RequestMapping("/searchMonitor")
	public ModelAndView searchMonitor(@RequestParam("warehouse") String warehouseName, @RequestParam("category") String categoryName) {
		
		
		ModelAndView mav = new ModelAndView("searchView");
		
		Warehouse warehouse = ws.getWarehouseByName(warehouseName);
		
		ProductCategory category = pcs.findCategoryByName(categoryName);
		
		mav.addObject("category", category);
		
		mav.addObject("warehouse", warehouse);
		
		List<Product> products = ps.callAllProducts();
		
		List<Warehouse> warehouses = ws.callAllWarehouses();
		
		List<ProductCategory> productCategories = pcs.callAllProductCategories();
		
		mav.addObject("products", products);
		mav.addObject("warehouses", warehouses);
		mav.addObject("pcs", productCategories);
		
		return mav;		
		
		
	}
 
}
