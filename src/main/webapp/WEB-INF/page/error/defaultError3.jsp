<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ page import="java.lang.Exception" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Ĭ���쳣ҳ��_3</title>
</head>
<body>
Ĭ���쳣ҳ��_3<br>
    <% Exception ex = (Exception)request.getAttribute("ex"); %>
    <H2>Exception: <%= ex.getMessage()%></H2>
    <P/>
    <% ex.printStackTrace(new java.io.PrintWriter(out)); %>
</body>
</html>