--Approach 2
select dept.Name Department, emp_highest_salary.Name Employee, emp_highest_salary.Salary as Salary from
(select * from Employee
    WHERE (DepartmentId,Salary) IN
          ( select a1.DepartmentId, max(a1.Salary) max_sal from Employee a1 group by DepartmentId )
) emp_highest_salary
inner join Department dept on dept.id=emp_highest_salary.DepartmentId
order by Department, Employee
;
