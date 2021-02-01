SELECT products.product_id, product_name, quantity FROM products JOIN inventories ON products.product_id = inventories.product_id
JOIN warehouses ON inventories.warehouse_id = warehouses.warehouse_id
WHERE product_name like '%Intel%' and warehouse_name like '%San Francisco%' 
ORDER BY product_name asc;