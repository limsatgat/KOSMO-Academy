--������� �ٹ��� ���� ���� ��� ������ ���
SELECT
    ename,
    hiredate,
    round(sysdate - hiredate) AS work_days
FROM
    emp
ORDER BY
    sysdate - hiredate DESC;

--������� �ٹ��� ���� ���� ��� ������ ��¿��� NULL���� ����������
SELECT
    ename,
    hiredate,
    round(sysdate - hiredate) AS work_days
FROM
    emp
ORDER BY
    sysdate - hiredate DESC NULLS LAST;

--������� �ٹ��� ���� �� �� �� �� �ΰ��� ���
SELECT
    ename,
    hiredate,
    ceil(sysdate - hiredate)           AS "�ٹ��ϼ�",
    trunc((sysdate - hiredate) / 7)    AS "�ٹ� ��",
    ceil(mod((sysdate - hiredate), 7)) AS "�ٹ���"
FROM
    emp;


--10�� �μ��� ���� ����� ��������� �ٹ� ������ ���
SELECT
    ename,
    hiredate,
    trunc(months_between(sysdate, hiredate)) AS work_months
FROM
    emp
WHERE
    deptno = 10;

--���� ��¥���� 3���� ���� ��¥ ���ϱ�
SELECT
    add_months(sysdate, 3) AS mydate
FROM
    dual;

--���� ��¥���� ���ƿ��� '��'������ ��¥ ���ϱ�
SELECT
    next_day(sysdate, '��') AS mydate
FROM
    dual;

--���� ��¥���� ���� ������ ��¥ ���ϱ�
SELECT
    last_day(sysdate) AS mydate
FROM
    dual;

--�Ի����ڿ��� �Ի�⵵�� ���
SELECT
    ename,
    hiredate,
    to_char(hiredate, 'YYYY') AS hire_year
FROM
    emp;

--�Ի����ڸ� '1999�� 1�� 1��' �������� ���
SELECT
    ename,
    hiredate,
    to_char(hiredate, 'YYYY"��" MM"��" DD"��" HH"��" MI"��"') k_date
FROM
    emp;

--ȫ�浿 ����� �Ի����� ���� ����
UPDATE emp
SET hiredate-sysdate
WHERE ename='ȫ�浿';

--1981�⵵�� �Ի��� ��� �˻�
SELECT ename, hiredate, to_char(hiredate, 'YY"�⵵"') AS "�Ի�"
FROM emp
WHERE substr(hiredate, 0, 2) = 81;
-- SELECT ename, hiredate
-- FROM emp
-- WHERE to_char(hiredate, 'YYYY') = '1981';

--5���� �Ի��� ��� �˻�
SELECT ename, hiredate, to_char(hiredate, 'MM"��"') AS "�Ի�"
FROM emp
WHERE INSTR(hiredate, 5, 5) = 5;
-- SELECT ename, hiredate
-- FROM emp
-- WHERE to_char(hiredate, 'MM') = 05;
-- '05' x / 05 o / 5 o /'5' x

--�޿� �տ� $�� �����ϰ� 3�ڸ� ���� ,�� ��� 
SELECT ename, sal, to_char(sal, '$999,999,999,999') as "�޿�"
from emp;
