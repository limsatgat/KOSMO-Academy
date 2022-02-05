--7번 문항 : 전화번호가 없는 고객은 누구인지 고객명을 검색하세요.
SELECT name
FROM gogek
WHERE tel is null;

--8번 문항 : 홍씨 성을 가진 고객들의 정보를 검색하세요.
SELECT *
FROM gogek
WHERE name like '홍%';

--9번 문항 : babo2222 고객명을 박길동으로 변경하세요
UPDATE gogek SET name='박길동' where id='babo2222';

--10번 문항 : 아이디 123 고객의 아이디를 babo123 으로 변경하세요
UPDATE gogek SET id='babo123' where id='123';

--11번 문항 : 봉길동씨의 전화번호 02-555-5555를 추가하세요
UPDATE gogek SET tel='02-555-5555' where name='봉길동';

--12번 문항 : 상품번호 B00009 에 가격 1200원 그리고 "겁나 쌕시한 옷입니다"라는 상품설명을 추가하세요.
UPDATE sangpum SET price=70, detail='겁나 쌕시한 옷입니다' where no='B00009';

--13번 문항 : 이쁜바지 상품이 10개가 팔렸습니다.
UPDATE sangpum SET count=nvl(count,0)-10 where title='이쁜바지';

--14번 문항 : Z00001 상품이 3개가 더 입고 되었습니다.
UPDATE sangpum SET count=nvl(count,0)+3 where No='Z00001';

--15번 문항 : 11월 이후에 주문한 상품 번호를 검색하세요
SELECT sangpum
FROM jumun
WHERE jumunil>'2016/11/01' ;

--16번 문항 : babo 고객이 주문한 상품을 A00002로 변경하고 수량을 2개로 수정하세요
UPDATE jumun 
SET sangpum='A00002', count=nvl(count,0)+2 
WHERE gogek='babo';

--17번 문항 : babo1234 고객이 11월에 주문한 상품 번호를 검색하세요
SELECT sangpum
FROM jumun
WHERE gogek='babo1234' and Jumunil>'2016/11';

--18번 문항 : 위의 사항들을 모두 실행한 후의 고객 테이블 결과를 복사하시오.
SELECT *
FROM gogek;


--19번 문항 : 위의 사항들을 모두 실행한 후의 상품 테이블 결과를 복사하시오.
SELECT *
FROM sangpum;

--20번 문항 : 위의 사항들을 모두 실행한 후의 주문 테이블 결과를 복사하시오.
SELECT *
FROM jumun;