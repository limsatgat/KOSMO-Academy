--1. Zlotkey와 동일한 부서에 속한 모든 사원의 이름과 입사일을 표시하는 질의를 작성하십시오. Zlotkey는 제외하십시오.
SELECT FIRST_NAME||LAST_NAME name,HIRE_DATE hire_date
FROM employees
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM employees WHERE last_name = 'Zlotkey') and LAST_NAME != 'Zlotkey';

--2. 급여가 평균 급여보다 많은 모든 사원의 사원 번호와 이름을 표시하는 질의를 작성하고 결과를 급여에 대해 오름차순으로 정렬하십시오.
SELECT EMPLOYEE_ID 사번, FIRST_NAME||LAST_NAME 이름
FROM employees
WHERE SALARY > (SELECT avg(SALARY) avg FROM employees)
ORDER BY SALARY DESC;

--3. 이름에 u가 포함된 사원과 같은 부서에서 일하는 모든 사원의 사원 번호와 이름을 표시하는 질의를 작성하십시오.
SELECT EMPLOYEE_ID 사번, FIRST_NAME||LAST_NAME 이름
FROM employees
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE (FIRST_NAME||LAST_NAME) LIKE '%u%');

--4. 부서 위치 ID가 1700인 모든 사원의 이름, 부서 번호 및 업무 ID를 표시하십시오.
SELECT FIRST_NAME||LAST_NAME 이름, DEPARTMENT_ID 부서번호, JOB_ID 업무ID
FROM employees
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE LOCATION_ID = 1700);

--5. King에게 보고하는 모든 사원의 이름과 급여를 표시하십시오.
SELECT FIRST_NAME||LAST_NAME 보고자, SALARY 급여
FROM EMPLOYEES
WHERE MANAGER_ID in (SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE LAST_NAME = 'King');

--6. Executive 부서의 모든 사원에 대한 부서 번호, 이름 및 업무 ID를 표시하십시오.
SELECT DEPARTMENT_ID, FIRST_NAME||LAST_NAME 이름, JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Executive');

--7. 평균 급여보다 많은 급여를 받고 이름에 u가 포함된 사원과 같은 부서에서 근무하는 모든 사원의 사원 번호, 이름 및 급여를 표시하는 질의를 작성하십시오.
SELECT EMPLOYEE_ID 사번, FIRST_NAME||LAST_NAME 이름, SALARY 급여
FROM EMPLOYEES
WHERE SALARY > (SELECT avg(SALARY) FROM EMPLOYEES) and DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE LAST_NAME LIKE '%u%' );
