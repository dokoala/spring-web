package com.spring.web.service;

import java.util.List;

import com.spring.web.model.BoardVO;

public interface BoardService {
	
	public void registBoard(BoardVO board);
	
	public List<BoardVO> getList();
}
