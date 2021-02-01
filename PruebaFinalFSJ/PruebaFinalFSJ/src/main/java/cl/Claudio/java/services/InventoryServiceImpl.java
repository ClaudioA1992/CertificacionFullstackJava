package cl.Claudio.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Claudio.java.models.Inventory;
import cl.Claudio.java.repositorios.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	InventoryRepository ir;

	@Override
	public List<Inventory> callAllInventories() {
		return ir.findAll();
	}

}
