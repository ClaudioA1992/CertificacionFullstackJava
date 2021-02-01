package cl.Claudio.java.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.Claudio.java.models.Warehouse;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{
	
	Warehouse findByWarehouseName(String warehouseName);

}
