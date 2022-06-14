# spring-web
spring을 이용해 만든 기본적인 CRUD 게시판입니다.
기능을 하나씩 추가해 나갈 예정입니다.   
(게시판, 로그인 등)

## 사용 기술 및 언어
java(spring mvc framework), mysql(8.0.22), javascript, jsp, css, tomcat server(9.0)



## DB TABLE (MySQL)
### 1. board table 
```mysql
CREATE TABLE `board` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `title` varchar(150) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `writer` varchar(50) NOT NULL,
  `regdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
### 2. member table 
```mysql
CREATE TABLE `member` (
  `mno` int NOT NULL AUTO_INCREMENT,
  `id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `regdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`mno`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `nickname_UNIQUE` (`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```


## 기능
1. 전체 게시물 조회 GET(/board/list)
2. 게시물 등록 페이지 이동 GET(/board/regist)
3. 게시물 등록 POST(/board/regist)
4. 게시판 조회 GET(/board/get)
5. 게시물 수정 페이지 이동 GET(/board/update)
6. 게시물 수정 POST(/board/boardUpdatePOST)
7. 삭제 POST(/board/delete)
8. 로그인 페이지 이동 GET(/member/login)
9. 로그인 POST(/member/login)
10. 로그아웃 POST(/logout)
11. 회원가입 페이지 이동 GET(/member/regist)
12. 회원가입 POST(/member/regist)
13. ID체크 POST(/member/IdCheck)   
14. 닉네임체크 POST(/member/nicknameCheck)   

## 실행 화면
- 회원가입 및 로그인   
  <img src="https://user-images.githubusercontent.com/56539587/170850158-00d673dc-6fa6-46f0-9a0b-e0ed42be3e4f.gif">   
- 글 등록 , 수정, 삭제   
  <img src="https://user-images.githubusercontent.com/56539587/170850539-415ee7b6-80d9-4c23-8331-1508a2485d95.gif">


## 오류 및 수정
- ~~autowired가 제대로 작동하지 않는 오류 발생. 페이지 위치를 제대로 잡지 못함.~~   
  => 프로젝트 클리어 및 재실행해서 위치를 다시 잡아주니 제대로 잡힘.
- ~~주소 창에 주소와 값을 직접 입력해서 페이지에 진입하면 그대로 들어갈 수 있는 오류~~    
  => 세션을 확인해서 같은 값이 아니면 입력이 불가능 하도록 화면에서 보이지 않도록 함.
- ~~값을 넘길 때 주소창 값이 그대로 존재~~ 스크립트 코트 추가로 해결. 
- 게시판 글 읽고 뒤로가기시 이전에 있던 파라미터 값이 주소창에 존재해서 이 후 어떤 게시물을 클릭해도 맨 처음 클릭한 게시물로 이동.
- ~~세션이 없을 때 클릭 시 오류~~ 현재 로그인 이후 클릭이 가능하도록 잠시 막아둠. 
