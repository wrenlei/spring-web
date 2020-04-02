<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>增加</title>
</head>
<body>
示例
<form action="${ctx}/test/save" method="post">
<br>id:&nbsp;&nbsp;&nbsp;<input name="id" value="1"/>
<br>name:&nbsp;&nbsp;&nbsp;<input name="name" value="哈哈"/>
<br>age:&nbsp;&nbsp;&nbsp;<input name="age" value="12"/>
<br>birthday:&nbsp;&nbsp;&nbsp;<input name="birthday" value="2010-11-11"/>
<br><button type="submit">提交</button>
</form>
1111:${ctx}
</body>
</html>