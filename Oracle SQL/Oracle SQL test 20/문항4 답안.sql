--(1) 삽입 완료
INSERT INTO gogek ( id, name, tel ) VALUES ('babo1234','홍길동', '031-333-3333' );

--(2) 삽입 완료
INSERT INTO gogek ( id, name, tel ) VALUES ('babo1111','김길동', '031-111-1111' );

--(3) 삽입 완료
INSERT INTO gogek ( id, name, tel ) VALUES ('babo2222','홍길동', '031-222-2222' );

--(4) 삽입 완료
INSERT INTO gogek ( id, name, tel ) VALUES ('babo9999','박길동', '031-333-3333' );

--(5) ID 중복(primary key)
--INSERT INTO gogek ( id, name, tel ) VALUES ('babo1234','맹길동', '031-999-9999' );

--(6) ID 제한 글자 수 초과 (최대 8자)
--INSERT INTO gogek ( id, name, tel ) VALUES ('babo12345','이길동', '031-333-1234' );

--(7) 삽입 완료
INSERT INTO gogek ( id, name, tel ) VALUES ('123','최길동', '031-999-9999' );

--(8) 삽입 완료
INSERT INTO gogek ( id, name ) VALUES ('babo','봉길동' );

--(9) name 필수 입력 (primary key)
--INSERT INTO gogek ( id, tel ) VALUES ('babo1988','031-888-8888' );