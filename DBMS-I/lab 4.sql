----AAAA-----ALTER----
--1. Add two more columns City VARCHAR (20) and Pincode INT.
ALTER TABLE DEPOSIT ADD CITY VARCHAR(50),PINCODE INT
SELECT * FROM DEPOSIT

--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
ALTER TABLE DEPOSIT ALTER COLUMN CITY VARCHAR(35)

--3. Change the data type DECIMAL to INT in amount Column.
ALTER TABLE DEPOSIT ALTER COLUMN AMOUNT INT

--4. Rename Column ActNo to ANO.
sp_rename 'DEPOSIT.ACTNO','ANO'

--5. Delete Column City from the DEPOSIT table.
ALTER TABLE DEPOSIT DROP COLUMN CITY

--6. Change name of table DEPOSIT to DEPOSIT_DETAILS.
	sp_rename 'DEPOSIT_DETAILS.ADATE','AOPENDATE'

--2. Delete Column AOPENDATE from the DEPOSIT_DETAILS table.
ALTER TABLE DEPOSIT_DETAILS DROP COLUMN AOPENDATE

--3. Rename Column CNAME to CustomerName.
ALTER TABLE STUDENT_DETAIL ADD CITY VARCHAR(20) NOT NULL DEFAULT 'MORBI',BACKLOG INT NULL 
SELECT * FROM STUDENT_DETAIL

--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
ALTER TABLE STUDENT_DETAIL ALTER COLUMN NAME VARCHAR(35)

--3. Change the data type DECIMAL to INT in CPI Column.
ALTER TABLE STUDENT_DETAIL ALTER COLUMN CPI INT

--4. Rename Column Enrollment_No to ENO.
sp_rename 'STUDENT_DETAIL.ENROLLMENT_NO','ENO'

--5. Delete Column City from the student_detail table.
--ALTER TABLE STUDENT_DETAIL DROP COLUMN CITY--

--6. Change name of table student_detail to STUDENT_MASTER.
DELETE FROM DEPOSIT_DETAILS WHERE AMOUNT>=4000
SELECT * FROM DEPOSIT_DETAILS

--2. Delete all the accounts CHANDI BRANCH.
DELETE FROM DEPOSIT_DETAILS WHERE BNAME='CHANDI'

--3. Delete all the accounts having account number (ANO) is greater than 105.
DELETE FROM DEPOSIT_DETAILS WHERE ANO>105

--4. Delete all the records of Deposit_Detail table. (Use Truncate)
TRUNCATE TABLE DEPOSIT_DETAILS

--5. Remove Deposit_Detail table. (Use Drop)
DELETE FROM EMPLOYEE_MASTER WHERE SALARY>=14000

--2. Delete all the Employees who belongs to �RAJKOT� city.
DELETE FROM EMPLOYEE_MASTER WHERE CITY='RAJKOT'

--3. Delete all the Employees who joined after 1-1-2007.
DELETE FROM EMPLOYEE_MASTER WHERE JOININGDATE>'2007-01-01'

--4. Delete the records of Employees whose joining date is null and Name is not null.
DELETE FROM EMPLOYEE_MASTER WHERE JOININGDATE IS NULL AND EMPNAME IS NOT NULL

--5. Delete the records of Employees whose salary is 50% of 20000.
DELETE FROM EMPLOYEE_MASTER WHERE SALARY=10000

--6. Delete the records of Employees whose City Name is not empty.
DELETE FROM EMPLOYEE_MASTER WHERE CITY IS NOT NULL

--7. Delete all the records of Employee_MASTER table. (Use Truncate)
TRUNCATE TABLE EMPLOYEE_MASTER

--8. Remove Employee_MASTER table. (Use Drop)
DROP TABLE EMPLOYEE_MASTER