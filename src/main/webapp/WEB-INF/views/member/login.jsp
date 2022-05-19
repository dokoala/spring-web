<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file ="../common/head.jsp"%>


<link href="../../../resources/css/member/member.css" rel="stylesheet">

<body class="text-center" style="width=500px">
	<section class = "login">
		<form action="/member/login" method="post">
			<h1 class="h3 mb-3 fw-normal">로그인</h1>
	
		  	<div class="form-floating">
		  		<input type="text" name="id" class="form-control" id="floatingInput" placeholder="아이디를 입력하시오">
	      		<label for="floatingInput">아이디</label>
		    </div>
		    <div class="form-floating">
		      	<input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
		      	<label for="floatingPassword">패스워드</label>
		    </div>
			<button class="w-100 btn btn-lg btn-primary" type="submit" id="btnLogin">로그인</button>
		</form>
	<a href="/member/regist" class="top_btn" style="size=10px">회원 가입</a>
	</section>
</body>

<script>
$(document).ready(function(){
    
    let result = '<c:out value="${result}"/>';
    
    checkAlert(result);
    
    function checkAlert(result){
        
        if(result === "login fail"){
        	alert("로그인 실패")
            return;
        }
        
        if(result === "login success"){
            alert("로그인 완료.");
        }
        
    }    
    
});
</script>

</html>
