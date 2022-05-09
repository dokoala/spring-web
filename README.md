# spring-web
기본적인 CRUD 게시판 형태부터 시작해서 기능을 하나씩 추가해 나갈 예정입니다.
## 기능
1. 조회(/board/list)
2. 등록(/board/regist)
3. 수정(/board/update)
4. 삭제(/board/delete)
## DB TABLE (MySQL)
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
