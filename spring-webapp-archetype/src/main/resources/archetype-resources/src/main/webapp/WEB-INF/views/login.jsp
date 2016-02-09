#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url var="loginUrl" value="/login" />
	<form action="${symbol_dollar}{loginUrl}"  method="post">
		<div>
			<p>
				<label for="username">Username</label>
				<input type="text" id="username" name="username" title="Usuario" value="edicson" >
			</p>
			<p>	
				<label for="username">Password</label>
				<input type="password" id="password" name="password" title="Password" value="bigfoot69">
				<input type="hidden" name="${symbol_dollar}{_csrf.parameterName}" value="${symbol_dollar}{_csrf.token}" />
			</p>
			<input type="submit" value="Login" >
		</div>
	</form>
</body>
</html>