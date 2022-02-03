--2003년에 입사한 사원들의 사번, 이름, 입사일을 출력
SELECT EMPLOYEE_ID, FIRST_NAME||LAST_NAME full_name, HIRE_DATE 
FROM EMPLOYEES
WHERE to_char(HIRE_DATE, 'YY') = 03;

--업무가 FI_ACCOUNT / FI_MGR / SA_MAN / SA_REP인 사원들의 정보를 출력
SELECT *
FROM EMPLOYEES
WHERE JOB_ID IN('FI_ACCOUNT','FI_MGR','SA_MAN','SA_REP');

--커미션을 받는 사원들의 명단을 출력
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL and COMMISSION_PCT !=0;

--업무가 SA_MAM 또는 SA_REP이면 "판매부서"를 그 외는 "그 외 부서"라고 출력
SELECT JOB_ID, CASE job_id
WHEN 'SA_MAN' THEN '판매부서'
WHEN 'SA_REP' THEN '판매부서'
else '그 외 부서'
end as 부서
FROM EMPLOYEES 
ORDER BY 부서 DESC;
-------------------------------------------------------------------------------

--연도별로 입사자들의 최소급여, 최대급여, 급여의 총합 그리고 평균 급여를 구하시오.
SELECT TO_CHAR(HIRE_DATE, 'YYYY"년"') YEAR, MIN(SALARY) MIN, MAX(SALARY) MAX, SUM(SALARY) SUM, ROUND(AVG(SALARY)) AVG
FROM employees
GROUP BY TO_CHAR(HIRE_DATE, 'YYYY"년"');

--부서별 평균 급여가 $10,000 이상인 부서만 구하시오. (평균급여가 높은 순으로)
SELECT DEPARTMENT_ID DID, to_char(avg(SALARY),'$999,999') avg
FROM employees
GROUP BY DEPARTMENT_ID
HAVING avg(SALARY)>='10000'
ORDER BY avg DESC;

--부서별 최대 급여를 구하시오.
SELECT DEPARTMENT_ID DID, max(SALARY) max
FROM employees
GROUP BY DEPARTMENT_ID
ORDER BY DID DESC NULLS LAST;