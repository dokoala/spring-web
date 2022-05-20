package com.spring.web.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.web.model.BoardVO;
import com.spring.web.model.Criteria;

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
    
    /* �Խ��� ���� */
//    @Test
//    public void testDelete() {
//        
//        int result = service.delete(22);
//        log.info("result : " + result);
//        
//    }

    /* �Խ��� ��ȸ(����¡ ����) */
    @Test
    public void testGetListPaging() {
        
        Criteria cri = new Criteria();
        
        List list = service.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
        
        
    }
}