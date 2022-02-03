--현재까지 근무일 수가 많은 사람 순으로 출력
SELECT
    ename,
    hiredate,
    round(sysdate - hiredate) AS work_days
FROM
    emp
ORDER BY
    sysdate - hiredate DESC;

--현재까지 근무일 수가 많은 사람 순으로 출력에서 NULL값은 마지막으로
SELECT
    ename,
    hiredate,
    round(sysdate - hiredate) AS work_days
FROM
    emp
ORDER BY
    sysdate - hiredate DESC NULLS LAST;

--현재까지 근무일 수가 몇 주 몇 일 인가를 출력
SELECT
    ename,
    hiredate,
    ceil(sysdate - hiredate)           AS "근무일수",
    trunc((sysdate - hiredate) / 7)    AS "근무 주",
    ceil(mod((sysdate - hiredate), 7)) AS "근무일"
FROM
    emp;


--10번 부서에 속한 사원의 현재까지의 근무 월수를 계산
SELECT
    ename,
    hiredate,
    trunc(months_between(sysdate, hiredate)) AS work_months
FROM
    emp
WHERE
    deptno = 10;

--현재 날짜에서 3개월 후의 날짜 구하기
SELECT
    add_months(sysdate, 3) AS mydate
FROM
    dual;

--현재 날짜에서 돌아오는 '월'요일의 날짜 구하기
SELECT
    next_day(sysdate, '월') AS mydate
FROM
    dual;

--현재 날짜에서 월의 마지막 날짜 구하기
SELECT
    last_day(sysdate) AS mydate
FROM
    dual;

--입사일자에서 입사년도를 출력
SELECT
    ename,
    hiredate,
    to_char(hiredate, 'YYYY') AS hire_year
FROM
    emp;

--입사일자를 '1999년 1월 1일' 형식으로 출력
SELECT
    ename,
    hiredate,
    to_char(hiredate, 'YYYY"년" MM"월" DD"일" HH"시" MI"초"') k_date
FROM
    emp;

--홍길동 사원의 입사일을 오늘 지정
UPDATE emp
SET hiredate-sysdate
WHERE ename='홍길동';

--1981년도에 입사한 사원 검색
SELECT ename, hiredate, to_char(hiredate, 'YY"년도"') AS "입사"
FROM emp
WHERE substr(hiredate, 0, 2) = 81;
-- SELECT ename, hiredate
-- FROM emp
-- WHERE to_char(hiredate, 'YYYY') = '1981';

--5월에 입사한 사원 검색
SELECT ename, hiredate, to_char(hiredate, 'MM"월"') AS "입사"
FROM emp
WHERE INSTR(hiredate, 5, 5) = 5;
-- SELECT ename, hiredate
-- FROM emp
-- WHERE to_char(hiredate, 'MM') = 05;
-- '05' x / 05 o / 5 o /'5' x

--급여 앞에 $를 삽입하고 3자리 마다 ,를 출력 
SELECT ename, sal, to_char(sal, '$999,999,999,999') as "급여"
from emp;
