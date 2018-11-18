-- Approach 1
select email from person group by email having count(1) > 1;
