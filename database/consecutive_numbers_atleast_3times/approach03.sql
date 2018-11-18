-- Approach 3
select distinct num as ConsecutiveNums from
(
  select num, id, lead(id, 2) over (partition by num order by id asc) as next2id, lead(id, 2) over (partition by num order by id asc)- id as diff_next2_id
  from logs
  order by num
) where diff_next2_id=2
;
