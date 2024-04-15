--CustomerTable.sql

create table customer(
	num number(3),
	name varchar2(10),
	email varchar2(20),
	tel varchar2(15)
);

insert into customer values(1, '김민수', 'abc1@abc.com', '010-1111-1234');
insert into customer values(2, '이민수', 'abc2@abc.com', '010-2222-1234');
insert into customer values(3, '박민수', 'abc3@abc.com', '010-3333-1234');
insert into customer values(4, '최민수', 'abc4@abc.com', '010-0004-1234');
insert into customer values(5, '강민수', 'abc5@abc.com', '010-5555-1234');

select * from customer