--2003�⿡ �Ի��� ������� ���, �̸�, �Ի����� ���
SELECT EMPLOYEE_ID, FIRST_NAME||LAST_NAME full_name, HIRE_DATE 
FROM EMPLOYEES
WHERE to_char(HIRE_DATE, 'YY') = 03;

--������ FI_ACCOUNT / FI_MGR / SA_MAN / SA_REP�� ������� ������ ���
SELECT *
FROM EMPLOYEES
WHERE JOB_ID IN('FI_ACCOUNT','FI_MGR','SA_MAN','SA_REP');

--Ŀ�̼��� �޴� ������� ����� ���
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL and COMMISSION_PCT !=0;

--������ SA_MAM �Ǵ� SA_REP�̸� "�Ǹźμ�"�� �� �ܴ� "�� �� �μ�"��� ���
SELECT JOB_ID, CASE job_id
WHEN 'SA_MAN' THEN '�Ǹźμ�'
WHEN 'SA_REP' THEN '�Ǹźμ�'
else '�� �� �μ�'
end as �μ�
FROM EMPLOYEES 
ORDER BY �μ� DESC;
-------------------------------------------------------------------------------

--�������� �Ի��ڵ��� �ּұ޿�, �ִ�޿�, �޿��� ���� �׸��� ��� �޿��� ���Ͻÿ�.
SELECT TO_CHAR(HIRE_DATE, 'YYYY"��"') YEAR, MIN(SALARY) MIN, MAX(SALARY) MAX, SUM(SALARY) SUM, ROUND(AVG(SALARY)) AVG
FROM employees
GROUP BY TO_CHAR(HIRE_DATE, 'YYYY"��"');

--�μ��� ��� �޿��� $10,000 �̻��� �μ��� ���Ͻÿ�. (��ձ޿��� ���� ������)
SELECT DEPARTMENT_ID DID, to_char(avg(SALARY),'$999,999') avg
FROM employees
GROUP BY DEPARTMENT_ID
HAVING avg(SALARY)>='10000'
ORDER BY avg DESC;

--�μ��� �ִ� �޿��� ���Ͻÿ�.
SELECT DEPARTMENT_ID DID, max(SALARY) max
FROM employees
GROUP BY DEPARTMENT_ID
ORDER BY DID DESC NULLS LAST;