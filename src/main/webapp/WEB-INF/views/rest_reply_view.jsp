<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"></script>

<script>

	$(document).ready(function(){
		
		$('#replyContent').submit(function(event) {
			event.preventDefault(); 
	
			var bName = $("#bName").val();
			var bTitle = $("#bTitle").val();
			var bContent = $("#bContent").val();
			var bId = $("#bId").val();
			var bGroup = $("#bGroup").val();
			var bStep = $("#bStep").val();
			var bIndent = $("#bIndent").val();
			
			var form = {
					bName: bName,
					bTitle: bTitle,
					bContent: bContent,
					bId: bId,
					bGroup: bGroup,
					bStep: bStep,
					bIndent: bIndent
					
			};
			
			$.ajax({
				type: "POST", 
				url: $(this).attr("action"),
				cache:  false,
				contentType: 'application/json; charset=UTF-8', //contentType 은 data 설명 put을 쓰면 json형태로 넘겨야하고 stringify은 json으로 바꿔주는것
				data: JSON.stringify(form), //마임타입? 보안문제때문에 그냥 넘기면 안되고 json으로 넘겨줘야함
				success: function(result) {
					
					if (result == ("SUCCESS")) {
						/* windows.location.href = ${pageContext.request.contextPath}/restful/board */
						$(location).attr('href', '${pageContext.request.contextPath}/restful/board')
						// ↑ BOM 객체 
	
					}
				},
				error: function(e) {
					console.log(e);
				}
			})
		}); //end.submit()
	}); //end.ready()
</script>


</head>
<body>
  
  <table width="500" cellpadding="0" cellspacing="0" border="1">
		<form id="replyContent" action="${pageContext.request.contextPath}/restful/board/reply/${reply_view.bId}" method="post">
			
			<input type="hidden" id="bId" value="${reply_view.bId}"> 
			<input type="hidden" id="bGroup" value="${reply_view.bGroup}"> 
			<input type="hidden" id="bStep" value="${reply_view.bStep}">
		 <input type="hidden" id="bIndent" value="${reply_view.bIndent}">
			<tr>
				<td>번호</td>
				<td>${reply_view.bId}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${reply_view.bHit}</td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td><input type="text" id="bName" value="${reply_view.bName}"></td>
			</tr>
			
			<tr>
				<td>제목</td>
				<td><input type="text" id="bTitle" value="${reply_view.bTitle}"></td>
			</tr>
			
			<tr>
				<td>내용</td>
				<td><textarea rows="10" id="bContent">${reply_view.bContent}</textarea></td>
		<tr>
			<td colspan="2"><input type="submit" value="답변">&nbsp;
				&nbsp; <a href="list">목록보기</a></td>
		</tr>

		</form>
	</table>


</body>
</html>