package com.spring.web.service;

import java.util.List;

import com.spring.web.model.BoardVO;
import com.spring.web.model.Criteria;

public interface BoardService {
	
	public void registBoard(BoardVO board);
	
	public List<BoardVO> getList();
	
	/* �Խ��� ��ȸ */
    public BoardVO getPage(int bno);
    
    /* �Խ��� ���� */
    public int update(BoardVO board);
    
    /* �Խ��� ���� */
    public int delete(int bno);
    
    /* �Խ��� ���(����¡ ����) */
    public List<BoardVO> getListPaging(Criteria cri);

	/* �Խ��� �� ���� */
    public int getTotal();
}
