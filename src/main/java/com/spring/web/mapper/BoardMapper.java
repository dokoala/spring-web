package com.spring.web.mapper;

import java.util.List;

import com.spring.web.model.BoardVO;

public interface BoardMapper {
	
	/* ��� */
	public void registBoard(BoardVO board);
	
	/* ����Ʈ */
	public List<BoardVO> getList();
	
	/* ������ */
	public BoardVO getPage(int bno);
	
	/* ���� */
    public int update(BoardVO board);
    
    /* �Խ��� ���� */
    public int delete(int bno);
}
