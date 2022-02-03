--사원번호, 이름, 업무, 급여, 현재 급여에 15%증가된 급여를(New Salary), 증가액(Increase)를 출력
SELECT empno, ename, job, sal, (sal*1.15) AS newSalary, (sal*1.15 - sal) AS Increase
FROM emp;

--이름, 입사일, 입사일로부터 6개월 후에 돌아오는 월요일을 출력
SELECT ename, hiredate, next_day(add_months(hiredate, 6), '월') as "정규직전환"
FROM emp;

--이름, 입사일, 입사일로부터 현재까지의 년수, 급여, 입사일로부터 현재까지의 급여의 총계를 출력
SELECT ename, hiredate, trunc(ceil(sysdate - hiredate)/365) AS "근속년수",
sal "급여",
sal*(trunc(ceil(sysdate - hiredate)/365))AS "총 급여"
FROM emp;

--이름, 업무, 입사일, 입사한 요일을 출력
SELECT ename, job, hiredate, to_char(hiredate, 'DAY') "입사요일"
FROM emp;

--모든 사원의 이름과 급여를 출력
SELECT ename, LPAD(sal, 15, '*') 급여
FROM emp;

--6번의 결과처럼 출력하기
SELECT ename || ' earns' || to_char(sal, '$999,999.99') || ' monthly but wants ' || to_char(sal*3, '$999,999.99') as want
--SELECT ename, job, sal, TO_CHAR(ename "earns" sal 'monthly' 'but' wants 'wants') CASE ENAME
--WHEN 'KING' THEN sal*3
--WHEN 'BLAKE' THEN sal*3
--WHEN 'CLARK' THEN sal*3
--else sal*1
--END as wants
FROM EMP;