package com.spring.web.mapper;

import java.util.List;

import com.spring.web.model.BoardVO;

public interface BoardMapper {
	
	public void registBoard(BoardVO board);
	
	public List<BoardVO> getList();
}
