-- @ @ @ ��������
--������̺��� ������ �μ����̺��� �μ����� ����Ͻÿ�
SELECT ename, dname, emp.deptno
FROM emp, dept
WHERE emp.deptno = dept.deptno;
-- WHERE ������ ������ ����� ���̺��� �����ϸ�
-- SELECT ������ �ߺ��� �μ��� �տ� ����� ���̺�� �ٿ�����.

-- ��Ī �ο� , AS ���Ұ�
SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d --��Ī
WHERE e.deptno = d.deptno;

-- ����� ��������
SELECT e.ename, d.dname, d.deptno
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, d.deptno
FROM emp e INNER JOIN dept d
USING (deptno); --column�� ���

SELECT e.ename, d.dname, deptno
FROM emp e
Natural JOIN dept d;
--------------------------------------------------------------------------------
-- @ @ @ �ܺ����� // �ݴ��ʿ� �����Ͱ� ��� ��°���
SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno = d.deptno(+); -- ���Ҽ��� �ҷ���(���Ի��)

SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno; -- �Ҽӿ� ���� �μ��� �ҷ���(Operation)

SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno(+);

-- ����� �ܺ�����
SELECT e.ename, d.dname, e.deptno
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, e.deptno
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, e.deptno
FROM emp e FULL OUTER JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------------------
-- @ @ ��������
SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e, emp e2
WHERE e.mgr = e2.empno(+);

SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e INNER JOIN emp e2
ON e.mgr = e2.empno;

SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e LEFT OUTER JOIN emp e2
ON e.mgr = e2.empno;
--------------------------------------------------------------------------------
--JONES ���� �޿��� �� ���� ���� �̸� ���
SELECT e1.ename, e1.sal, e2.ename, e2.sal
FROM emp e1, emp e2
WHERE e1.ename='JONES' AND e1.sal < e2.sal;

SELECT e1.ename, e1.sal, e2.ename, e2.sal
FROM emp e1 INNER JOIN emp e2
ON e1.ename='JONES' AND e1.sal < e2.sal;
--------------------------------------------------------------------------------
-- ������ CLERK�� �����ȸ
-- 10�� �μ��� ��� ��ȸ
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
MINUS--UNION --����(SET) > UNION, UNION ALL, INTERSECT, MINUS
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
