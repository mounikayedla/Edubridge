use mounika;
-- foreign key:you can join multiple tables
create table customer
(
cust_id int primary key,
name varchar(50),
address varchar(50),
phone varchar(20)
);
create table orderDetails
(
order_id int primary key,
order_num int not null,
order_date datetime,
cust_id int,
constraint FK_custOrder foreign key(cust_id) references Customer(cust_id)
);
insert into customer values(101,'abc','mumbai','9010208877');
insert into customer values(102,'acb','khammam','9828567490');
insert into customer values(103,'mnk','palvancha','7674894630');
insert into orderDetails values(501,12301,'2021-03-01',101);
insert into  orderDetails values(502,12302,'2021-10-23',102);
insert into  orderDetails values(503,12303,'2021-05-05',103);
insert into  orderDetails values(504,12304,'2021-11-23',101);
select * from customer;
select * from orderDetails;
-- ex of inner join
select orderDetails.Order_id,customer.name
from orderDetails inner join customer
on orderDetails.cust_id=customer.cust_id;
-- ex of left join
select orderDetails.Order_id,customer.name
from orderDetails left join customer
on orderDetails.cust_id=customer.cust_id;

-- ex of right join
select orderDetails.Order_id,customer.name
from orderDetails right join customer
on orderDetails.cust_id=customer.cust_id
order by orderDetails.order_id; 
-- ex of full outer join
select  orderDetails .name,orderDetails.order_id,orderDetails.order_date
from  orderDetails FULL JOIN customer
on  orderDetails.cust_id=customer.cust_id
order by customer.name;
use mounika;
-- stored procedure
delimiter //
create procedure getEmployees()
begin
select * from employee;

end //
delimiter ;
 call getEmployees;
 create table userDetails
 (
 id int primary key,
 name varchar(50)
 );
 delimiter //
 create procedure insertRecord(id int,name varchar(50))
begin
insert into userDetails values(id,name);
end//
delimiter ;
select * from userDetails;
call InsertRecord(103,'Ajay');
use mounika;
create table imgtable
(
name varchar(50),
photo blob
);
select * from imgtable;
select * from filetable;
select * from employee;
use mounika;
 select * from employeee;
use mounika;
select * from UserDetails;
select * from userdetails1;
select *from user1;
select * from hibernate_sequence;
create table mouni(
P_id int primary key,
name varchar(50),
tech varchar(50)
);

select * from mouni;
drop table mouni;
create table person1(
P_id int primary key,
name varchar(50),
tech varchar(50)
);
select * from person1;
select * from student;
CREATE TABLE  books (
  id int(10) NOT NULL AUTO_INCREMENT,
  callno varchar(100) NOT NULL,
  name varchar(100) NOT NULL,
  author varchar(100) NOT NULL,
  publisher varchar(100) NOT NULL,
  quantity int(10) NOT NULL,
  issued int(10) NOT NULL,
  added_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY callno (callno),
  UNIQUE KEY callno_2 (callno)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `callno`, `name`, `author`, `publisher`, `quantity`, `issued`, `added_date`) VALUES
(1, 'A@4', 'C In Depth', 'Shrivastav', 'BPB', 2, 2, '2016-07-19 19:37:56'),
(2, 'B@1', 'DBMS', 'Korth', 'Pearson', 3, 0, '2016-07-18 18:39:52'),
(3, 'G@12', 'Let''s see', 'Yashwant Kanetkar', 'BPB', 10, 0, '2016-07-18 23:02:14');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE TABLE IF NOT EXISTS `issuebooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookcallno` varchar(50) NOT NULL,
  `studentid` int(11) NOT NULL,
  `studentname` varchar(50) NOT NULL,
  `studentcontact` varchar(20) NOT NULL,
  `issueddate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `issuebooks`
--

INSERT INTO `issuebooks` (`id`, `bookcallno`, `studentid`, `studentname`, `studentcontact`, `issueddate`) VALUES
(4, 'A@4', 23, 'kk', '932992932', '2016-07-19 18:43:16'),
(6, 'A@4', 335, 'Sumedh', '95676565756', '2016-07-19 18:44:34'),
(7, 'A@4', 87, 'abhishek', '9329882382', '2016-07-19 18:46:12');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
select * from issuebooks;
create table users (
	id  int(3) NOT NULL AUTO_INCREMENT,
	name varchar(120) NOT NULL,
	email varchar(220) NOT NULL,
	country varchar(120),
	PRIMARY KEY (id)
);
insert into users (id,name,email,country) values
(1,'Mounika','mounika@gmail.com','India'),
(2,'Sandhya','sandhyaa@gmail.com','India'),
(3,'Kavya','kavya@gmail.com','India'),
(4,'Navya','navyaa@gmail.com','India');
select * from users;
create table qao  
(   
	qno int primary key,   
	question varchar(250),   
	option1 varchar(20),   
	option2 varchar(20),   
	option3 varchar(20),   
	option4 varchar(20)
);
create table stuqao  
(   
	qno int primary key,   
	question varchar(250),   
	option1 varchar(20),   
	option2 varchar(20),   
	option3 varchar(20),   
	option4 varchar(20)
);
alter table stuqao add unique(qno);
create table stuua  
(   
	qno int primary key,   
	ans varchar(20),
	foreign key (qno) references stuqao(qno)
);
ALTER TABLE stuua ADD UNIQUE (qno);
ALTER TABLE stuua CHANGE COLUMN `ans` `userans` VARCHAR(20) NOT NULL;
ALTER TABLE stuua ADD correctans varchar(20);
ALTER TABLE stuua modify userans varchar(20);
create table ua  
(   
	qno int primary key,   
	ans varchar(20),
	foreign key (qno) references qao(qno)
);
ALTER TABLE ua ADD UNIQUE (qno);
ALTER TABLE ua CHANGE COLUMN `ans` `userans` VARCHAR(20) NOT NULL;
ALTER TABLE ua ADD correctans varchar(20);
ALTER TABLE ua modify userans varchar(20);
create database maven;
use maven;
 create table users (
	
	name varchar(120) NOT NULL,
	Department varchar(220) NOT NULL,
	Designation varchar(120),
	Salary int(3)
);











