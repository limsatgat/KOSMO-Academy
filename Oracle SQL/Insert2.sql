create table stat_salary (
    stat_date date not null,        -- ��¥
    dept_no number,                 -- �μ�
    emp_count number,               -- ��� ��
    tot_salary number,              -- �޿��Ѿ�
    avg_salary number               -- ���
    );
    
-- INSERT ������ SELECT������ �����ֱ� ����
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
                                            
-- �μ����� 'SALES'�� ����� ������ ����
SELECT deptno FROM dept WHERE dname = 'SALES';

DELETE FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES');

rollback;