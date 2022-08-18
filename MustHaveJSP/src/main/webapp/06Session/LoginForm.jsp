<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Session</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />

	<br>
	<h2 style="text-align: center">로그인 페이지</h2>
	<br>
	<span style="color: red; font-size: 1.2em;"> <%=request.getAttribute("LoginErrMsg") == null ? "" : request.getAttribute("LoginErrMsg")%></span>

	<%
	if (session.getAttribute("UserId") == null) {
	%>
	<script>
		function validateForm(form) {
			if (!form.user_id.value) {
				alert("아이디를 입력하세요.");
				return false;
			}
			if (form.user_pw.value == "") {
				alert("패스워드를 입력하세요.");
				return false;
			}
		}
	</script>
	<div>
		<form style="text-align: center" action="LoginProcess.jsp"
			method="post" name="loginFrm" onsubmit="return validateForm(this);">
			아이디 <br />
			<input type="text" class="border border-info" name="user_id" /><br />
			패스워드 <br />
			<input type="password" class="border border-info" name="user_pw" /><br />
			<input type="submit" class="btn btn-outline-primary" value="로그인하기" />

		</form>
	</div>
	<%
	} else {
	%>

	<%=session.getAttribute("UserName")%>
	회원님, 로그인하셨습니다.
	<br />
	<a href="Logout.jsp">[로그아웃]</a>
	<%
	}
	%>
</body>
</html>