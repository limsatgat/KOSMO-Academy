--�����ȣ, �̸�, ����, �޿�, ���� �޿��� 15%������ �޿���(New Salary), ������(Increase)�� ���
SELECT empno, ename, job, sal, (sal*1.15) AS newSalary, (sal*1.15 - sal) AS Increase
FROM emp;

--�̸�, �Ի���, �Ի��Ϸκ��� 6���� �Ŀ� ���ƿ��� �������� ���
SELECT ename, hiredate, next_day(add_months(hiredate, 6), '��') as "��������ȯ"
FROM emp;

--�̸�, �Ի���, �Ի��Ϸκ��� ��������� ���, �޿�, �Ի��Ϸκ��� ��������� �޿��� �Ѱ踦 ���
SELECT ename, hiredate, trunc(ceil(sysdate - hiredate)/365) AS "�ټӳ��",
sal "�޿�",
sal*(trunc(ceil(sysdate - hiredate)/365))AS "�� �޿�"
FROM emp;

--�̸�, ����, �Ի���, �Ի��� ������ ���
SELECT ename, job, hiredate, to_char(hiredate, 'DAY') "�Ի����"
FROM emp;

--��� ����� �̸��� �޿��� ���
SELECT ename, LPAD(sal, 15, '*') �޿�
FROM emp;

--6���� ���ó�� ����ϱ�
SELECT ename || ' earns' || to_char(sal, '$999,999.99') || ' monthly but wants ' || to_char(sal*3, '$999,999.99') as want
--SELECT ename, job, sal, TO_CHAR(ename "earns" sal 'monthly' 'but' wants 'wants') CASE ENAME
--WHEN 'KING' THEN sal*3
--WHEN 'BLAKE' THEN sal*3
--WHEN 'CLARK' THEN sal*3
--else sal*1
--END as wants
FROM EMP;