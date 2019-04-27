/*查找employees表中Location——id是1400或者1100的部门员工姓名
*/

SELECT first_name FROM employees
where department_id in 
(SELECT department_id FROM departments where location_id
in (1400,1100))
/*返回其他部门中比job_id为‘it_prog’部门所有工资都低的员工的员工号 
姓名 job_id以及salary
*/
-- 主查询 
 SELECT employee_id,last_name,job_id,salary
 FROM employees e1
WHERE e1.salary<ALL
(SELECT salary
 from employees e2
 where job_id = 'IT_PROG')
 AND
job_id<>'IT_PROG';

/*
test 09

*/
-- 1.查询和Zlotkey相同部门的员工姓名和工资
SELECT CONCAT(FIRST_name,LAST_name),salary
FROM employees
WHERE department_id=
	(SELECT department_id from employees
WHERE last_name='Zlotkey');
		
--  2.查询工资比公司平均工资高的员工的员工号，姓名和工资
SELECT job_id,CONCAT(first_name,last_name),salary FROM employees
WHERE salary>(
SELECT AVG(salary) FROM employees)
-- 3. 查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资
SELECT job_id,CONCAT(first_name,last_name),salary FROM employees
WHERE 

-- 4. 查询和姓名中包含字母 u 的员工在相同部门的员工的员工号和姓名
SELECT job_id,CONCAT(first_name,last_name),salary FROM employees
WHERE department_id in
(SELECT department_id FROM employees
WHERE first_name LIKE '%u%'
OR
last_name LIKE '%u%')
-- 5. 查询在部门的 location_id 为 1700 的部门工作的员工的员工号

SELECT job_id FROM employees
where department_id=ANY (SELECT department_id  FROM departments 
where location_id=1700)

-- 6. 查询管理者是 King 的员工姓名和工资

SELECT CONCAT(first_name,last_name),salary FROM employees
WHERE manager_id=ANY(
SELECT employee_id FROM employees
WHERE last_name='K_ing')

-- 7. 查询工资最高的员工的姓名，要求 first_name 和 last_name 显示为一列，列名为 姓.名
SELECT CONCAT(first_name,last_name) FROM employees
WHERE salary>=All(
SELECT salary FROM employees
)
/*
test 10

*/
-- 1. 运行以下脚本创建表 my_employees
Create table my_employees(
Id int(10),
First_name varchar(10),
Last_name varchar(10),
Userid varchar(10),
Salary double(10,2)
)
create table users(
id int,
userid varchar(10),
department_id int
)

-- 2. 显示表 my_employees 的结构
DESC my_employees

-- 3. 向 my_employees 表中插入下列数据
INSERT INTO my_employees 
VALUES (1,'patel' ,'Ralph' ,'Rpatel', 895)
INSERT INTO my_employees 
VALUES (2,'Dancs',' Betty',' Bdancs', 860)
INSERT INTO my_employees 
VALUES (3,'Biri', 'Ben', 'Bbiri', 1100)
INSERT INTO my_employees 
VALUES (4,'Newman',' Chad',' Cnewman', 750)
INSERT INTO my_employees 
VALUES (5,'Ropeburn ','Audrey','Aropebur', 1550)
INSERT INTO my_employees 
VALUES ( null,'','' ,'', null)

-- 4. 向 users 表中插入数据
INSERT INTO users 
VALUES (1,'Rpatel', 10)
INSERT INTO users 
VALUES (2 ,'Bdancs', 10)
INSERT INTO users 
VALUES (3,' Bbiri', 20)
INSERT INTO users 
VALUES (4 ,'Cnewman', 30)
INSERT INTO users 
VALUES (null,'', null)
INSERT INTO users 
VALUES (5 ,'Aropebur', 40)

-- 5. 将 3 号员工的 last_name 修改为“drelxer”

UPDATE my_employees SET last_name = 'drelxer'
WHERE Id = 3

-- 6. 将所有工资少于 900 的员工的工资修改为 1000
UPDATE my_employees SET salary = 1000
WHERE salary<900

-- 7. 将 userid 为 Bbiri 的 user 表和 my_employees 表的记录全部删除

DELETE FROM users
WHERE Userid ='Bbiri'
DELETE FROM my_employees
WHERE Userid ='Bbiri'

-- 8.删除所有数据
DROP FROM users

-- 9.检查所作的修正

-- 10.清空表 my_employees
DELETE FROM my_employees

/*
test 11

*/

-- 1. 创建表 dept1

create table dept1(
name1 varchar(10),
id int(7),
name2 VARCHAR(28)
)

-- 2.将表 departments 中的数据插入新表 dept2 中(拷贝)

CREATE TABLE dept2 LIKE departments
INSERT INTO dept2
SELECT * FROM departments
WHERE department_id<290

-- 3. 创建表 emp5

create table emp5(
id int(7),
first_name VARCHAR(25),
last_name VARCHAR(25),
dept_id int(7)
)
-- 4. 将列 Last_name 的长度增加到 50
ALTER TABLE emp5
MODIFY COLUMN last_name VARCHAR(50)


-- 5. 根据表 employees 创建 employees2
CREATE TABLE employees2 LIke employees


-- 6. 删除表 emp5

DROP FROM emp5

-- 7. 将表 employees2 重命名为 emp5


RENAME TABLE employees2 TO emp5;

-- 8 在表 dept 和 emp5 中添加新列 test_column，并检查所作的操作

ALTER TABLE dept1 
ADD test_column VARCHAR(20)

-- 9.直接删除表 emp5 中的列 dept_id

ALTER TABLE emp5
DROP COLUMN dept_id

/*
test 12

*/

-- 1. 向表 emp2 的 id 列中添加 PRIMARY KEY 约束（my_emp_id_pk）
-- 主键约束
ALTER TABLE emp2
CONSTRAINT emp2_my_emp_id_pk PRIMARY KEY(id)

-- 2. 向表 dept2 的 id 列中添加 PRIMARY KEY 约束（my_dept_id_pk）
ALTER TABLE dept2 
CONSTRAINT dept2_my_dept_id_pk PRIMARY KEY(id)


-- 3. 向表 emp2 中添加列 dept_id，并在其中定义 FOREIGN KEY 约束，与之相关联的列是
-- dept2 表中的 id 列。









