--1. 관리자보다 먼저 입사한 사원에 대해 이름, 입사일, 관리자 이름, 관리자 입사일을 출력
SELECT e1.ename 사원, e1.hiredate 입사, e2.ename 관리자, e2.hiredate 관사
FROM emp e1 INNER JOIN emp e2
ON e1.mgr = e2.empno
WHERE e1.hiredate < e2.hiredate;

--2. 사원명에 ‘L’자가 있는 사원에 대해 이름, 업무, 부서명, 위치를 출력
SELECT e.ename 이름, e.job 업무, d.dname 부서명, d.loc 위치
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE e.ename like '%L%';

--3. 아래의 결과를 출력 ( 관리자가 없는 KING을 포함하여 모든 사원을 출력 )
--사번 사원명 매니저사번 매니저명
--7839 KING
--7698 BLAKE 7839 KING 
--7782 CLARK 7839 KING
SELECT e.empno 사번, e.ename 사원명, m.empno 매니저사번, m.ename 매니저명
FROM emp e LEFT OUTER JOIN emp m
ON e.mgr = m.empno;

--------------------------------------------------------------------------------
SELECT max(sal)
FROM emp;

-- 월급이 가장 많은 사원의 정보 조회
SELECT *
FROM emp
where sal = (SELECT MAX(sal) from emp);

-- 평균 급여보다 높고 최대 급여보다 낮은 월급을 받는 사원의 정보를 조회
SELECT round(avg(sal))
FROM emp;

SELECT max(sal);
FROM emp;

SELECT *
FROM emp
WHERE sal>(SELECT avg(sal) FROM emp) and sal<(SELECT max(sal) FROM emp);

SELECT e.*
FROM emp e, (SELECT avg(sal) avg, max(sal) max FROM emp) ext
WHERE e.sal > ext.avg and e.sal < ext.max;

-- 월급순으로 상위 10명의 명단을 출력
SELECT e.*
FROM ( SELECT * FROM emp 
        ORDER BY sal DESC NULLS LAST ) e
WHERE rownum <=10;
-- 정렬한 후에 뽑기 (누락값있음)
