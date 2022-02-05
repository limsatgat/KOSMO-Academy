--(1) 삽입 완료
INSERT INTO sangpum ( No, title, count, price, detail ) VALUES ('A00001','이쁜바지', 30, 1000, '싸고 이뻐서 금방 다 팔릴 바지입니다' );

--(2) 삽입 완료
INSERT INTO sangpum ( No, title, count, price, detail ) VALUES ('A00002','그냥바지', 20, 500, '그냥 이뻐고 편안한 바지입니다' );

--(3) 삽입 완료
INSERT INTO sangpum ( No, title, count ) VALUES ('B00009','윗도리', 20 );

--(4) sangpum 테이블에 적은 항목보다 VALUES 에 적은 항목이 더 많음
--INSERT INTO sangpum ( No, title, count, price ) VALUES ('Z0001','비싼코트', 3, 20000, '겁나 비싼 코트입니다' );

--(5) VALUES의 항목이 순서별로 안되어있어 입력불가
--INSERT INTO sangpum VALUES ('Z00001','비싼코트2', 5, 20000, '겁나 비싼 코트입니다' );

--(6) 삽입 완료
INSERT INTO sangpum VALUES ('Z00001','비싼코트3','겁나 비싼 코트입니다', 5, 20000);