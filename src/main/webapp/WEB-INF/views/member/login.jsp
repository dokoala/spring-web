<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file ="../common/head.jsp"%>


<link href="../../../resources/css/login/login.css" rel="stylesheet">

<body class="text-center" style="width=500px">
	<section class = "login">
		<form action="/member/login" method="post">
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>
	
		  	<div class="form-floating">
		  		<input type="text" name="id" class="form-control" id="floatingInput" placeholder="name@example.com">
	      		<label for="floatingInput">ID</label>
		    </div>
		    <div class="form-floating">
		      	<input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
		      	<label for="floatingPassword">Password</label>
		    </div>
			<button class="w-100 btn btn-lg btn-primary" type="submit" id="btnLogin">로그인</button>
		</form>
	<a href="/member/regist" class="top_btn">회원 가입</a>
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
