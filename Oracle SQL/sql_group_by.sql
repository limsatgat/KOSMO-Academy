--업무별, 부서별 급여 합계와 인원수를 출력하되, 10번 부서를 제외하고 업무가 'SALESMAN'과 'MANAGER'만 출력한다.
SELECT JOB, DEPTNO, sum(sal) sum, count(*) num
FROM emp
WHERE job in ('SALESMAN', 'MANAGER') and DEPTNO in (20, 30)
GROUP BY JOB, DEPTNO;
--HAVING deptno!=10 and jon in ('SALESMAN', 'MANAGER')

--업무별로 평균 급여와 최대급여를 출력하되, 평균급여가 2000이상인 것만 출력하고 평균급여가 높은 순으로 정렬
SELECT deptno, round(avg(sal)) avg, max(sal) max
FROM emp
GROUP BY deptno
having avg(sal) >= 2000
ORDER BY avg desc;

--5개씩 급여 합계와 인원수를 출력 (rownum)이용
SELECT sum(sal) 급여합계, count(*) 인원수, ceil(rownum/5) 그룹
FROM emp
GROUP BY ceil(rownum/5);

--같은 입사년도 별로 인원수를 출력
SELECT TO_CHAR(hiredate, 'YYYY"년"') YEAR, count(*) 인원
FROM emp
GROUP BY TO_CHAR(hiredate, 'YYYY"년"');

--다음과 같이 출력
SELECT COUNT(decode(JOB, 'CLERK', 1)) AS CLERK,
COUNT(decode(JOB, 'SALESMAN', 1)) AS SALESMAN,
COUNT(decode(JOB, 'MANAGER', 1)) AS MANAGER
FROM emp;


--다음과 같이 출력
SELECT JOB 업무명, COUNT(DECODE(DEPTNO, '10', 1)) 부서10,
COUNT(DECODE(DEPTNO, '20', 1)) 부서20, COUNT(DECODE(DEPTNO, '30', 1)) 부서30,
SUM(sal) 급여합계
FROM emp
GROUP BY JOB;
--SLELECT JOB 업무명, COUNT(CASE DEPTNO WHEN 10 THEN 1 END) 부서10,
--COUNT(CASE DEPTNO WHEN 20 THEN 1 END) 부서20,
--COUNT(CASE DEPTNO WHEN 30 THEN 1 END) 부서30,
--SUM(sal) 급여합계
--FRO emp
--GROUP BY JOB;