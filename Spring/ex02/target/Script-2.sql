SELECT * FROM BOARD b ;
INSERT INTO member(id, pass,name) values('musthave','1234','머스트해브');
INSERT INTO board(num,title,content,id,postdate,visitcount)
values(seq_board_num.nextval,'제목1입니다.','내용1입니다.','musthave',sysdate,0);
COMMIT;

INSERT INTO board(num,title,content,id,postdate,visitcount)
values(seq_board_num.nextval,'지금은 봄입니다.','봄의 왈츠','musthave',sysdate,0);
INSERT INTO board(num,title,content,id,postdate,visitcount)
values(seq_board_num.nextval,'지금은 여름입니다.','여름향기','musthave',sysdate,0);
INSERT INTO board(num,title,content,id,postdate,visitcount)
values(seq_board_num.nextval,'지금은 가을입니다.','가을동화','musthave',sysdate,0);
INSERT INTO board(num,title,content,id,postdate,visitcount)
values(seq_board_num.nextval,'지금은 겨울입니다.','겨울연가','musthave',sysdate,0);

SELECT * FROM MEMBER;

SELECT id, pass, rownum FROM MEMBER;

SELECT  * FROM (
	SELECT TB.*, rownum rNum FROM (
		SELECT * FROM board ORDER BY num DESC
	)TB 
)
WHERE rNum BETWEEN 1 AND 10;

CREATE TABLE myfile(
	idx NUMBER PRIMARY KEY,
	name varchar2(50) NOT NULL,
	title varchar2(200) NOT NULL,
	cate varchar2(30),
	ofile varchar2(100) NOT NULL,
	sfile varchar2(30) NOT NULL,
	postdate DATE DEFAULT sysdate NOT null
);

CREATE TABLE mvcboard(
	idx NUMBER PRIMARY KEY,
	name varchar2(50) NOT NULL,
	title varchar2(200) NOT NULL,
	content varchar2(2000) NOT NULL,
	postdate DATE DEFAULT sysdate NOT NULL,
	ofile varchar2(200),
	sfile varchar2(30),
	downcount number(5) DEFAULT 0 NOT NULL,
	pass varchar2(50) NOT NULL,
	visitcount NUMBER DEFAULT 0 NOT NULL
);

DROP TABLE mcvboard

SELECT * FROM mvcboard;

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'김유신','자료실 제목1 입니다.','내용','1234');

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'장보고','자료실 제목2 입니다.','내용','1234');

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'이순신','자료실 제목3 입니다.','내용','1234');

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'강감찬','자료실 제목4 입니다.','내용','1234');

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'대조영','자료실 제목5 입니다.','내용','1234');

INSERT INTO mvcboard(idx, name, title, content, pass)
values(seq_board_num.nextval,'연개소문','자료실 제목6 입니다.','내용','1234');

COMMIT

CREATE SEQUENCE seq_board;

CREATE TABLE tbl_board(
	bno number(10,0),
	title varchar2(200) NOT NULL,
	content varchar2(2000) NOT NULL,
	writer varchar2(50) NOT NULL,
	regdate DATE DEFAULT sysdate,
	updatedate DATE DEFAULT sysdate
);

ALTER TABLE tbl_board ADD CONSTRAINT pk_board
PRIMARY KEY (bno);

INSERT INTO tbl_board(bno, title, content, writer)
values(seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');

SELECT * FROM  tbl_board;














































SELECT * FROM myfile;