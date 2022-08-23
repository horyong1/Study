<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("출력되지 않는 텍스트");// 버퍼에 저장
	out.clearBuffer();//버퍼를 비움으로 윗줄 출력 값 사라짐
	
	out.print("<h2>out 내장 객체</h2>");
	//버퍼 크기 정보 확인
	out.print("출력 버퍼의 크기 : " + out.getBufferSize()+"<br>");
	out.print("남은 버퍼의 크기 : " + out.getRemaining()+"<br>");
	
	out.flush(); //버퍼 내횽 출력 후 비움
	out.print("flush 후 버퍼의 크기 : " + out.getRemaining()+"<br>");

	out.print(1);
	out.print(false);
	out.print('가');
%>
</body>
</html>