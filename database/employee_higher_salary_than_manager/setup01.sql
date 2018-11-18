drop table employee;

create table employee (
  id int,
  name varchar(50),
  salary int,
  managerid int
);

insert into employee values (1, 'Joe', 70000, 3);
insert into employee values (2, 'Henry', 80000, 4);
insert into employee values (3, 'Sam', 60000, NULL);
insert into employee values (4, 'Max', 90000, NULL); 
