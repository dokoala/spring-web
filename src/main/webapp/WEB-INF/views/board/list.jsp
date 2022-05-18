<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<%@include file ="../common/head.jsp"%>

<body>

<%@include file ="../common/header.jsp"%>

<h1>목록페이지입니다.</h1>
 
<div class="table_wrap">
	<a href="/board/regist" class="top_btn">게시판 등록</a>
	<div class="bd-example">
		<table class="table table-dark table-borderless width=500px;">
			<thead>
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
						<td><c:out value="${list.regdate}"/></td>
						<td><c:out value="${list.updateDate}"/></td>
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