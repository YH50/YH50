-- 08_DML_Select.sql

-- 이거 자주 쓰이는 거니까 중요하다!!!!!!!!!!!

-- 오라클 명령어 : select 문(검색)
-- 가장 사용 빈도수가 높은 명령

-- [1] scott 사용자가 관리하고 있는 테이블 목록
select * from tab;
select * from tabs;

-- [2] 특정 테이블의 구조 조회 (필드 리스트/데이터 형식)
desc booklist;		-->> 명령프롬프트에서 sqlplus로 확인 필요
desc memberlist;		-->> 얘도 마찬가지

-- [3] 테이블의 제약사항 조회
select * from user_constraints;		-- 모든 제약사항
select * from user_constraints where table_name = 'RENTLIST';
select * from user_constraints where table_name = 'BOOKLIST';
select * from user_constraints where table_name = 'MEMBERLIST';

-------------------------------------------------------------------
-- SELECT 사용법
-- SELECT : select와 from 사이에 조회하려는 필드명을 , 로 구분하여 나열
select booknum, subject, inprice from booklist;
-- 모든 필드를 한번에 지목할 때는 * 사용
-- from 뒤에는 대상 테이블명 작성
-- where 절을 붙여 조건에 맞는 행을 골라내기도 함.
select 필드명들 또는 * from 테이블명 where 검색 조건

-- 출판년도가 2020 이후인 도서의 제목과 출판년도 조회
select subject, makeyear from booklist where makeyear >= 2020;

select * from booklist; -- > 검색 조건 없이 모든 필드를 조회하여 열람

-- 연산의 결과가 필드의 항목을 조회할 수 있음.
select subject, outprice - inprice as margin from booklist;
select subject as 선수명, outprice - inprice as "인상폭(만원)"  from booklist;
select booknum || '-' || subject as "plyr info" from booklist;
-- 오라클 SL에서 || 는 이어붙이기 연산임.


-- 중복 제거 : distinct
select bnum as 대여번호들 from rentlist;
select distinct bnum as 대여번호들 from rentlist;


-- 함수의 사용
select avg(inprice) as 입단연봉 from booklist;

-- 검색 조건 : update 와 delete 에서 사용했던 where 와 사용방식 유사

----------------------------직접 해보기---------------------------------

-- MemberList에서 "김" (수업은 홍) 으로 시작하는 모든 회원 정보 출력
-- MemberList에서 98년도 이후 출생한 모든 회원 정보 출력
-- booklist에서 입단년도가 2016년 이전이거나 현재 연봉이 6000 이하인 모든 자료 출력
-- booklist에서 이름 중간 글자가 '동' 인 선수 정보
--___________________________________________________

select * from MemberList where membername like '김%';
select * from MemberList where birth >= '1998-01-01';
select * from booklist where makeyear < 2016 or outprice <= 6000;
select * from booklist where subject like '_동%';
----------------------------------------------------------------------------

-- IN ANY SOME ALL을 이용
-- 부서번호가 10,20,30D 인 사원들의 모든 필드 조회
-- #1.
select * from EMP where deptno  = 10 or deptno = 20 or deptno = 30;
-- #2.
select * from EMP where deptno <> 40;
-- #3.
select * from EMP where deptno in (10,20,30);

-- [1] ANY 
select * from EMP where deptno = any (10, 20, 40);
-- >> 나열된 괄호 안 내용 중 하나라도 해당이 되면 검색 대상으로 취급.
-- in 과 유사함

-- [2] SOME 조건식 : ANY 와 동일함
select * from EMP where deptno = some(10, 20 ,40);

-- [3] ALL
select * from EMP where deptno = all(10, 20, 40);
-- 괄호 안의 모든 값이 동시 만족해야 하는 조건이므로
-- 해당하는 레코드가 없을 때가 대부분, 사용빈도 현저히 낮음.

select * from EMP where deptno <> all(10, 20, 40);
-- 이처럼 구성내용과 모두 같지 않을 때를 필터링할 때 자주 사용함.
-- >> 위 예문을 in으로 표현
select * from EMP where deptno NOT in(10, 20, 40);

-----------------------select 관련 예제------------------------------

-- 부서번호가 10이 아닌 사원
select * from EMP where NOT (deptno = 10;)
select * from EMP where deptno <> 10;

-- 급여가 1000불 이상 3000불 이하
select * from EMP where SAL >= 1000 and SAL <= 3000;
select * from EMP where SAL between 1000 and 3000;

-- 사원 연봉 출력
select deptno, ename, sal * 12 as 연봉 from EMP;

-------------------------------------------------------------------------

-- 정렬 (SORT) : where 구문의 뒤 또는 맨 끝에 Order by 필드명 [desc]
-- select 명령의 결과를 특정 필드값의 오름차순이나 내림차순으로 정렬하라는 명령
-- asc : 오름차순 정렬, 쓰지 않으면 기본 오름차순 정렬로 실행
-- desc : 내림차순 정렬 >> 반드시 정렬기준이 되는 필드명 뒤에 써야함

-- EMP 테이블에서
-- 연봉이 1000 이상인 데이터를 ename 의 오름차순으로 정렬하여 조회
select * from EMP where SAL >= 1000 order by ename;
-- >> 오름차순일 경우 asc 는 생략 가능
-- 연봉이 1000 이상인 데이터를 ename 의 내림차순 정렬하여 조회
select * from EMP where SAL >= 1000 order by ename desc;

-- job으로 내림차순 정렬하되 같은 job_id 사이에서는
--								순서를 hiredate 내림차순으로 정렬
select * from EMP order by job desc, hiredate desc;
-- >> 2가지 이상의 정렬 기준이 필요한 경우 위와 같이 "," 로 구분하여
--		여러 개의 기준을 지정해주고, 예제처럼 job으로 1차 정렬한 다음
--						같은 job 값들 사이에 hiredate 로 내림차순 정렬.














