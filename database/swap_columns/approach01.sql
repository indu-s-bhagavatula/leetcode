-- Approach 1
select * from swap_cols_demo;

update swap_cols_demo
  set col1 = col2,
      col2 = col1
;

select * from swap_cols_demo;
