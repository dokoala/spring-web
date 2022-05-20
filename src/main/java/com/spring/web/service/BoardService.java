package com.spring.web.service;

import java.util.List;

import com.spring.web.model.BoardVO;
import com.spring.web.model.Criteria;

public interface BoardService {
	
	public void registBoard(BoardVO board);
	
	public List<BoardVO> getList();
	
	/* 게시판 조회 */
    public BoardVO getPage(int bno);
    
    /* 게시판 수정 */
    public int update(BoardVO board);
    
    /* 게시판 삭제 */
    public int delete(int bno);
    
    /* 게시판 목록(페이징 적용) */
    public List<BoardVO> getListPaging(Criteria cri);

	/* 게시판 총 갯수 */
    public int getTotal();
}
