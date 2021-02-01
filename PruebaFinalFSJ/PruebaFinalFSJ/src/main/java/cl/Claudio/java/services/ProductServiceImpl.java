package cl.Claudio.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Claudio.java.models.Product;
import cl.Claudio.java.repositorios.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository rp;

	@Override
	public List<Product> callAllProducts() {
		return rp.findAll();
	}

}
