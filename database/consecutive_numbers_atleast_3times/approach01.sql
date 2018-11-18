-- Approach 1
select distinct offset0.num as consecutivenums from logs offset0
inner join logs offset1 on offset0.id=offset1.id-1 and offset0.num=offset1.num
inner join logs offset2 on offset0.id=offset2.id-2 and offset0.num=offset2.num
