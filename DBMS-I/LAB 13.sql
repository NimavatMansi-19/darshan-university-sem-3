--1. Display all the villages of Rajkot city. 
select v.Name from Village v join City c
on v.cityID=c.CityID
where c.name='rajkot'

--2. Display city along with their villages & pin code. 
select c.Name,v.name,c.pincode from City c join Village v
on c.cityID=v.CityID

--3. Display the city having more than one village.
select c.Name from City c join Village v
on c.cityID=v.CityID
group by c.name
having count(*)>1
--4. Display the city having no village. 
select c.Name from City c left join Village v
on c.cityID=v.CityID
group by c.name
having count(v.name)=0
--5. Count the total number of villages in each city.
select c.Name,count(v.name) from City c left join Village v
on c.cityID=v.CityID
group by c.name

--6. Count the number of cities having more than one village. 
select count(c.name) from City c 
where c.cityID 
in(select v.cityID from Village v group by v.cityId having(v.cityID)>1)

select * from Stu_Masters
select * from City_DETAILS
select * from Emp_DETAILS
select* from Dept_DETAILS
---CCC-
--Create table as per following schema with proper validation and try to insert data which violate your validation.
--1.	Emp(Eid, Ename, Did, Cid, Salary, Experience)
--		Dept(Did, Dname)
--		City(Cid, Cname, Did))
--		District(Did, Dname, Sid)
--		State(Sid, Sname, Cid)
--		Country(Cid, Cname)


CREATE TABLE Country_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL
);

CREATE TABLE State_INFO (
    Sid INT PRIMARY KEY,
    Sname VARCHAR(100) NOT NULL,
    Cid INT,
    FOREIGN KEY (Cid) REFERENCES Country_INFO(Cid)
);

CREATE TABLE District_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL,
    Sid INT,
    FOREIGN KEY (Sid) REFERENCES State_INFO(Sid)
);

CREATE TABLE Dept_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL
);

CREATE TABLE City_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL,
    Did INT,
    FOREIGN KEY (Did) REFERENCES District_INFO(Did)
);

CREATE TABLE Emp_INFO (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(100) NOT NULL,
    Did INT,
    Cid INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0), -- Salary must be positive
    Experience INT CHECK (Experience >= 0),  -- Experience cannot be negative
    FOREIGN KEY (Did) REFERENCES Dept_INFO(Did),
    FOREIGN KEY (Cid) REFERENCES City_INFO(Cid)
);

INSERT INTO Country_INFO (Cid, Cname) VALUES
(1, 'USA'),
(2, 'Canada'),
(3, 'UK'),
(4, 'Australia'),
(5, 'India');

INSERT INTO State_INFO (Sid, Sname, Cid) VALUES
(1, 'California', 1),
(2, 'Ontario', 2),
(3, 'London', 3),
(4, 'New South Wales', 4),
(5, 'Gujarat', 5);

INSERT INTO District_INFO (Did, Dname, Sid) VALUES
(1, 'Los Angeles', 1),
(2, 'Toronto', 2),
(3, 'Westminster', 3),
(4, 'Sydney', 4),
(5, 'Ahmedabad', 5);

INSERT INTO Dept_INFO (Did, Dname) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing'),
(4, 'Sales'),
(5, 'Finance');

INSERT INTO City_INFO (Cid, Cname, Did) VALUES
(1, 'Los Angeles City', 1),
(2, 'Toronto City', 2),
(3, 'London City', 3),
(4, 'Sydney City', 4),
(5, 'Ahmedabad City', 5);

INSERT INTO Emp_INFO (Eid, Ename, Did, Cid, Salary, Experience) VALUES
(1, 'John Doe', 1, 1, 50000.00, 5),
(2, 'Jane Smith', 2, 2, 75000.00, 8),
(3, 'Mike Johnson', 3, 3, 60000.00, 3),
(4, 'Alice Brown', 4, 4, 45000.00, 2),
(5, 'Bob Green', 5, 5, 40000.00, 4);
select * from emp_info
--2.Insert 5 records in each table. 
insert into Country_INFO values(6,'Brazil')
--3. Display employeename, departmentname, Salary, Experience, City, District, State and country of all employees. 
select e.Ename,d.Dname,e.salary,e.experience,c.Cname,di.Dname,s.Sname,co.Cname
from Emp_info e join Dept_INFO d
on e.Did=d.Did join
City_INFO c
on d.Did=c.Did join
District_INFO di
on c.Did=di.Did join
State_INFO s 
on di.Sid=s.Sid join
Country_INFO co
on s.Cid=co.Cid