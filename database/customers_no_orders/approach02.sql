-- Approach 2
select name as customers from customers c where NOT EXISTS
  (select 1 from orders where orders.customerid=c.id)
order by customers
;
