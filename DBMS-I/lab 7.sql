CREATE TABLE EMP(
EID INT,
ENAME VARCHAR(25),
DEPARTMENT VARCHAR(25),
SALARY INT,
JOININGDATE DATETIME,
CITY VARCHAR(25)
);                                  
INSERT INTO EMP VALUES(101,'RAHUL','ADMIN',56000,'1990-JAN-1','RAJKOT'),
(102,'HARDIK','IT',18000,'1990-SEP-25','AHMEDABAD'),
(103,'BHAVIN','HR',25000,'1991-MAY-14','BARODA'),
(104,'BHOOMI','ADMIN',39000,'1991-FEB-8','RAJKOT'),
(105,'ROHIT','IT',17000,'1990-JUL-23','JAMNAGAR'),
(106,'PRIYA','IT',9000,'1990-OCT-18','AHMEDABAD'),
(107,'BHOOMI','HR',34000,'1991-DEC-25','RAJKOT')
SELECT * FROM EMP
--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MAX(SALARY) AS MAXIMUM, MIN(SALARY) AS MINIMUM  FROM EMP

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
SELECT SUM(SALARY) AS Total_Sal, AVG(SALARY) AS Average_Sal  FROM EMP

--3. Find total number of employees of EMPLOYEE table.
SELECT COUNT(EID) FROM EMP

--4. Find highest salary from Rajkot city.
SELECT MAX(SALARY) AS MAXIMUM FROM EMP WHERE CITY='RAJKOT'

--5. Give maximum salary from IT department.
SELECT MAX(SALARY) AS MAXIMUM FROM EMP WHERE DEPARTMENT='IT'

--6. Count employee whose joining date is after 8-feb-91.
SELECT COUNT(EID) FROM EMP WHERE JOININGDATE>'1991-FEB-8'

--7. Display average salary of Admin department.
SELECT  AVG(SALARY) AS Average_Sal  FROM EMP WHERE DEPARTMENT='ADMIN'

--8. Display total salary of HR department.
SELECT  SUM(SALARY) AS TOTAL  FROM EMP WHERE DEPARTMENT='HR'

--9. Count total number of cities of employee without duplication.
SELECT COUNT(DISTINCT CITY) FROM EMP 

--10. Count unique departments.
SELECT COUNT(DISTINCT DEPARTMENT) FROM EMP

--11. Give minimum salary of employee who belongs to Ahmedabad.
SELECT CITY,MIN(SALARY) AS MINIMUM FROM EMP WHERE CITY='AHMEDABAD' GROUP BY CITY

--12. Find city wise highest salary.
SELECT MAX(SALARY),CITY FROM EMP
GROUP BY CITY

--13. Find department wise lowest salary.
SELECT MIN(SALARY),DEPARTMENT FROM EMP
GROUP BY DEPARTMENT

--14. Display city with the total number of employees belonging to each city.
SELECT COUNT(EID),CITY FROM EMP
GROUP BY CITY
--15. Give total salary of each department of EMP table.
SELECT SUM(SALARY),DEPARTMENT FROM EMP
GROUP BY DEPARTMENT
--16. Give average salary of each department of EMP table without displaying the respective department
--name.SELECT AVG(SALARY) FROM EMP
GROUP BY DEPARTMENT----BBB-----1. Count the number of employees living in Rajkot.
SELECT CITY,COUNT(EID) AS NO_OF_EMP FROM EMP WHERE CITY='RAJKOT' GROUP BY CITY

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT (MAX(SALARY)-MIN(SALARY)) AS DIFFERENCE FROM EMP

--3. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(EID) AS HIRED_BEFORE_1991 FROM EMP WHERE JOININGDATE<'1991-JAN-1'

---CCC----
--1. Count the number of employees living in Rajkot or Baroda.
SELECT COUNT(EID)AS EMPLOYEE FROM EMP WHERE CITY='RAJKOT' OR CITY='BARODA'

--2. Display the total number of employees hired before 1st January, 1991 in IT department.
SELECT COUNT(EID) AS HIRED_BEFORE_1991 FROM EMP WHERE JOININGDATE<'1991-JAN-1'
GROUP BY DEPARTMENT
HAVING DEPARTMENT='IT'

--3. Find the Joining Date wise Total Salaries.
SELECT JOININGDATE,SUM(SALARY) AS TOTAL FROM EMP GROUP BY JOININGDATE

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
SELECT DEPARTMENT,CITY,MAX(SALARY) AS MAX_SAL FROM EMP WHERE CITY LIKE 'R%' GROUP BY CITY,DEPARTMENT
SELECT DEPARTMENT,CITY,MAX(SALARY) AS MAX_SAL FROM EMP  GROUP BY DEPARTMENT,CITY
SELECT DEPARTMENT,CITY,MAX(SALARY) AS MAX_SAL FROM EMP GROUP BY CITY,DEPARTMENT