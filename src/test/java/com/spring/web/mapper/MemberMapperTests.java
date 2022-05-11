package com.spring.web.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.model.BoardVO;
import com.spring.web.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
 
     private static final Logger log = LoggerFactory.getLogger(MemberMapperTests.class);
     
     @Autowired
     private MemberMapper mapper;
 
//     @Test
//     public void testRegist() {
//         
//         MemberVO vo = new MemberVO();
//         
//         vo.setId("harryqas");
//         vo.setPassword("12341234");
//         vo.setNickname("동팔이");
//         
//         mapper.registMember(vo);
//         
//     }
     
     @Test
     public void testLogin() {
         
         MemberVO vo = new MemberVO();
         
         vo.setId("123123222");
         vo.setPassword("123123222");
         
         vo = mapper.login(vo);
         log.info("result : " + vo);
     }
     
//     @Test
//     public void testGetList() {
//         
//         
//         List list = mapper.getList();
//        /* 일반적 for문 */
//         for(int i = 0; i < list.size();i++) {
//             log.info("" + list.get(i));
//         }
         
//        /* foreach문(향상된 for문) */
//         for(Object a : list) {
//             log.info("" + a);
//         }
//         
//        /* foreach문 & 람다식 */
//         list.forEach(board -> log.info("" + board));
         
//     }
     
//     /* 게시판 조회 */
//     @Test
//    public void testGetPage() {
//        
//        /* 실제 존재하는 페이지 */
//        int bno = 2;
//        
//        log.info("" + mapper.getPage(bno));
//        
//    }
     
//     /* 게시판 수정 */
//     @Test
//     public void testModify() {
//         
//         BoardVO board = new BoardVO();
//         board.setBno(2);
//         board.setTitle("수정 제목");
//         board.setContent("수정 내용");
//         
//         int result = mapper.update(board);
//         log.info("result : " +result);
//         
//     }
     
//     /* 게시판 삭제 */
//     @Test
//     public void testDelete() {
//         
//         int result = mapper.delete(5);
//         log.info("result : " + result);
//         
//     }
}