package com.spring.web.mapper;

import java.util.List;

import com.spring.web.model.BoardVO;
import com.spring.web.model.Criteria;

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
    
    /* �Խ��� ���(����¡ ����) */
    public List<BoardVO> getListPaging(Criteria cri);

    /* �Խ��� �� ���� */
    public int getTotal();
}
