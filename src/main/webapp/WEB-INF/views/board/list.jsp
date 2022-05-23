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
						<a class="move" id="no" href='<c:out value="${list.bno}"/>'>
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
		
		<nav aria-label="Page navigation example">
        	<ul id="pageInfo" class="pagination justify-content-center pageInfo">
        	
	        	<!-- 이전페이지 버튼 -->
                <c:if test="${pageMaker.prev}">
                    <li class="page-item previous"><a class="page-link" href="${pageMaker.startPage-1}">Previous</a></li>
                </c:if>
                
	 			<!-- 각 번호 페이지 버튼 -->		 			
                <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="page-item ${pageMaker.cri.pageNum == num ? "active":"" }"><a class="page-link" href="${num}">${num}</a></li>
                </c:forEach>                
                
                <!-- 다음페이지 버튼 -->
                <c:if test="${pageMaker.next}">
                    <li class="page-item next"><a class="page-link" href="${pageMaker.endPage + 1 }">Next</a></li>
                </c:if> 
            </ul>
		</nav>
	</div>
	<form id="moveForm" method="get">
		<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
        <input type="hidden" name="amount" value="${pageMaker.cri.amount }">    
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
		moveForm.find("#bno").remove();
	});
	
	$(".pageInfo a").on("click", function(e){
		 
        e.preventDefault();
        moveForm.find("input[name='pageNum']").val($(this).attr("href"));
        moveForm.attr("action", "/board/list");
        moveForm.submit();
        
    });
	

</script>

</body>
</html>