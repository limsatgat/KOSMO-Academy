--1. SCOTT의 급여보다 많은 사원의 정보를 사원번호, 이름, 담당업무, 급여를 출력
SELECT sal
FROM emp
WHERE ename = 'SCOTT';

SELECT empno, ename, job, sal
FROM emp
WHERE sal>(SELECT sal FROM emp WHERE ename='SCOTT');

--2. 30번 부서의 최소 급여보다 각부서의 최소 급여가 높은 부서를 출력
SELECT min(sal) min
FROM emp
WHERE deptno = '30';

SELECT deptno
FROM emp
GROUP BY deptno
HAVING min(sal) >(select min(sal) from emp where deptno =30);

--3. 업무별로 평균 급여 중에서 가장 적은 급여를 가진 직업을 출력
select job
from emp
group by job
having avg(sal) = (select min(avg(sal)) from emp group by job);

--4. 사원번호가 7521의 업무와 같고 사번 7934인 직원보다 급여를 많이 받는 사원의 정보를 출력
select *
from emp
where job = (select job from emp where empno = 7521)
and sal > (select sal from emp where empno = 7934);

--5. 'WARD'와 부서와 업무가 같은 사원 명단 출력
select ename
from emp
where deptno = (select deptno from emp where ename = 'WARD')
and job = (select job from emp where ename = 'WARD');
