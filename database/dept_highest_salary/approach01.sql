--Approach 1
select dept.Name Department, emp.Name Employee, dept_highest.max_sal as Salary from
(select DepartmentId, max(Salary) max_sal from Employee group by DepartmentId ) dept_highest
inner join Employee emp on emp.salary=dept_highest.max_sal and emp.DepartmentId = dept_highest.DepartmentId
inner join Department dept on dept.id=dept_highest.DepartmentId
order by Department, Employee
;
