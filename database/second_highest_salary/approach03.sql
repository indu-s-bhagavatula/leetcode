-- Approach 3
select salary as SecondHighestSalary
FROM
(
  select salary FROM (
    select salary , rank() over (order by salary DESC ) as rnk FROM (
      select distinct salary as salary from employee
    )
  ) where rnk=2
  UNION ALL
  select null FROM DUAL
) where ROWNUM=1
;
