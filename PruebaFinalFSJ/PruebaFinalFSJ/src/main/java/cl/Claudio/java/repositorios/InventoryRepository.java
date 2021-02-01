package cl.Claudio.java.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.Claudio.java.models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
