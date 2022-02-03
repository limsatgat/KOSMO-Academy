SELECT empno, ename From emp;

-- 출력된 것에 번호를 붙이고 5 이하인 데이터를 출력
SELECT rownum, empno, ename From emp WHERE rownum <=5;

DESC emp;

--업무가 'SALESMAN'인 사람들의 월급의 평균, 총합, 최소값, 최대값 구하기
SELECT avg(sal) avg, sum(sal) sum, min(sal) min, max(sal) max
FROM emp
WHERE JOB = 'SALESMAN';

--커미션을 받는 사람들의 수는
SELECT count(COMM) count
FROM emp
WHERE COMM IS NOT NULL and COMM !=0;

--------------------------------------------------------------------------------
--부서별로 인원수, 평균급여, 최저급여, 최고급여, 급여의 합을 구하기
SELECT deptno, count(empno) cnt, trunc(avg(sal)) avg, min(sal) min, max(sal) max, sum(sal) sum
FROM emp
GROUP BY deptno;

--부서별로 인원수, 평균급여, 최저급여, 최고급여, 급여의 합을 구하고 부서별 급여의 합이 높은 순으로 정렬
SELECT deptno, count(empno) cnt, trunc(avg(sal)) avg, min(sal) min, max(sal) max, sum(sal) sum
FROM emp
GROUP BY deptno
ORDER BY sum desc;

--최대 급여가 2900 이상인 부서에 대해 부서번호, 평균 급여, 급여의 합을 출력
SELECT deptno, ROUND(avg(sal)) avg, sum(sal) sum
FROM emp
GROUP by deptno
HAVING max(sal) >=2900;

--업무별 급여의 평균이 3000 이상인 업무에 대해 업무명, 평균 급여, 급여의 합을 출력
SELECT job, ROUND(avg(sal)) avg, sum(sal) sum
FROM emp
GROUP BY job
HAVING avg(sal) >= 3000;

-- 전체 합계 급여가 5000을 초과하는 각 업무에 대해서 업무와 급여 합계를 출력
-- 단, SALESMAN은 제외하고 급여 합계가 높은 순으로 정렬
SELECT job, sum(sal) sum
FROM emp
where job in ('ANALYST', 'MANAGER')
GROUP BY job
HAVING sum(sal) > 5000
ORDER BY sum ASC;

-- 업무별 최고 급여와 최소 급여의 차이를 구하라
SELECT job, (max(sal) - min(sal)) gap
FROM emp
GROUP BY job;

-- 부서 인원이 4명보다 많은 부서의 부서번호 인원수, 급여의 합을 출력
SELECT deptno, count(deptno) person_num, sum(sal) sum
FROM emp
GROUP BY deptno
HAVING count(deptno) > 4;