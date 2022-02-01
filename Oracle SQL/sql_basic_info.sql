--(1번)
CREATE TABLE info (
    name    varchar2(10),       -- 한글 이름으로 최대 3~5글자(버전차이)
    ID  char(15),               
    Tel varchar2(20) PRIMARY KEY,
    Gender  char(5),
    Age number(3),
    Born    varchar2(50)
    );

-- (2번)
CREATE TABLE info (
    name    varchar2(10),       
    ID  char(15),               
    Tel varchar2(20),
    Gender  char(5),
    Age number(3),
    Born    varchar2(50),
    CONSTRAINT pk_info_tel PRIMARY KEY (tel)
);

DESC info;

INSERT INTO info(tel, name) VALUES('02-222', '홍길동');    -- 입력가능
INSERT INTO info(tel, name) VALUES('032-333', '김길동');   -- 입력안됨
INSERT INTO info(tel, name) VALUES('02-222', '김길동');    -- 입력안됨
INSERT INTO info(tel, name) VALUES('999-99', '홍길동');    -- 입력가능
INSERT INTO info(gender, age) VALUES('남', 33);            -- 입력안됨
INSERT INTO info(name, id) VALUES('홍길동', '900102-2134567'); -- 입력안됨

SELECT * FROM info;     -- 출력 확인

delete from info;

drop table info;    -- 테이블 삭제

ALTER TABLE info ADD CONSTRAINT pk_info_tel PRIMARY KEY (tel);
-- primary key가 중복되어서 동일한 데이터의 입력이 불가함

ALTER TABLE info MODIFY name varchar2(10) NOT NULL;
-- 완성 테이블에 not값을 허용하지않는 not null로 제약조건 변경modify) - 이름

ALTER TABLE info DROP CONSTRAINT pk_info_tel;
-- pk_tablename_columnname || tablename_columnname_pk
-- 테이블 삭제

insert into info(Tel,ID,Gender,name) values('031-111','911012-1234567','남','아무무');
-- values 뒤에 입력 정보 추가

insert into info(Tel,ID,Gender,name) values('031-999','911012-1234567','남','아무르');

ALTER TABLE info ADD CONSTRAINT uq_info_ID UNIQUE(ID);
-- 완성 테이블에 UNIQUE 제약조건 추가(ADD) - 주민번호

--------------------------------------------------------------------------------

ALTER TABLE info ADD CONSTRAINT ck_info_gender check(gender in('남','여'));
-- 알파벳으로 표기할 때 '' 설정되었으면 대문자와 소문자 구분해야함
insert into info(Tel,Gender,name) values('051-555','여','아무린');

--------------------------------------------------------------------------------
ALTER TABLE info MODIFY Gender char(5) default '남';
-- check에서 default로 미입력시 '남'으로 나오게 설정

insert into info(Tel,name) values('051-777','다니엘');

commit;
rollback;
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
SELECT * FROM info;

--(3번) 전부 설정 후 테이블 생성
CREATE TABLE info (
    name    varchar2(10) NOT NULL,
    id  	char(15),               
    tel 	varchar2(20),
    gender  char(6) DEFAULT '남성',
    age 	number(3),
    home    varchar2(50), 
    
    deptno number(2),
    -- FOREIGN KEY : 다른 테이블의 값을 참조, 연결
    CONSTRAINT pk_info_tel PRIMARY KEY (tel),
    CONSTRAINT fk_info_deptno foreign key (deptno) references dept(deptno),
    CONSTRAINT uq_info_id UNIQUE (id),
    CONSTRAINT ch_info_gender CHECK (gender IN('남성','여성'))
    );

INSERt INTO info (name, tel, deptno) values ('아무개','02-2222',10);

-- INSERt INTO info (name, tel, deptno) values ('아듀','031-1111',50);
-- DEPT 테이블 데이터에 50 이라는 부서가 존재하지 않음

insert into info (name, tel) values ('김숙','051-555');
-- 부서값을 입력하지 않아도 상관없지만 없는 것을 억지로 넣으려고하면 문제가 생김
    
INSERT INTO info( name, tel, id ) 
VALUES('갑순이', '02-777-4444', '990909-1234567');

--INSERT INTO info( name, tel, id, gender, age, home )
--VALUES('갑갑이','03-555-5555', '880808-1234567', '남자', 27,'경기');
--남성이 아닌 남자로 적혀있어 오류

INSERT INTO info( name, tel, id, gender, age, home )
VALUES('홍길동','03-031-0310', '900909-1234567', '남성', 27,'경기');

--INSERT INTO info( name, id) VALUES('홍길자', '550505-1234567');
--tel 미기재 (primary key - 필수요건)

--INSERT INTO info( tel, id ) VALUES('031-777-7777', '700707-1234567');
--name 미기재 (not null - null값 허용안됨)

INSERT INTO info( name, tel, id ) VALUES('갑동이', '031-000-0000', '700707-1234567');

drop table info;