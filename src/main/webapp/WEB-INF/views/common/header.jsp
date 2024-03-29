<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<header class="p-3 bg-dark text-white">
	<div class="container">
		<div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
			<a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
			  <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
			</a>
		
			<ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
			  <li><a href="/board/list" class="nav-link px-2 text-white">게시판</a></li>
			</ul>
			
			<div class="text-end">
				<button type="button" onclick="location.href='/member/login';" 
				class="btn btn-warning">로그아웃</button>			 
			</div>
		</div>
	</div>
</header>