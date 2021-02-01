package cl.Claudio.java.services;

import java.util.List;

import cl.Claudio.java.models.Warehouse;

public interface WarehouseService {
	
	List<Warehouse> callAllWarehouses();
	
	Warehouse getWarehouseByName(String warehouseName);

}
