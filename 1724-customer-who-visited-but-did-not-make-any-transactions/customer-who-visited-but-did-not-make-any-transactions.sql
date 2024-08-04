# Write your MySQL query statement below
select visits.customer_id, count(customer_id) as count_no_trans 
from visits left join Transactions on transactions.visit_id = visits.visit_id where transaction_id is null group by customer_id;