package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mapper.BoardMapper;
import com.spring.web.model.BoardVO;
import com.spring.web.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void registBoard(BoardVO board) {
		
		boardMapper.registBoard(board);		
	}

	@Override
	public List<BoardVO> getList() {

		return boardMapper.getList();
	}

	/* 게시판 조회 */
    @Override
    public BoardVO getPage(int bno) {
         
        return boardMapper.getPage(bno);
    }

	@Override
	public int update(BoardVO board) {
		
		return boardMapper.update(board);
	}

	@Override
	public int delete(int bno) {

		return boardMapper.delete(bno);
	}

    @Override
    public List<BoardVO> getListPaging(Criteria cri) {
        
        return boardMapper.getListPaging(cri);
    }      
    

	/* 게시물 총 갯수 */
    @Override
    public int getTotal() {
        
        return boardMapper.getTotal();
    } 	
}
