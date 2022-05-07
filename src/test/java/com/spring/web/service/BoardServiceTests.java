package com.spring.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
    
    
    @Autowired
    private BoardService service;
    
//    @Test
//    public void testRegist() {
//        
//        BoardVO vo = new BoardVO();
//        
//        vo.setTitle("service test");
//        vo.setContent("service test");
//        vo.setWriter("service test");
//        
//        service.registBoard(vo);
//        
//    }
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
    /* �Խ��� ���� */
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(2);
        board.setTitle("���� ����");
        board.setContent("���� ����");
        
        int result = service.modify(board);
        log.info("result : " +result);
        
    }
 
}