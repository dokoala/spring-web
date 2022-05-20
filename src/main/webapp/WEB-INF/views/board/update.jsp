<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file ="../common/head.jsp"%>

<link href="../../../resources/css/board/board.css" rel="stylesheet">

<body>

<%@include file ="../common/header.jsp"%>
	<div class = "container" style="margin-top: 2%">
		<form id="updateForm" action="/board/update" method="post">
			<h1>수정 페이지</h1>
			<div class="mb-3">
				<label class="form-label">게시판 번호</label>
				<input type="text" name="bno" class="form-control" 
				readonly="readonly" value='<c:out value="${pageInfo.bno}"/>' >
			</div>
			<div class="mb-3">
				<label class="form-label">작성자</label>
				<input type="text"name="writer" class="form-control"
				readonly="readonly" value='<c:out value="${pageInfo.writer}"/>' >
			</div>
			<div class="mb-3">
				<label class="form-label">제목</label>
				<input type="text" name="title" class="form-control"
				value='<c:out value="${pageInfo.title}"/>' >
			</div>
			<div class="mb-3">
				<label class="form-label">글 내용</label>
				<textarea class="form-control" rows="4" name="content"><c:out value="${pageInfo.content}"/></textarea>
			</div>			
			<div class="input-group mb-3">
			  <div class="input-group-prepend">
			    <span class="input-group-text" id="basic-addon1">게시판 등록일</span>
			  </div>
			  <input type="text" class="form-control" readonly="readonly" placeholder="게사판 등록일" 
			  value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.regdate}"/>'>
			</div>
			<div class="input-group mb-3">
			  <div class="input-group-prepend">
			    <span class="input-group-text" id="basic-addon1">게시판 수정일</span>
			  </div>
			  <input type="text" class="form-control" readonly="readonly" placeholder="게사판 수정일" 
			  aria-label="Username" aria-describedby="basic-addon1" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.updateDate}"/>'>
			</div>	
			<div class="btn_wrap">
				<a class="btn btn-outline-dark" id="list_btn">목록 페이지</a> 
				<a class="btn btn-outline-success" id="update_btn">수정 완료</a>
				<a class="btn btn-outline-danger" id="delete_btn">삭제</a>
				<a class="btn btn-outline-dark" id="cancel_btn">수정 취소</a>
			</div>
		</form>
		<form id="infoForm" action="/board/update" method="get">
			<input type="hidden" id="bno" name="bno" value='<c:out value="${pageInfo.bno}"/>'>
			<input type="hidden" name="pageNum" value='<c:out value="${cri.pageNum}"/>'>
    		<input type="hidden" name="amount" value='<c:out value="${cri.amount}"/>'> 
		</form>
	</div>
</body>
<script>
	let form = $("#infoForm");        // 페이지 이동 form(리스트 페이지 이동, 조회 페이지 이동)
	let mForm = $("#updateForm");    // 페이지 데이터 수정 from
	
	/* 목록 페이지 이동 버튼 */
	$("#list_btn").on("click", function(e){
	    form.find("#bno").remove();
	    form.attr("action", "/board/list");
	    form.submit();
	});
	
	/* 수정 하기 버튼 */
	$("#update_btn").on("click", function(e){
	    mForm.submit();
	});
	
	/* 취소 버튼 */
	$("#cancel_btn").on("click", function(e){
	    form.attr("action", "/board/get");
	    form.submit();
	});
	
	/* 삭제 버튼 */
	$("#delete_btn").on("click", function(e){
		form.attr("action", "/board/delete");
		form.attr("method", "post");
		form.submit();
	});
</script>	
</html>