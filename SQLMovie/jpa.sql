
CREATE DATABASE JPA

USE JPA
CREATE TABLE USERS(

	ID Int identity(1,1) primary key ,
	PASSWORD NVARCHAR(50),
	FULLNAME NVARCHAR(50),
	EMAIL NVARCHAR(50),
	ADMIN BIT
)

insert into USERS(PASSWORD,FULLNAME,EMAIL,ADMIN) values (N'sfdfdf',N'nguyen Minh anh',N'truong@gmail.com',1)
select * from users