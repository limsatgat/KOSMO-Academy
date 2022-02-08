--1. �̸��� ��T���� �ִ� ����� �ٹ��ϴ� �μ����� �ٹ��ϴ� ��� ����� ���� ���, �̸�, �޿��� ���/ ��, ��������� ���
SELECT empno, ename, sal
FROM emp
WHERE ename IN (SELECT ename FROM emp WHERE ename like '%T%')
ORDER BY empno;

--2. �μ���ġ�� Dallas�� NEW YORK�� ��� ����� ���� �̸�, ����, �޿��� ���
SELECT ename, job, sal
FROM emp e
WHERE deptno = ALL (SELECT deptno FROM dept WHERE LOC = 'NEW YORK' and LOC = 'DALLAS');

--3. ������ 30�� �μ��� ���� ���޺��� ���� ������� ���
SELECT *
FROM emp
WHERE sal > (SELECT min(sal) FROM emp WHERE deptno = 30);

--4. �μ����� ������ ��� ���޺��� ���� ����� �μ���ȣ, �̸�, �޿��� ���
SELECT e1.deptno, e1.ename, e1.sal
FROM emp e1 RIGHT OUTER JOIN (SELECT deptno, avg(sal) sal FROM emp GROUP BY deptno) e2
ON e1.deptno = e2.deptno and e1.sal > e2.sal;
--SELECT e.deptno, e.ename, e.sal
--FROM emp e
--WHERE sal > (SELECT avg(sal) FROM emp e2 WHERE e.deptno = e2.deptno);