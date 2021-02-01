SELECT country_name,  warehouse_name, address, city, l_state FROM warehouses JOIN locations ON warehouses.location_id = locations.location_id
JOIN countries ON countries.country_id = locations.country_id
ORDER BY country_name ASC; 