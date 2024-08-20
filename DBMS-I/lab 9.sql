CREATE TABLE STUDENT_DATA(
RNO INT,
NAME VARCHAR(30),
CITY VARCHAR(30),
DID INT
);
CREATE TABLE ACADEMIC(
RNO INT,
SPI DECIMAL(5,2),
BKLOG INT
);
CREATE TABLE DEPARTMENT(
DID INT,
DNAME VARCHAR(30)
);
INSERT INTO STUDENT_DATA VALUES(101,'RAJU','RAJKOT',10),
(102,'AMIT','AHEMDABAD',20),
(103,'SANJAY','BARODA',40),
(104,'NEHA','RAJKOT',20),
(105,'MEERA','AHEMDABAD',30),
(106,'MAHESH','BARODA',10)
SELECT * FROM STUDENT_DATA
INSERT INTO ACADEMIC VALUES(101,8.8,0),
(102,9.2,2),
(103,7.6,1),
(104,8.2,4),
(105,7.0,2),
(106,8.9,3)
SELECT * FROM ACADEMIC
INSERT INTO DEPARTMENT VALUES(10,'COMPUTER'),
(20,'ELECTRICAL'),
(30,'MECHANICAL'),
(40,'CIVIL')
---AAA---
--1. Display details of students who are from computer department.
SELECT * FROM STUDENT_DATA WHERE DID=
(SELECT DID FROM DEPARTMENT WHERE DNAME='COMPUTER')
--2. Displays name of students whose SPI is more than 8.
SELECT NAME FROM STUDENT_DATA WHERE RNO IN
(SELECT RNO FROM ACADEMIC WHERE SPI>8)

--3. Display details of students of computer department who belongs to Rajkot city.
SELECT * FROM STUDENT_DATA WHERE DID=
(SELECT DID FROM DEPARTMENT WHERE DNAME='COMPUTER') AND CITY='RAJKOT'

--4. Find total number of students of electrical department.
SELECT COUNT(RNO) FROM STUDENT_DATA WHERE DID=
(SELECT DID FROM DEPARTMENT WHERE DNAME='ELECTRICAL')

--5. Display name of student who is having maximum SPI.
SELECT NAME FROM STUDENT_DATA WHERE RNO=
(SELECT RNO FROM ACADEMIC WHERE SPI=(SELECT MAX(SPI) FROM ACADEMIC))

--6. Display details of students having more than 1 backlog.
SELECT * FROM STUDENT_DATA WHERE RNO IN
(SELECT RNO FROM ACADEMIC WHERE BKLOG>1)

--Part – B:
--1. Display name of students who are either from computer department or from mechanical department.
SELECT NAME FROM STUDENT_DATA WHERE DID IN
(SELECT DID FROM DEPARTMENT WHERE DNAME='COMPUTER'OR DNAME='MECHANICAL')
--2. Display name of students who are in same department as 102 studying in.
SELECT NAME FROM STUDENT_DATA WHERE DID=
(SELECT DID FROM STUDENT_DATA WHERE RNO=102) AND RNO<>102
--Part – C:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.

--2. Display name of student who is having second highest SPI.
--3. Display city names whose students branch wise SPI is 9.2