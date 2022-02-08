create table stat_salary (
    stat_date date not null,        -- 날짜
    dept_no number,                 -- 부서
    emp_count number,               -- 사원 수
    tot_salary number,              -- 급여총액
    avg_salary number               -- 평균
    );
    
-- INSERT 문에도 SELECT문으로 정보넣기 가능
INSERT INTO stat_salary(stat_date, dept_no)
    SELECT sysdate, deptno FROM dept;
    
SELECT count(*), sum(sal), ROUND(avg(sal))
FROM emp
GROUP BY deptno;

SELECT * FROM stat_salary;

UPDATE stat_salary
SET (emp_count, tot_salary, avg_salary) = ( SELECT count(*), sum(sal), ROUND(avg(sal))
                                            FROM emp
                                            WHERE emp.deptno = stat_salary.dept_no
                                            GROUP BY deptno);
                                            
-- 부서명이 'SALES'인 사원의 정보를 삭제
SELECT deptno FROM dept WHERE dname = 'SALES';

DELETE FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES');

rollback;