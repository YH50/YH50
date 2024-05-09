create table members (
	id varchar(10),
	name varchar(15),
	pwd varchar(20),
	phone varchar(15)
);

insert into members values ('Minji', '김민지', '1111', '010-0722-0507');
insert into members values ('Hanni', '팜하니', '2222', '010-0722-1006');
insert into members values ('Hyein', '이혜인', '5555', '010-0722-0421');

select * from members;

delete from members where name is null;
delete from members where id is null;

commit
