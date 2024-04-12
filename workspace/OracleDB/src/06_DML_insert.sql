-- 06_DML.sql

-- DML (Data Management Language) : 데이터 조작 언어

-- 테이블에 레코드를 조작 (추가, 수정, 삭제, 조회)하기 위한 명령어들
-- INSERT (추가)
-- UPDATE (수정)
-- DELETE (삭제)
-- SELECT (조회 및 선택)


-- [ 샘플 테이블 생성 ]

create table exam01(
	deptno number(2),
	dname varchar2(15),
	loc varchar2(15)
);
select * from exam01;

-- [ 2. 레코드 추가 ]

--[방법 1] : 필드명 존재 o
insert into 테이블이름 (필드명1, 필드명2, ....) values (값1, 값2, ....);
--[방법 2] : 필드명 존재 x
insert into 테이블이름 values (값1, 값2, ....);

-- [1과 2의 차이점]

-- 1 : 필드명과 입력되어야 하는 값들이 일대일 매칭되어 입력됨.
--	    필드명의 순서는 반드시 지켜야 하는 건 아니지만 나열된 필드명 대로
--      값들의 순서는 맞춰서 입력하는 것을 권장함.
insert into exam01 (deptno, dname, loc) values ('기획부', 10, '서울'); >> X
insert into exam01 (deptno, dname, loc) values (10, '기획부', '서울'); >> O
insert into exam01 (loc, deptno, dname) values ('서울', 10, '기획부'); >> O
--		null 값을 허용하는 필드나 default 값이 있는 필드는 생략하고 입력 가능
insert into exam01 (deptno, dname) values (10, '기획부');	>> O

-- 2 : 모든 필드에 해당하는 값들을 최초에 테이블 생성 때 기술한
--		필드 순서에 맞게 모두 입력하는 방법
insert into exam01 values (10, '기획부', '서울'); >> O
-- 2번 방법은 null을 허용하는 곳을 비우고 입력할 수 없으며 null 이라도 직접 지정해야 함
insert into exam01 values (10, null, '서울'); >> O

-- 1, 2 모두 공통으로 숫자는 그냥 쓰고, 문자는 작은 따옴표로 묶어서 표현.

delete from booklist;		-- 테이블 내 모든 레코드 삭제 명령

--booklist 테이블에 레코드 10개 추가하기
--booknum : 시퀀스 이용

insert into booklist values (book_seq.nextVal, '윤동희', 2022, 3000, 10000);
insert into booklist values (book_seq.nextVal, '김민석', 2023, 3000, 5000);
insert into booklist values (book_seq.nextVal, '노시환', 2020, 3000, 13000);
insert into booklist values (book_seq.nextVal, '전준우', 2008, 3000, 9000);
insert into booklist values (book_seq.nextVal, '강민호', 2008, 3000, 7000);
insert into booklist values (book_seq.nextVal, '정보근', 2018, 3000, 5000);
insert into booklist values (book_seq.nextVal, '조세진', 2021, 3000, 4000);
insert into booklist values (book_seq.nextVal, '나승엽', 2021, 3000, 3500);
insert into booklist values (book_seq.nextVal, '최항', 2024, 3000, 4000);
insert into booklist values (book_seq.nextVal, '박세웅', 2015, 3000, 20000);
select * from booklist;

-- memberlist에 10명의 데이터 추가 (member_seq 이용)

insert into MemberList
values (member_seq.nextVal, '김민지', '010-0722-0507', '04.05.07', 700, 'F', 19);
insert into MemberList
values (member_seq.nextVal, '강해린', '010-0722-0515', '06.05.15', 900, 'F', 17);
insert into MemberList
values (member_seq.nextVal, '팜하니', '010-0722-1006', '04.10.06', 500, 'F', 19);
insert into MemberList
values (member_seq.nextVal, '모지혜', '010-0722-0411', '04.04.11', 300, 'F', 18);
insert into MemberList
values (member_seq.nextVal, '이혜인', '010-0722-0421', '08.04.21', 300, 'F', 15);
insert into MemberList
values (member_seq.nextVal, '이대호', '010-0010-8577', '82.06.21', 1010, 'M', 40);
insert into MemberList
values (member_seq.nextVal, '김태균', '010-5252-1010', '82.05.29', 520, 'M', 40);
insert into MemberList
values (member_seq.nextVal, '김광현', '010-0290-1111', '88.07.22', 290, 'M', 35);
insert into MemberList
values (member_seq.nextVal, '양현종', '010-5400-0054', '88.03.01', 540, 'M', 35);
insert into MemberList
values (member_seq.nextVal, '배지연', '010-0358-3333', '99.07.26', 3, 'M', 24);

select * from MemberList;
delete from MemberList;

-- rentlist 테이블도 rent_seq로 10개 데이터 추가하기

insert into rentlist values (rent_seq.nextVal, '2024.01.01', 7, 1, 720);
insert into rentlist values (rent_seq.nextVal, '2024.01.01', 10, 2, 720);
insert into rentlist values (rent_seq.nextVal, '2024.01.01', 11, 3, 720);
insert into rentlist values (rent_seq.nextVal, '2024.01.01', 6, 4, 720);
insert into rentlist values (rent_seq.nextVal, '2024.01.01', 5, 5, 720);
insert into rentlist values (rent_seq.nextVal, '2024.03.23', 10, 6, 1000);
insert into rentlist values (rent_seq.nextVal, '2024.03.23', 52, 7, 5200);
insert into rentlist values (rent_seq.nextVal, '2024.03.23', 29, 8, 2900);
insert into rentlist values (rent_seq.nextVal, '2024.03.23', 54, 9, 5400);
insert into rentlist values (rent_seq.nextVal, '2024.03.23', 3, 10, 300);

select * from rentlist;

commit		-- 현재 창에서 commit은 세미콜론을 붙히지 않음.

-- 데이터베이스 백업 명령
exp userid = scott/tiger file = abc.dmp log = abc.log

-- 데이터베이스 복원 명령
imp userid = scott/tiger file = abc.dmp log = abc.log full = y

-- [ oracle 의 백업 명령과 복원 명령은 모두 command 창에서 실행 ]
















