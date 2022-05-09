package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mapper.BoardMapper;
import com.spring.web.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void registBoard(BoardVO board) {
		mapper.registBoard(board);		
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	/* �Խ��� ��ȸ */
    @Override
    public BoardVO getPage(int bno) {
         
        return mapper.getPage(bno);
    }

	@Override
	public int update(BoardVO board) {
		
		return mapper.update(board);
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return mapper.delete(bno);
	}    
}
