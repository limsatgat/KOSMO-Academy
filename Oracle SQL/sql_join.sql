-- @ @ @ 내부조인
--사원테이블의 사원명과 부서테이블의 부서명을 출력하시오
SELECT ename, dname, emp.deptno
FROM emp, dept
WHERE emp.deptno = dept.deptno;
-- WHERE 절에서 조인을 사용해 테이블을 연결하면
-- SELECT 절에서 중복된 부서의 앞에 출력할 테이블명 붙여야함.

-- 별칭 부여 , AS 사용불가
SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d --별칭
WHERE e.deptno = d.deptno;

-- 현대식 내부조인
SELECT e.ename, d.dname, d.deptno
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, d.deptno
FROM emp e INNER JOIN dept d
USING (deptno); --column명만 기술

SELECT e.ename, d.dname, deptno
FROM emp e
Natural JOIN dept d;
--------------------------------------------------------------------------------
-- @ @ @ 외부조인 // 반대쪽에 데이터가 없어도 출력가능
SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno = d.deptno(+); -- 무소속을 불러냄(신입사원)

SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno; -- 소속원 없는 부서를 불러냄(Operation)

SELECT e.ename ename, d.dname dname, e.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno(+);

-- 현대식 외부조인
SELECT e.ename, d.dname, e.deptno
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, e.deptno
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.ename, d.dname, e.deptno
FROM emp e FULL OUTER JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------------------
-- @ @ 셀프조인
SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e, emp e2
WHERE e.mgr = e2.empno(+);

SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e INNER JOIN emp e2
ON e.mgr = e2.empno;

SELECT e.empno, e.ename, e.mgr, e2.ename
FROM emp e LEFT OUTER JOIN emp e2
ON e.mgr = e2.empno;
--------------------------------------------------------------------------------
--JONES 보다 급여를 더 많은 직원 이름 출력
SELECT e1.ename, e1.sal, e2.ename, e2.sal
FROM emp e1, emp e2
WHERE e1.ename='JONES' AND e1.sal < e2.sal;

SELECT e1.ename, e1.sal, e2.ename, e2.sal
FROM emp e1 INNER JOIN emp e2
ON e1.ename='JONES' AND e1.sal < e2.sal;
--------------------------------------------------------------------------------
-- 업무가 CLERK인 사원조회
-- 10번 부서의 사원 조회
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
MINUS--UNION --집합(SET) > UNION, UNION ALL, INTERSECT, MINUS
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
