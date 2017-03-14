<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource 
		var="conn"
		driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:orcl"
		user="scott"
		password="tiger"
	/>
	<sql:query var="bank" dataSource="${conn}">
		select Max(AccountNo)+1 Accno from Bank
	</sql:query>
<c:set var="accno" value="0"/>
<c:forEach var="account" items="${bank.rows }">
<c:set var="accno" value="${account.Accno }"/>
</c:forEach>
Account No: <b> <c:out
</body>
</html>
