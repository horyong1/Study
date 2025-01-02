<%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUpload</title>
<script type="text/javascript">
	function validateForm(form) {
		if (form.name.vlaue == "") {
			alert("작성자를 입력하세요.");
			form.name.focus();
			return false;
		}
		if (form.title.vlaue == "") {
			alert("제목을 입력하세요.");
			form.name.focus();
			return false;
		}
		if (form.attachedFile.vlaue == "") {
			alert("첨부파일은 필수 입력입니다.");
			form.name.focus();
			return false;
		}

	}
</script>
</head>
<body>
	<br/>
	<h3>파일 업로드</h3>
	<span style="color: red;">${errorMessage }</span>
	<form name="fileForm" method="post" enctype="Multipart/form-data"
		action="UploadProcess.jsp" onsubmit="return validateForm(this);">
		<b>작성자 :</b> <input class="form-control" type="text" name="name" value="머스트해브" /><br /> 
		<b>제목 :</b>  <input class="form-control" type="text" name="title" /><br/>
		<b>카테고리(선택사항) :</b><br/>
		<input class="form-check-input" type="checkbox" name="cate" value="사진" checked />사진 
		<input class="form-check-input" type="checkbox" name="cate" value="과제"  />과제 
		<input class="form-check-input" type="checkbox" name="cate" value="워드"  />워드
		<input class="form-check-input" type="checkbox" name="cate" value="음원"  />음원<br/>
		<br/><b>첨부파일 :</b><br/>
		<input type="file"  name="attachedFile" /><br /><br/>
		<input type="submit" class="btn btn-primary" value="전송하기" />
	</form>
</body>
</html>