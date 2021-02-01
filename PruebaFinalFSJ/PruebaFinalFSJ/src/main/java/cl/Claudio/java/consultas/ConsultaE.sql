SELECT warehouse_name, sum(quantity*standard_cost) as inventario_valorizado from products JOIN inventories 
ON products.product_id = inventories.product_id
JOIN warehouses ON inventories.warehouse_id = warehouses.warehouse_id GROUP BY warehouses.warehouse_name
ORDER BY inventario_valorizado desc;