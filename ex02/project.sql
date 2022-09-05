CREATE SEQUENCE seq_board

CREATE TABLE tbl_board (
	bno number(10,0),
	title varchar2(200) NOT NULL,
	content varchar2(2000) NOT NULL,
	writer varchar2(50) NOT NULL,
	regdate DATE DEFAULT sysdate,
	updatedate DATE DEFAULT sysdate
);

ALTER TABLE tbl_board ADD CONSTRAINT pk_board
PRIMARY key(bno);

INSERT INTO TBL_BOARD (bno, title, content, WRITER)
values(seq_board.nextval, '테스트 제목', '테스트 내용', 'user00');

SELECT * FROM TBL_BOARD

DELETE FROM TBL_BOARD WHERE BNO>50


CREATE TABLE BBOARD(
	NUM NUMBER(5)	PRIMARY KEY,
	PASS VARCHAR2(30),
	NAME VARCHAR2(30),
	EMAIL VARCHAR2(30),
	TITLE VARCHAR2(30),
	CONTENT VARCHAR2(1000),
	READCOUNT NUMBER(4) DEFAULT 0,
	WRITEDATE DATE DEFAULT SYSDATE
);

CREATE SEQUENCE BOARD_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO BBOARD(num,name,email,pass,title,content) 
VALUES(BOARD_SEQ.NEXTVAL, '홍길동','ghdrlfehd@naver.com','1234','첫방문','반갑습니다.');

SELECT * FROM BBoard;


