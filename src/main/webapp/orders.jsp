<%@page import="java.util.*"%>
<%@page import="cn.tut.model.User"%>
<%@page import="cn.tut.model.*"%>
<%@page import="cn.tut.connection.DBConn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	 User auth = (User) request.getSession().getAttribute("auth");
	if(auth != null){
		request.setAttribute("auth", auth);
	}
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	if(cart_list != null){
		request.setAttribute("cart_list", cart_list);
	}
	%>
<!DOCTYPE html>
<html>
<head>
<title>Orders Page</title>
<%@include file="includes/head.jsp" %>
</head>
<body>
<%@include file="includes/navbar.jsp"%> 

<%@include file="includes/footer.jsp" %>
</body>
</html>