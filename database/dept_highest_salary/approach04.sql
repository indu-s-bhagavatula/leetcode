-- Approach 4
select dept.Name as Department , emp_dept_sals_rank.Employee, emp_dept_sals_rank.salary from
(
  select emp.Name Employee, emp.salary, emp.DepartmentId, rank() over (partition by DepartmentID order by salary DESC ) as rnk from Employee emp
) emp_dept_sals_rank
inner join Department dept on dept.id=emp_dept_sals_rank.DepartmentId
and emp_dept_sals_rank.rnk=1
and emp_dept_sals_rank.DepartmentId=dept.id
order by Department, Employee
;
