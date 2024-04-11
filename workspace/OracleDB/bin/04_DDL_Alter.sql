-- 04_DDL_Alter.sql

-- 생성
create table 테이블 이름();
create user scott identified by tiger;

-- 수정
alter table 테이블 이름 <수정내용>;
alter user 유저 이름 identifed by 비밀번호;

-- 1. 필드명의 변경
alter table 테이블이름 remame column 변경 전 필드 이름 to 변경 후 이름;

--booklist 테이블의 subject 필드명을 title로 수정,
alter table booklist RENAME column subject to title;
select * from booklist;

-- 반대로 title 필드명을 subject 필드명으로 수정.
alter table booklist rename column title to subject;


-- rentlist의 outprice 필드의 이름을 rentprice로 수정
alter table booklist rename column outprice to rentprice;

-- memberlist 테이블의 membername 필드를 name으로 변경
alter table memberlist rename column membername to name;


-- rentlist 테이블의 rent_date 필드를 rentdate로 변경.
alter table rentlist rename column rent_date to rentdate;


-- rentlist의 idx를 numseq으로 변경.
alter table rentlist rename column idx to numseq;


-- 2. 필드 자료형의 변경
-- - alter table 데이블명 MODIFY 필드형 자료형 (디폴트 OR 제약사항)

-- - varchar2(12)였던 memberlist 테이블의 name 필드, var2(30)으로 변경
alter table memberlist modify name varchar2(30);

-- booklist의 booknum 필드를 number(5)로 자료형 변경
alter table booklist modify booknum number(5); 	-- 실패

-- memberlist의 membernum 필드를 number(5)로 자료형 변경
alter table memberlist modify memberenum number(5);		--실패

-- rentlist의 bnum 필드를 number(5)로 자료형 변경
alter table rentlist modify bnum number(5);			--실패

-- rentlist의 mnum 필드를 number(5)로 자료형 변경
alter table rentlist modify mnum number(5);			--실패


-- 외래키로 연결되어 참조되고 참조하고 있는 필드들은 위의 명령으로 수정이 바로 불가함
-- 가능하게 하려면 외래키 제약 조건을 수정하여 없앤 후 참조되는 필드와 참조하는 필드를
-- 모두 수정한 후 외래키 제약 조건을 다시 설정함.
-- alter 명령에 의하여 제약 조건을 수정 또는 삭제하는 명령을 아래에서 배울 예정.




-- 3. 필드의 추가
-- ALTER TABLE 테이블명 ADD 필드면 자료형

--booklist에 구매 등급을 저장할 수 있는 grade 필드를 varchar2(15)로 추가
alter table booklist add grade varchar2(15);

-- memberlist에 성별 필드를 varchar 2(3)으로 추가 
alter table memberlist add gender varchar2(3);

-- memberlist 에 나이(age) 필드를 number(2)로 추가.
alter table memberlist add age number(2);


-- 4. 필드의 삭제
-- ALTER TABLE 테이블명 DROP COLUMN 필드명


-- memberlist 테이블에서 성별 필드 제거
-- alter table memberlist drop column gender;

--5. 제약 조건의 추가 및 삭제
-- 필드 레벨의 제약 조건의 수정 > modify 명령을 통해 수정, 생성, 삭제함.
-- memberlist의 gender 필드에 'M' 또는 'F' 둘 중 하나만 입력되게 제약 조건 설정
alter table memberlist modify gender varchar2(3) CHECK (gender = 'M' or gender = 'F');
alter table memberlist modify gender varchar2(3) CHECK (gender IN ('M', 'F') );
-- >> gender in() : gender 필드 값이 in 함수 안에 있는 값들일때만 true를 결과로 내기.

-- 테이블 레벨의 제약 조건 생성 및 삭제
-- 추가 : ALTER TABLE 테이블 명 ADD CONSTRAINT 제약조건명 제약조건식
-- 테이블 LEVEL 의 제약 조건은 위의 명령 형식으로 제약조건 이름과 같이 추가함.

-- memberlist 테이블의 나이 (age) 필드에 120살이 초과되는 나이는 입력되지 못하게 제약 조건 추가
alter table memberlist add constraint check_age CHECK (age <= 120);

--삭제 : ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명

--rentlist 테이블의 bnum에 걸려있었던 외래키 제약조건 제거 (fk1)
alter table rentlist drop constraint fk1;

--rentlist 테이블의 mnum에 걸려있었던 외래키 제약조건 제거 (fk2)
alter table rentlist drop constraint fk2;

--rentlist 테이블 기본키까지 제거 (rent_pk)
alter table rentlist drop constraint rent_pk;


-- booklist의 booknum 필드를 number(5)로 자료형 변경
alter table booklist modify booknum number(5); 

-- memberlist의 membernum 필드를 number(5)로 자료형 변경
alter table memberlist modify membernum number(5);

-- rentlist의 bnum 필드를 number(5)로 자료형 변경
alter table rentlist modify bnum number(5);	

-- rentlist의 mnum 필드를 number(5)로 자료형 변경
alter table rentlist modify mnum number(5);


--rentlist의 기본키(rent_pk)를 numseq로 설정
alter table rentlist add constraint rent_pk primary key (numseq);


--rentlist의 외래키를 fk1, fk2로 재설정
alter table rentlist add constraint fk1 foreign key (bnum) references booklist (booknum);
alter table rentlist add constraint fk2 foreign key (mnum) references memberlist (membernum);


-------------------------------직접 해보기-------------------------------------

create table ORDERS1(
	ORDER_ID NUMBER (12,0),
	ORDER_DATE DATE DEFAULT SYSDATE,
	ORDER_MODE VARCHAR2(8),
	CUSTOMER_ID NUMBER(6,0),
	ORDER_STATUS NUMBER(2,0),
	ORDER_TOTAL NUMBER(8,2) DEFAULT 0,
	SALES_REP_ID NUMBER(6,0),
	PROMOTION_ID NUMBER(6,0),
	constraint pk_order primary key (ORDER_ID),
	constraint ck_order_mode check (ORDER_MODE in ('direct', 'onine') )
);
--------------------------- 직접 해보기 -------------------------------------------
-- CUSTOMER_ID 필드명을 CUSTOMER_NUMBER 로 수정
-- PROMOTION_ID 값은 10000~99999 사이의 값만 저장 가능하게 수정

alter table ORDERS1 rename column CUSTOMER_ID to CUSTOMER_NUMBER;

--alter table ORDERS1 PROMOTION_ID NUMBER(5,0); 		>> 내가 한거
--답안--
alter table ORDERS1 add constraint pro_check check (PROMOTION_ID between 10000 and 99999);
-- or 						(이하 동일)						   check (promotion_id >= 10000 and promotion_id <= 99999);

CREATE TABLE orders2 as select * from ORDERS1;		-- 테이블 복사

DROP TABLE orders2 purge;














