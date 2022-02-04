--1. EMP 테이블에서 사원번호, 이름, 업무, 부서번호와 DEPT 테이블에서 부서명, 근무지를 출력
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;
??
--2. SALESMAN 사원만 사원번호, 이름, 급여, 부서명, 근무지를 출력
SELECT e.empno,e.job,e.ename,e.sal,d.DNAME,d.LOC
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE e.job = 'SALESMAN'; 

--3. 보너스(comm)를 받는 사원에 대해 이름, 부서명, 위치를 출력
?SELECT e.ename,d.DNAME,d.LOC,e.comm
FROM emp e left outer join dept d
ON e.deptno = d.deptno
WHERE e.comm is not null and e.comm <> 0;

--4. 부서별 부서명과 급여 합계를 출력
SELECT d.dname 부서명, sum(sal) 급여합계
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
GROUP BY d.dname;
?
-- 5. 업무가 ‘MANAGER’인 사원의 정보를 이름, 업무, 부서명, 근무지를 출력 
SELECT e.ename 이름, e.job 업무, d.dname 부서명, d.loc 근무지
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE e.job = 'MANAGER';