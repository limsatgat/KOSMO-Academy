--(1) �޿��� 2000 �̻� 3000 ������ ����� �̸��� �����ȣ, �Ի���, �޿��� ����ϵ� �̸��� �������� �����ϼ���.
SELECT ename, eno, hiredate, salary
FROM employee
WHERE salary >= 2000 and salary <= 3000
ORDER BY ename asc;

--(2) Ŀ�̼��� NULL �� ����̸���, �Ի���, �μ���ȣ�� ����ϵ� �μ���ȣ�� ������������ �����ϵ�, �μ���ȣ�� ���� �׸��� ���� ��� �̸��� ������������ ����
SELECT ename, hiredate, dno
FROM employee
WHERE commission is null
ORDER BY dno asc, ename asc;

--(3) Ŀ�̼��� 300�̰ų� 500�̰ų� 1400�� ����� �����ȣ�� �̸�, ����, Ŀ�̼��� ����ϵ� Ŀ�̼��� �������� �����ϰ� IN �����ڸ� ����Ͽ� ���
SELECT eno, ename, salary, commission
FROM employee
WHERE commission in (300, 500, 1400)
ORDER BY commission desc;

--(4) �̸��� ù ���ڰ� 'S��' �����ϴ� ����� �̸��� ����ϼ���
SELECT ename
FROM employee
WHERE ename LIKE 'S%';

--(5) LIKE �����ڿ� ���ϵ� ī�带 ����ؼ� '81'�⵵�� �Ի����� ���� ����� �̸��� �Ի����� ����ϼ���.
SELECT ename, hiredate 
FROM employee
WHERE hiredate not like '81%';

--(6) �μ� ��ȣ�� �ߺ� ���� �� ������������ �����ؼ� ����ϼ���.
SELECT distinct dno
FROM employee
ORDER BY dno asc;

--(7) �̸��� 'A'�� 'E'�� ��� �����ϴ� ����� �̸��� ����ϼ���
SELECT ename
FROM employee
WHERE ename LIKE '%A%' and ename LIKE '%E%';

--(8) SUBSTR �Լ��� ����ؼ� 12���޿� �Ի��� ����� �����ȣ, �̸�, �Ի����� ����ϼ���.
SELECT eno, ename, hiredate
FROM employee
WHERE substr(hiredate, 4, 2)='12';

--(9) NVL �Լ��� ����ؼ� ����� ������ ����� �� ����̸�, ����, Ŀ�̼�, ������ ����ϵ� ������ ���� ������� ����ϼ���.
SELECT ename, salary, commission, (salary*12) + nvl(commission, 0) comm
FROM employee
ORDER BY comm desc;

--(10) NVL2 �Լ��� ����ؼ� ����� ������ ����ϰ� ����̸�, ����, Ŀ�̼�, ������ ����ϵ� ������ ���� �������
SELECT ename, salary, commission, nvl2(commission,salary+commission,salary*0) comm
FROM employee
ORDER BY comm desc;

--(11) ������� �޿� �Ѿ�, ��վ�, �ְ��, �ּҾ��� ����ϼ���. �� �÷��� "�޿��Ѿ�","��վ�","�ְ��","�ּҾ�"���� ��Ī
SELECT SUM(salary) �޿��Ѿ�, AVG(salary) "��վ�", MAX(salary) �ְ��, MIN(salary) �ּҾ�
FROM employee;

--(12) ���� ������ ������ ����ϼ���. ����÷��� "���� ������ ����"�� ��Ī
SELECT count(distinct job) "���� ������ ����"
FROM employee;

--(13) �� �μ��� ��� ������ ���ؼ� �μ���ȣ�� ��� ������ ����ϵ� ���� "�μ���ȣ","��տ���"���� ��Ī
SELECT dno "�μ���ȣ", avg(salary) "��� ����"
FROM employee
group by dno;

--(14) ��� ������ ������ ����� �� ( count �Լ� ���)
SELECT job, count(*)
FROM employee
group by job;

--(15) ���޺� ����� ���� �޿��� ���, �����ڸ� �� �� ���ų� ���� �޿��� 2000�̸� �׷��� ����, �޿��� ���� ������������ ���
SELECT job, min(salary) min
FROM employee
WHERE MANAGER is not null
GROUP BY job
having min(salary) > 2000
ORDER BY avg(salary) desc;

--(16) ���� ������ ����ؼ� �����ȣ�� 7788�� ����� �������� ���� ����� ����̸�, �������� ���
SELECT ename, job
FROM employee
WHERE job = (SELECT job FROM employee WHERE eno='7788');

--(17) ���� ������ ����ؼ� �������� 7499�� ������� �޿��� ���� ����� ����̸�, �������� ���
SELECT ename, job
FROM employee
WHERE SALARY > (SELECT salary FROM employee WHERE eno='7499');

--(18) ���� ������ ����ؼ� �� �μ��� �ּ� �޿��� �޴� ����� �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�.
SELECT e.ename, e.salary, e.dno
FROM employee e
WHERE (e.dno, e.salary) IN (SELECT e.dno, min(e.salary) FROM employee e GROUP BY e.dno);

--(19) ���� ������ ����ؼ� ��� �޿����� ���� ������� �����ȣ�� �̸��� ǥ���ϵ� ����� �޿��� ���ؼ� ��������
SELECT eno, ename
FROM employee
WHERE salary >= (SELECT avg(salary) FROM employee)
ORDER BY salary asc;

--(20) ���� ������ ����ؼ� 'RESARCH' �μ��� �μ���ȣ, ����̸� �� ��� ������ ǥ���Ͻÿ�.
SELECT dno, ename, job
FROM employee
WHERE dno = (SELECT deptno FROM DEPT WHERE dname = 'RESEARCH');
