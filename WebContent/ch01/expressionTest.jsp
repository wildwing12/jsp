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
String[] str={"jsp","java","html","javascript"};
%>
<ul>
<%
for(String s:str){%>
<li><%=s %></li><!-- 표혀식 -->
<%} %>
<%-- <li><%out.print(s); %></li>--%></ul>
</body>
</html>