-- Approach 1
select name as customers from customers where customers.id NOT IN 
  (select customerid from orders)
order by customers
;
