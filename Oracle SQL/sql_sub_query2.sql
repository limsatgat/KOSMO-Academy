-- �������� �ּ� �޿��� �޴� ����� ������ �����ȣ, �̸�, ������, �޿��� ���
SELECT min(sal) min
FROM emp
GROUP by job;

SELECT empno,ename, job, sal
FROM emp
WHERE (job,sal) IN (SELECT job, min(sal) FROM emp GROUP BY job);
-- job�� �����ϰ� �ۼ��ϸ� ���� clerk �μ��� ȫ�浿�� ����

UPDATE emp set job='clerk', sal=1250 where ename='ȫ�浿';
-- 10�� �μ� ������� ������ ������ ������ �˻�
SELECT *
FROM emp
--WHERE job = ANY (SELECT job FROM emp WHERE deptno='10');
WHERE job IN (SELECT job FROM emp WHERE deptno='10');

-- ��� �Ѹ��� ������κ��� ���� ���� �� �ִ� ����� ������ �����ȣ, �̸�, ������ ���
SELECT e.empno, e.ename, e.job
FROM emp e 
WHERE exists (SELECT * FROM emp e2 WHERE e.empno = e2.mgr);
--WHERE not exists (SELECT * FROM emp e2 WHERE e.empno = e2.mgr);