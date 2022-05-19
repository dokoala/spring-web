<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<%@include file ="../common/head.jsp"%>

<link href="../../../resources/css/member/member.css" rel="stylesheet">

<body class="text-center" style="width=500px">
	<section class = "member-register">
		<h1 class="h3 mb-3 fw-normal">회원 가입</h1>
		<form action="/member/regist" method="post">
		    <div class="form-floating">		    	
				<input type="text" name="id" class="form-control id_input"placeholder="아이디를 입력하시오">
		        <label for="floatingInput">아이디</label>
		        <span class="id_input_re_1">사용 가능한 아이디입니다.</span>
				<span class="id_input_re_2">아이디가 이미 존재합니다.</span>
				<span class="id_input_re_3">아이디를 입력해 주세요.</span>  
		    </div>
		    <div class="form-floating">
		        <input type="password" name="password" class="form-control" placeholder="비밀번호를 입력하시오">
		      	<label for="floatingPassword">비밀번호</label>
		    </div>
		    <div class="form-floating">
		      	<input type="text" name="nickname" class="form-control nickname_input"placeholder="닉네임을 입력하시오">
		      	<label for="floatingPassword">닉네임</label>
		      	<span class="nickname_input_re_1">사용 가능한 닉네임입니다.</span>
				<span class="nickname_input_re_2">닉네임이 이미 존재합니다.</span>
				<span class="nickname_input_re_3">닉네임을 입력해 주세요.</span>
		    </div>
		    <button class="w-100 btn btn-lg btn-primary" style="margin-top=5px">회원 등록</button>
		</form>
	</section>
</body>
<script>
$(document).ready(function(){
    
    let result = '<c:out value="${result}"/>';
    
    checkAlert(result);
    
    function checkAlert(result){
        
        if(result === ''){
            return;
        }
        
        if(result === "regist success"){
            alert("회원 가입이 완료되었습니다.");
        }        
    } 
});

$('.id_input').on("propertychange change keyup paste input", function(){

	var memberId = $('.id_input').val();			// .id_input에 입력되는 값
	var data = {memberId : memberId}				// '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)'
	
	$.ajax({
		type : "post",
		url : "/member/idCheck",
		data : data,
		success : function(result){
			// console.log("성공 여부" + result);
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display", "none");			
			}
			else {
				$('.id_input_re_1').css("display", "none");
				$('.id_input_re_2').css("display","inline-block");	
			}			
		}// success 종료
	}); // ajax 종료

});// function 종료

$('.nickname_input').on("propertychange change keyup paste input", function(){

	var nickname = $('.nickname_input').val();			// .nickname_input에 입력되는 값
	var data = {nickname : nickname}				// '컨트롤에 넘길 데이터 이름' : '데이터(.nickname_input에 입력되는 값)'
	
	$.ajax({
		type : "post",
		url : "/member/nicknameCheck",
		data : data,
		success : function(result){
			// console.log("성공 여부" + result);
			if(result != 'fail'){
				$('.nickname_input_re_1').css("display","inline-block");
				$('.nickname_input_re_2').css("display", "none");				
			}
			else {
				$('.nickname_input_re_1').css("display", "none");
				$('.nickname_input_re_2').css("display","inline-block");		
			}			
		}// success 종료
	}); // ajax 종료

});// function 종료
</script>
</html>