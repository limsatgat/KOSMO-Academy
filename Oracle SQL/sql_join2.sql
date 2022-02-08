-- ȸ�� ���̺�
create table ex_member(
    id varchar2(10), -- ���̵�
    pass varchar2(10), -- �н�����
    name varchar2(20), -- �̸�
    tel varchar2(20), -- ��ȭ��ȣ
    addr varchar2(100) -- �ּ�
);
-- ��ǰ ���̺�
create table ex_good(
    gno varchar2 (10), -- ��ǰ��ȣ
    gname varchar(30), -- ��ǰ��
    gdetail varchar2(300), -- �󼼼���
    price number); -- ����

-- �ֹ� ���̺�
create table ex_order (
    ono number, -- ��ȣ
    orderno varchar2(20), -- �ֹ���ȣ
    gno varchar2(10), -- ��ǰ��ȣ
    id varchar2(10), -- ȸ�� ���̵�
    count number, -- ����
    status varchar2(12) -- ��ۻ���
);

create sequence seq_order_ono;
-- ######################################################
-- 1. �ֹ����̺�� ȸ�����̺�, ��ǰ���̺��� ���踦 �δ´ٸ�?
ALTER TABLE ex_member ADD CONSTRAINT eo_pk_id PRIMARY KEY(id);
ALTER TABLE ex_good ADD CONSTRAINT eo_pk_gno PRIMARY KEY(gno);
ALTER TABLE ex_order ADD CONSTRAINT eo_fk_id FOREIGN KEY (id) REFERENCES ex_member(id);
ALTER TABLE ex_order ADD CONSTRAINT eo_fk_gno FOREIGN KEY (gno) REFERENCES ex_good(gno);
ALTER TABLE ex_order ADD CONSTRAINT eo_pk_ono PRIMARY KEY(ono);

commit;
-- ȸ�� ���̺� ����Ÿ �Է�
insert into ex_member(id, pass, name, tel, addr )
values('kim', '1111', '��浿', '02-222-2222','���� ������ �̻۵�');

insert into ex_member(id, pass, name, tel, addr )
values('park', '1111', '�ڱ浿', '03-333-3333','��õ ������ �̻۵�');

insert into ex_member(id, pass, name, tel, addr )
values('meng', '1111', '�ͱ浿', '04-444-4444','��� ������ �̻۵�');
?commit;

-- ���� ���̺� ����Ÿ �Է�
insert into ex_good( gno, gname, gdetail, price )
values('1001', '�Ӹ���', '���� ��� �Ӹ���', 200 );
?
insert into ex_good( gno, gname, gdetail, price )
values('2002', '������-A', '������� ������ �޸��� ������', 10000 );

insert into ex_good( gno, gname, gdetail, price )
values('2010', '������-B', '���� ������� ������ �����ϰ� �޸��ٴ� ������', 20000 );

?insert into ex_good( gno, gname, gdetail, price )
values('3333', '�ڵ������̽�', '�ΰ� �����ϴ� �ڵ��� ���̽�', 1500 );

commit;

-- �ֹ� ���̺� ����Ÿ �Է�
insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20161212', '1001', 'park', 1, '��ۿϷ�');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20161212', '2010', 'park', 1, '�����');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20161111', '1001', 'kim', 2, '�ֹ�');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20161111', '3333', 'kim', 3, '�ֹ�');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20163333', '1001', 'park', 3, '�ֹ�');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20163333', '2010', 'park', 1, '�����');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20163333', '2002', 'park', 2, '�ֹ�');

insert into ex_order( ono, orderno, gno, id, count, status )
values( seq_order_ono.nextval, '20165050', '1001', 'meng', 1, '�����');

commit;

-- ###############################################################
--[ ���� ]
--1. ������� �ֹ� ������ ��ǰ ���� ���
SELECT o.orderno, o.count, g.gno, g.gname, g.gdetail, g.price, o.status
FROM ex_order o, ex_good g
WHERE g.gno = o.gno AND status = '�����';
--2. �ֹ� ���� ��ǰ ������ �� ���� ���
SELECT m.id, m.name, m.tel, m.addr, g.gno, g.gname, g.gdetail, g.price, o.ono, o.orderno, o.count, o.status
FROM ex_member m, ex_order o, ex_good g
WHERE m.id=o.id AND g.gno = o.gno AND status = '�ֹ�';

--3. �ֹ����� �� ����(ID�� ���)�� �ֹ��� ��ǰ�� �ѱݾ��� ���
SELECT e.id, e.orderno, sum(g.price*e.count)total
FROM ex_good g, ex_order e
WHERE g.gno = e.gno
GROUP BY id, orderno;

--4. [����] 3���� �ֹ� ������ �� ���� ��ǰ�� �� �� ���� ��� 

-- [��] 20161212 �Ӹ��� �� 1�� 