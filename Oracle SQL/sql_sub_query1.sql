--1. SCOTT�� �޿����� ���� ����� ������ �����ȣ, �̸�, ������, �޿��� ���
SELECT sal
FROM emp
WHERE ename = 'SCOTT';

SELECT empno, ename, job, sal
FROM emp
WHERE sal>(SELECT sal FROM emp WHERE ename='SCOTT');

--2. 30�� �μ��� �ּ� �޿����� ���μ��� �ּ� �޿��� ���� �μ��� ���
SELECT min(sal) min
FROM emp
WHERE deptno = '30';

SELECT deptno
FROM emp
GROUP BY deptno
HAVING min(sal) >(select min(sal) from emp where deptno =30);

--3. �������� ��� �޿� �߿��� ���� ���� �޿��� ���� ������ ���
select job
from emp
group by job
having avg(sal) = (select min(avg(sal)) from emp group by job);

--4. �����ȣ�� 7521�� ������ ���� ��� 7934�� �������� �޿��� ���� �޴� ����� ������ ���
select *
from emp
where job = (select job from emp where empno = 7521)
and sal > (select sal from emp where empno = 7934);

--5. 'WARD'�� �μ��� ������ ���� ��� ��� ���
select ename
from emp
where deptno = (select deptno from emp where ename = 'WARD')
and job = (select job from emp where ename = 'WARD');
