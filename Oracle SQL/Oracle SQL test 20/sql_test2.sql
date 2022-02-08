--(1) 급여가 2000 이상 3000 이하인 사원의 이름과 사원번호, 입사일, 급여를 출력하되 이름을 오름차순 정렬하세요.
SELECT ename, eno, hiredate, salary
FROM employee
WHERE salary >= 2000 and salary <= 3000
ORDER BY ename asc;

--(2) 커미션이 NULL 인 사원이름과, 입사일, 부서번호를 출력하되 부서번호를 오름차순으로 정려하되, 부서번호가 같은 항목이 있을 경우 이름을 오름차순으로 정렬
SELECT ename, hiredate, dno
FROM employee
WHERE commission is null
ORDER BY dno asc, ename asc;

--(3) 커미션이 300이거나 500이거나 1400인 사원의 사원번호와 이름, 월급, 커미션을 출력하되 커미션을 내림차순 정렬하고 IN 연산자를 사용하여 출력
SELECT eno, ename, salary, commission
FROM employee
WHERE commission in (300, 500, 1400)
ORDER BY commission desc;

--(4) 이름의 첫 글자가 'S로' 시작하는 사원의 이름을 출력하세요
SELECT ename
FROM employee
WHERE ename LIKE 'S%';

--(5) LIKE 연산자와 와일드 카드를 사용해서 '81'년도에 입사하지 않은 사원의 이름과 입사일을 출력하세요.
SELECT ename, hiredate 
FROM employee
WHERE hiredate not like '81%';

--(6) 부서 번호를 중복 제거 후 오름차순으로 정렬해서 출력하세요.
SELECT distinct dno
FROM employee
ORDER BY dno asc;

--(7) 이름에 'A'와 'E'를 모두 포함하는 사원의 이름을 출력하세요
SELECT ename
FROM employee
WHERE ename LIKE '%A%' and ename LIKE '%E%';

--(8) SUBSTR 함수를 사용해서 12월달에 입사한 사원의 사원번호, 이름, 입사일을 출력하세요.
SELECT eno, ename, hiredate
FROM employee
WHERE substr(hiredate, 4, 2)='12';

--(9) NVL 함수를 사용해서 사원의 연봉을 계산한 뒤 사원이름, 월급, 커미션, 연봉을 출력하되 연봉이 많은 순서대로 출력하세요.
SELECT ename, salary, commission, (salary*12) + nvl(commission, 0) comm
FROM employee
ORDER BY comm desc;

--(10) NVL2 함수를 사용해서 사원의 연봉을 계싼하고 사원이름, 월급, 커미션, 연봉을 출력하되 연봉이 많은 순서대로
SELECT ename, salary, commission, nvl2(commission,salary+commission,salary*0) comm
FROM employee
ORDER BY comm desc;

--(11) 사원들의 급여 총액, 평균액, 최고액, 최소액을 출력하세요. 각 컬럼을 "급여총액","평균액","최고액","최소액"으로 별칭
SELECT SUM(salary) 급여총액, AVG(salary) "평균액", MAX(salary) 최고액, MIN(salary) 최소액
FROM employee;

--(12) 직업 종류의 갯수를 출력하세요. 출력컬럼을 "직업 종류의 갯수"로 별칭
SELECT count(distinct job) "직업 종류의 갯수"
FROM employee;

--(13) 각 부서별 평균 월급을 구해서 부서번호와 평균 월급을 출력하되 각각 "부서번호","평균월급"으로 별칭
SELECT dno "부서번호", avg(salary) "평균 월급"
FROM employee
group by dno;

--(14) 담당 업무가 동일한 사원의 수 ( count 함수 사용)
SELECT job, count(*)
FROM employee
group by job;

--(15) 직급별 사원의 최저 급여를 출력, 관리자를 알 수 없거나 최저 급여가 2000미만 그룹은 제외, 급여에 대한 내림차순으로 출력
SELECT job, min(salary) min
FROM employee
WHERE MANAGER is not null
GROUP BY job
having min(salary) > 2000
ORDER BY avg(salary) desc;

--(16) 서브 쿼리를 사용해서 사원번호가 7788인 사원과 담당업무가 같은 사원의 담당이름, 담당업무를 출력
SELECT ename, job
FROM employee
WHERE job = (SELECT job FROM employee WHERE eno='7788');

--(17) 서브 쿼리를 사용해서 담당업무가 7499인 사원보다 급여가 많은 사원의 사원이름, 담당업무를 출력
SELECT ename, job
FROM employee
WHERE SALARY > (SELECT salary FROM employee WHERE eno='7499');

--(18) 서브 쿼리를 사용해서 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 출력하시오.
SELECT e.ename, e.salary, e.dno
FROM employee e
WHERE (e.dno, e.salary) IN (SELECT e.dno, min(e.salary) FROM employee e GROUP BY e.dno);

--(19) 서브 쿼리를 사용해서 평균 급여보다 많은 사원들의 사원보호와 이름을 표시하되 결과를 급여에 대해서 오름차순
SELECT eno, ename
FROM employee
WHERE salary >= (SELECT avg(salary) FROM employee)
ORDER BY salary asc;

--(20) 서브 쿼리를 사용해서 'RESARCH' 부서의 부서번호, 사원이름 및 담당 업무를 표시하시오.
SELECT dno, ename, job
FROM employee
WHERE dno = (SELECT deptno FROM DEPT WHERE dname = 'RESEARCH');
