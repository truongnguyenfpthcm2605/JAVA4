
CREATE DATABASE DEMO

USE DEMO
CREATE TABLE Account(

	ID Int identity(1,1) primary key ,
	PASSWORD NVARCHAR(50),
	FULLNAME NVARCHAR(50),
	EMAIL NVARCHAR(50),
	ADMIN BIT
)

insert into Account(PASSWORD,FULLNAME,EMAIL,ADMIN) values (N'sfdfdf',N'nguyen dinha toan',N'truong@gmail.com',1)
select * from Account
delete from Account where admin is null