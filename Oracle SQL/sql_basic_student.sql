CREATE TABLE student(
	hakbun char(4),
	name varchar2(10),
	kor number(3),
	eng number(3),
	tot number,
	avg number(5,2)	-- 마지막 컬럼에는 콤마(,) 찍지 않기
);
DESC student;
drop table student;

alter table student add(math number(3));
desc student;

--총점 컬럼을 지우기
alter table student DROP COLUMN tot;
desc student;

--데이터 입력
insert into student(hakbun,name,kor,eng,math) values('1001','홍길동',100,77,30);

--데이터 검색
select * from student;

--2000번 학번인 홍길자의 국어와 수학점수가 각각 50,80점을 입력해주세요
insert into student(hakbun,name,kor,math) values('2000','홍길자',50,80);

--avg 자료형 변경
alter table student MODIFY (avg number(5,2));

--3000번 홍길국 학생의 정보로 국어80, 영어70, 평균 50.5, 수학 90을 입력하세요
insert into student(hakbun,name,kor,eng,avg,math) values('3000','홍길국',80,70,50.5,90);

--3000번 홍길국 학생의 정보로 국어80, 영어70, 평균 50.5, 수학 90을 입력하세요
insert into student(hakbun,name,kor,eng,avg,math) values('3000','홍길국',80,70,50.5,90);

--데이터 검색
select * from student;

--1) 1001번 학번의 학생이름을 박길동으로 수정
UPDATE student
  SET name = '박길동'
  WHERE hakbun='1001';
  
--데이터 검색
select * from student;

--2) 2000번 학생의 국어점수를 70으로 변경하고, 수학점수를 100점으로 변경
--UPDATE table_name SET column=value WHERE condition;
UPDATE student  SET kor=70 where hakbun='2000';
UPDATE student  SET math=100  where hakbun='2000';
--update student set kor=70, math=100 where hakbun='2000';

--데이터 검색
select * from student;

--3) 각 과목점수에 따른 평균점수를 저장
--     -update문 사용
--     -평균=(국어+영어+수학)/3
update student SET avg = (kor+eng+math)/3;

-- null값 감안해서 평균 구할때
update student set avg=(kor+math+nvl(eng,0))/3;

--데이터 검색
select * from student;

--4) 홍길자 학생의 영어점수를 40 입력
update student set eng =40 where hakbun='2000';

--[샘플]
--이름이 박길동인 사람 정보 지우기
delete from student where name='박길동';

--수학점수가 90미만인 학생 정보 삭제하기
DELETE FROM student WHERE math<90;