<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
	<!-- ${pageContext.request.contextPath} 이 프로젝트에서는
			= /ex-->  
</h1>
<img alt="" src="${pageContext.request.contextPath}/resources/images/img01.jpg" >
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
