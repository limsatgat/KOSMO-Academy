CREATE TABLE DEPT(
    deptno NUMBER(8)
    , dname VARCHAR(50)
    , CONSTRAINT PK_DEPT_DEPTID PRIMARY KEY(deptno)
);

INSERT INTO DEPT VALUES (1001, 'IT��');
INSERT INTO DEPT VALUES (1002, '������');
INSERT INTO DEPT VALUES (1003, '��������');

select * from dept;
drop table dept;

commit;
--------------------------------------------------------------------------------
drop table STUDENT;
select * from student;
select * from STUDENT;

--1) student ���̺� �����
CREATE TABLE STUDENT(
    hakbun number(8),
    name varchar2(12) not null,
    gender varchar2(12),
    addr varchar2(50),
    jumin varchar2(16),
    deptno number(5)
);

--2) �й� �÷��� �⺻Ű(primary key) �������� �߰�
ALTER TABLE STUDENT
ADD CONSTRAINT pk_hakbun PRIMARY KEY(hakbun);

--3) �ֹι�ȣ �÷����� NOT NULL �������� ����
ALTER TABLE STUDENT MODIFY name varchar2(12);

--4) �ּ� �÷��� ����Ʈ ������������ ����� �߰�
ALTER TABLE STUDENT
MODIFY addr DEFAULT '����';

--5) ���� �÷��� üũ ������������ ��������, �������� �߰�
ALTER TABLE STUDENT ADD CONSTRAINT ck_student_gender check(gender in('����','����'));

commit;

--[ Ȯ�� ] ���ڵ� �Է½� Ȯ��
INSERT INTO student(hakbun, name, gender, addr, jumin ) 
VALUES('1111', '������', '����', '����� ������', '801212-1234567' );

INSERT INTO student(hakbun, name, jumin ) 
VALUES('2222', '������', '881212-1234567');

--INSERT INTO student(hakbun, name, jumin ) 
--VALUES('1111', '������', '881212-1234567');
-- �й��� �ߺ�

--INSERT INTO student(hakbun, name, gender, jumin ) 
--VALUES('3333', '������', '����', '830303-1234567');
-- ���� Ʋ��

INSERT INTO student(hakbun, name, addr, jumin ) 
VALUES('4444', '�����', '����� ���ʱ�', '990909-1234567');

INSERT INTO student(hakbun, name, addr, deptno ) 
VALUES('8888', '�̺���', '����� �Ѱ�', 50);

-------------------------------------------------------------------------------
drop table library;

--6) library ���̺� �����
CREATE TABLE LIBRARY(
    rent_id number(8) PRIMARY KEY,
    book_id varchar2(12) not null,
    hakbun number(8),
    CONSTRAINT fk_hakbun FOREIGN KEY (hakbun) REFERENCES STUDENT(hakbun)
);

--[ Ȯ�� ] 

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 1, 'bk001', '1111' );

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 2, 'bk002', '2222' );

--INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 3, 'bk003', '3333' );
--��� ���̺� 3333 �л��� ����

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 4, 'bk004', '4444' );

--INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 5, 'bk005', '5555' );
--��� ���̺� 5555 �л��� ����

commit;