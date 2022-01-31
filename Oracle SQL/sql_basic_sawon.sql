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

ALTER Table sawon add constraint ck_sawon_ubmu check(ubmu in('개발','유지보수','관리'));
ALTER TABLE sawon modify ubmu varchar2(30) default '개발';

INSERT INTO sawon (sabun, sawon_name, weolgub, buseo, jiyeok) 
values (8001,'홍길동이군',100000,101,'부산');

--INSERT INTO sawon (sabun, sawon_name, ubmu, weolgub, buseo, jiyeok) 
--values (8002,'홍길자','사무',200000,202,'인천');
--업무 콜론에 사무 없음

--INSERT INTO sawon (sabun, sawon_name, ubmu, buseo, jiyeok) 
--values (8003,'홍길순','개발',111,'대전');
--부서 테이블에 111 없음

--INSERT INTO sawon (sabun, sawon_name, weolgub, jiyeok) 
--values (8004,'홍길석',12345678,'서울');
-- 월급 부분 바이트 초과

INSERT INTO sawon (sabun, sawon_name, ubmu, buseo, jiyeok) 
values (8005,'홍길철','유지보수',303,'판교');

alter table sawon DROP COLUMN jiyeok;

TRUNCATE table sawon;
