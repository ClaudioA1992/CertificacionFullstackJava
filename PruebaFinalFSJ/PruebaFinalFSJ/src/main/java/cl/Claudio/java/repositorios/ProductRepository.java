package cl.Claudio.java.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.Claudio.java.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
