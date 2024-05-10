CREATE TABLE `board`.`board` (
  `num` INT NOT NULL AUTO_INCREMENT,
  `pass` VARCHAR(45) NOT NULL,
  `userid` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `readcount` INT NULL DEFAULT 0,
  `writedate` DATETIME NULL DEFAULT now(),
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;



CREATE TABLE `board`.`member` (
  `userid` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;



insert into member values('kang1', '강해린', '1234', 'kitty0515@naver.com', '010-0722-0515');
insert into member values('kang2', '강해링', '1234', 'kitty0516@naver.com', '010-0722-0516');
insert into member values('kang3', '강해륀', '1234', 'kitty0517@naver.com', '010-0722-0517');

insert into board(pass, userid, email, title, content)
values('1234', 'kang1', 'kitty0515@naver.com', '안녕 친구들', '내 이름은 바네사 강');
insert into board(pass, userid, email, title, content)
values('1234', 'kang2', 'kitty0516@naver.com', '어 그래 내 왔다.', '롯데 해체해라');
insert into board(pass, userid, email, title, content)
values('1234', 'kang3', 'kitty0517@naver.com', '뭐고 이거', '야구하고 싶다');
insert into board(pass, userid, email, title, content)
values('1234', 'kang1', 'kitty0515@naver.com', '위에 다 내 사칭임...', '나쁜 사람들ㅠㅠ');

select * from member
select * from board;

