-- approach01.sql 
select emp.name as employee
-- , emp.salary , mng.salary
from employee emp
inner join employee mng
on emp.managerid = mng.id
and emp.salary > mng.salary ;
