<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
   <title>로그인</title>
   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<link href="/resources/signin.css" rel="stylesheet">
</head>

<body class="text-center">

  <c:if test="${user == null}">	
    <form class="form-signin" role="form" method="post" autocomplete="off" action="${pageContext.request.contextPath }/login">
      <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
 
      <label for="userId" class="sr-only">아이디</label>
      <input type="text" id="userId" name="id" class="form-control" placeholder="아이디" required autofocus>
      
      <label for="userPass" class="sr-only">패스워드</label>
      <input type="password" id="userPass" name="pw" class="form-control" placeholder="비밀번호" required>
      
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>

      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </c:if>
  
	<c:if test="${msg == false}">
	   <p style="color:#f00;">로그인에 실패했습니다. 아이디 또는 패스워드를 다시 입력해주십시오.</p>
	</c:if>
	
	<c:if test="${user != null}">				
	   <p>${user.username}님 환영합니다.</p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   
	   <a href="${pageContext.request.contextPath }/restful/board">게시판 리스트</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   <a href="${pageContext.request.contextPath }/logout">로그아웃</a>
	</c:if>  
	
</body>
</html>