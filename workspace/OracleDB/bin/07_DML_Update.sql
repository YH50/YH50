-- 07_DML_Update.sql

-- 데이터 변경 - 수정 (UPDATE)
-- UPDATE 테이블명 SET 변경내용 WHERE 검색조건
update memberlist set age = 20, phone = '010-0000-1111' where membernum = 30;
-- update랑 set 는 같이 붙어 댕김!!!!									>> 이거 없으면 전체가 다 바뀜


-- 명령문에 WHERE 이후의 구문은 생략이 가능함.
-- 다만 생략하게 될 경우 모든 레코드를 대상으로 UPDATE 명령이 실행 및 수정됨
-- 검색조건 : 필드명 (비교-관계연산자) 조건값 	으로 이루어진 조건연산,
-- 흔히 자바에서 쓰는 if()와 유사.
-- ex) 나이가 29세 이상  >> WHERE AGE >= 29
-- 2개 이상의 필드를 수정하고 싶을때 "," 로 구분함.
-- 복합 조건을 사용하려면 AND, OR 등을 사용
-- ex) (&& >> AND, || >> OR, ! >> NOT)



-- [1. booklist 의 모든 도서의 대여 가격(outprice)를 10% 인상된 가격으로 수정
-- [2. memberlist에서 bpoint가 300 이상인 회원에게 30점 가산점 부여]
-- [3. 생년월일이 null인 회원의 생년월일을 2000.01.01, 23세로 변경]
-- [4. gender 가 NULL인 회원의 gender를 'M'으로 변경]


update booklist set outprice = outprice * 1.1;			--[1]
update MemberList set bpoint = bpoint + 30 where bpoint >= 300;	--[2]
update MemberList set BIRTH = '2000.01.01', AGE = 23 where BIRTH is null;		--[3]
update MemberList set GENDER = 'M' where GENDER is null;		--[4]

select * from MemberList;
select * from booklist; 

update MemberList set membernum = membernum - 27;


-- 외래키로 참조되는 필드를 수정
update booklist set booknum = 17 where booknum = 5;
-- rentlist의 bnum에 8번이 있다면 변경 가능, 있으면 변경 불가 >> 있음

-- 해결법 1 : 외래키를 지우고 해당 booknum 과 bnum을 함께 수정한 후 다시 외래키 설정
-- 해결법 2 : PL/SQL 의 트리거 기능을 이용하여 동시에 변경


-- 레코드 삭제
-- >> delete from 테이블명 where 조건식
--	where 조건식이 생략될 경우 모든 레코드 삭제됨

-- rentlist 테이블에서 discount <= 10 인 레코드 지우기
delete from rentlist where discount <= 10;


-- 삭제의 제한
delete from booklist where booknum = 8;
-- integrity constraint (SCOTT.FK1) violated - child record found

-- 해결법 1
-- rentlist 테이블에 해당 도서 대여목록 레코드(child record) 모두 삭제 후
-- booklist 테이블에서 해당 도서를 삭제
delete from rentlist where bnum = 7;
delete from booklist where  booknum = 7;

-- 해결법 2
-- 외래키 제약 조건을 삭제 후 다시 생성
-- 외래키 생성 시 "옵션 추가"
-- "참조되는 값"(parents record)이 삭제되면 참조하는 값도 같이 삭제되게 구성

-- 외래키 삭제
alter table rentlist drop constraint fk1;

-- 새 외래키 추가
alter table rentlist add constraint fk1
foreign key (bnum) references booklist(booknum) on delete cascade;


-- memberlist 테이블에서 회원 한명을 삭제하면 rentlist 테이블에서도
-- 해당회원이 대여한 기록을 같이 삭제하도록 외래키 설정 바꿔주기
-- (외래키 제약 조건 삭제 후 재생성)
alter table rentlist drop constraint fk2;
alter table rentlist add constraint fk2
foreign key(mnum) references MemberList(membernum) on delete cascade;


