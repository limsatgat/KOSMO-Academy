SELECT * FROM SAWON;
commit;
rollback;
drop table sawon;

CREATE TABLE sawon (
    sabun       number(6) PRIMARY KEY,       
    sawon_name  varchar2(15), 
    ubmu        varchar2(30),
    weolgub     number(10),
    buseo       number(3),
    
    CONSTRAINT fk_sawon_buseo foreign key (buseo) references buseo(buseo_no)
    );
    
    
ALTER TABLE sawon ADD(jiyeok varchar2(30));
ALTER TABLE sawon Modify jiyeok varchar2(30) not null;
ALTER TABLE sawon modify (weolgub number(7, 0));

ALTER Table sawon add constraint ck_sawon_ubmu check(ubmu in('����','��������','����'));
ALTER TABLE sawon modify ubmu varchar2(30) default '����';

INSERT INTO sawon (sabun, sawon_name, weolgub, buseo, jiyeok) 
values (8001,'ȫ�浿�̱�',100000,101,'�λ�');

--INSERT INTO sawon (sabun, sawon_name, ubmu, weolgub, buseo, jiyeok) 
--values (8002,'ȫ����','�繫',200000,202,'��õ');
--���� �ݷп� �繫 ����

--INSERT INTO sawon (sabun, sawon_name, ubmu, buseo, jiyeok) 
--values (8003,'ȫ���','����',111,'����');
--�μ� ���̺� 111 ����

--INSERT INTO sawon (sabun, sawon_name, weolgub, jiyeok) 
--values (8004,'ȫ�漮',12345678,'����');
-- ���� �κ� ����Ʈ �ʰ�

INSERT INTO sawon (sabun, sawon_name, ubmu, buseo, jiyeok) 
values (8005,'ȫ��ö','��������',303,'�Ǳ�');

alter table sawon DROP COLUMN jiyeok;

TRUNCATE table sawon;
