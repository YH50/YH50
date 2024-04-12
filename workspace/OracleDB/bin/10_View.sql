--10_View.sql

-- Oracle - view
--		- 물리적인 테이블에 근거한 논리적인 "가상 테이블" > 저장되어있는 select 문
--		- 가상이란 단어 : 실질적으로 데이터를 저장하고 있지 않아서 붙여진 것.
--		- 테이블이란 단어 : 실질적으로 저장된 데이터가 없더라도
--	  사용자는 마치 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있기 때문에 붙인 것.

--		- 뷰는 기본 테이블에서 파생된 객체로서 기본 테이블에 대한 하나의 쿼리문.
--		- 실제 테이블에 저장된 데이터를 뷰를 통하여 볼 수 있도록 함.

-- 뷰 생성 방법
create or replace view 뷰이름 as select 조회 명령 (select ~)

create or replace view empinfo as
select a.empno, a.ename, a.deptno, b.dname, b.loc
from EMP a, dept b
where a.deptno = b.deptno;

select * from empinfo;
-->> 위에 난잡하게 해놓은거를 간단하게 표현
-->> 위에서 수정 다 해놓고 띄우는건 이걸로만 실행함.

-- rentlist, memberlist, booklist 가 조인된 결과를
--	report 라는 이름의 뷰로 생성하기.
-- 대여일자, 도서번호, 제목, 회원번호, 이름, 차액(outprice-discount)

select * from booklist;
select * from memberlist;
select * from rentlist;


create or replace view report as
select a.rent_date as 대여일자, a.bnum as 등록번호,
b.subject as 선수명, c.membernum as 회원번호,
c.membername as 이름, (b.outprice-a.discount) as "차액"
from rentlist a, booklist b, memberlist c
where a.bnum = b.booknum and a.mnum = c.membernum;

select * from report;











