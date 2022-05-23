<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file ="../common/head.jsp"%>

<link href="../../../resources/css/board/board.css" rel="stylesheet">

<body>

<%@include file ="../common/header.jsp"%>
<div class = "container" style="margin-top: 2%">
<h1>게시판 등록</h1>
	<form action="/board/regist" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">작성자</label>
			<input type="text" name="writer" class="form-control"  readonly="readonly" 
			value='<c:out value="${memberInfo.nickname}"/>'>
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">제목</label>
			<input type="text" name="title" class="form-control" placeholder="제목" 
		  aria-label="title" aria-describedby="basic-addon1">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">글 내용</label>
			<textarea class="form-control" name="content" aria-label="With textarea"></textarea>
		</div>
	    <button class="btn btn-outline-dark">등록</button>
	</form>
</div>
</body>
<script>
$(document).ready(function(){
    
    let result = '<c:out value="${result}"/>';
    
    checkAlert(result);
    
    function checkAlert(result){
        
        if(result === ''){
            reutrn;
        }
        
        if(result === "regist success"){
            alert("등록이 완료되었습니다.");
        }
        
    }    
    
});
</script>
</html>