-- Approach 2
select case WHEN salary=-1000 then null
else salary
end as SecondHighestSalary
FROM
(
  select salary FROM (
    select salary , rank() over (order by salary DESC ) as rnk FROM (
      select distinct salary as salary from employee
    )
  ) where rnk=2
  UNION ALL
  select -1000 FROM DUAL
) where ROWNUM=1
;
