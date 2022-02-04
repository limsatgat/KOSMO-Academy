--������, �μ��� �޿� �հ�� �ο����� ����ϵ�, 10�� �μ��� �����ϰ� ������ 'SALESMAN'�� 'MANAGER'�� ����Ѵ�.
SELECT JOB, DEPTNO, sum(sal) sum, count(*) num
FROM emp
WHERE job in ('SALESMAN', 'MANAGER') and DEPTNO in (20, 30)
GROUP BY JOB, DEPTNO;
--HAVING deptno!=10 and jon in ('SALESMAN', 'MANAGER')

--�������� ��� �޿��� �ִ�޿��� ����ϵ�, ��ձ޿��� 2000�̻��� �͸� ����ϰ� ��ձ޿��� ���� ������ ����
SELECT deptno, round(avg(sal)) avg, max(sal) max
FROM emp
GROUP BY deptno
having avg(sal) >= 2000
ORDER BY avg desc;

--5���� �޿� �հ�� �ο����� ��� (rownum)�̿�
SELECT sum(sal) �޿��հ�, count(*) �ο���, ceil(rownum/5) �׷�
FROM emp
GROUP BY ceil(rownum/5);

--���� �Ի�⵵ ���� �ο����� ���
SELECT TO_CHAR(hiredate, 'YYYY"��"') YEAR, count(*) �ο�
FROM emp
GROUP BY TO_CHAR(hiredate, 'YYYY"��"');

--������ ���� ���
SELECT COUNT(decode(JOB, 'CLERK', 1)) AS CLERK,
COUNT(decode(JOB, 'SALESMAN', 1)) AS SALESMAN,
COUNT(decode(JOB, 'MANAGER', 1)) AS MANAGER
FROM emp;


--������ ���� ���
SELECT JOB ������, COUNT(DECODE(DEPTNO, '10', 1)) �μ�10,
COUNT(DECODE(DEPTNO, '20', 1)) �μ�20, COUNT(DECODE(DEPTNO, '30', 1)) �μ�30,
SUM(sal) �޿��հ�
FROM emp
GROUP BY JOB;
--SLELECT JOB ������, COUNT(CASE DEPTNO WHEN 10 THEN 1 END) �μ�10,
--COUNT(CASE DEPTNO WHEN 20 THEN 1 END) �μ�20,
--COUNT(CASE DEPTNO WHEN 30 THEN 1 END) �μ�30,
--SUM(sal) �޿��հ�
--FRO emp
--GROUP BY JOB;