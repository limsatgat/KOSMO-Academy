CREATE OR REPLACE VIEW v_emp AS
    SELECT empno, ename, deptno FROM emp
    WITH READ ONLY; -- 원본 테이블에 영향을 막기 위해 '읽기전용' 속성
    
SELECT * FROM v_emp;
SELECT * FROM emp;
DESC v_emp;

INSERT INTO v_emp(empno, ename, deptno) VALUES (1000, '홍길자', 20);

INSERT INTO v_emp(empno, ename, deptno) VALUES (1000, '둘리', 20);  -- pk 에 걸림
INSERT INTO v_emp(empno, ename, deptno) VALUES (1001, '둘리', 50);  -- fk 에 걸림

DELETE FROM v_emp WHERE empno = 1000;

CREATE OR REPLACE VIEW EMP_30 AS
    SELECT empno EMP_NO, ename NAME, SAL SALARY FROM emp
    WHERE deptno = 30;

SELECT * FROM emp_30;

--복합 뷰
Create or replace view v_emp_info as
    select e.empno empno, e.ename ename, d.dname dname 
    from emp e, dept d
    where e.deptno=d.deptno;

SELECT * FROM v_emp_info;

INSERT INTO v_emp_info(empno, ename) VALUES (9999, '김가');
DELETE FROM v_emp_info WHERE empno = 9999;

CREATE VIEW V_DEPT_SUM as
    SELECT dname 부서명, min(sal) 최소급여, max(sal) 최대급여, ROUND(avg(sal)) 평균급여
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
-- 시퀀스 : 오라클의 자동 증가 수 : seq_(tabel)_(column)
-- 10000번부터 시작해서 100개씩 증가
CREATE SEQUENCE seq_temp_no
    increment by 100
    start with 10000;
    
INSERT INTO temp VALUES (seq_temp_no.nextval, '홍길동', sysdate);
SELECT * FROM temp;

select empno, ename, job, rowid from emp;