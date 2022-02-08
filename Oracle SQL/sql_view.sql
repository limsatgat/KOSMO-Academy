CREATE OR REPLACE VIEW v_emp AS
    SELECT empno, ename, deptno FROM emp
    WITH READ ONLY; -- ���� ���̺� ������ ���� ���� '�б�����' �Ӽ�
    
SELECT * FROM v_emp;
SELECT * FROM emp;
DESC v_emp;

INSERT INTO v_emp(empno, ename, deptno) VALUES (1000, 'ȫ����', 20);

INSERT INTO v_emp(empno, ename, deptno) VALUES (1000, '�Ѹ�', 20);  -- pk �� �ɸ�
INSERT INTO v_emp(empno, ename, deptno) VALUES (1001, '�Ѹ�', 50);  -- fk �� �ɸ�

DELETE FROM v_emp WHERE empno = 1000;

CREATE OR REPLACE VIEW EMP_30 AS
    SELECT empno EMP_NO, ename NAME, SAL SALARY FROM emp
    WHERE deptno = 30;

SELECT * FROM emp_30;

--���� ��
Create or replace view v_emp_info as
    select e.empno empno, e.ename ename, d.dname dname 
    from emp e, dept d
    where e.deptno=d.deptno;

SELECT * FROM v_emp_info;

INSERT INTO v_emp_info(empno, ename) VALUES (9999, '�谡');
DELETE FROM v_emp_info WHERE empno = 9999;

CREATE VIEW V_DEPT_SUM as
    SELECT dname �μ���, min(sal) �ּұ޿�, max(sal) �ִ�޿�, ROUND(avg(sal)) ��ձ޿�
    FROM emp e, dept d
    WHERE e.deptno=d.deptno
    GROUP BY dname;

SELECT * FROM v_dept_sum;

UPDATE emp SET sal=10000 WHERE empno=7788;

CREATE SEQUENCE seq_temp;

SELECT seq_temp.NEXTVAL FROM dual;
SELECT seq_temp.CURRVAL FROM dual;

CREATE TABLE TEMP(
    no number primary key,
    name varchar(20),
    indate date
    );
-- ������ : ����Ŭ�� �ڵ� ���� �� : seq_(tabel)_(column)
-- 10000������ �����ؼ� 100���� ����
CREATE SEQUENCE seq_temp_no
    increment by 100
    start with 10000;
    
INSERT INTO temp VALUES (seq_temp_no.nextval, 'ȫ�浿', sysdate);
SELECT * FROM temp;

select empno, ename, job, rowid from emp;