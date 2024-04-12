--09_Join.sql

-- 여기가 어렵다고 하신다... ㅈ됐다...

select * from emp;
select * from dept;
drop table emp2;

create table emp2 as select ename, deptno from emp where job = 'SALESMAN';
select * from emp2;
 

-- [1]. 사원명이 'SCOTT'인 사원의 부서명을 알고 싶을 때
select deptno from emp where ename = 'SCOTT';	-- 20
select dname from dept where deptno = 20;		--RESEARCH
-- 서브 쿼리 사용
select dname from dept where deptno = (select deptno from emp where ename = 'SCOTT');

--JOIN
-- >> 2개 이상의 테이블에 나눠져 있는 관련 데이터들을
--		하나의 테이블로 모아서 조회하려고 할 때 사용하는 명령어.

-- cross join : 2개 이상의 테이블이 조인
-- " 가장 최악의 결과를 얻어버림 "
select * from emp2, dept;

-- equi join : 조인 대상이 되는 두 테이블에서 공통으로 존재하는
--				컬럼의 값이 일치하는 행을 연결하여 결과를 생성.
select * from emp2, dept where emp2.deptno = dept.deptno;
select * from emp2 a, dept b where a.deptno = b.deptno;
select * from emp a, dept b where a.deptno = b.deptno;

---------------예               제-------------------------------

-- rentlist 의 대여일자, 도서번호, 회원번호, 할인금액 출력하되,
--				도서 제목을 도서번호 옆에 출력하기.

select * from rentlist;
select * from booklist;
select * from MemberList;
select a.rent_date, a.bnum, b.subject, a.mnum, a.discount from rentlist a, booklist b
where a.bnum = b.booknum;

--rentlist의 대여일자, 도서번호, 회원번호, 할인금액 출력하되,
--			회원 이름을 회원번호 옆에 출력하기.
select a.rent_date, a.bnum, a.mnum, b.membername, a.discount from rentlist a , MemberList b
where a.mnum = b.membernum;

--rentlist의 대여일자, 도서번호, 회원번호, 할인금액 출력하되,
--			책 제목, 회원 이름을 도서번호와 회원번호 옆에 출력하기.

select a.rent_date, a.bnum, b.subject, a.mnum, c.membername, a.discount, b.outprice-a.discount as "차액"
from rentlist a , booklist b, MemberList c
where a.bnum = b.booknum and a.mnum = c.membernum;

------------------------------------------------------------------------------
-- non-equi join
-- 동일 컬럼이 없어서 다른 조건을 사용하여 조인시키기.
-- 조인 조건에 특정 범위 내에 있는지를 조사하기 위해
-- 			조건절에 조인 조건을 '=' 연산자 이외의 비교.
select * from EMP;
select * from SALGRADE;

select a.ename, a.sal, b.grade
from EMP a, SALGRADE b
where a.sal >= b.losal and a.sal <= b.hisal;

select a.ename, a.sal, b.grade
from EMP a, SALGRADE b
where a.sal between b.losal and b.hisal;


-- outer join
-- 조인 조건에 만족하지 못해서 해당 결과를 출력 시 누락이 되는
-- 문제점이 발생할 때 해당 레코드를 출력하는 조인

select a.booknum, a.subject, b.rent_date from booklist a, rentlist b
where a.booknum = b.bnum(+);

-- EMP 테이블에는 deptno에 40인 레코드가 1도 없기 때문에
--	조인된 결과에는 40번 부서의 이름, loc 모두 표시가 안됨.
select * from EMP a, dept b
where a.deptno(+) = b.deptno;


-- ANSI join

-- 일반 equi 조인
select a.ename, b.dname
from EMP a, dept b
where a.deptno = b.deptno;

-- ANSI Inner join
-- [표현 방식]
select ename, dname
from EMP inner join dept on EMP.deptno = dept.deptno;
-- 서로 비교되는 필드명이 같을 때에 한하여 사용할 수 있는 또 다른 방법
select ename, dname
from EMP inner join dept using (deptno);

-- ANSI Outer join
-- [기존 아우터 조인의 표현 방식]
select * from EMP, dept
where EMP.deptno(+) = dept.deptno;

select * from rentlist, booklist
where rentlist.bnum(+) = booklist.booknum;

-- [아우터 조인 표현 방식]
select * from EMP right outer join dept on emp.deptno = dept.deptno;
select * from rentlist right outer join booklist on rentlist.bnum = booklist.booknum;



















