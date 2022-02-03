SELECT empno, ename From emp;

-- ��µ� �Ϳ� ��ȣ�� ���̰� 5 ������ �����͸� ���
SELECT rownum, empno, ename From emp WHERE rownum <=5;

DESC emp;

--������ 'SALESMAN'�� ������� ������ ���, ����, �ּҰ�, �ִ밪 ���ϱ�
SELECT avg(sal) avg, sum(sal) sum, min(sal) min, max(sal) max
FROM emp
WHERE JOB = 'SALESMAN';

--Ŀ�̼��� �޴� ������� ����
SELECT count(COMM) count
FROM emp
WHERE COMM IS NOT NULL and COMM !=0;

--------------------------------------------------------------------------------
--�μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϱ�
SELECT deptno, count(empno) cnt, trunc(avg(sal)) avg, min(sal) min, max(sal) max, sum(sal) sum
FROM emp
GROUP BY deptno;

--�μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϰ� �μ��� �޿��� ���� ���� ������ ����
SELECT deptno, count(empno) cnt, trunc(avg(sal)) avg, min(sal) min, max(sal) max, sum(sal) sum
FROM emp
GROUP BY deptno
ORDER BY sum desc;

--�ִ� �޿��� 2900 �̻��� �μ��� ���� �μ���ȣ, ��� �޿�, �޿��� ���� ���
SELECT deptno, ROUND(avg(sal)) avg, sum(sal) sum
FROM emp
GROUP by deptno
HAVING max(sal) >=2900;

--������ �޿��� ����� 3000 �̻��� ������ ���� ������, ��� �޿�, �޿��� ���� ���
SELECT job, ROUND(avg(sal)) avg, sum(sal) sum
FROM emp
GROUP BY job
HAVING avg(sal) >= 3000;

-- ��ü �հ� �޿��� 5000�� �ʰ��ϴ� �� ������ ���ؼ� ������ �޿� �հ踦 ���
-- ��, SALESMAN�� �����ϰ� �޿� �հ谡 ���� ������ ����
SELECT job, sum(sal) sum
FROM emp
where job in ('ANALYST', 'MANAGER')
GROUP BY job
HAVING sum(sal) > 5000
ORDER BY sum ASC;

-- ������ �ְ� �޿��� �ּ� �޿��� ���̸� ���϶�
SELECT job, (max(sal) - min(sal)) gap
FROM emp
GROUP BY job;

-- �μ� �ο��� 4���� ���� �μ��� �μ���ȣ �ο���, �޿��� ���� ���
SELECT deptno, count(deptno) person_num, sum(sal) sum
FROM emp
GROUP BY deptno
HAVING count(deptno) > 4;