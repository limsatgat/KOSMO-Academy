SELECT * FROM BUSEO;
commit;
rollback;
drop table buseo;

CREATE TABLE BUSEO (
    buseo_no    number(3) PRIMARY KEY,       
    buseo_name  varchar2(30)
    );
    
INSERt INTO buseo (buseo_no, buseo_name) values (101,'����Ʈ��������������');
INSERt INTO buseo (buseo_no, buseo_name) values (202,'������');
INSERt INTO buseo (buseo_no, buseo_name) values (303,'�����ڿ���');

delete from buseo where buseo_name='�����ڿ���';
-- sawon ���̺� �����Ǿ��־ ���� �Ұ�