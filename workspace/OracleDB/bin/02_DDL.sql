--02_DDL.sql
--DDL 데이터 정의어

--테이블의 생성 Create

--명령 양식
create table 테이블이름(
   필드명1, datatype [default 값 or 제약조건 등], 
   필드명2, datatype [default 값 or 제약조건 등],
   필드명3, datatype [default 값 or 제약조건 등],
   필드명4, datatype [default 값 or 제약조건 등],
   .
   .
   .
   필드명, datatype [default 값 or 제약조건 등]
);

--도서 대여점의 도서 목록 테이블의 생성
--필드 : booknum, subject, makeyear, inprice, outprice
--자료형 : booknum(문자5자리), subject(문자30), makeyear(숫자4),
--		inprice(숫자6), outprice(숫자6)
--제약조건 : booknum(Not null), subject(Not null), makeyear(),
--         inprice(), outprice()
--테이블 명 : booklist 
---------------------------------------------------------
create table booklist(
	booknum varchar2(5), 
	subject varchar2(30) not null,
	makeyear number(4), --4바이트 아니고 4자리 숫자(0000~9999)
	inprice number(6) not null,
	outprice number(6) not null,
	-- 필드명 옆 현재 필드에만 적용하는 제약 조건 > 필드레벨의 제약
	-- 아래에다 작성 > 테이블레벨의 제약 조건
	constraint booklist_pk primary key(booknum)
	--constraint : 테이블 수준의 제약 조건을 지정하는 키워드(명령)
	--booklist_pk : 테이블 외부에서 현재 제약 조건을 컨트롤하기 위한 제약 조건의 고유 이름 
	--primary key(booknum) : 기본키로 booknum을 지정하겠다는 뜻.
);
select * from booklist;
drop table booklist purge; 	--purge : 휴지통 없이 그냥 삭제

--기본키(Primary Key) : 테이블을 구성하는 필드들 중에서 갖는 값들이 빈칸이 없고
--	서로 다른(유일한) 값들을 갖고 있어 레코드들을 유일하게 구분해낼 수 있는 필드
-- 테이블을 구성하는 필드들 중 자격이 되는 필드 중 하나에 부여하는 테이블의 대표값
-- >> 기본키를 지정함으로써 기본키가 지정되지 않았을때 발생할 수 있는 오류들을
-- 		미연에 방지할 수 있다.
-- 기본키로 하여금 결함을 없애고 유지가 되는 것 >> "개체 무결성"


-- create table 명령의 세부 규칙
--1. 테이블의 이름은 객체를 의미할 수 있는 적절한 이름을 사용할 것.
--2. 다른 테이블과 이름이 중복되지 않게 설정함.
--3. 한 테이블 내에서 필드 이름도 중복되지 않도록 함.
--4. 각 필드들은 ","로 구분하여 생성함.
--5. create 를 비롯한 모든 sql 명령은 ";"로 마침.
--6. 필드명 뒤에 datatype 은 반드시 지정하고 []안 내용은 해당 내용이 있을 때 작성하며 생략도 가능함.
--7. 예약어, 명령어 등은 테이블명 또는 필드명으로 쓸 수 없음.
--8. 테이블 생성 시 대,소문자 구분은 없음. >> 기본적으로 테이블이나 컬럼 명은 대문자로 생성됨
--		create table
--		CREATE TABLE
--		Create Table (이건 안된다고 말했는데 맞나)
--9. 보통 데이터 형식과 용량(크기)을 지정하는데, date 데이터 형식은 유형을 별도로 크기를 지정하지 않음
--10. 문자 데이터의 DataType -> varchar2(10), number(4)
--11. 문자 데이터 유형은 반드시 가질 수 있는 최대 길이를 표시해야 함.
--12. 숫자 데이터 형식은 byte 수로 표현하지 않고 자릿수로 표현. number(4) -> 4자리 수
--13. 컬럼(필드) <> 컬럼(필드) 간의 구분은 콤마로 하되,
-- 							마지막 컬럼이나 constraint를 작성한 후에는 콤마를 찍지 않음.
 

-------------테이블 직접 만들어보기------------------------
create table MemberList(
	memberNum varchar2(5) not null,
	memberName varchar2(12) not null,
	Phone varchar2(13) not null,
	Birth date,
	Bpoint number(6),
	constraint MemberList_pk primary key(memberNum)
);

select * from MemberList;


-- 외래키(Foreign Key) : 테이블 간의 필수 포함 관계에 있어서
--								상대 테이블의 특정 필드값을 참조하면서 없는 값은 사용할 수 없게 하는 규칙.
--							외래키로 유지되는 무결성 >> "참조 무결성"
-- ex) booklist에 존재하지 않는 도서의 번호가 rentlist의 대여 도서의 번호로 등록되지 못하게 하는 것.

-------------------테이블 직접 만들어보기--------------------------
create table rentlist(
	idx number(3),		--대여기록번호
--	rent_seq number(3)  	-- 하루 안에서 지정된 순번
	rent_date date default sysdate,		--대여 날짜//		sysdate : 현재 시각 표시
	bnum number(5) not null,		--대여해간 도서번호
	mnum number(5) not null,		--대여한 회원의 회원번호
	discount number(4) default 500,		--할인 금액
--	constraint rent_pk primary key(rent_date, rent_seq)
	constraint rent_pk primary key(idx),
	constraint fk1 foreign key(bnum) references booklist(booknum),
	-- 현재 테이블의 bnum 필드는 booklist 테이블의 booknum 필드값을 참조함.
	constraint fk2 foreign key(mnum) references memberlist(membernum)
	-- 현재 테이블의 mnum 필드는 memberlist 테이블의 membernum 필드값을 참조함.
);

select * from rentlist;


-- 외래키의 참조 대상이 되는 필드는 그 쪽 테이블의 기본키여야 함.

--제약 조건 (Constraint)
-- PRIMARY KEY
-- - 테이블에 저장된 레코드를 고유하게 식별하기 위한 키, 한 테이블 당 하나의 기본키만 정의할 수 있음.
-- - 여러 필드가 조합된 기본키의 생성이 가능함.
-- - 기본키는 중복값을 가질 수 없으며 빈칸도 가능함.
-- - PRIMARY KEY = UNIQUE KEY + NOT NULL

-- UNIQUE KEY
-- - 테이블에 저장된 행 데이터를 고유하게 식별하기 위한 고유키를 정의함.
-- - 단 NULL은 고유키 제약의 대상이 아니므로, NULL 값을 가진 행이 여러개여도
--				Unique Key의 제약에 위배되지는 않음.

-- NOT NULL
-- - "공백", 즉 아무 것도 없는 상태를 허용하지 않음.			 >> 입력 필수!!

-- CHECK
-- -입력할 수 있는 값의 범위를 제한함.
-- - >> TRUE 또는 FALSE로 평가할 수 있는 논리식을 지정함.

-- FOREIGN KEY
-- - 관계형 DB에서 테이블 간의 관계를 정의하기 위해 기본키를 다른 테이블의 외래키로 복사하는 경우 생성됨.
-- - >> 참조 무결성 제약 옵션이 생성됨.




