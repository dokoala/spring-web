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
        
        if(result === ''){
            return;
        }
        
        if(result === "regist success"){
            alert("회원 가입이 완료되었습니다.");
        }
        
    }    
    
});
</script>

</head>
<body>

<h1>회원 등록</h1>
<form action="/member/regist" method="post">
    <div class="input_wrap">
        <label>ID</label>
        <input name="id">
    </div>
    <div class="input_wrap">
        <label>Password</label>
        <input type="password" name="password">
    </div>
    <div class="input_wrap">
        <label>Nickname</label>
        <input name="nickname">
    </div>
    <button class="btn">회원 등록</button>
</form>
</body>
</html>