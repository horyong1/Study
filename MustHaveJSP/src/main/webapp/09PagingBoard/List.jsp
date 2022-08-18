<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="model1.board.BoardDAO" %>
<%@ page import="model1.board.BoardDTO" %>
<%@ page import="utils.BoardPage" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO dao = new BoardDAO(application);

Map<String, Object> param = new HashMap<String, Object>();
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
if(searchWord != null){
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
	
}

int totalCount = dao.selectCount(param);

int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
int totalPage = (int)Math.ceil((double)totalCount / pageSize);

int pageNum = 1;
String pageTemp = request.getParameter("pageNum");
if(pageTemp != null && !pageTemp.equals(""))
	pageNum = Integer.parseInt(pageTemp);
	

int start = (pageNum -1) * pageSize + 1;
int end = pageNum * pageSize;
param.put("start",start);
param.put("end", end);


List<BoardDTO> boardLists = dao.selectListPage(param);
dao.close();

%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />
	<h2 align="center">목록 보기(List) - 현재 페이지 : <%= pageNum %> (전체 : <%= totalPage %>) </h2>
	<form method = "get">
	<table class="table table-dark table-sm" border="1" width="90%">
	<tr>
		<td align="center">
			<select class="btn btn-danger" name="searchField">
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="searchWord"/>
			<input type="submit" class="btn btn-primary" value="검색하기"/>
		</td>
	</tr>
	</table>
	</form>
	
	<table class="table table-dark table-sm" border="1" width="90%" >
	<tr>
		<th width="10%">번호</th>
		<th width="50%">제목</th>
		<th width="15%">작성자</th>
		<th width="10%">조회수</th>
		<th width="15%">작성일</th>
	</tr>
<%
if(boardLists.isEmpty()){
	

%>
	<tr>
		<td colspan="5" align="center">
			등록된 게시물이 없습니다.^^*
		</td>
	</tr>
<%
}else{
	//게시물이 있을 때 
	
	int virtualNum = 0;
	int countNum = 0;
	for(BoardDTO dto : boardLists){
//		virtualNum = totalCount--; // 기존 코드
		virtualNum = totalCount - (((pageNum -1 ) * pageSize) + countNum++);
		
%>



	<tr align="center">
		<td><%=virtualNum%></td>
		<td align="left">
			<a href="View.jsp?num=<%= dto.getNum() %>"><%= dto.getTitle() %>
		</td>
		<td align="center"><%=dto.getId() %></td>
		<td align="center"><%=dto.getVisitcount() %></td>
		<td align="center"><%=dto.getPostdate() %></td>
	</tr>
<%
	}
}
%>
	</table>
	
	<table class="table table-dark table-sm" border="1" width="90%">
		<tr align="center">
			<td><%= BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, request.getRequestURI()) %></td>
			<td><button  type="button" class="btn btn-primary" onclick="location.href='Write.jsp';">글쓰기</button></td>
		</tr>
	
	</table>
</body>
</html>