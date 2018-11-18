-- Approach 2
select distinct offset0_num as consecutivenums from (
  select num as offset0_num, lead(num, 1) over (order by id asc) as offset1_num, lead(num,2) over(order by id asc) as offset2_num from logs
) where offset0_num=offset1_num and offset1_num=offset2_num
;
