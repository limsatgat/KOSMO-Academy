--1. Zlotkey�� ������ �μ��� ���� ��� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�. Zlotkey�� �����Ͻʽÿ�.
SELECT FIRST_NAME||LAST_NAME name,HIRE_DATE hire_date
FROM employees
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM employees WHERE last_name = 'Zlotkey') and LAST_NAME != 'Zlotkey';

--2. �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��ϰ� ����� �޿��� ���� ������������ �����Ͻʽÿ�.
SELECT EMPLOYEE_ID ���, FIRST_NAME||LAST_NAME �̸�
FROM employees
WHERE SALARY > (SELECT avg(SALARY) avg FROM employees)
ORDER BY SALARY DESC;

--3. �̸��� u�� ���Ե� ����� ���� �μ����� ���ϴ� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�.
SELECT EMPLOYEE_ID ���, FIRST_NAME||LAST_NAME �̸�
FROM employees
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE (FIRST_NAME||LAST_NAME) LIKE '%u%');

--4. �μ� ��ġ ID�� 1700�� ��� ����� �̸�, �μ� ��ȣ �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT FIRST_NAME||LAST_NAME �̸�, DEPARTMENT_ID �μ���ȣ, JOB_ID ����ID
FROM employees
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE LOCATION_ID = 1700);

--5. King���� �����ϴ� ��� ����� �̸��� �޿��� ǥ���Ͻʽÿ�.
SELECT FIRST_NAME||LAST_NAME ������, SALARY �޿�
FROM EMPLOYEES
WHERE MANAGER_ID in (SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE LAST_NAME = 'King');

--6. Executive �μ��� ��� ����� ���� �μ� ��ȣ, �̸� �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT DEPARTMENT_ID, FIRST_NAME||LAST_NAME �̸�, JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Executive');

--7. ��� �޿����� ���� �޿��� �ް� �̸��� u�� ���Ե� ����� ���� �μ����� �ٹ��ϴ� ��� ����� ��� ��ȣ, �̸� �� �޿��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�.
SELECT EMPLOYEE_ID ���, FIRST_NAME||LAST_NAME �̸�, SALARY �޿�
FROM EMPLOYEES
WHERE SALARY > (SELECT avg(SALARY) FROM EMPLOYEES) and DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE LAST_NAME LIKE '%u%' );
