desc emp;

SELECT * FROM EMP;

-- ���� ���̺� ����
CREATE TABLE emp_copy
    as select empno, ename, sal, comm, hiredate, deptno FROM emp;
    
    SELECT * FROM emp_copy;     -- ��� Ȯ��
    
    --�����ȣ�� 7788�� ����� �μ��� 10������ ����
    UPDATE emp_copy SET DEPTNO=10 WHERE EMPNO=7788;
    
    --�����ȣ�� 7782�� ����� �̸��� ȫ������� ����, �޿��� 3500���� ����
    UPDATE emp_copy SET ENAME='ȫ���', SAL='3500' WHERE EMPNO=7782;
    
    --��� �μ����� ���ʽ��� 300�� �λ�
    UPDATE emp_copy SET comm = nvl(comm,0)+300; 
    
    --��� ��ȣ�� 7499�� ����� ������ ����
    DELETE emp_copy WHERE EMPNO=7499;
    
    --�Ի����ڰ� 81�� 6�� 1�� ������ ����� ������ ����
    DELETE FROM emp_copy WHERE HIREDATE < '81/06/01';
    
    rollback;
    