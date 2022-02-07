-- 업무별로 최소 급여를 받는 사원의 정보를 사원번호, 이름, 담당업무, 급여를 출력
SELECT min(sal) min
FROM emp
GROUP by job;

SELECT empno,ename, job, sal
FROM emp
WHERE (job,sal) IN (SELECT job, min(sal) FROM emp GROUP BY job);
-- job을 제외하고 작성하면 같은 clerk 부서의 홍길동이 나옴

UPDATE emp set job='clerk', sal=1250 where ename='홍길동';
-- 10번 부서 사원들의 업무와 동일한 직원들 검색
SELECT *
FROM emp
--WHERE job = ANY (SELECT job FROM emp WHERE deptno='10');
WHERE job IN (SELECT job FROM emp WHERE deptno='10');

-- 적어도 한명의 사원으로부터 보고를 받을 수 있는 사원의 정보를 사원번호, 이름, 업무를 출력
SELECT e.empno, e.ename, e.job
FROM emp e 
WHERE exists (SELECT * FROM emp e2 WHERE e.empno = e2.mgr);
--WHERE not exists (SELECT * FROM emp e2 WHERE e.empno = e2.mgr);