CREATE TABLE student(
	hakbun char(4),
	name varchar2(10),
	kor number(3),
	eng number(3),
	tot number,
	avg number(5,2)	-- ������ �÷����� �޸�(,) ���� �ʱ�
);
DESC student;
drop table student;

alter table student add(math number(3));
desc student;

--���� �÷��� �����
alter table student DROP COLUMN tot;
desc student;

--������ �Է�
insert into student(hakbun,name,kor,eng,math) values('1001','ȫ�浿',100,77,30);

--������ �˻�
select * from student;

--2000�� �й��� ȫ������ ����� ���������� ���� 50,80���� �Է����ּ���
insert into student(hakbun,name,kor,math) values('2000','ȫ����',50,80);

--avg �ڷ��� ����
alter table student MODIFY (avg number(5,2));

--3000�� ȫ�汹 �л��� ������ ����80, ����70, ��� 50.5, ���� 90�� �Է��ϼ���
insert into student(hakbun,name,kor,eng,avg,math) values('3000','ȫ�汹',80,70,50.5,90);

--3000�� ȫ�汹 �л��� ������ ����80, ����70, ��� 50.5, ���� 90�� �Է��ϼ���
insert into student(hakbun,name,kor,eng,avg,math) values('3000','ȫ�汹',80,70,50.5,90);

--������ �˻�
select * from student;

--1) 1001�� �й��� �л��̸��� �ڱ浿���� ����
UPDATE student
  SET name = '�ڱ浿'
  WHERE hakbun='1001';
  
--������ �˻�
select * from student;

--2) 2000�� �л��� ���������� 70���� �����ϰ�, ���������� 100������ ����
--UPDATE table_name SET column=value WHERE condition;
UPDATE student  SET kor=70 where hakbun='2000';
UPDATE student  SET math=100  where hakbun='2000';
--update student set kor=70, math=100 where hakbun='2000';

--������ �˻�
select * from student;

--3) �� ���������� ���� ��������� ����
--     -update�� ���
--     -���=(����+����+����)/3
update student SET avg = (kor+eng+math)/3;

-- null�� �����ؼ� ��� ���Ҷ�
update student set avg=(kor+math+nvl(eng,0))/3;

--������ �˻�
select * from student;

--4) ȫ���� �л��� ���������� 40 �Է�
update student set eng =40 where hakbun='2000';

--[����]
--�̸��� �ڱ浿�� ��� ���� �����
delete from student where name='�ڱ浿';

--���������� 90�̸��� �л� ���� �����ϱ�
DELETE FROM student WHERE math<90;