create table customers(
  id int,
  name varchar2(20)
);

create table orders (
  id int,
  customerid int
;

insert into customers values (1, 'Joe');
insert into customers values (2, 'Henry');
insert into customers values (3, 'Sam');
insert into customers values (4, 'Max');

insert into orders values (1,3);
insert into orders values (2,1);
 
