package cl.Claudio.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Claudio.java.models.Warehouse;
import cl.Claudio.java.repositorios.WarehouseRepository;

@Service
public class WarehouseServiceImpl implements WarehouseService {
	
	@Autowired	
	WarehouseRepository wr;

	@Override
	public List<Warehouse> callAllWarehouses() {
		return wr.findAll();
	}

	@Override
	public Warehouse getWarehouseByName(String warehouseName) {
		return wr.findByWarehouseName(warehouseName);
	}

}
