-- Approach 3
select employee_dept.Department,employee_dept.emp_name Employee,employee_dept.salary from
(
  select emp.Id emp_id, emp.Name emp_name, emp.Salary salary, emp.DepartmentId DepartmentId, dept.Name Department from Employee emp
  inner join Department dept
  on emp.DepartmentId=dept.id
) employee_dept
inner join
(
  select DepartmentId DepartmentId, max(salary) max_salary from Employee emp1 group by DepartmentId
) dept_max
on  dept_max.DepartmentId=employee_dept.DepartmentId
and dept_max.max_salary = employee_dept.salary
order by Department, Employee
;
