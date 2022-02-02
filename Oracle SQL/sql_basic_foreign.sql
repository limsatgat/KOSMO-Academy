CREATE TABLE DEPT(
    deptno NUMBER(8)
    , dname VARCHAR(50)
    , CONSTRAINT PK_DEPT_DEPTID PRIMARY KEY(deptno)
);

INSERT INTO DEPT VALUES (1001, 'IT팀');
INSERT INTO DEPT VALUES (1002, '생산운영팀');
INSERT INTO DEPT VALUES (1003, '생산기술팀');

select * from dept;
drop table dept;

commit;
--------------------------------------------------------------------------------
drop table STUDENT;
select * from student;
select * from STUDENT;

--1) student 테이블 만들기
CREATE TABLE STUDENT(
    hakbun number(8),
    name varchar2(12) not null,
    gender varchar2(12),
    addr varchar2(50),
    jumin varchar2(16),
    deptno number(5)
);

--2) 학번 컬럼에 기본키(primary key) 제약조건 추가
ALTER TABLE STUDENT
ADD CONSTRAINT pk_hakbun PRIMARY KEY(hakbun);

--3) 주민번호 컬럼에서 NOT NULL 제약조건 삭제
ALTER TABLE STUDENT MODIFY name varchar2(12);

--4) 주소 컬럼에 디폴트 제약조건으로 “서울” 추가
ALTER TABLE STUDENT
MODIFY addr DEFAULT '서울';

--5) 성별 컬럼에 체크 제약조건으로 “남성”, “여성” 추가
ALTER TABLE STUDENT ADD CONSTRAINT ck_student_gender check(gender in('남성','여성'));

commit;

--[ 확인 ] 레코드 입력시 확인
INSERT INTO student(hakbun, name, gender, addr, jumin ) 
VALUES('1111', '김태희', '여성', '서울시 강남구', '801212-1234567' );

INSERT INTO student(hakbun, name, jumin ) 
VALUES('2222', '송혜교', '881212-1234567');

--INSERT INTO student(hakbun, name, jumin ) 
--VALUES('1111', '강동원', '881212-1234567');
-- 학번이 중복

--INSERT INTO student(hakbun, name, gender, jumin ) 
--VALUES('3333', '하정우', '남자', '830303-1234567');
-- 성별 틀림

INSERT INTO student(hakbun, name, addr, jumin ) 
VALUES('4444', '김새론', '서울시 서초구', '990909-1234567');

INSERT INTO student(hakbun, name, addr, deptno ) 
VALUES('8888', '이병헌', '서울시 한강', 50);

-------------------------------------------------------------------------------
drop table library;

--6) library 테이블 만들기
CREATE TABLE LIBRARY(
    rent_id number(8) PRIMARY KEY,
    book_id varchar2(12) not null,
    hakbun number(8),
    CONSTRAINT fk_hakbun FOREIGN KEY (hakbun) REFERENCES STUDENT(hakbun)
);

--[ 확인 ] 

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 1, 'bk001', '1111' );

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 2, 'bk002', '2222' );

--INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 3, 'bk003', '3333' );
--상속 테이블에 3333 학생이 없음

INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 4, 'bk004', '4444' );

--INSERT INTO library ( rent_id, book_id, hakbun ) VALUES( 5, 'bk005', '5555' );
--상속 테이블에 5555 학생이 없음

commit;