package com.spring.web.mapper;

import java.util.List;

import com.spring.web.model.BoardVO;

public interface BoardMapper {
	
	/* 등록 */
	public void registBoard(BoardVO board);
	
	/* 리스트 */
	public List<BoardVO> getList();
	
	/* 페이지 */
	public BoardVO getPage(int bno);
	
	/* 수정 */
    public int modify(BoardVO board);
}
