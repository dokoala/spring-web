<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
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
</head>

<body>
<h2>로그인</h2>
<form action="/member/login" method="post">
	<table border="1" width="400px">
		<tr>
			 <td>아이디</td>
			 <td><input name="id"></td>
		</tr>
		<tr>
			 <td>비밀번호</td>
			 <td><input type="password" name="password"></td>
		</tr>			
	</table>
	<button type="submit" id="btnLogin">로그인</button>
</form>
<a href="/member/regist" class="top_btn">회원 가입</a>


</body>
</html>
