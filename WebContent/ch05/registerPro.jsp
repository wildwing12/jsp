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
request.setCharacterEncoding("utf8");
%>

<jsp:useBean id="registerBean" class="ch05.RegisterBean">
	<jsp:setProperty name="registerBean" property="*"/>
</jsp:useBean>
<%@page import="java.sql.Timestamp" %>
<%
out.println(System.currentTimeMillis());
registerBean.setReg_date(new Timestamp(System.currentTimeMillis()));
%>
아이디 :<jsp:getProperty property="id" name="registerBean"/><br>
비번 :<jsp:getProperty property="passwd" name="registerBean"/><br>
이름 :<jsp:getProperty property="name" name="registerBean"/><br>
가입 일자 :<jsp:getProperty property="reg_date" name="registerBean"/><br>
</body>
</html>