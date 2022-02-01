SELECT * FROM BUSEO;
commit;
rollback;
drop table buseo;

CREATE TABLE BUSEO (
    buseo_no    number(3) PRIMARY KEY,       
    buseo_name  varchar2(30)
    );
    
INSERt INTO buseo (buseo_no, buseo_name) values (101,'소프트웨어유지보수부');
INSERt INTO buseo (buseo_no, buseo_name) values (202,'관리부');
INSERt INTO buseo (buseo_no, buseo_name) values (303,'인적자원부');

delete from buseo where buseo_name='인적자원부';
-- sawon 테이블에 참조되어있어서 삭제 불가