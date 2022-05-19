<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<%@include file ="../common/head.jsp"%>

<link href="../../../resources/css/board/board.css" rel="stylesheet">

<body>

<%@include file ="../common/header.jsp"%>


 
<div class="container" style="margin-top: 2%">
	<div class="bd-example">
		<button type="button" class="btn btn-outline-dark" 
		onclick="location.href='/board/regist' " style="float: right;">글 등록</button>
		<table class="table">
			<colgroup>
				<col style="width:5%;">
				<col style="width:40%;">				
				<col style="width:15%;">				
				<col style="width:20%;">
				<col style="width:20%;">
			</colgroup>
			<thead class="thead-dark">
				<tr>
					<th class="bno_width">번호</th>
					<th class="title_width">제목</th>
					<th class="writer_width">작성자</th>
					<th class="regdate_width">작성일</th>
					<th class="updatedate_width">수정일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
					    <td><c:out value="${list.bno}"/></td>
					<td>
						<a class="move" href='<c:out value="${list.bno}"/>'>
							<c:out value="${list.title}"/>
						</a>			
					</td>
				    	<td><c:out value="${list.writer}"/></td>
						<td><fmt:formatDate value="${list.regdate}" pattern="yyyy/MM/dd"/></td>
						<td><fmt:formatDate value="${list.updateDate}" pattern="yyyy/MM/dd"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<form id="moveForm" method="get">    
    </form>
</div>

<script>
$(document).ready(function(){
	
	let result = '<c:out value="${result}"/>';
	
	checkAlert(result);
	
	function checkAlert(result){
		
		if(result === ''){
			return;
		}
		
		if(result === "regist success"){
			alert("등록이 완료되었습니다.");
		}
        if(result === "modify success"){
            alert("수정이 완료되었습니다.");
        }
        if(result === "delete success"){
            alert("삭제가 완료되었습니다.");
        }
        if(result === "login success"){
			alert("로그인 성공!");
		}
	}	
	
});

let moveForm = $("#moveForm");

$(".move").on("click", function(e){
    e.preventDefault();
    
    moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
    moveForm.attr("action", "/board/get");
    moveForm.submit();
});
</script>

</body>
</html>