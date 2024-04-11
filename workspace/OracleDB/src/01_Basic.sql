--SQL 파일에서의 주석문 : "--" 표시

--Table : 데이터베이스에서 사용되는 데이터 집합의 단위, 흔히 말하는 "표" 양식
--Field : 열에 해당하는 데이터 단위 (속성, 어트리뷰트)
--Record : 행에 해당하는 데이터 단위 (튜플)

-- >> 위와 같은 표 형식의 데이터베이스 = "관계형 DB"

--현재 출시되어 DB로 활용되는 제품들 : MySQL, MSSQL, MariaDB,
--								MongoDB, Access 등등

--DB 프로그램에는 저장하는 공간이나 기능이 있지만 구현 프로그램은 별도.
--DB의 조작 운영을 가능하게 해주는 프로그램 : DBMS
--							(DataBase Management System)
--각 DB 제품들에는 자신의 DB를 관리할 수 있는 DBMS가 존재함.
--오라클 데이터베이스에서 사용 가능한 DBMS : SQL Developer, SQLPLUS, Eclipse 등등



--사용되는 언어 (Language)
--SQL(Structured by Query Language) : 관계형 DB 관리 시스템(RDBMS)의
-- 					데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어

--SQL의 종류 3가지 (알아만 두기)
--1. DDL (Database Definition Language) - create user ~...
--2. DML (Database Management Language)
--3. DCL (Database Control Language) - grant dba to ~...

--DDL : 데이터 정의어
--명령의 예 : Create, Alter, Drop
--Create : 테이블, 뷰, 사용자 등을 생성할 때 사용하는 명령
--Alter : 이미 생성되어 있는 테이블, 뷰, 사용자 등의 구조를 수정하기 위한 명령
--Drop : -------------------------------등을 삭제하기 위한 명령

--DML : 데이터 조작어 (레코드 단위의 처리)
--명령의 예 : Insert, Update, Delete, Select
--Insert : 테이블에 레코드를 추가하기 위한 명령
--Update : 테이블에 있는 레코드 중 일부 또는 전부를 수정하기 위한 명령
--Delete : -----------------------------를 삭제하기 위한 명령
--Select : -----------------------------를 조회(검색)하여 열람하기 위한 명령

--DCL : 데이터 제어어
--명령의 예 : Grant, Revoke
--Grant : 특정 사용자에게 권한 설정
--Revoke : ---------- 권한 해제








