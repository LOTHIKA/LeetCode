# Write your MySQL query statement below
select Product.product_name as product_name, Sales.year as year, Sales.price as price
from Sales join Product on sales.product_id=product.product_id;