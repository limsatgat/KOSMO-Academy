--1. �����ں��� ���� �Ի��� ����� ���� �̸�, �Ի���, ������ �̸�, ������ �Ի����� ���
SELECT e1.ename ���, e1.hiredate �Ի�, e2.ename ������, e2.hiredate ����
FROM emp e1 INNER JOIN emp e2
ON e1.mgr = e2.empno
WHERE e1.hiredate < e2.hiredate;

--2. ����� ��L���ڰ� �ִ� ����� ���� �̸�, ����, �μ���, ��ġ�� ���
SELECT e.ename �̸�, e.job ����, d.dname �μ���, d.loc ��ġ
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE e.ename like '%L%';

--3. �Ʒ��� ����� ��� ( �����ڰ� ���� KING�� �����Ͽ� ��� ����� ��� )
--��� ����� �Ŵ������ �Ŵ�����
--7839 KING
--7698 BLAKE 7839 KING 
--7782 CLARK 7839 KING
SELECT e.empno ���, e.ename �����, m.empno �Ŵ������, m.ename �Ŵ�����
FROM emp e LEFT OUTER JOIN emp m
ON e.mgr = m.empno;

--------------------------------------------------------------------------------
SELECT max(sal)
FROM emp;

-- ������ ���� ���� ����� ���� ��ȸ
SELECT *
FROM emp
where sal = (SELECT MAX(sal) from emp);

-- ��� �޿����� ���� �ִ� �޿����� ���� ������ �޴� ����� ������ ��ȸ
SELECT round(avg(sal))
FROM emp;

SELECT max(sal);
FROM emp;

SELECT *
FROM emp
WHERE sal>(SELECT avg(sal) FROM emp) and sal<(SELECT max(sal) FROM emp);

SELECT e.*
FROM emp e, (SELECT avg(sal) avg, max(sal) max FROM emp) ext
WHERE e.sal > ext.avg and e.sal < ext.max;

-- ���޼����� ���� 10���� ����� ���
SELECT e.*
FROM ( SELECT * FROM emp 
        ORDER BY sal DESC NULLS LAST ) e
WHERE rownum <=10;
-- ������ �Ŀ� �̱� (����������)
