# spring-web
기본적인 CRUD 게시판 형태부터 시작해서 기능을 하나씩 추가해 나갈 예정입니다.
(게시판, 로그인, 댓글)

## 사용 기술
javascript, cstl, jsp, java(spring mvc framework), mysql
bootstrap(https://getbootstrap.com/docs/5.0/components/accordion/)

## 기능
1. 게시판을 조회할 수 있는 기능.


## 호출
1. 조회 GET(/board/list)
2. 등록 POST(/board/regist)
3. 수정 POST(/board/update)
4. 삭제 POST(/board/delete)
5. 로그인 POST(/member/login)
6. 회원가입 POST(/member/regist)
7. ID체크 POST(/member/IdCheck)
8. 닉네임체크 POST(/member/nicknameCheck)

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

## 느낀점
