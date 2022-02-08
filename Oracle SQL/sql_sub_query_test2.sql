--1. 이름에 ‘T’가 있는 사원이 근무하는 부서에서 근무하는 모든 사원에 대해 사번, 이름, 급여를 출력/ 단, 사번순으로 출력
SELECT empno, ename, sal
FROM emp
WHERE ename IN (SELECT ename FROM emp WHERE ename like '%T%')
ORDER BY empno;

--2. 부서위치가 Dallas와 NEW YORK인 모든 사원에 대해 이름, 업무, 급여를 출력
SELECT ename, job, sal
FROM emp e
WHERE deptno = ALL (SELECT deptno FROM dept WHERE LOC = 'NEW YORK' and LOC = 'DALLAS');

--3. 월급이 30번 부서의 최저 월급보다 많은 사원들을 출력
SELECT *
FROM emp
WHERE sal > (SELECT min(sal) FROM emp WHERE deptno = 30);

--4. 부서별로 월급이 평균 월급보다 높은 사원을 부서번호, 이름, 급여를 출력
SELECT e1.deptno, e1.ename, e1.sal
FROM emp e1 RIGHT OUTER JOIN (SELECT deptno, avg(sal) sal FROM emp GROUP BY deptno) e2
ON e1.deptno = e2.deptno and e1.sal > e2.sal;
--SELECT e.deptno, e.ename, e.sal
--FROM emp e
--WHERE sal > (SELECT avg(sal) FROM emp e2 WHERE e.deptno = e2.deptno);