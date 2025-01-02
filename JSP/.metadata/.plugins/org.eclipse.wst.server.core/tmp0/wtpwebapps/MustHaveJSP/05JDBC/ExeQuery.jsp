<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="common.JDBConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회언 목록 조회 테스트(excuteQuery() 사용) </h2>
	<%
	JDBConnect jdbc = new JDBConnect();
	
	String sql = "SELECT ID, PASS, NAME, regidata FROM MEMBER";
	Statement stmt = jdbc.con.createStatement();
	
	
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()){
		String id = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString("name");
		java.sql.Date regidate = rs.getDate("regidata");
		
		out.println(String.format("%s %s %s %s",id,pw,name,regidate)+ "<br/>");
	}
	
	jdbc.close();
	%>
</body>
</html>