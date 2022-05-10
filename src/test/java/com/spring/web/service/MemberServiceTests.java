package com.spring.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberServiceTests {
	
	private static final Logger log = LoggerFactory.getLogger(MemberServiceTests.class);
    
    
    @Autowired
    private MemberService service;
    
    @Test
    public void testRegist() {
        
        MemberVO vo = new MemberVO();
        
        vo.setId("geobuk11121231233");
        vo.setPassword("11223344");
        vo.setNickname("yeop2");
        
        service.registMember(vo);
        
    }
//    
//    
//    /* �Խ��� ��� �׽�Ʈ */
//    @Test
//    public void testGetList() {
//        
//        service.getList().forEach(board -> log.info("" + board));        
//        
//    }
// 
//    /*�Խ��� ��ȸ*/
//    @Test
//    public void testGETPage() {
//        
//        int bno = 8;
//        
//        log.info("" + service.getPage(bno));
//        
//    }
//    /* �Խ��� ���� */
//    @Test
//    public void testModify() {
//        
//        BoardVO board = new BoardVO();
//        board.setBno(2);
//        board.setTitle("���� ����");
//        board.setContent("���� ����");
//        
//        int result = service.update(board);
//        log.info("result : " +result);
//        
//    }
    
//    /* �Խ��� ���� */
//    @Test
//    public void testDelete() {
//        
//        int result = service.delete(22);
//        log.info("result : " + result);
//        
//    }
 
}