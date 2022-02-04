--1. EMP ���̺��� �����ȣ, �̸�, ����, �μ���ȣ�� DEPT ���̺��� �μ���, �ٹ����� ���
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;
??
--2. SALESMAN ����� �����ȣ, �̸�, �޿�, �μ���, �ٹ����� ���
SELECT e.empno,e.job,e.ename,e.sal,d.DNAME,d.LOC
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE e.job = 'SALESMAN'; 

--3. ���ʽ�(comm)�� �޴� ����� ���� �̸�, �μ���, ��ġ�� ���
?SELECT e.ename,d.DNAME,d.LOC,e.comm
FROM emp e left outer join dept d
ON e.deptno = d.deptno
WHERE e.comm is not null and e.comm <> 0;

--4. �μ��� �μ���� �޿� �հ踦 ���
SELECT d.dname �μ���, sum(sal) �޿��հ�
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
GROUP BY d.dname;
?
-- 5. ������ ��MANAGER���� ����� ������ �̸�, ����, �μ���, �ٹ����� ��� 
SELECT e.ename �̸�, e.job ����, d.dname �μ���, d.loc �ٹ���
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE e.job = 'MANAGER';