desc emp;

SELECT * FROM EMP;

-- 기존 테이블 복사
CREATE TABLE emp_copy
    as select empno, ename, sal, comm, hiredate, deptno FROM emp;
    
    SELECT * FROM emp_copy;     -- 출력 확인
    
    --사원번호가 7788인 사원의 부서를 10번으로 변경
    UPDATE emp_copy SET DEPTNO=10 WHERE EMPNO=7788;
    
    --사원번호가 7782인 사원의 이름을 홍길숙으로 변경, 급여를 3500으로 변경
    UPDATE emp_copy SET ENAME='홍길숙', SAL='3500' WHERE EMPNO=7782;
    
    --모든 부서원의 보너스를 300씩 인상
    UPDATE emp_copy SET comm = nvl(comm,0)+300; 
    
    --사원 번호가 7499인 사원의 정보를 삭제
    DELETE emp_copy WHERE EMPNO=7499;
    
    --입사일자가 81년 6월 1일 이전인 사원의 정보를 삭제
    DELETE FROM emp_copy WHERE HIREDATE < '81/06/01';
    
    rollback;
    