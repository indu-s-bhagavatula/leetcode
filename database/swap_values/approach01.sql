/*
Given a table salary, such as the one below, that has m=male and f=female values. Swap all f and m values (i.e., change all f values to m and vice versa) with a single update query and no intermediate temp table.
*/
-- Approach 1
select * from salary;

update salary
  set sex= (
    case when sex='m' then 'f'
         when sex='f' then 'm'
    end
  )
;

select * from salary;
