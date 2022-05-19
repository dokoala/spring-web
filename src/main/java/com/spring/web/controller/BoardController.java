package com.spring.web.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.model.BoardVO;
import com.spring.web.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	 @GetMapping("/list")
    // => @RequestMapping(value="list", method=RequestMethod.GET)
    public void boardListGET(Model model) {
        
        log.info("�Խ��� ��� ������ ����");
        model.addAttribute("list", boardService.getList());
        
    }
    
    @GetMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.GET)
    public void boardReigstGET() {
        
        log.info("�Խ��� ��� ������ ����");
        
    }	 

    // �Խ��� ��� 
    @PostMapping("/regist")
    public String boardReigstPOST(BoardVO board, RedirectAttributes rttr) {
        
        log.info("BoardVO : " + board);
        boardService.registBoard(board);
        
        rttr.addFlashAttribute("result", "regist success");
        
        return "redirect:/board/list";
    }
    
    /* �Խ��� ��ȸ */
    @GetMapping("/get")
    public void boardGetPageGET(int bno, Model model) {
        
        model.addAttribute("pageInfo", boardService.getPage(bno));
        
    }
    
    @GetMapping("/update")
    public void boardUpdateGET(int bno, Model model) {
        
        model.addAttribute("pageInfo", boardService.getPage(bno));
        
    }
    
    /* ���� �ϱ�*/
    @PostMapping("/update")
    public String boardUpdatePOST(BoardVO board, RedirectAttributes rttr) {
        
        boardService.update(board);
        
        rttr.addFlashAttribute("result", "update success");
        
        return "redirect:/board/list";
        
    }
    
    /* ������ ���� */
    @PostMapping("/delete")
    public String boardDeletePOST(int bno, RedirectAttributes rttr) {
        
        boardService.delete(bno);
        
        rttr.addFlashAttribute("result", "delete success");
        
        return "redirect:/board/list";
    }
}
