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




