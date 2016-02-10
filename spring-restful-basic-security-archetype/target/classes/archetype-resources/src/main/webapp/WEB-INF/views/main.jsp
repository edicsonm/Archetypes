#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${symbol_dollar}{title}</title>
</head>
<body>
<strong>${symbol_dollar}{message}</strong>
  <div class="container">
    <h1>This is secured!</h1>
    <p>
      Hello <b><c:out value="${symbol_dollar}{pageContext.request.remoteUser}"/></b>
    </p>
    <c:url var="logoutUrl" value="/logout"/>
    <form class="form-inline" action="${symbol_dollar}{logoutUrl}" method="post">
      <input type="submit" value="Log out" />
      <input type="hidden" name="${symbol_dollar}{_csrf.parameterName}" value="${symbol_dollar}{_csrf.token}"/>
    </form>
  </div>
</body>
</html>