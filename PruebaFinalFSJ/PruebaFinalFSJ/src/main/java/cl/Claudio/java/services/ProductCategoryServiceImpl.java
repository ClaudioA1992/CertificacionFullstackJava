package cl.Claudio.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Claudio.java.models.ProductCategory;
import cl.Claudio.java.repositorios.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	ProductCategoryRepository pcr;

	@Override
	public List<ProductCategory> callAllProductCategories() {
		return pcr.findAll();
	}

	@Override
	public ProductCategory findCategoryByName(String categoryName) {
		return pcr.findByCategoryName(categoryName);
	}

}
