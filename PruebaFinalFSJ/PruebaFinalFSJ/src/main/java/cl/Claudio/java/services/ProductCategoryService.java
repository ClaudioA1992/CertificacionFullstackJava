package cl.Claudio.java.services;

import java.util.List;

import cl.Claudio.java.models.ProductCategory;

public interface ProductCategoryService {
	
	List<ProductCategory> callAllProductCategories();
	
	ProductCategory findCategoryByName(String categoryName);

}
