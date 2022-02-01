--(1��)
CREATE TABLE info (
    name    varchar2(10),       -- �ѱ� �̸����� �ִ� 3~5����(��������)
    ID  char(15),               
    Tel varchar2(20) PRIMARY KEY,
    Gender  char(5),
    Age number(3),
    Born    varchar2(50)
    );

-- (2��)
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

INSERT INTO info(tel, name) VALUES('02-222', 'ȫ�浿');    -- �Է°���
INSERT INTO info(tel, name) VALUES('032-333', '��浿');   -- �Է¾ȵ�
INSERT INTO info(tel, name) VALUES('02-222', '��浿');    -- �Է¾ȵ�
INSERT INTO info(tel, name) VALUES('999-99', 'ȫ�浿');    -- �Է°���
INSERT INTO info(gender, age) VALUES('��', 33);            -- �Է¾ȵ�
INSERT INTO info(name, id) VALUES('ȫ�浿', '900102-2134567'); -- �Է¾ȵ�

SELECT * FROM info;     -- ��� Ȯ��

delete from info;

drop table info;    -- ���̺� ����

ALTER TABLE info ADD CONSTRAINT pk_info_tel PRIMARY KEY (tel);
-- primary key�� �ߺ��Ǿ ������ �������� �Է��� �Ұ���

ALTER TABLE info MODIFY name varchar2(10) NOT NULL;
-- �ϼ� ���̺� not���� ��������ʴ� not null�� �������� ����modify) - �̸�

ALTER TABLE info DROP CONSTRAINT pk_info_tel;
-- pk_tablename_columnname || tablename_columnname_pk
-- ���̺� ����

insert into info(Tel,ID,Gender,name) values('031-111','911012-1234567','��','�ƹ���');
-- values �ڿ� �Է� ���� �߰�

insert into info(Tel,ID,Gender,name) values('031-999','911012-1234567','��','�ƹ���');

ALTER TABLE info ADD CONSTRAINT uq_info_ID UNIQUE(ID);
-- �ϼ� ���̺� UNIQUE �������� �߰�(ADD) - �ֹι�ȣ

--------------------------------------------------------------------------------

ALTER TABLE info ADD CONSTRAINT ck_info_gender check(gender in('��','��'));
-- ���ĺ����� ǥ���� �� '' �����Ǿ����� �빮�ڿ� �ҹ��� �����ؾ���
insert into info(Tel,Gender,name) values('051-555','��','�ƹ���');

--------------------------------------------------------------------------------
ALTER TABLE info MODIFY Gender char(5) default '��';
-- check���� default�� ���Է½� '��'���� ������ ����

insert into info(Tel,name) values('051-777','�ٴϿ�');

commit;
rollback;
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
SELECT * FROM info;

--(3��) ���� ���� �� ���̺� ����
CREATE TABLE info (
    name    varchar2(10) NOT NULL,
    id  	char(15),               
    tel 	varchar2(20),
    gender  char(6) DEFAULT '����',
    age 	number(3),
    home    varchar2(50), 
    
    deptno number(2),
    -- FOREIGN KEY : �ٸ� ���̺��� ���� ����, ����
    CONSTRAINT pk_info_tel PRIMARY KEY (tel),
    CONSTRAINT fk_info_deptno foreign key (deptno) references dept(deptno),
    CONSTRAINT uq_info_id UNIQUE (id),
    CONSTRAINT ch_info_gender CHECK (gender IN('����','����'))
    );

INSERt INTO info (name, tel, deptno) values ('�ƹ���','02-2222',10);

-- INSERt INTO info (name, tel, deptno) values ('�Ƶ�','031-1111',50);
-- DEPT ���̺� �����Ϳ� 50 �̶�� �μ��� �������� ����

insert into info (name, tel) values ('���','051-555');
-- �μ����� �Է����� �ʾƵ� ��������� ���� ���� ������ ���������ϸ� ������ ����
    
INSERT INTO info( name, tel, id ) 
VALUES('������', '02-777-4444', '990909-1234567');

--INSERT INTO info( name, tel, id, gender, age, home )
--VALUES('������','03-555-5555', '880808-1234567', '����', 27,'���');
--������ �ƴ� ���ڷ� �����־� ����

INSERT INTO info( name, tel, id, gender, age, home )
VALUES('ȫ�浿','03-031-0310', '900909-1234567', '����', 27,'���');

--INSERT INTO info( name, id) VALUES('ȫ����', '550505-1234567');
--tel �̱��� (primary key - �ʼ����)

--INSERT INTO info( tel, id ) VALUES('031-777-7777', '700707-1234567');
--name �̱��� (not null - null�� ���ȵ�)

INSERT INTO info( name, tel, id ) VALUES('������', '031-000-0000', '700707-1234567');

drop table info;