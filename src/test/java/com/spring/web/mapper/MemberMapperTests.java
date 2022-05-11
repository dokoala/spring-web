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
//         vo.setNickname("������");
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
//        /* �Ϲ��� for�� */
//         for(int i = 0; i < list.size();i++) {
//             log.info("" + list.get(i));
//         }
         
//        /* foreach��(���� for��) */
//         for(Object a : list) {
//             log.info("" + a);
//         }
//         
//        /* foreach�� & ���ٽ� */
//         list.forEach(board -> log.info("" + board));
         
//     }
     
//     /* �Խ��� ��ȸ */
//     @Test
//    public void testGetPage() {
//        
//        /* ���� �����ϴ� ������ */
//        int bno = 2;
//        
//        log.info("" + mapper.getPage(bno));
//        
//    }
     
//     /* �Խ��� ���� */
//     @Test
//     public void testModify() {
//         
//         BoardVO board = new BoardVO();
//         board.setBno(2);
//         board.setTitle("���� ����");
//         board.setContent("���� ����");
//         
//         int result = mapper.update(board);
//         log.info("result : " +result);
//         
//     }
     
//     /* �Խ��� ���� */
//     @Test
//     public void testDelete() {
//         
//         int result = mapper.delete(5);
//         log.info("result : " + result);
//         
//     }
}