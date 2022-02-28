<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="text/html;UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<%
		int i = Integer.parseInt(request.getParameter("num1"));// request est donné par default
		int j = Integer.parseInt(request.getParameter("num2"));// request est donné par default
		
		int k = i + j;
		
		out.println("output"+k);
	 %>	
</body>
</html>