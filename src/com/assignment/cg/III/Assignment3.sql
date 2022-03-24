-- A new database "assingmentdb" is created for the execution of the following query
create table employee(empno varchar(6) primary key,empname varchar(30),salary numeric (8,2),designation varchar(10),department varchar(10));
select * from employee;
insert into employee values('EP01','Avi Arad',33000),
							('EP02','Bruce Banner',60000),
							('EP03','Charlie Cox',46000),
							('EP04','Danny DeVito',54000);
delete from employee;

-- Queries used for testing the validity of Strings passed into executeQuery method
update employee set designation ='Producer' where empno = 'EP01';
select * from employee where department = 'Production' and designation = 'Producer';






