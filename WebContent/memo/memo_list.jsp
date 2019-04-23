<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %> 
<%@ page import="memo.MemoDTO" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//서블릿에서 넘겨준 list변수 조회
List<MemoDTO> items=(List<MemoDTO>)request.getAttribute("list");
%>
<table border="1">
 <tr>
   <th>번호</th>
   <th>이름</th>
   <th>메모</th>
   <th>날짜</th>
 </tr>
 <% for(MemoDTO dto : items) { %>
 <tr>
   <td><%=dto.getIdx() %></td>
   <td><%=dto.getWriter() %></td>
   <td><%=dto.getMemo() %></td>
   <td><%=dto.getPost_date() %></td>
 </tr>
 <% } %>
</table>
</body>
</html>